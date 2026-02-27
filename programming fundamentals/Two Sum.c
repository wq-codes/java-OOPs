#include<stdio.h>
int main(){

int nums[]={7,9,6,4};
int target=15;

int index1=0;
int index2=0;
for(int i=0; i<4; i++){

  for(int j=i+1; j<=3; j++){
    if ( nums[i] + nums[j]==target){
    
         index1=i;
        index2=j;
    } 
  }
       
}
     printf("OUTPUT:[%d,%d]",index1,index2);
return 0;

}