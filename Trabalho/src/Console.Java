public class Console {

    private static Scanner leitor = new Scanner(System.in);

    public static int lerInt() {
        int valor = leitor.nextInt();
        leitor.nextLine(); // limpeza de buffer
        return valor;
    }

    public static float lerFloat() {
        float valor = leitor.nextFloat();
        leitor.nextLine();
        return valor;
    }

    public static String lerString() {
        return leitor.nextLine();
    }


    public static boolean lerBool() {
        String input = leitor.nextLine();
        while (!input.equalsIgnoreCase("Sim") && !input.equalsIgnoreCase("Nao")) {
            System.out.println("Por favor, digite 'Sim' ou 'Nao'.");
            input = leitor.nextLine();
        }
        return Boolean.parseBoolean(input);
    }

}