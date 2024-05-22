public class FolhaPgto {

    public static void main(String args[]) throws Exception {
        Mensalista men1, men2;
        Horista h1, h2;

        men1 = new Mensalista("Jose", "Rua abc", null, "Junior");
        men1.calcularSalario();
        men1.calcINSS();
        men1.imprimir();

        men2 = new Mensalista("Ana", "Rua sem fim", null, "Senior");
        men2.calcularSalario();
        men2.calcINSS();
        men2.imprimir();

        h1 = new Horista("Carlos", "Rua xyz", 0, 100, 50);
        h1.calcularSalario();
        h1.imprimir();

        h2 = new Horista("Cristina", "Rua do centro", 0, 100, 50);
        h2.calcularSalario();
        h2.imprimir();
    }
}
