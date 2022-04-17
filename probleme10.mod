/*********************************************
 * OPL 12.6.0.0 Model
 * Author: HP-fr
 * Creation Date: 16 avr. 2022 at 16:40:15
 *********************************************/
 int n = 6; 
 int P = ; 
range I = 1..n;

int C[i in I][j in I][k in I][m in I]= rand(1000);
int Q[i in I][j in I]= rand(1000);
dvar boolean flow[I];
dvar boolean hub[k];

minimize
 sum(i in I) sum(j in I)sum(k in I) sum(m in I) C[i][j][k][m] * Q[i][j] * flow[i][j][k][m];

subject to
{

    sum(k in I) hub[i][j] == P;
    forall(i in I),(i in I)
    sum(k in I)sum(m in I)flow[i][j][k][m] == 1;
    
    flow[i][j][k][m] <= hub[k];
    flow[i][j][k][m] <= hub[m];
 
    


  

}
