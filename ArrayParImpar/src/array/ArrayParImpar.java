package array;

public class ArrayParImpar {

    public static void main(String[] args) {
int contar_pares=0,contar_impar=0;
//Se crea el arreglo estableciendo la cantidad de numeros que quiero que tome 
int arrayNumeros[] = new int [20];
for(int i=0; i<20; i++){
    arrayNumeros[i]=(int)(Math.random()*100);
    System.out.println("Arreglo"+" "+i+" :"+arrayNumeros[i]);
 
    //condicion de if -else para saber cuantos elementos par e impar hay 
    if(arrayNumeros[i] %2==0){// Si el numero es par va aumentar 
     contar_pares++;
 }
    else {
        contar_impar++;//En otro caso el numero es impar , va aumentar 
    }
}
System.out.println();
  //creacion de array conteo de numeros pares e impares
int par[]=new int[contar_pares];// creacion de array para almacenar los numeros pares
int impar[]=new int [contar_impar];

contar_pares=0;
contar_impar=0;

//almacenan los numeros pares e impares en su respectivo array
for (int i=0; i<20; i++){
    if(arrayNumeros[i] %2==0){// if el numero es par 
        par[contar_pares]=arrayNumeros[i];
        contar_pares++;
    }
    else{
        impar[contar_impar]=arrayNumeros[i];
        contar_impar++;
    }
    
}
//imprimir los numeros pares
System.out.println("Array Ordenado: pares e impares");
for(int i=0; i<contar_pares; i++){
    System.out.print(par[i]+" ");
}
//imprimir los numeros impares
for(int i=0; i<contar_impar; i++){
    System.out.print(impar[i]+" ");
}
           }
    
}
