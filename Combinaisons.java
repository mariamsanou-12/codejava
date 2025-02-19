class Combinaisons {
public static void main(String[] argv){
for (int i=0; i<=50;i++){
for (int j=0; j<=20;j++){
for (int k=0; k<=10;k++){
 if ((i*2)+((j*5)+(k*10))==100)
 System.out.println("1F="+i+"*2c+"+j+"*5c+"+k+"*10c");
}
}
}
}
}
