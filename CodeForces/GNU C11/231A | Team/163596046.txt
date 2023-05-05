int main(){
  
  int n ;//number of problems
  int counter =0 ;
  scanf("%d",&n);
  int array[n][3];
  for(int i = 0 ; i < n;i++){
    scanf("%d %d %d", &array[i][0],&array[i][1],&array[i][2]);
  }
  for(int i = 0 ; i < n ; i ++){
     if((array[i][0]&array[i][1])||(array[i][0]&array[i][2])||(array[i][1]&array[i][2]))
    counter++;
  }
 printf("%d",counter);
  }