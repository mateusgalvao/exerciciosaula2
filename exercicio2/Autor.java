import java.util.Scanner;

class Autor {
        String nome;
        int id; 
        void carregadoteclado(){
                Scanner scanner = new Scanner(System.in); 
                System.out.print("Nome: "); 
                String nome = scanner.nextLine(); 
        
                System.out.print("ID: "); 
                int id = scanner.nextInt(); 
        
                System.out.println("\nOlá, " + nome + "!");
                System.out.println("\nID, " + id + "!");
            
        }
}