public class insercao{
  public static void  main(String[] args) {  
    int [] v={3,1,7,5,8,6,2,4};   
    metodoInsercao( v );   
    imprimeVetor( v );
  }

  public static void metodoInsercao(int[] v) {
    for(int i = 1; i < v.length; i++){
       int j = i;
       int x = v[j];
       while(j > 0 && x < v[j-1]) {
         v[j] = v[j-1];
         j--;
       }
       v[j] = x;
    }
  }
  public static void imprimeVetor(int[] v) {    
    for( int i=0; i < v.length; i++ )
      System.out.println("v["+i+"]:"+v[i]);
  }
}