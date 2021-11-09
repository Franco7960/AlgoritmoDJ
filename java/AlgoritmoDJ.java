/**
 * @author: Ing. Noé Vásquez Godínez
 * @email: noe-vg@outlook.com
 * @about: Clase para implementar Dijkstra's algorithm
 */
class AlgoritmoDJ{
    /**
     * @about:
     * En este metodo se iniciara sel setup del algoritmo
     */
    public void init(){
        this.start();
    }
    /**@about: 
     * En este metodo se incia el algoritmo
     */
     // AQUI EMPIEZO A MODIFICAR PROGRAMA
       System.out.println("Pruebas para subir cambios");

	public  int distancia[] = new int[10];
	public  int costo[][] = new int[10][10]; 
	public void calc(int n,int s){
	  int flag[] = new int[n+1];
	  int i,minpos=1,k,c,minimum;
	  for(i=1;i<=n;i++)
	  {  
		flag[i]=0; 
		this.distancia[i]=this.costo[s][i]; 
	  }
	  c=2;
	  while(c<=n)
	  {
		minimum=99;
		for(k=1;k<=n;k++){ 
			if(this.distancia[k]<minimum && flag[k]!=1){
			minimum=this.distancia[i];
			minpos=k;
		   }
		} 
		  flag[minpos]=1;
		  c++;
			for(k=1;k<=n;k++){
				if(this.distancia[minpos]+this.costo[minpos][k] <  this.distancia[k] && flag[k]!=1 )
					this.distancia[k]=this.distancia[minpos]+this.costo[minpos][k];
			}   
		}
	}
	
 public static void main(String args[]){
	int nodos,origen,i,j;
	Scanner in = new Scanner(System.in);
	System.out.print("Ingresa el numero de nodos: ");
	nodos = in.nextInt();
	Dijkstra d = new Dijkstra();
	System.out.println("Ingresa distancias dejando espacios: ");
        for(i=1;i<=nodos;i++){
          for(j=1;j<=nodos;j++){
            d.costo[i][j]=in.nextInt();
            if(d.costo[i][j]==0)
              d.costo[i][j]=999;
			}
		}
  System.out.println("Ingresa nodo de origen : ");
  origen=in.nextInt();
  d.calc(nodos,origen);
        for(i=1;i<=nodos;i++)
          if(i!=origen)
  System.out.println(" Origen :"+origen+"\t Destino :"+i+"\t Minimo :"+d.distancia[i]+"\t");
	} 
}
    
    } 
    public static void main(String[] args) {
        AlgoritmoDJ algoritmoDJ = new AlgoritmoDJ();
        algoritmoDJ.init();
    }
}