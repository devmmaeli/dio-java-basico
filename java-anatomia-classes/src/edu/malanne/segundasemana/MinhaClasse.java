public class MinhaClasse {

    public static void main(String[] args) {   

        String primeiroNome = "Malanne Maelí";
        String segundoNome = "Oliveira de Souza de Carvalho";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
       
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }

}
