import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Start {
	
	static Start st = new Start();
	
	class Cluster {
		
		public int amount;
		public ArrayList<Node> nodes;
		public ArrayList<Edge> edges;
	    public ArrayList<Node> tsp;
		public ArrayList<Edge> mstE;
		
	    public int cost;
		
		public Cluster(){
			nodes = new ArrayList<Node>();
			edges = new ArrayList<Edge>();
		}
		
		public void add(Node n){
			nodes.add(n);
			amount+= n.amount;
		}
		
		public Cluster copy(){
			Cluster n = new Cluster();
			n.amount = this.amount;
			n.nodes = this.nodes;
			return n;
		}
		
		public void printMST(StringBuilder sb){
			System.out.println("CLUSTER:");
			for(Edge e:mstE){
				sb.append("From: " + e.n1.index + " To: " + e.n2.index + " Val: " + e.val);
			}
		}
		
		public void mst(){
			mstE = new ArrayList<Edge>();
			
			nodes.get(0).visited = true;
			nodes.get(0).mstEdges = new ArrayList<Edge>();
			int visitedNodes = 1;
			Collections.sort(edges);

			while(visitedNodes!= nodes.size()){
				boolean added = false;
				int counter = 0;
				while(!added){
					
					Edge e = edges.get(counter);
					if((e.n1.visited == true && e.n2.visited == false)){
						//||(e.n2.visited == true && e.n1.visited == false)){
						mstE.add(e);
						//e.n1.visited = true;
						e.n2.visited = true;
						//pridam do MST hran, ktere tvori kostru
						if(e.n1.mstEdges == null){
							e.n1.mstEdges = new ArrayList<Edge>();
						}
						e.n1.mstEdges.add(e);
						added = true;
						visitedNodes++;
					}
					counter++;
				}
			}	
		}
		
		public void dfsONMST(){
			tsp = new ArrayList<Node>();
			Node start = nodes.get(0);
			dfsProjdi(start);
			tsp.add(start);
		}
		
		public void dfsProjdi(Node n){
			tsp.add(n);
			if(n.mstEdges!=null){
				for(Edge e:n.mstEdges){
					Node n2 = e.n2;
					dfsProjdi(n2);
				}
			}
		}
		
		public void printTSP(StringBuilder sb){
			//System.out.println("CLUSTER TSP:");
			for(Node n:tsp){
				sb.append(n.index + " ");
			}		
		}

		public void printTSPAdds(StringBuilder sb) {
			int nodeCount  = tsp.size();
			for(int i=0;i<nodeCount;i++){
				Node n = tsp.get(i);
				sb.append(n.add);
				if(i<nodeCount-1){
					sb.append("->");
				}
			}		
		}
	}
	
	class Edge implements Comparable<Edge>{
		public Node n1;
		public Node n2;
		
		public int val;
		
		public Edge next;
		
		public Edge(Node ln1,Node ln2,int dist){
			this.n1 = ln1;
			this.n2 = ln2;
			this.val = dist;
		}
		
		public void connect(Edge e1){
			next = e1;
		}
		
		public void reverse(){
			Node swap = this.n2;
			this.n2 = n1;
			this.n1 = swap;
		}

		@Override
		public int compareTo(Edge o) {
			if(this.val<o.val)
				return -1;
			else if(o.val == this.val)
				return 0;
			else
				return 1;
		}
	}

	static class MyUtils {

		public static int[][] randomMatrix(int n){
			int[][] random = new int[n][n];
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					if(i!=j){
						random[i][j] = (int) (100 * Math.random());
				    }
					else{
						random[i][i] = 0;
					}
				}
			}
			return random;
		}
		
		public static int[] randomAmounts(int n){
			int[] amounts = new int[n];
			for(int i=1;i<n;i++){
				amounts[i] = (int) (100*Math.random());
			}
			return amounts;
		}
		
		public static void printSaving(Saving s){
			int from = s.from.index;
			int to = s.to.index;
			System.out.println("Saving - From: " + from + " To: " + to + " Val: " + s.val);
		}
		
		public static void printRoutesCities(ArrayList<Route> routes, StringBuilder sb){
			for(Route r:routes){
				printCities(r,sb);
				sb.append("\r\n");
			}
		}
		
		public static void printAdds(ArrayList<Route> routes,String[] adds,StringBuilder sb){
			int totalCost = 0;
			for(Route r:routes){
				printAdds(r,adds,sb);
				sb.append("\r\n");
				totalCost+= r.totalCost;
			}
			sb.append("TOTAL COST OF THE ROUTES: " + totalCost);
		}
		
		public static void printRoute(Route r){
			System.out.print("Route: ");
			Edge edge = r.outEdges[0];
			
			System.out.print("(" + edge.n1.index + "->" + edge.n2.index + ")");
			
			do{
				edge = r.outEdges[edge.n2.index];
				System.out.print("(" + edge.n1.index + "->" + edge.n2.index + ")");
			}while(edge.n2.index!=0);
			
			
			System.out.print(" Amount: " + r.actual + " Cost: " + r.totalCost);
			
			System.out.println("");
		}
		
		/**
		 * Vytiskne mesta z jedne cesty
		 * @param r
		 */
		public static void printCities(Route r,StringBuilder sb){
			sb.append(0 + " ");
			Edge edge = r.outEdges[0];
			sb.append(edge.n2.index + " ");
			do{
				edge = r.outEdges[edge.n2.index];
				sb.append(edge.n2.index + " ");
			}while(edge.n2.index!=0);
		}
		
		/**
		 * Vytiskne adresy mest z jedne cesty
		 * @param r
		 * @param adds
		 */
		public static void printAdds(Route r,String[] adds,StringBuilder sb){
			sb.append(adds[0]);
			Edge edge = r.outEdges[0];
			sb.append(" -> " + adds[edge.n2.index]);
			do{
				edge = r.outEdges[edge.n2.index];
				sb.append(" -> " + adds[edge.n2.index]);
			}while(edge.n2.index!=0);
		}
		
		/**
		 * Vytiskne hrany ze vsech cest
		 * @param routes
		 */
		public static void printRoutes(ArrayList<Route> routes){
			int totalCost = 0;
			for(Route r:routes){
				printRoute(r);
				totalCost+= r.totalCost;
			}
			
			System.out.println("Total cost of the routes: " + totalCost);
		}
		
		public static int compClusterCost(Cluster cl,int distances[][]){
			int cost = 0;
			for(int i=0;i<cl.tsp.size()-1;i++){
				Node n=cl.tsp.get(i);
				Node n1 = cl.tsp.get(i+1);
				
				cost+=distances[n.index][n1.index];
			}
			return cost;
		}
		
		public static String generateRandomNodes(int count,int distanceMultConst,int amountConst){
			
			Node[] nodes = new Node[count];
			int[][] distances = new int[count][count];
			
			for(int i=0;i<count;i++){
				int x = (int)(Math.random() * distanceMultConst);
				int y = (int)(Math.random() * distanceMultConst);
				for(int j=0;j<i;j++){
					Node n = nodes[j];
					int dist = (int)Math.sqrt((x-n.x)*(x-n.x) + (y-n.y)*(y-n.y));
					distances[i][n.index] = dist;
					distances[n.index][i] = dist;			
				}
				Node newNode = st.new Node(i);
				
		        newNode.x = x;
		        newNode.y = y;
		        newNode.add = "N" + i;
		        newNode.amount = (int) (Math.random() * amountConst);
				nodes[i] = newNode;
			}
			//vypisu
			StringBuilder sb = new StringBuilder();
			
			sb.append(count);
			for(int i=0;i<count;i++){
				sb.append("\r\n");
				for(int j=0;j<count;j++){
					if(i==j){
						sb.append(0);
					}else{
						if(distances[i][j] != 0){
							sb.append(distances[i][j]);
						}else{
							sb.append(distances[j][i]);
						}
					}
					sb.append(" ");
				}
			}
			
			sb.append("\r\n");
			sb.append("\r\n");
			
			for(int i=0;i<nodes.length;i++){
				sb.append(nodes[i].amount + ";" + nodes[i].add + ";" + nodes[i].x + ";" + nodes[i].y);
				sb.append("\r\n");
			}
			
			return sb.toString();
		}
	}
	
	class Node implements Comparable<Node>{
		public int index;
		public Route route;
		
		
		public int cluster;
		public double x;
		public double y;
		public double angle;

		public int state;
		public boolean visited;
		
		public ArrayList<Edge> mstEdges;
		
		public String add;
		
		public int amount;
		
		
		public Node(int i){
			index = i;
		}


		@Override
		public int compareTo(Node o) {
			if(this.angle<o.angle){
				return -1;
			}else if(o.angle == this.angle){
				return 0;
			}else{
				return 1;
			}
		}
	}
	
	class Route {
		
		public int allowed;
		public int actual;
		public int totalCost;
		
		
		public int[] nodes;
		public Edge[] inEdges;
		public Edge[] outEdges;
		
		
		ArrayList<Edge> edges;
		
		public Route(int nodesNumber){
			edges = new ArrayList<Edge>();
			
			nodes = new int[nodesNumber];
			inEdges = new Edge[nodesNumber];
			outEdges = new Edge[nodesNumber];
		}
		
		public void add(Edge e){
			edges.add(e);
			
			outEdges[e.n1.index] = e;
			inEdges[e.n2.index] = e;
			
			e.n1.route = this;
			e.n2.route = this;
			
			totalCost+= e.val;
		}
		
		public void removeEdgeToNode(int index){
			Edge e = inEdges[index];
			outEdges[e.n1.index] = null;
			
			totalCost-= e.val;
			
			edges.remove(e);
			inEdges[index] = null;
		}
		
		public void removeEdgeFromNode(int index){
			Edge e = outEdges[index];
			inEdges[e.n2.index] = null;
			
			totalCost-=e.val;
			edges.remove(e);
			outEdges[index] = null;
		}
		
		public int predecessor(int nodeIndex){
			return inEdges[nodeIndex].n1.index;
		}
		
		
		public int successor(int nodeIndex){
			return outEdges[nodeIndex].n2.index;
		}
		
		public boolean merge(Route r2,Edge mergingEdge){

			int from = mergingEdge.n1.index;
			int to = mergingEdge.n2.index;
			
			int predecessorI = this.predecessor(from);
			int predecessorJ = r2.predecessor(to);
			
			int successorI = this.successor(from);
			int successorJ = r2.successor(to);
			
			//moznost jedna
			//hrana smeruje z uzlu ze, ktereho v prvni Route se vracime zpatky do uzlu 0
			//v druhe route je naopak predecessor uzlu J sklad = 0
			if(successorI == 0 && predecessorJ == 0){
				this.removeEdgeToNode(0);
				r2.removeEdgeFromNode(0);
				for(Edge e:r2.edges){
					this.add(e);
				}
				this.actual+= r2.actual;
				this.add(mergingEdge);
				return true;
			// moznost dva
			//hrana jde jakoby v protismeru
			//uzel i je v prvni route druhy hned za skladem 
		    //musime otocit hranu
			}else if(successorJ == 0 && predecessorI == 0){
				mergingEdge.reverse();
				this.removeEdgeFromNode(0);
				r2.removeEdgeToNode(0);
				for(Edge e:r2.edges){
					this.add(e);
				}
				this.actual+= r2.actual;
				this.add(mergingEdge);
				return true;
			}
			
			return false;
		}
	}
	
	static class VRPProgram {

		public static int CAR_LIMIT = 40;
		private static int[][] savings;
		public static int[][] distances;
		private static Node[] nodes;
		private static String[] adds;
		private static ArrayList<Route> routes;
		private static int nCount;
		private static int[] amounts;
		
		
		public static ArrayList<Node> cluster(){
			Node depo = nodes[0];
			ArrayList<Node> nodesList = new ArrayList<Node>();
			
			for(int i=1;i<nodes.length;i++){
			   Node n = nodes[i];
			   if(n.x >= depo.x){
				   if(n.y>= depo.y){
					   n.cluster = 1;
				   }else{
					   n.cluster = 4;
				   }
			   }else{
				   if(n.y>= depo.y){
					   n.cluster = 2;
				   }else{
					   n.cluster = 3;
				   }
			   }
			   
			   
			   for(int j=1;j<5;j++){
				   if(n.cluster == j){
					   double difx = Math.abs(n.x - depo.x);
					   double dify = Math.abs(n.y - depo.y);
					   
					   if(dify!=0){
						   double tangA = (double)dify/difx;
						   
						   if(n.cluster == 2 || n.cluster == 4){
							   tangA= 1/tangA;
						   }
						   n.angle+= Math.atan(tangA);
					   }
					   
					   break;
				   }
				   else{
					   n.angle+= Math.PI/2;
				   }
			   }
			   nodesList.add(n);
		   }
		   return nodesList;
		}
		
		/**
		 * Load the data from external variables
		 * @param lNodes
		 * @param lCount
		 * @param lDistances
		 * @param lAmounts
		 * @param lAdds
		 * @param carLim
		 * @return
		 */
		public static boolean loadData(Node[] lNodes,int lCount, int[][] lDistances, int[] lAmounts,String[] lAdds,int carLim){
			boolean returnVal = true;
			
			try{
				CAR_LIMIT = carLim;
				nCount = lCount;
				nodes = lNodes;
				distances = lDistances;
				amounts = lAmounts;
				adds = lAdds;
			}catch(Exception ex){
				returnVal = false;
			}
			
			return returnVal;
		}
		
		/**
		 * Load the data from file specified in the parameter
		 * @param file
		 * @throws IOException
		 */
		public static void loadData(String file) throws IOException{
			//BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-16"));
			BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			nCount = Integer.parseInt(in.readLine());
			distances = new int[nCount][nCount];

			//nactu tabulku vzdalenosti
			for(int i=0;i<nCount;i++){
				String line = in.readLine();
				String[] inDist = line.split(" ");
				for(int k=0;k<inDist.length;k++){
					int dis = Integer.parseInt(inDist[k]);
					distances[i][k] = dis;
				}
			}

			in.readLine();

			//nactu mnozstvi objednaneho zbozi
			//adresy a souradnice
			amounts = new int[nCount];
			nodes = new Node[nCount];
			adds = new String[nCount];

			for(int i=0;i<nCount;i++){
				String nodeInfo = in.readLine();
				String[] info = nodeInfo.split(";");
				amounts[i] = Integer.parseInt(info[0]);

				Node n = st.new Node(i);
				n.amount = amounts[i];
				adds[i] = info[1];
				n.add = adds[i];

				if(info.length==4){
					n.x = Double.parseDouble(info[2]);
					n.y = Double.parseDouble(info[3]);
				}
				nodes[i] = n;
			}
		}

		
		/**
		 * Implementation of the Sweep algorithm
		 * @return
		 */
		public static ArrayList sweep(){
			ArrayList<Node> nodesList = cluster();
			Collections.sort(nodesList);
			
			//Cluster
			Cluster actualCluster = st.new Cluster();
			
			ArrayList<Cluster> clusters = new ArrayList<Cluster>();
			
			//pridam 0 do clusteru
			actualCluster.add(nodes[0]);
			for(int i=0;i<nodesList.size();i++){
				Node n = nodesList.get(i);
				
				//pokud by byla prekrocena kapacita vytvorim novy cluster
				if(actualCluster.amount + n.amount> CAR_LIMIT){
					clusters.add(actualCluster);
					actualCluster = st.new Cluster();
					//pridam depot uzel do kazdeho clusteru
					actualCluster.add(nodes[0]);
				}
				
				//pridam uzel do clusteru
				//pridam vsechny hrany ktere inciduji s uzly ktere jiz jsou v clusteru
				actualCluster.add(n);
				for(int j=0;j<actualCluster.nodes.size();j++){
					Node nIn = actualCluster.nodes.get(j);
					Edge e = st.new Edge(nIn,n,distances[nIn.index][n.index]);
					
					Edge eReverse = st.new Edge(n,nIn,distances[n.index][nIn.index]);
					
					actualCluster.edges.add(e);
					actualCluster.edges.add(eReverse);
				}
				
				//v pripade posledni polozky musim pridat i cluster.
				if(i==nodesList.size()-1){
					clusters.add(actualCluster);
				}
			}
			
			int totalCost = 0;
			int clusterCount = clusters.size();
			
			StringBuilder sb = new StringBuilder();
			//sb.append(clusterCount +"\r\n");
			
			System.out.println(sb.toString());
			
			ArrayList<ArrayList<Integer>> routes = new ArrayList<ArrayList<Integer>>();
			
			for(int i=0;i<clusterCount;i++){
				//System.out.println("Cluster: " + clusters.get(i).amount);
				clusters.get(i).mst();
				//clusters.get(i).printMST();
				clusters.get(i).dfsONMST();
				clusters.get(i).printTSP(sb);
				sb.append("");
				//sb.append("\r\n");
				totalCost += MyUtils.compClusterCost(clusters.get(i), distances);
				
				String []temp = sb.toString().split(" ");
				//System.out.println(temp.length);
				
				ArrayList<Integer> rt = new ArrayList<Integer>();
				
				for (int j = 0; j < temp.length; j++) {
					//System.out.println(temp[j]);
					rt.add(Integer.parseInt(temp[j]));
				}
				routes.add(rt);
				//System.out.println(words);
				sb = new StringBuilder();
			}
			
			//System.out.println(sb.toString());
			
//			for(int i=0;i<clusterCount;i++){
//				clusters.get(i).printTSPAdds(sb);
//				sb.append("\r\n");
//			}
//			sb.append("TOTAL COST OF THE ROUTES:" + totalCost);
			return routes;
		}
		
		/**
		 * Implementation of the Clarks' & Wright's algorithm
		 * @return
		 */
		public static String clarkWright(){
			routes = new ArrayList<Route>();
			
			//I create N nodes. Each node will be inserted into a route.
			//each route will contain 2 edges - from the depo to the edge and back
			for(int i=0;i<nCount;i++){
				
				Node n = nodes[i];
				
				if(i!=0){
					//creating the two edges
					Edge e  = st.new Edge(nodes[0],n,distances[0][n.index]);
					Edge e2 = st.new Edge(n,nodes[0],distances[0][n.index]);
				
					Route r = st.new Route(nCount);
					//40 omezeni kamionu
					r.allowed = CAR_LIMIT;
					r.add(e);
					r.add(e2);
					r.actual += n.amount;
					
					routes.add(r);
				}	
			}
			
			
			MyUtils.printRoutes(routes);
			//Computing the savings - the values which made be saved by optimization
			ArrayList<Saving> sList = computeSaving(distances, nCount, savings,nodes);
			//sorting the savings
			Collections.sort(sList);
			
			//and use the savings until the list is not empty
			while(!sList.isEmpty()){
				Saving actualS = sList.get(0);
				
				Node n1 = actualS.from;
				Node n2 = actualS.to;
				
				Route r1 = n1.route;
				Route r2 = n2.route;
				
				int from = n1.index;
				int to = n2.index;
				
				//MyUtils.printSaving(actualS);
				
				if(actualS.val>0 && r1.actual+r2.actual<r1.allowed && !r1.equals(r2)){
					
					//moznozt jedna z uzlu do kteryho se de se de do cile
					
					Edge outgoingR2 = r2.outEdges[to];
					Edge incommingR1 = r1.inEdges[from];
					
					
					if(outgoingR2!=null && incommingR1 != null){
						boolean succ = r1.merge(r2, st.new Edge(n1,n2,distances[n1.index][n2.index]));
						if(succ){
							routes.remove(r2);
						}
					}else{
						System.out.println("Problem");
					}
					
				}
				
				sList.remove(0);
				//MyUtils.printRoutes(routes);
				
			}
			StringBuilder sb = new StringBuilder();
			sb.append(routes.size() + "\r\n");
			
			
			MyUtils.printRoutesCities(routes,sb);
			MyUtils.printAdds(routes,adds,sb);
			return sb.toString();
		}
		
		
		/**
		 * Computation of savings. The value which could be saved if we would not return to the depo, but instead pass directly from one node to other.
		 * @param dist
		 * @param n
		 * @param sav
		 * @param nodesField
		 * @return
		 */
		public static ArrayList<Saving> computeSaving(int[][] dist,int n,int[][] sav,Node[] nodesField){
			sav = new int[n][n];
			ArrayList<Saving> sList = new ArrayList<Saving>();
			for(int i=1;i<n;i++){
				for(int j=i+1;j<n;j++){
					sav[i][j] = dist[0][i] + dist[j][0] - dist[i][j];
					Node n1 = nodesField[i];
					Node n2 = nodesField[j];
					Saving s = st.new Saving(sav[i][j],n1, n2);
					sList.add(s);
				}
			}
			return sList;		
		}
	}
	
	class Saving implements Comparable<Saving>{
		public int val;
		public Node from;
		public Node to;
		
		public Saving(int v,Node f,Node t){
			val = v;
			from = f;
			to = t;
		}

		@Override
		public int compareTo(Saving o) {
			if(o.val<this.val){
				return -1;
			}else if(o.val == this.val){
				return 0;
			}else{
				return 1;
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		
		if(args.length!=2){
			System.out.println("Two parameters are obligatory. Filename and  'sweep' or 'clark' to choose the algorithm");
			System.out.println("USAGE: Start [filename] [sweep|clark]");
			
			String method = "sweep";
			String fileName = "input/inputTest1.in";
			
			VRPProgram.loadData(fileName);
			
			if(method.equals("sweep")){
				ArrayList<ArrayList<Integer>> output = VRPProgram.sweep();
				System.out.println(output.size());
				System.err.println(output);
			}else{
				VRPProgram.clarkWright();
			}
			//MyUtils.generateRandomNodes(100,300,15);
		}else {
		
			String fileName = args[0];
			
			VRPProgram.loadData(fileName);
			
			if(args[1].equals("sweep")){
				ArrayList<ArrayList<Integer>> output = VRPProgram.sweep();
				System.out.println(output.size());
				System.err.println(output);
			}else{
				VRPProgram.clarkWright();
			}
			//MyUtils.generateRandomNodes(100,300,15);
		}
	}
}
