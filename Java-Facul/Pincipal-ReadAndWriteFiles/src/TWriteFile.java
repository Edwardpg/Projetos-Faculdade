import java.io.PrintWriter;

//heran�a da classe TreadFile
public class TWriteFile extends TReadFile{
	//atributo gravo
	PrintWriter grava;
	
	public void setGrava() {
		this.setLocal("C:/exemplo/MyArqClasses.txt");
		this.setLeitor();
		
		grava = new PrintWriter(this.getLeitor());
		
		String Conteudo;
		
		Conteudo = "Vamos testar este bagulho";
		
		grava.printf(Conteudo);
		
		grava.close();
	}
}
