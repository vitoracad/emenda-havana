public class Main {
    public static void main(String[] args) {
        EmendaParlamentar emenda1 = new EmendaParlamentar(2025, "Individual", "Raul Henry", "202024570014", "201771180001", true, "Raul Henry", true, "12345", "Saúde", "Assistência Social", "Programa Saúde", "Ação Saúde Básica", "Plano Saúde 2025", 1000000.00, 800000.00, 500000.00, "Recife", 200000.00, 50000.00, 100000.00);
        EmendaParlamentar emenda2 = new EmendaParlamentar(2025, "Individual", "Luciana Santos", "202024570015", "201771180002", false, "", true, "12346", "Educação", "Ensino Fundamental", "Programa Educação", "Ação Ensino Fundamental", "Plano Educação 2025", 1500000.00, 1200000.00, 800000.00, "Olinda", 250000.00, 60000.00, 120000.00);
        EmendaParlamentar emenda3 = new EmendaParlamentar(2025, "Individual", "Fernando Filho", "202024570016", "201771180003", true, "Fernando Filho", true, "12347", "Infraestrutura", "Transportes", "Programa Infraestrutura", "Ação Transporte Urbano", "Plano Infraestrutura 2025", 2000000.00, 1600000.00, 1000000.00, "Caruaru", 300000.00, 70000.00, 140000.00);

        EmendaParlamentar emendaBancada1 = new EmendaParlamentar(2025, "Bancada", "Bancada de Pernambuco", "202024570017", "201771180004", false, "", true, "12348", "Saúde", "Assistência Social", "Programa Saúde", "Ação Saúde Básica", "Plano Saúde 2025", 5000000.00, 4000000.00, 2500000.00, "Recife", 1000000.00, 200000.00, 400000.00);
        EmendaParlamentar emendaBancada2 = new EmendaParlamentar(2025, "Bancada", "Bancada de Pernambuco", "202024570018", "201771180005", false, "", true, "12349", "Educação", "Ensino Fundamental", "Programa Educação", "Ação Ensino Fundamental", "Plano Educação 2025", 6000000.00, 4800000.00, 3000000.00, "Olinda", 1200000.00, 240000.00, 480000.00);
        EmendaParlamentar emendaBancada3 = new EmendaParlamentar(2025, "Bancada", "Bancada de Pernambuco", "202024570019", "201771180006", false, "", true, "12350", "Infraestrutura", "Transportes", "Programa Infraestrutura", "Ação Transporte Urbano", "Plano Infraestrutura 2025", 7000000.00, 5600000.00, 3500000.00, "Caruaru", 1400000.00, 280000.00, 560000.00);

        EmendaParlamentar emendaComissao1 = new EmendaParlamentar(2025, "Comissão", "Comissão de Saúde", "202024570020", "201771180007", false, "", true, "12351", "Saúde", "Assistência Social", "Programa Saúde", "Ação Saúde Básica", "Plano Saúde 2025", 8000000.00, 6400000.00, 4000000.00, "Recife", 1600000.00, 320000.00, 640000.00);
        EmendaParlamentar emendaComissao2 = new EmendaParlamentar(2025, "Comissão", "Comissão de Educação", "202024570021", "201771180008", false, "", true, "12352", "Educação", "Ensino Fundamental", "Programa Educação", "Ação Ensino Fundamental", "Plano Educação 2025", 9000000.00, 7200000.00, 4500000.00, "Olinda", 1800000.00, 360000.00, 720000.00);
        EmendaParlamentar emendaComissao3 = new EmendaParlamentar(2025, "Comissão", "Comissão de Infraestrutura", "202024570022", "201771180009", false, "", true, "12353", "Infraestrutura", "Transportes", "Programa Infraestrutura", "Ação Transporte Urbano", "Plano Infraestrutura 2025", 10000000.00, 8000000.00, 5000000.00, "Caruaru", 2000000.00, 400000.00, 800000.00);

        EmendaParlamentar emendaRelator1 = new EmendaParlamentar(2025, "Relator", "Relator Geral", "202024570023", "201771180010", false, "", true, "12354", "Saúde", "Assistência Social", "Programa Saúde", "Ação Saúde Básica", "Plano Saúde 2025", 11000000.00, 8800000.00, 5500000.00, "Recife", 2200000.00, 440000.00, 880000.00);
        EmendaParlamentar emendaRelator2 = new EmendaParlamentar(2025, "Relator", "Relator Geral", "202024570024", "201771180011", false, "", true, "12355", "Educação", "Ensino Fundamental", "Programa Educação", "Ação Ensino Fundamental", "Plano Educação 2025", 12000000.00, 9600000.00, 6000000.00, "Olinda", 2400000.00, 480000.00, 960000.00);
        EmendaParlamentar emendaRelator3 = new EmendaParlamentar(2025, "Relator", "Relator Geral", "202024570025", "201771180012", false, "", true, "12356", "Infraestrutura", "Transportes", "Programa Infraestrutura", "Ação Transporte Urbano", "Plano Infraestrutura 2025", 13000000.00, 10400000.00, 6500000.00, "Caruaru", 2600000.00, 520000.00, 1040000.00);

        System.out.println("Emenda individual 1: " + emenda1.getNumeroEmenda());
        System.out.println("Emenda bancada 2: " + emendaBancada2.getNumeroEmenda());
        System.out.println("Emenda comissao 3: " + emendaComissao3.getNumeroEmenda());
        System.out.println("Emenda relator 1: " + emendaRelator1.getNumeroEmenda());
    }
}
