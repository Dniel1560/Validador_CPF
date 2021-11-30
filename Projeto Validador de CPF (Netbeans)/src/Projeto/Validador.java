

    package Projeto;

    /**
     *
     * @author dniel
     */


            
    import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.plaf.metal.DefaultMetalTheme;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.metal.OceanTheme;
    
            public class Validador {
 private static String LOOKANDFEEL = "";
 private static String THEME = "Ocean";
              public static void main(String[] args) {
                  
                  
                  
                  
                  
                  LOOKANDFEEL = "Quaqua-7.3.4";
        initLookAndFeel();
                  
                   TelaInicial tela=new TelaInicial();
               tela.setVisible(true);
                Scanner ler = new Scanner(System.in);
            
                String CPF;

                
                }
              private static void initLookAndFeel() {

        String enderecoDoTema = null;

        if (LOOKANDFEEL != null) {

            if (LOOKANDFEEL.equals("JTatto")) {
                
                
                // If L&F = "Metal", set the theme
                 enderecoDoTema = UIManager.getCrossPlatformLookAndFeelClassName();
                //  an alternative way to set the Metal L&F is to replace the 
                // previous line with:

               // enderecoDoTema = "javax.swing.plaf.metal.MetalLookAndFeel";
                try {
                    UIManager.setLookAndFeel(enderecoDoTema);

                } catch (Exception ex) {
                    Logger.getLogger(Validador.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (THEME.equals("DefaultMetal")) {
                    MetalLookAndFeel.setCurrentTheme(new DefaultMetalTheme());
                } else if (THEME.equals("Ocean")) {
                    MetalLookAndFeel.setCurrentTheme(new OceanTheme());
                } else {
                    MetalLookAndFeel.setCurrentTheme(new TemaLookandFeel());
                }

                try {

                    UIManager.setLookAndFeel(new MetalLookAndFeel());
                } catch (Exception ex) {

                    Logger.getLogger(Validador.class.getName()).log(Level.SEVERE, null, ex);
                }
                return;

            } else if (LOOKANDFEEL.equals("System")) {
                enderecoDoTema = UIManager.getSystemLookAndFeelClassName();
            } else if (LOOKANDFEEL.equals("Motif")) {
                enderecoDoTema = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
            } else if (LOOKANDFEEL.equals("GTK")) {
                enderecoDoTema = "com.sun.java.swing.plaf.gtk.GTKLookAndFeel";
            } else if (LOOKANDFEEL.equals("Nimbus")) {
                setLook("Nimbus");
            } else if (LOOKANDFEEL.equals("CDE/Motif")) {
                setLook("CDE/Motif");
            } else if (LOOKANDFEEL.equals("Windows Classic")) {
                setLook("Windows Classic");
            } else if (LOOKANDFEEL.equals("Windows")) {
                setLook("Windows");
            } else if (LOOKANDFEEL.equals("JTatto")) {
                //http://www.jtattoo.net/ScreenShots.html

                // enderecoDoTema="com.jtattoo.plaf.texture.TextureLookAndFeel";
                // enderecoDoTema="com.jtattoo.plaf.noire.NoireLookAndFeel";
                // enderecoDoTema="com.jtattoo.plaf.acryl.AcrylLookAndFeel";
                //  enderecoDoTema ="com.jtattoo.plaf.aluminium.AluminiumLookAndFeel";
                //enderecoDoTema="com.jtattoo.plaf.hifi.HiFiLookAndFeel";
                // enderecoDoTema="com.jtattoo.plaf.graphite.GraphiteLookAndFeel";
            } else if (LOOKANDFEEL.equals("Quaqua-7.3.4")) {
                //enderecoDoTema="ch.randelshofer.quaqua.tiger.Quaqua15TigerCrossPlatformLookAndFeel"; 
               enderecoDoTema="ch.randelshofer.quaqua.QuaquaLookAndFeel15"; 
                 //enderecoDoTema="ch.randelshofer.quaqua.tiger.Quaqua16SnowLeopardLookAndFeel"; 
            }else {

                System.err.println("Unexpected value of LOOKANDFEEL specified: "
                        + LOOKANDFEEL);
                enderecoDoTema = UIManager.getCrossPlatformLookAndFeelClassName();
            }

            try {
                //AQUI ATUALIZAMOS A UI(INTERFACE DE USUÁRIO) COM 
                // o ENDEREÇO DO TEMA ESCOLHIDO.
                UIManager.setLookAndFeel(enderecoDoTema);

            } catch (Exception e) {
                System.out.println("Erro L&f:" + e);
            }

        }

    }

    private static void setLook(String nimbus) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            }
