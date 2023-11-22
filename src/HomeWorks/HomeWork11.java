package HomeWorks;

public class HomeWork11 {

public static void main(String[] args) {
    printResult();
    printTriangle();
}

//Task1
static void printResult (){
    int n = 10;
    int y = 0;
    while (y<=n) {
        
        while (y<=n) {
             
            System.out.print(y*n + "  ");
            y++;
        }
        n--;
    }
}

//Task2
static void printTriangle (){
    int t = 1;
    while (t<=10) {
        int e = 1;
        while (e<=t) {
            System.out.print(e);
            e++;
        }
        System.out.println();
        t++;
    }
}    
}