import java.util.Scanner;

public class Netflix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String nome;

        System.out.println("Insira seu nome de usuário: ");
        nome = scanner.nextLine();
        System.out.println("Olá, " + nome + "insira o seu plano: \n1) Básico \n2) Padrão \n3) Premium");
        int resposta = scanner.nextInt();
        System.out.println("PLANO SELECIONADO: ");

        switch (resposta) {
            case 1:{
                System.out.println("(Básico): Resolução 720p - 1 tela disponível");
                break;
            } 
            case 2: {
                System.out.println("(Padrão): Resolução 1080p (Full HD) - 2 telas disponíveis.");
                break;
            }
            case 3: {
                System.out.println("(Premium): Resolução 4K + HDR - 4 telas disponíveis.");
                break;
            }
            default:{
                System.out.println("Código de plano inválido.");
            }
        }
        System.out.println("Insira a idade do perfil logado: ");
        int idade = scanner.nextInt();
        
        if (idade < 12){
            System.out.println("Categoria: Infantil (Desenhos e Animações)");
        } else if (idade >= 12 && idade <= 17){
            System.out.println("Categoria: Adolescente (Séries Teen e Aventura).");
        } else {
            System.out.println("Categoria: Adulto (Filmes de Ação e Documentários).");
        }

        System.out.println("Insira o país do perfil logado");
        String país = scanner.next().toLowerCase();

        if (país.equals("brasil")){
            System.out.println("Destaque: Assista agora produções originais brasileiras!");
        }

        scanner.close();
        
    }
}
