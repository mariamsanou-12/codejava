import java.util.Scanner;
class TiangleEtoile{
public static void main(String[] args){
Scanner lire= new Scanner(System.in);
System.out.println("donner le nombre de ligne");
int nombre= lire.nextInt();
//la hauteur du triangle
for(int i=1;i<=nombre;i++){
// comment gerer les espace
for(int j=1;j<=nombre-i;j++){
System.out.print(" ");
}
//l'affichage des *
for(int k=1;k<=(2*i-1);k++){
System.out.print("*");
}
//retour a la ligne 
System.out.println();
lire.close();
}
}
}

 

