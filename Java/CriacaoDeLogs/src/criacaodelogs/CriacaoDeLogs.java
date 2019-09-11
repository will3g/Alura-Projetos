package criacaodelogs;

import java.io.IOException;
import java.util.logging.Logger;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.SimpleFormatter;

public class CriacaoDeLogs {

    public static void main(String[] args) throws IOException {

        /*Assegura que o diretório seja criado*/
        Files.createDirectories(Paths.get("logs"));

        /*Obtém a data a ser usada no nome do arquivo*/
        DateTimeFormatter formataData = DateTimeFormatter.ofPattern("yyyyMMdd_hhmm");
        LocalDateTime agora = LocalDateTime.now();
        String data = agora.format(formataData);

        /*Define o nome do arquivo no diretório logs*/
        String logFileName = "logs\\testlog-" + data + ".txt";

        /*Define Logger*/
        FileHandler meuFileHandler = new FileHandler(logFileName);
        meuFileHandler.setFormatter(new SimpleFormatter());
        Logger arquivoLog = Logger.getLogger("Meu arquivo log");
        arquivoLog.setLevel(Level.ALL);
        arquivoLog.addHandler(meuFileHandler);

        /*Mensagem do log*/
        arquivoLog.info("\nEsta é uma mensagem informativa de um arquivo log");

        /*Fecha o arquivo*/
        meuFileHandler.close();

    }

}
