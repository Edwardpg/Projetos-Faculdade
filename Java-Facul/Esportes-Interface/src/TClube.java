import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;


public class TClube implements IEsporte,IModalidade {
	private static String AnEsporte;
	private static String ACampeao;
	private static String AModalidade;
	private static String APatrocinio;
	private String SalvaTXT;
	public static String salvar;
	
	private final String DescricaoCampeao = "Campeao: ";
	private final String DescricaoEsporte = "Esporte: ";
	private final String DescricaoPatrocinio = "Patrocinio: ";
	private final String DescricaoModalidade = "Modalidade: ";
	private final static String DescricaoResultado = "Resultado Final Foi: ";
	private final static String DescricaoErro = "N�o foi possivel Salva Desculpe";
	private final static String CaminhoArquivo = "C://exemplo/Interface.txt";
	
	@Override
	public void setNomeModalidade(String Modalidade) {
		this.AModalidade = Modalidade;
	}

	@Override
	public void setNomePatrocinio(String Patrocinio) {
		this.APatrocinio = Patrocinio;
	}

	@Override
	public String getNomeModalidade() {
		return this.AModalidade;
	}

	@Override
	public String getNomePatrocinio() {
		return this.APatrocinio;
	}

	@Override
	public void setNomeEsporte(String Esporte) {
		this.AnEsporte = Esporte;	
	}

	@Override
	public void setNomeDeUmCampeao(String Campeao) {
		this.ACampeao = Campeao;	
	}

	@Override
	public String getNomeEsporte() {
		return this.AnEsporte;
	}

	@Override
	public String getNomeDeUmCampeao() {
		return this.ACampeao;
	}
	private void PedeDados() {
		Scanner Leitor = new Scanner(System.in);
		
		System.out.println("Digite uma Modalidade: ");
		this.setNomeModalidade(Leitor.nextLine());
		
		System.out.println("Digite um Patroc�nio dessa Modalidade: ");
		this.setNomePatrocinio(Leitor.nextLine());
		
		System.out.println("Digite um Esporte: ");
		this.setNomeEsporte(Leitor.nextLine());
		
		System.out.println("Digite o nome de um Campe�o desse Esporte: ");
		this.setNomeDeUmCampeao(Leitor.nextLine());
	}
	private void MostraDados() {
		System.out.println( DescricaoModalidade + this.getNomeModalidade());
		System.out.println( DescricaoPatrocinio + this.getNomePatrocinio());
		System.out.println( DescricaoEsporte + this.getNomeEsporte());
		System.out.println( DescricaoCampeao + this.getNomeDeUmCampeao());
	}
	public static void main(String[] args) {
		try {
			TClube Atleta = new TClube();
			Atleta.PedeDados();
			System.out.println("\n" + DescricaoResultado);
			Atleta.MostraDados();
			
			FileWriter arquivo = new FileWriter(CaminhoArquivo);
			PrintWriter gravar = new PrintWriter(arquivo);
			salvar = AnEsporte+" "+ACampeao+" "+AModalidade+" "+APatrocinio;
			gravar.println(salvar);
		} catch (Exception e) {
			System.out.println("\n" + DescricaoErro);
		}			
	}
}
