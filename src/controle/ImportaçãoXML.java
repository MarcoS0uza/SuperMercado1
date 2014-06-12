package controle;

import entidade.NotaFiscal;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class ImportaçãoXML {

    public static void getNF() {
        JFileChooser chooser;
        chooser = new JFileChooser();
        File file = null;
        int retorno = chooser.showOpenDialog(null);
        if (retorno == JFileChooser.APPROVE_OPTION) {
            file = new File(chooser.getSelectedFile().getAbsolutePath()); 
        }
            SAXBuilder builder = new SAXBuilder();
            try {
                Document document = builder.build(file);
                Element xml = (Element) document.getRootElement();
                JOptionPane.showMessageDialog(null, xml.getChildren().get(1).getChildText("infNFe"));
                
/*              
                List  = frameset.getChildren("predicate");

                for (int k = 0; k < predicate.size(); k++) {
                    verb_frame_set.addPredicateLemma(extractPredicateLemma(frameset, k));
                }
            } catch (JDOMException ex) {
                System.out.println("Erro de JDOM " + ex.getMessage());
            } catch (IOException ex) {
                System.out.println("Erro de IO " + ex.getMessage());
            }
            return verb_frame_set;

        }
*/
    }       catch (JDOMException ex) {
                Logger.getLogger(ImportaçãoXML.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(ImportaçãoXML.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    



}
