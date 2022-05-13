/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomadeira;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.BasicStroke;
import java.awt.Color;
import static java.awt.Component.TOP_ALIGNMENT;
import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


/**
 *
 * @author mathe
 */
public class TelaCorteSimples10 extends javax.swing.JFrame {
    
 
    
    public TelaCorteSimples10() {
        this.setLocation(233,120);
        initComponents();
        int valorprego;
        double pegarvalordaforça;
        valorangdif.setVisible(false);
    }
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        escolheraligação = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        teladefundoprincipal = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tipodeligaçãoaserescolhida = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ligaçãoparafusada1 = new javax.swing.JRadioButton();
        ligacaocavilha1 = new javax.swing.JRadioButton();
        am0 = new javax.swing.JRadioButton();
        ang90 = new javax.swing.JRadioButton();
        angdif = new javax.swing.JRadioButton();
        valorangdif = new javax.swing.JTextField();
        liganel1 = new javax.swing.JRadioButton();
        fundodatelaligação = new javax.swing.JLabel();
        telaescolhaanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jComboBox4 = new javax.swing.JComboBox<>();
        perf = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        pregoeparafuso = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        escoprego = new javax.swing.JComboBox<>();
        diametroprego = new javax.swing.JLabel();
        penmini = new javax.swing.JLabel();
        Bitola = new javax.swing.JLabel();
        comprprego = new javax.swing.JLabel();
        escopara = new javax.swing.JComboBox<>();
        ligprego = new javax.swing.JRadioButton();
        ligpara = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        escolhacavilha = new javax.swing.JPanel();
        cavj = new javax.swing.JComboBox<>();
        jComboBox11 = new javax.swing.JComboBox<>();
        jComboBox16 = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jComboBox14 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        Escolhamadeira = new javax.swing.JPanel();
        compr = new javax.swing.JTextField();
        espessurat2 = new javax.swing.JTextField();
        espessurat1 = new javax.swing.JTextField();
        larguralig = new javax.swing.JTextField();
        jComboBox15 = new javax.swing.JComboBox<>();
        jComboBox13 = new javax.swing.JComboBox<>();
        jComboBox9 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox10 = new javax.swing.JComboBox<>();
        selco = new javax.swing.JRadioButton();
        respapa = new javax.swing.JLabel();
        resecom = new javax.swing.JLabel();
        resfc0k = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        seldico = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        escolhadacarga = new javax.swing.JPanel();
        Tipodevariabilidade = new javax.swing.JComboBox<>();
        paraefeitos = new javax.swing.JComboBox<>();
        variavel = new javax.swing.JComboBox<>();
        combinação = new javax.swing.JComboBox<>();
        acoescorrentes = new javax.swing.JComboBox<>();
        cargasacid = new javax.swing.JComboBox<>();
        sobrecarga = new javax.swing.JTextField();
        permanente = new javax.swing.JTextField();
        vento = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        resultanel = new javax.swing.JPanel();
        resultperma1 = new javax.swing.JLabel();
        resultvent1 = new javax.swing.JLabel();
        resulkmod4 = new javax.swing.JLabel();
        resulkmod5 = new javax.swing.JLabel();
        resulkmod6 = new javax.swing.JLabel();
        resulkmod7 = new javax.swing.JLabel();
        rescomcal1 = new javax.swing.JLabel();
        resutembut1 = new javax.swing.JLabel();
        diam1 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        resultadosdospregos = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        resultadoscavilha = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        Resultadoparafuso = new javax.swing.JPanel();
        resultperma = new javax.swing.JLabel();
        resultvent = new javax.swing.JLabel();
        resulkmod1 = new javax.swing.JLabel();
        resulkmod2 = new javax.swing.JLabel();
        resulkmod3 = new javax.swing.JLabel();
        resulkmod = new javax.swing.JLabel();
        rescomcal = new javax.swing.JLabel();
        resutembut = new javax.swing.JLabel();
        diam = new javax.swing.JLabel();
        bet = new javax.swing.JLabel();
        betlimite = new javax.swing.JLabel();
        jlabelre = new javax.swing.JLabel();
        numpara = new javax.swing.JLabel();
        alfaetext = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();

        setTitle("Dimensionamento Corte Simples");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("quadro-de-madeira.png")).getImage());
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        escolheraligação.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                escolheraligaçãoMouseClicked(evt);
            }
        });
        jPanel2.add(escolheraligação, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 264, 180, 20));

        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 180, 20));

        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 354, 180, 20));

        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 180, 20));

        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 180, 20));

        teladefundoprincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetomadeira/telalateralcortesimples.png"))); // NOI18N
        jPanel2.add(teladefundoprincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel5.add(jPanel2);

        jPanel1.setLayout(new java.awt.CardLayout());

        tipodeligaçãoaserescolhida.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        tipodeligaçãoaserescolhida.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 80, 30));

        ligaçãoparafusada1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(ligaçãoparafusada1);
        ligaçãoparafusada1.setSelected(true);
        ligaçãoparafusada1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ligaçãoparafusada1ActionPerformed(evt);
            }
        });
        tipodeligaçãoaserescolhida.add(ligaçãoparafusada1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        ligacaocavilha1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(ligacaocavilha1);
        ligacaocavilha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ligacaocavilha1ActionPerformed(evt);
            }
        });
        tipodeligaçãoaserescolhida.add(ligacaocavilha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 133, -1, -1));

        am0.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(am0);
        am0.setSelected(true);
        am0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                am0MouseClicked(evt);
            }
        });
        tipodeligaçãoaserescolhida.add(am0, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, -1));

        ang90.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(ang90);
        ang90.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ang90MouseClicked(evt);
            }
        });
        ang90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ang90ActionPerformed(evt);
            }
        });
        tipodeligaçãoaserescolhida.add(ang90, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 20, -1));

        angdif.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(angdif);
        angdif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                angdifMouseClicked(evt);
            }
        });
        angdif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angdifActionPerformed(evt);
            }
        });
        tipodeligaçãoaserescolhida.add(angdif, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, -1, -1));

        valorangdif.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        valorangdif.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tipodeligaçãoaserescolhida.add(valorangdif, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 50, 30));

        liganel1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(liganel1);
        tipodeligaçãoaserescolhida.add(liganel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        fundodatelaligação.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetomadeira/telaescolhacortesimples.png"))); // NOI18N
        tipodeligaçãoaserescolhida.add(fundodatelaligação, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 500));

        jPanel1.add(tipodeligaçãoaserescolhida, "card14");

        telaescolhaanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable4.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"64", "4"},
                {"102", "5"}
            },
            new String [] {
                "Diametrôs Permitidos(mm)", "Espessura Mínima da Anel(mm)"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        telaescolhaanel.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 330, 60));

        jComboBox4.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "64", "102" }));
        telaescolhaanel.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 60, -1));

        perf.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        telaescolhaanel.add(perf, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 60, -1));

        jLabel85.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel85MouseClicked(evt);
            }
        });
        telaescolhaanel.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 80, 30));

        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetomadeira/teladaescolhaanelmetalico.png"))); // NOI18N
        telaescolhaanel.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(telaescolhaanel, "card10");

        pregoeparafuso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "17x21",  new Double(3.0),  new Double(51.0),  new Double(36.0)},
                {"2", "17x24",  new Double(3.0),  new Double(57.0),  new Double(36.0)},
                {"3", "17x27",  new Double(3.0),  new Double(63.0),  new Double(36.0)},
                {"4", "17x30",  new Double(3.0),  new Double(69.0),  new Double(36.0)},
                {"5", "18x24",  new Double(3.4),  new Double(57.0),  new Double(41.0)},
                {"6", "18x27",  new Double(3.4),  new Double(63.0),  new Double(41.0)},
                {"7", "18x30",  new Double(3.4),  new Double(69.0),  new Double(41.0)},
                {"8", "18x33",  new Double(3.4),  new Double(76.0),  new Double(41.0)},
                {"9", "18x36",  new Double(3.4),  new Double(82.0),  new Double(41.0)},
                {"10", "19x27",  new Double(3.9),  new Double(63.0),  new Double(47.0)},
                {"11", "19x30",  new Double(3.9),  new Double(69.0),  new Double(47.0)},
                {"12", "19x33",  new Double(3.9),  new Double(76.0),  new Double(47.0)},
                {"13", "19x36",  new Double(3.9),  new Double(82.0),  new Double(47.0)},
                {"14", "19x39",  new Double(3.9),  new Double(89.0),  new Double(47.0)},
                {"15", "20x30",  new Double(4.4),  new Double(69.0),  new Double(53.0)},
                {"16", "20x33",  new Double(4.4),  new Double(76.0),  new Double(53.0)},
                {"17", "20x39",  new Double(4.4),  new Double(89.0),  new Double(53.0)},
                {"18", "20x42",  new Double(4.4),  new Double(95.0),  new Double(53.0)},
                {"19", "20x48",  new Double(4.4),  new Double(108.0),  new Double(53.0)},
                {"20", "21x33",  new Double(4.9),  new Double(76.0),  new Double(59.0)},
                {"21", "21x45",  new Double(4.9),  new Double(101.0),  new Double(59.0)},
                {"22", "21x48",  new Double(4.9),  new Double(108.0),  new Double(59.0)},
                {"23", "21x54",  new Double(4.9),  new Double(127.0),  new Double(59.0)},
                {"24", "22x42",  new Double(5.4),  new Double(95.0),  new Double(65.0)},
                {"25", "22x45",  new Double(5.4),  new Double(101.0),  new Double(65.0)},
                {"26", "22x48",  new Double(5.4),  new Double(108.0),  new Double(65.0)},
                {"27", "22x51",  new Double(5.4),  new Double(114.0),  new Double(65.0)},
                {"28", "22x54",  new Double(5.9),  new Double(127.0),  new Double(65.0)},
                {"29", "23x45",  new Double(5.9),  new Double(102.0),  new Double(71.0)},
                {"30", "23x54",  new Double(5.9),  new Double(127.0),  new Double(71.0)},
                {"31", "23x60",  new Double(5.9),  new Double(140.0),  new Double(71.0)},
                {"32", "23x66",  new Double(5.9),  new Double(152.0),  new Double(71.0)},
                {"33", "24x60",  new Double(6.4),  new Double(140.0),  new Double(77.0)},
                {"34", "24x66",  new Double(6.4),  new Double(152.0),  new Double(77.0)},
                {"35", "25x72",  new Double(6.4),  new Double(165.0),  new Double(84.0)},
                {"36", "26x72",  new Double(7.6),  new Double(165.0),  new Double(91.0)},
                {"37", "26x78",  new Double(7.6),  new Double(178.0),  new Double(91.0)},
                {"38", "26x84",  new Double(7.6),  new Double(190.0),  new Double(91.0)}
            },
            new String [] {
                "Opções", "Bitola", "d(mm)", "l(mm)", "Penetração mínima*12d(mm)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setOpaque(false);
        jScrollPane1.setViewportView(jTable1);

        pregoeparafuso.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 400, 80));

        jTable2.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Double(1.25), "1/2\""},
                { new Double(1.6), "5/8\""},
                { new Double(1.9), "3/4\""},
                { new Double(2.2), "7/8\""},
                { new Double(2.5), "1\""},
                { new Double(3.1), "1 1/4\""},
                { new Double(3.8), "1 1/2\""}
            },
            new String [] {
                "Diâmetro (cm)", "Diâmetro (pol)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        pregoeparafuso.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 240, 80));

        escoprego.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        escoprego.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38" }));
        escoprego.setBorder(null);
        escoprego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escopregoActionPerformed(evt);
            }
        });
        pregoeparafuso.add(escoprego, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 50, -1));

        diametroprego.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        diametroprego.setForeground(new java.awt.Color(255, 255, 255));
        diametroprego.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pregoeparafuso.add(diametroprego, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 50, 25));

        penmini.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        penmini.setForeground(new java.awt.Color(255, 255, 255));
        penmini.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pregoeparafuso.add(penmini, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 50, 25));

        Bitola.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        Bitola.setForeground(new java.awt.Color(255, 255, 255));
        Bitola.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pregoeparafuso.add(Bitola, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 215, 50, 25));

        comprprego.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        comprprego.setForeground(new java.awt.Color(255, 255, 255));
        comprprego.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pregoeparafuso.add(comprprego, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 215, 50, 25));

        escopara.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        escopara.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12.5", "16.0", "19.0", "22.0", "25.0", "31.0", "38.0", " " }));
        escopara.setBorder(null);
        escopara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escoparaActionPerformed(evt);
            }
        });
        pregoeparafuso.add(escopara, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 60, -1));

        ligprego.setBackground(new java.awt.Color(242, 103, 84));
        buttonGroup5.add(ligprego);
        ligprego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ligpregoActionPerformed(evt);
            }
        });
        pregoeparafuso.add(ligprego, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        ligpara.setBackground(new java.awt.Color(242, 103, 84));
        buttonGroup5.add(ligpara);
        pregoeparafuso.add(ligpara, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 327, -1, -1));

        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        pregoeparafuso.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 444, 90, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetomadeira/Telaescolhametalica.png"))); // NOI18N
        pregoeparafuso.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel61.setText("jLabel61");
        pregoeparafuso.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, -1, -1));

        jPanel1.add(pregoeparafuso, "card13");

        escolhacavilha.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cavj.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "16", "18", "20" }));
        cavj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cavjActionPerformed(evt);
            }
        });
        escolhacavilha.add(cavj, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 415, 50, 20));

        jComboBox11.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Madeira Serrada", "Madeira Laminada Colada", "Madeira Compensada", "Madeira Recomposta" }));
        escolhacavilha.add(jComboBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 125, 190, 20));

        jComboBox16.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        escolhacavilha.add(jComboBox16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 185, 50, 20));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Dicotiledônea", "C60", "16"},
                {"Dicotiledônea", "C60", "18"},
                {"Dicotiledônea", "C60", "20"}
            },
            new String [] {
                "Madeira", "Classe da Madeira", "Diâmetro da Cavilha(mm)"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        escolhacavilha.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 420, 80));

        jComboBox14.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        escolhacavilha.add(jComboBox14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 155, 50, 20));

        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        escolhacavilha.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 444, 80, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetomadeira/telaescolhacavilha.png"))); // NOI18N
        escolhacavilha.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel82.setText("jLabel82");
        escolhacavilha.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, -1));

        jLabel83.setText("jLabel83");
        escolhacavilha.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, -1));

        jLabel84.setText("jLabel84");
        escolhacavilha.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        jPanel1.add(escolhacavilha, "card12");

        Escolhamadeira.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        compr.setBackground(new java.awt.Color(223, 104, 4));
        compr.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        compr.setForeground(new java.awt.Color(255, 255, 255));
        compr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        compr.setBorder(null);
        Escolhamadeira.add(compr, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 30, 25));

        espessurat2.setBackground(new java.awt.Color(223, 104, 4));
        espessurat2.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        espessurat2.setForeground(new java.awt.Color(255, 255, 255));
        espessurat2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        espessurat2.setBorder(null);
        Escolhamadeira.add(espessurat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 423, 30, 25));

        espessurat1.setBackground(new java.awt.Color(223, 104, 4));
        espessurat1.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        espessurat1.setForeground(new java.awt.Color(255, 255, 255));
        espessurat1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        espessurat1.setBorder(null);
        espessurat1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Escolhamadeira.add(espessurat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 392, 30, 25));

        larguralig.setBackground(new java.awt.Color(223, 104, 4));
        larguralig.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        larguralig.setForeground(new java.awt.Color(255, 255, 255));
        larguralig.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        larguralig.setBorder(null);
        Escolhamadeira.add(larguralig, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 30, 25));

        jComboBox15.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        jComboBox15.setBorder(null);
        jComboBox15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox15ActionPerformed(evt);
            }
        });
        Escolhamadeira.add(jComboBox15, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 298, 50, 20));

        jComboBox13.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        jComboBox13.setBorder(null);
        Escolhamadeira.add(jComboBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 328, 50, 20));

        jComboBox9.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Madeira Serrada", "Madeira Laminada Colada", "Madeira Compensada", "Madeira Recomposta" }));
        jComboBox9.setBorder(null);
        jComboBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox9ActionPerformed(evt);
            }
        });
        Escolhamadeira.add(jComboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 330, 150, 20));

        jComboBox1.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C20", "C30", "C40", "C60" }));
        jComboBox1.setBorder(null);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        Escolhamadeira.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 50, 55, 20));

        jComboBox10.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Permanente", "Longa duração", "Média duração", "Curta duração", "Instantânea" }));
        jComboBox10.setBorder(null);
        jComboBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox10ActionPerformed(evt);
            }
        });
        Escolhamadeira.add(jComboBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 140, 20));

        selco.setBackground(new java.awt.Color(242, 103, 84));
        buttonGroup2.add(selco);
        selco.setFont(new java.awt.Font("Bahnschrift", 0, 10)); // NOI18N
        selco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selcoMouseClicked(evt);
            }
        });
        selco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selcoActionPerformed(evt);
            }
        });
        Escolhamadeira.add(selco, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, 20));

        respapa.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        respapa.setForeground(new java.awt.Color(255, 255, 255));
        respapa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Escolhamadeira.add(respapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 215, 50, 25));

        resecom.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        resecom.setForeground(new java.awt.Color(255, 255, 255));
        resecom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Escolhamadeira.add(resecom, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 50, 25));

        resfc0k.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        resfc0k.setForeground(new java.awt.Color(255, 255, 255));
        resfc0k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Escolhamadeira.add(resfc0k, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 50, 25));

        jLabel26.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Escolhamadeira.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 50, 25));

        seldico.setBackground(new java.awt.Color(242, 103, 84));
        buttonGroup2.add(seldico);
        seldico.setFont(new java.awt.Font("Bahnschrift", 0, 10)); // NOI18N
        seldico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seldicoMouseClicked(evt);
            }
        });
        seldico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seldicoActionPerformed(evt);
            }
        });
        Escolhamadeira.add(seldico, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 50, 20, -1));

        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        Escolhamadeira.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 80, 40));

        jComboBox2.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C20", "C25", "C30" }));
        jComboBox2.setBorder(null);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        Escolhamadeira.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 50, 55, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetomadeira/telamadeiracortesimples.png"))); // NOI18N
        Escolhamadeira.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel56.setText("jLabel56");
        Escolhamadeira.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, -1, -1));

        jLabel59.setText("jLabel59");
        Escolhamadeira.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, -1));

        jPanel1.add(Escolhamadeira, "card11");

        escolhadacarga.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tipodevariabilidade.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        Tipodevariabilidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ações de Pequena Variabilidade", "Ações de Grande Variabilidade" }));
        escolhadacarga.add(Tipodevariabilidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 138, -1, -1));

        paraefeitos.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        paraefeitos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desfavoráveis", "Favoráveis" }));
        escolhadacarga.add(paraefeitos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        variavel.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        variavel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ações Variáveis em Geral", "Efeitos da Temperatura" }));
        escolhadacarga.add(variavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 196, -1, -1));

        combinação.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        combinação.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normais", "Especiais ou de Construções", "Excepicionais" }));
        combinação.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combinaçãoActionPerformed(evt);
            }
        });
        escolhadacarga.add(combinação, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 90, -1));

        acoescorrentes.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        acoescorrentes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Variações uniformes de Temperatura", "Pressão Dinâmica do Vento" }));
        escolhadacarga.add(acoescorrentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 288, 215, -1));

        cargasacid.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        cargasacid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não há pred. de Equipamentos Fixos nem de el. concentr", "Há pred. de Equipamentos Fixos ou de elev. Concentração.", "Bibliotecas, arquivos, oficinas ou garagens", " " }));
        cargasacid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargasacidActionPerformed(evt);
            }
        });
        escolhadacarga.add(cargasacid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 228, 270, -1));

        sobrecarga.setBackground(new java.awt.Color(223, 104, 4));
        sobrecarga.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        sobrecarga.setForeground(new java.awt.Color(255, 255, 255));
        sobrecarga.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sobrecarga.setBorder(null);
        sobrecarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobrecargaActionPerformed(evt);
            }
        });
        escolhadacarga.add(sobrecarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 166, 50, 25));

        permanente.setBackground(new java.awt.Color(223, 104, 4));
        permanente.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        permanente.setForeground(new java.awt.Color(255, 255, 255));
        permanente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        permanente.setBorder(null);
        escolhadacarga.add(permanente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 50, 25));

        vento.setBackground(new java.awt.Color(223, 104, 4));
        vento.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        vento.setForeground(new java.awt.Color(255, 255, 255));
        vento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        vento.setBorder(null);
        escolhadacarga.add(vento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 252, 50, 25));

        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
        });
        escolhadacarga.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 80, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetomadeira/telacargacerto.png"))); // NOI18N
        escolhadacarga.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel20.setText("jLabel20");
        escolhadacarga.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jLabel60.setText("jLabel60");
        escolhadacarga.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, -1));

        jPanel1.add(escolhadacarga, "card10");

        resultanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resultperma1.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        resultperma1.setForeground(new java.awt.Color(255, 255, 255));
        resultanel.add(resultperma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 77, 30, 20));

        resultvent1.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        resultvent1.setForeground(new java.awt.Color(255, 255, 255));
        resultanel.add(resultvent1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 108, 50, 20));

        resulkmod4.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        resulkmod4.setForeground(new java.awt.Color(255, 255, 255));
        resultanel.add(resulkmod4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 186, 40, 20));

        resulkmod5.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        resulkmod5.setForeground(new java.awt.Color(255, 255, 255));
        resultanel.add(resulkmod5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 186, 40, 20));

        resulkmod6.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        resulkmod6.setForeground(new java.awt.Color(255, 255, 255));
        resultanel.add(resulkmod6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 186, 40, 20));

        resulkmod7.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        resulkmod7.setForeground(new java.awt.Color(255, 255, 255));
        resultanel.add(resulkmod7, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 186, 40, 20));

        rescomcal1.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        rescomcal1.setForeground(new java.awt.Color(255, 255, 255));
        resultanel.add(rescomcal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 258, 50, 20));

        resutembut1.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        resutembut1.setForeground(new java.awt.Color(255, 255, 255));
        resultanel.add(resutembut1, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 287, 50, 20));

        diam1.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        diam1.setForeground(new java.awt.Color(255, 255, 255));
        resultanel.add(diam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 355, 40, 20));

        jLabel87.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(255, 255, 255));
        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel87.setToolTipText("");
        resultanel.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 382, 50, 25));

        jLabel92.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(255, 255, 255));
        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel92.setToolTipText("");
        resultanel.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 446, 50, 25));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        jButton4.setText("Gerar PDF");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        resultanel.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 90, 30));

        jLabel88.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(255, 255, 255));
        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel88.setToolTipText("");
        resultanel.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 415, 50, 25));

        jLabel89.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(255, 255, 255));
        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel89.setToolTipText("");
        resultanel.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 40, 25));

        jLabel90.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel90MouseClicked(evt);
            }
        });
        resultanel.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 90, 30));

        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetomadeira/resultadoanel.png"))); // NOI18N
        resultanel.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel93.setText("jLabel93");
        resultanel.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));

        jLabel94.setText("jLabel94");
        resultanel.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));

        jPanel1.add(resultanel, "card11");

        resultadosdospregos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        resultadosdospregos.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 90, 30));

        jLabel38.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        resultadosdospregos.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 40, 25));

        jLabel39.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        resultadosdospregos.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 40, 25));

        jLabel40.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        resultadosdospregos.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 180, 40, 25));

        jLabel41.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        resultadosdospregos.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 180, 40, 25));

        jLabel42.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        resultadosdospregos.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 73, 40, 25));

        jLabel43.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        resultadosdospregos.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 105, 40, 25));

        jLabel49.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        resultadosdospregos.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 40, 25));

        jLabel50.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        resultadosdospregos.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 40, 25));

        jLabel51.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        resultadosdospregos.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 367, 40, 25));

        jLabel52.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        resultadosdospregos.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 400, 30, 25));

        jLabel53.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        resultadosdospregos.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 30, 25));

        jLabel54.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        resultadosdospregos.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 60, 25));

        jLabel55.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        resultadosdospregos.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 430, 60, 25));

        jLabel47.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        resultadosdospregos.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 368, 40, 25));

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        resultadosdospregos.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 305, 20, 15));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        jButton2.setText("Gerar PDF");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        resultadosdospregos.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 90, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetomadeira/resultadoprego0.png"))); // NOI18N
        resultadosdospregos.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel68.setText("jLabel68");
        resultadosdospregos.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        jLabel69.setText("jLabel69");
        resultadosdospregos.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        jLabel70.setText("jLabel70");
        resultadosdospregos.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        jLabel71.setText("jLabel71");
        resultadosdospregos.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        jLabel72.setText("jLabel72");
        resultadosdospregos.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));

        jLabel73.setText("jLabel73");
        resultadosdospregos.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, -1));

        jLabel74.setText("jLabel74");
        resultadosdospregos.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, -1));

        jLabel75.setText("jLabel75");
        resultadosdospregos.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        jLabel76.setText("jLabel76");
        resultadosdospregos.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        jLabel95.setText("jLabel95");
        resultadosdospregos.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, -1));

        jLabel96.setText("jLabel96");
        resultadosdospregos.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, -1));

        jLabel97.setText("jLabel97");
        resultadosdospregos.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, -1));

        jLabel100.setText("jLabel100");
        resultadosdospregos.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        jPanel1.add(resultadosdospregos, "card8");

        resultadoscavilha.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        resultadoscavilha.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 77, 40, 20));

        jLabel19.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        resultadoscavilha.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 108, 40, 20));

        jLabel21.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        resultadoscavilha.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 185, 40, 20));

        jLabel22.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        resultadoscavilha.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 185, 40, 20));

        jLabel23.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        resultadoscavilha.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 185, 40, 20));

        jLabel24.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        resultadoscavilha.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 185, 40, 20));

        jLabel25.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        resultadoscavilha.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 263, 40, 20));

        jLabel27.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        resultadoscavilha.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 295, 40, 20));

        jLabel28.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        resultadoscavilha.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 370, 40, 20));

        jLabel29.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        resultadoscavilha.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 402, 40, 20));

        jLabel30.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        resultadoscavilha.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 435, 40, 20));

        jLabel31.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        resultadoscavilha.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 403, 40, 20));

        jLabel32.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        resultadoscavilha.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 435, 40, 20));

        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });
        resultadoscavilha.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 90, 30));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        jButton3.setText("Gerar PDF");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        resultadoscavilha.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 90, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetomadeira/resultadocavilhacerto.png"))); // NOI18N
        resultadoscavilha.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel77.setText("jLabel77");
        resultadoscavilha.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        jLabel78.setText("jLabel78");
        resultadoscavilha.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        jLabel79.setText("jLabel79");
        resultadoscavilha.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, -1));

        jLabel80.setText("jLabel80");
        resultadoscavilha.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        jLabel81.setText("jLabel81");
        resultadoscavilha.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));

        jPanel1.add(resultadoscavilha, "card7");

        Resultadoparafuso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resultperma.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        resultperma.setForeground(new java.awt.Color(255, 255, 255));
        Resultadoparafuso.add(resultperma, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 78, 30, 20));

        resultvent.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        resultvent.setForeground(new java.awt.Color(255, 255, 255));
        Resultadoparafuso.add(resultvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 50, 20));

        resulkmod1.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        resulkmod1.setForeground(new java.awt.Color(255, 255, 255));
        Resultadoparafuso.add(resulkmod1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 185, 40, 20));

        resulkmod2.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        resulkmod2.setForeground(new java.awt.Color(255, 255, 255));
        Resultadoparafuso.add(resulkmod2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 185, 40, 20));

        resulkmod3.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        resulkmod3.setForeground(new java.awt.Color(255, 255, 255));
        Resultadoparafuso.add(resulkmod3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 185, 40, 20));

        resulkmod.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        resulkmod.setForeground(new java.awt.Color(255, 255, 255));
        Resultadoparafuso.add(resulkmod, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 185, 40, 20));

        rescomcal.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        rescomcal.setForeground(new java.awt.Color(255, 255, 255));
        Resultadoparafuso.add(rescomcal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 263, 50, 20));

        resutembut.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        resutembut.setForeground(new java.awt.Color(255, 255, 255));
        Resultadoparafuso.add(resutembut, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 295, 50, 20));

        diam.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        diam.setForeground(new java.awt.Color(255, 255, 255));
        Resultadoparafuso.add(diam, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 40, 20));

        bet.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        bet.setForeground(new java.awt.Color(255, 255, 255));
        Resultadoparafuso.add(bet, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 32, 25));

        betlimite.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        betlimite.setForeground(new java.awt.Color(255, 255, 255));
        Resultadoparafuso.add(betlimite, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 430, 25, 25));

        jlabelre.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        jlabelre.setForeground(new java.awt.Color(255, 255, 255));
        Resultadoparafuso.add(jlabelre, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 50, 20));

        numpara.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        numpara.setForeground(new java.awt.Color(255, 255, 255));
        Resultadoparafuso.add(numpara, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 430, 50, 20));

        alfaetext.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        alfaetext.setForeground(new java.awt.Color(255, 255, 255));
        Resultadoparafuso.add(alfaetext, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 50, 20));

        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        Resultadoparafuso.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 90, 30));

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("20");
        Resultadoparafuso.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 305, 20, 15));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Arial Unicode MS", 0, 10)); // NOI18N
        jButton1.setText("Gerar PDF");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Resultadoparafuso.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 90, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetomadeira/resultadoparafusodif.png"))); // NOI18N
        Resultadoparafuso.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel44.setText("jLabel44");
        Resultadoparafuso.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        jLabel62.setText("jLabel62");
        Resultadoparafuso.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, -1, -1));

        jLabel63.setText("jLabel63");
        Resultadoparafuso.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, -1));

        jLabel64.setText("jLabel64");
        Resultadoparafuso.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        jLabel65.setText("jLabel65");
        Resultadoparafuso.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        jLabel66.setText("jLabel66");
        Resultadoparafuso.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        jLabel67.setText("jLabel67");
        Resultadoparafuso.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, -1));

        jLabel98.setText("jLabel98");
        Resultadoparafuso.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        jLabel99.setText("jLabel99");
        Resultadoparafuso.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, -1));

        jPanel1.add(Resultadoparafuso, "card9");

        jPanel5.add(jPanel1);

        getContentPane().add(jPanel5, "card4");

        jPanel6.setLayout(new java.awt.CardLayout());

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel45MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, 60, 50));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetomadeira/botao.png"))); // NOI18N
        jLabel35.setText("jLabel35");
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 160, 60));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetomadeira/titulosuperior.png"))); // NOI18N
        jLabel36.setText("jLabel36");
        jPanel7.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 420, 50));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetomadeira/botaovoltar.png"))); // NOI18N
        jLabel46.setText("jLabel35");
        jLabel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel46MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 420, 160, 60));

        jLabel37.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Prefuração da Madeira(mm): ");
        jPanel7.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 170, 25));

        jLabel48.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 60, 25));

        jPanel6.add(jPanel7, "card2");

        getContentPane().add(jPanel6, "card5");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        if(ligaçãoparafusada1.isSelected()){
            jPanel1.setVisible(true);
            tipodeligaçãoaserescolhida.setVisible(false);
            resultadosdospregos.setVisible(false);

            resultadoscavilha.setVisible(false);
            escolhacavilha.setVisible(false);
            telaescolhaanel.setVisible(false);
            resultanel.setVisible(false);
            Escolhamadeira.setVisible(false);
            escolhadacarga.setVisible(false);
            pregoeparafuso.setVisible(true);
            Resultadoparafuso.setVisible(false);
        }
        if(ligacaocavilha1.isSelected()){
            jPanel1.setVisible(true);
            tipodeligaçãoaserescolhida.setVisible(false);
            resultadosdospregos.setVisible(false);
            telaescolhaanel.setVisible(false);
            resultanel.setVisible(false);
            resultadoscavilha.setVisible(false);
            escolhacavilha.setVisible(true);

            Escolhamadeira.setVisible(false);
            escolhadacarga.setVisible(false);
            pregoeparafuso.setVisible(false);
            Resultadoparafuso.setVisible(false);
        }
        if(liganel1.isSelected()){
            jPanel1.setVisible(true);
            tipodeligaçãoaserescolhida.setVisible(false);
            resultadosdospregos.setVisible(false);
            telaescolhaanel.setVisible(true);
            resultanel.setVisible(false);
            resultadoscavilha.setVisible(false);
            escolhacavilha.setVisible(false);
            Escolhamadeira.setVisible(false);
            escolhadacarga.setVisible(false);
            pregoeparafuso.setVisible(false);
            Resultadoparafuso.setVisible(false);
        }

    }//GEN-LAST:event_jLabel1MouseClicked

    private void jComboBox15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox15ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String valorresistencia = jComboBox1.getSelectedItem().toString();
        double resmad1 = 0;
        
        /*Valor das resistências e caracterisitcas das dicotiledoneas*/
        if("C20".equals(valorresistencia)&& seldico.isSelected()){
            resmad1 = 40;
            resfc0k.setText("20");
            jLabel26.setText("4");
            resecom.setText("9500");
            respapa.setText("650");
        }
        if("C30".equals(valorresistencia)&& seldico.isSelected()){
            resmad1 = 40;
            resfc0k.setText("30");
            jLabel26.setText("5");
            resecom.setText("14500");
            respapa.setText("800");
        }
        if("C40".equals(valorresistencia)&& seldico.isSelected()){
            resmad1 = 40;
            resfc0k.setText("40");
            jLabel26.setText("6");
            resecom.setText("19500");
            respapa.setText("950");
        }
        if("C60".equals(valorresistencia)&& seldico.isSelected()){
            resmad1 = 40;
            resfc0k.setText("60");
            jLabel26.setText("8");
            resecom.setText("24500");
            respapa.setText("1000");
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox10ActionPerformed

    }//GEN-LAST:event_jComboBox10ActionPerformed

    private void selcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selcoActionPerformed
        
    }//GEN-LAST:event_selcoActionPerformed

    private void seldicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seldicoActionPerformed
     
    }//GEN-LAST:event_seldicoActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        String comprimentopego = compr.getText();
        String largusd = larguralig.getText();
        double comprimentopego2 = Double.parseDouble(comprimentopego);
        double largusd1 = Double.parseDouble(largusd);
        if(ligprego.isSelected()){
            /*diametroprego*/
            String diaçp = diametroprego.getText();
            double diametrodopregoava = Double.parseDouble(diaçp);
            /*pegar comprimento do prego*/
            String comprimentodoprego1 = comprprego.getText();
            double comprimentodopregoesco = Double.parseDouble(comprimentodoprego1);
            /*pegar as espessuras*/
            String t1;
            t1 = espessurat1.getText();
            String t2;
            t2 = espessurat2.getText();
            double t1n = Double.parseDouble(t1);
            double t2n = Double.parseDouble(t2);
            double te = 0;
            double somadot1et2 = t1n+t2n;
            double comp23 = comprimentodopregoesco/10;
            double verificdiam = diametrodopregoava*12;
            double dimin = somadot1et2 - comp23;
            double t4 = t2n - dimin;
            double dif1 = (12/10)*diametrodopregoava;
            /*todos os menores de todos*/
            if(t4>dif1){
            jPanel1.setVisible(true);
            tipodeligaçãoaserescolhida.setVisible(false);
            resultadosdospregos.setVisible(false);
            resultadoscavilha.setVisible(false);
            escolhacavilha.setVisible(false);
            Escolhamadeira.setVisible(false);
            escolhadacarga.setVisible(true);
            pregoeparafuso.setVisible(false);
            Resultadoparafuso.setVisible(false);
            telaescolhaanel.setVisible(false);
            resultanel.setVisible(false);
        
            }else{
                   JOptionPane.showMessageDialog(null,"A espessura t4 deve ser maior 12d de acordo com a norma 7190","Erro no tamanho da peça ou prego",JOptionPane.OK_OPTION); 
            jPanel1.setVisible(true);
            tipodeligaçãoaserescolhida.setVisible(false);
            resultadosdospregos.setVisible(false);
            resultadoscavilha.setVisible(false);
            escolhacavilha.setVisible(false);
            Escolhamadeira.setVisible(true);
            escolhadacarga.setVisible(false);
            pregoeparafuso.setVisible(false);
            Resultadoparafuso.setVisible(false);
            telaescolhaanel.setVisible(false);
            resultanel.setVisible(false);
            } 
        }else{
            jPanel1.setVisible(true);
            tipodeligaçãoaserescolhida.setVisible(false);
            resultadosdospregos.setVisible(false);
            resultadoscavilha.setVisible(false);
            escolhacavilha.setVisible(false);
            telaescolhaanel.setVisible(false);
            resultanel.setVisible(false);
            Escolhamadeira.setVisible(false);
            escolhadacarga.setVisible(true);
            pregoeparafuso.setVisible(false);
            Resultadoparafuso.setVisible(false);
        }
        
    }//GEN-LAST:event_jLabel15MouseClicked

    private void combinaçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combinaçãoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combinaçãoActionPerformed

    private void cargasacidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargasacidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargasacidActionPerformed

    private void sobrecargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobrecargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sobrecargaActionPerformed

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
        if(ligaçãoparafusada1.isSelected()&& ligpara.isSelected()){
            jPanel1.setVisible(true);
            tipodeligaçãoaserescolhida.setVisible(false);
            resultadosdospregos.setVisible(false);
            resultadoscavilha.setVisible(false);
            escolhacavilha.setVisible(false);
            resultanel.setVisible(false);
            Escolhamadeira.setVisible(false);
            escolhadacarga.setVisible(false);
            pregoeparafuso.setVisible(false);
            Resultadoparafuso.setVisible(true);
        }
        if(ligaçãoparafusada1.isSelected()&& ligprego.isSelected()){
            jPanel1.setVisible(true);
            tipodeligaçãoaserescolhida.setVisible(false);
            resultadosdospregos.setVisible(true);
            resultadoscavilha.setVisible(false);
            escolhacavilha.setVisible(false);
            resultanel.setVisible(false);
            Escolhamadeira.setVisible(false);
            escolhadacarga.setVisible(false);
            pregoeparafuso.setVisible(false);
            Resultadoparafuso.setVisible(false);
        }
        if(ligacaocavilha1.isSelected()){
            jPanel1.setVisible(true);
            tipodeligaçãoaserescolhida.setVisible(false);
            resultadosdospregos.setVisible(false);
            resultadoscavilha.setVisible(true);
            escolhacavilha.setVisible(false);
            resultanel.setVisible(false);
            Escolhamadeira.setVisible(false);
            escolhadacarga.setVisible(false);
            pregoeparafuso.setVisible(false);
            Resultadoparafuso.setVisible(false);
        }
        if(liganel1.isSelected()){
            jPanel1.setVisible(true);
            tipodeligaçãoaserescolhida.setVisible(false);
            resultadosdospregos.setVisible(false);
            resultadoscavilha.setVisible(true);
            escolhacavilha.setVisible(false);
            resultanel.setVisible(true);
            Escolhamadeira.setVisible(false);
            escolhadacarga.setVisible(false);
            pregoeparafuso.setVisible(false);
            Resultadoparafuso.setVisible(false);
        }
    }//GEN-LAST:event_jLabel34MouseClicked

    private void cavjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cavjActionPerformed
        String combocav = cavj.getSelectedItem().toString();
        double diametrocav = 0;
        if("16".equals(combocav)){
            diametrocav = 16;
        }
        if("18".equals(combocav)){
            diametrocav = 18;
        }
        if("20".equals(combocav)){
            diametrocav = 20;
        }
    }//GEN-LAST:event_cavjActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        jPanel1.setVisible(true);
        tipodeligaçãoaserescolhida.setVisible(false);
        resultadosdospregos.setVisible(false);

        resultadoscavilha.setVisible(false);
        escolhacavilha.setVisible(false);

        Escolhamadeira.setVisible(true);
        escolhadacarga.setVisible(false);
        pregoeparafuso.setVisible(false);
        Resultadoparafuso.setVisible(false);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void escopregoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escopregoActionPerformed
        String esco = escoprego.getSelectedItem().toString();
        double esco1 = Double.parseDouble(esco);
        for (int i = 1; i<39;i++){
            if(esco1==i){
                int hj = i-1;
                String gj = (String) jTable1.getValueAt(hj, 1);
                Bitola.setText(gj);
                double diask = (double) jTable1.getValueAt(hj, 2);
                String diask1 = String.valueOf(diask);
                diametroprego.setText(diask1);
                double diask2 = (double) jTable1.getValueAt(hj, 3);
                String diask3 = String.valueOf(diask2);
                comprprego.setText(diask3);
                double diask4 = (double) jTable1.getValueAt(hj, 4);
                String diask5 = String.valueOf(diask4);
                penmini.setText(diask5);
            }
        }
    }//GEN-LAST:event_escopregoActionPerformed

    private void escoparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escoparaActionPerformed

    }//GEN-LAST:event_escoparaActionPerformed

    private void ligpregoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ligpregoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ligpregoActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked

        jPanel1.setVisible(true);
        tipodeligaçãoaserescolhida.setVisible(false);
        resultadosdospregos.setVisible(false);

        resultadoscavilha.setVisible(false);
        escolhacavilha.setVisible(false);

        Escolhamadeira.setVisible(true);
        escolhadacarga.setVisible(false);
        pregoeparafuso.setVisible(false);
        Resultadoparafuso.setVisible(false);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        /*Dados iniciais do primeiro elemento de ligação */
        /*Valor das resistências e caracterisitcas das coníferas*/
        String valorresistencia = null;
        double resmad1 = 0;
        double rescis = 0;
        if(selco.isSelected()){
             valorresistencia = jComboBox2.getSelectedItem().toString();
        }
        if(seldico.isSelected()){
             valorresistencia = jComboBox1.getSelectedItem().toString();
        }
        /*se as duas nao estiverem marcadas*/
        if ((selco.isSelected() == false && seldico.isSelected()== false)){}
        if("C20".equals(valorresistencia)&& selco.isSelected()){
            resmad1 = 20;
            rescis = 4;
            resfc0k.setText("20");
            jLabel26.setText("4");
            resecom.setText("3500");
            respapa.setText("500");
            jLabel72.setText("400");
            jLabel68.setText("5");
        }
        if("C25".equals(valorresistencia)&& selco.isSelected()){
            resmad1 = 25;
             rescis = 5;
            resfc0k.setText("25");
            jLabel26.setText("5");
            resecom.setText("8500");
            respapa.setText("550");
            jLabel72.setText("450");
            jLabel68.setText("6.25");
        }
        if("C30".equals(valorresistencia)&& selco.isSelected()){
            resmad1 = 30;
             rescis = 6;
            resfc0k.setText("30");
            jLabel26.setText("6");
            resecom.setText("14500");
            respapa.setText("600");
            jLabel72.setText("500");
            jLabel68.setText("7.5");
        }
        /*Valor das resistências e caracterisitcas das dicotiledoneas*/
        if("C20".equals(valorresistencia)&& seldico.isSelected()){
            resmad1 = 20;
            rescis = 4;
            resfc0k.setText("20");
            jLabel26.setText("4");
            resecom.setText("9500");
            respapa.setText("650");
            jLabel72.setText("500");
            jLabel68.setText("5");
        }
        if("C30".equals(valorresistencia)&& seldico.isSelected()){
            resmad1 = 30;
             rescis = 5;
            resfc0k.setText("30");
            jLabel26.setText("5");
            resecom.setText("14500");
            respapa.setText("800");
            jLabel72.setText("650");
            jLabel68.setText("7.5");
        }
        if("C40".equals(valorresistencia)&& seldico.isSelected()){
            resmad1 = 40;
             rescis = 6;
            resfc0k.setText("40");
            jLabel26.setText("6");
            resecom.setText("19500");
            respapa.setText("950");
            jLabel72.setText("750");
            jLabel68.setText("10");
        }
        if("C60".equals(valorresistencia)&& seldico.isSelected()){
            resmad1 = 60;
            rescis = 8;
            resfc0k.setText("60");
            jLabel26.setText("8");
            resecom.setText("24500");
            respapa.setText("1000");
            jLabel72.setText("800");
            jLabel68.setText("15");
        }
        /*tamanho da madeira*/
        DecimalFormat fe = new DecimalFormat("0.00");
        String b;
        b = compr.getText();
        /*Valor dos kmod1 e kmod2 e kmod3 do elemento de madeira 1*/
        String kmods = jComboBox10.getSelectedItem().toString();
        String km = jComboBox9.getSelectedItem().toString();
        double kmod1mad1 = 0;

         /*Longa duração para kmod1 da madeira 1*/
        if(("Permanente".equals(kmods)&& "Madeira Serrada".equals(km))){
            kmod1mad1 = 0.60;
        }
        if(("Permanente".equals(kmods)&& "Madeira Laminada Colada".equals(km))){
            kmod1mad1 = 0.60;
        }
        if(("Permanente".equals(kmods)&& "Madeira Compensada".equals(km))){
            kmod1mad1 = 0.60;
        }
        if(("Permanente".equals(kmods)&& "Madeira Recomposta".equals(km))){
            kmod1mad1 = 0.30;
        }
        /*Longa duração para kmod1 da madeira 1*/
        if("Longa duração".equals(kmods)&& "Madeira Serrada".equals(km)){
            kmod1mad1 = 0.70;
        }
        if(("Longa duração".equals(kmods)&& "Madeira Laminada Colada".equals(km))){
            kmod1mad1 = 0.70;
        }
        if(("Longa duração".equals(kmods)&& "Madeira Compensada".equals(km))){
            kmod1mad1 = 0.70;}

        if("Longa duração".equals(kmods)&& "Madeira Recomposta".equals(km)){
            kmod1mad1 = 0.45;
        }
        /*Média duração para kmod1 da madeira 1*/
        if("Média duração".equals(kmods)&& "Madeira Serrada".equals(km)){
            kmod1mad1 = 0.80;
        }
        if("Média duração".equals(kmods)&& "Madeira Laminada Colada".equals(km)){
            kmod1mad1 = 0.80;
        }
        if("Média duração".equals(kmods)&& "Madeira Compensada".equals(km)){
            kmod1mad1 = 0.80;
        }
        if("Média duração".equals(kmods)&& "Madeira Recomposta".equals(km)){
            kmod1mad1 = 0.65;
        }
        /*Curta duração para kmod1 da madeira 1*/
        if("Curta duração".equals(kmods)&& "Madeira Serrada".equals(km)){
            kmod1mad1 = 0.90;
        }
        if("Curta duração".equals(kmods)&& "Madeira Laminada Colada".equals(km)){
            kmod1mad1 = 0.90;
        }
        if("Curta duração".equals(kmods)&& "Madeira Compensada".equals(km)){
            kmod1mad1 = 0.90;
        }
        if("Curta duração".equals(kmods)&& "Madeira Recomposta".equals(km)){
            kmod1mad1 = 0.90;
        }
        /*Instantanea duração para kmod1 da madeira 1*/
        if("Instantânea".equals(kmods)&& "Madeira Serrada".equals(km)){
            kmod1mad1 = 1.10;
        }
        if("Instantânea".equals(kmods)&& "Madeira Laminada Colada".equals(km)){
            kmod1mad1 = 1.10;
        }
        if("Instantânea".equals(kmods)&& "Madeira Compensada".equals(km)){
            kmod1mad1 = 1.10;
        }
        if("Instantânea".equals(kmods)&& "Madeira Recomposta".equals(km)){
            kmod1mad1 = 1.10;
        }
        /*kmod 2 da madeira 1*/

        String kmod2 = jComboBox13.getSelectedItem().toString();
        String km2 = jComboBox9.getSelectedItem().toString();
        double kmod2mad1 = 0;

        /*Classe de umidade 1 do kmod2 da madeira 1*/
        if("1".equals(kmod2)){
            kmod2mad1 = 1;
        }
        /*Classe de umidade 2 do kmod2 da madeira 2*/
        if("2".equals(kmod2)){
            kmod2mad1 = 1;
        }

        /*Classe de umidade da 3  kmod2 da madeira 1*/
        if("3".equals(kmod2)&& "Madeira Serrada".equals(km2)){
            kmod2mad1 = 0.8;
        }
        if("3".equals(kmod2)&& "Madeira Laminada Colada".equals(km2)){
            kmod2mad1 = 0.8;
        }
        if("3".equals(kmod2)&& "Madeira Compensada".equals(km2)){
            kmod2mad1 = 0.8;
        }
        if("3".equals(kmod2)&& "Madeira Recomposta".equals(km2)){
            kmod2mad1 = 0.9;
        }
        /*Classe de umidade 2 para kmod2 da madeira 1*/
        if("4".equals(kmod2)&& "Madeira Serrada".equals(km2)){
            kmod2mad1 = 0.8;
        }
        if("4".equals(kmod2)&& "Madeira Laminada Colada".equals(km2)){
            kmod2mad1 = 0.8;
        }
        if("4".equals(kmod2)&& "Madeira Compensada".equals(km2)){
            kmod2mad1 = 0.8;
        }
        if("4".equals(kmod2)&& "Madeira Recomposta".equals(km2)){
            kmod2mad1 = 0.9;
        }
        /*Kmod 3 da madeira 1*/
        String kmod36s2 = jComboBox15.getSelectedItem().toString();
        double kmod3mad1 = 0;
        if("1".equals(kmod36s2)){
            kmod3mad1 = 1;
        }
        if("2".equals(kmod36s2)){
            kmod3mad1 = 0.80;
        }
        /*tamanho da madeira*/
        String t1;
        t1 = espessurat1.getText();
        String t2;
        t2 = espessurat2.getText();
        String t3;
        double t1n = Double.parseDouble(t1);
        double t2n = Double.parseDouble(t2);
        double te = 0;
         /*todos os menores de todos*/
        if((t1n<t2n)){
            te = t1n;
        }
        if(t1n>=t2n){
            te = t2n;
        }
        
        /*Cálculo do kmod final é do elemento 1*/
        double kmodfinalmad1;
        kmodfinalmad1 = kmod1mad1*kmod2mad1*kmod3mad1;
        String kmod1certo = (String.format(fe.format(kmod1mad1)));
        String kmod2certo = (String.format(fe.format(kmod2mad1)));
        String kmod3certo = (String.format(fe.format(kmod3mad1)));
        jLabel38.setText(kmod1certo);
        jLabel41.setText(String.format("%.2f",kmodfinalmad1));
        jLabel39.setText(kmod2certo);
        jLabel40.setText(kmod3certo);

        /*Cálculo dos pregos*/
        /*escolha do prego*/
        String diametrofdfd = diametroprego.getText();
        double diametrodoprego = Double.parseDouble(diametrofdfd);
        jLabel55.setText(diametrofdfd);
        double diametropara= 10;
        double alfaeprego = 0;
        alfaeprego = 2.5;
       
        /*Cálculo da resistência da madeira 1*/
        double fc0dmad1;
        fc0dmad1 = ((kmodfinalmad1*resmad1)/1.4)/10;
        double fv0dmad1;
        fv0dmad1 = (kmodfinalmad1*(rescis/(1.8)))/10;
        jLabel49.setText(String.format(fe.format(fc0dmad1)));
        jLabel95.setText(String.format(fe.format(fc0dmad1*0.25)));
        jLabel69.setText(String.format(fe.format(fv0dmad1)));
        /*embutimento da madeira 1*/
        double resultado0;
        double resultado90;
        double resultadofinal = 0;
        double result90mad;
        resultado0 = fc0dmad1;
        jLabel96.setText(String.format(fe.format(resultado0)));
        resultado90 = (0.25*fc0dmad1*alfaeprego);
        jLabel97.setText(String.format(fe.format(resultado90)));
        result90mad = (0.25*resmad1);
        
        jLabel70.setText(String.format(fe.format(result90mad)));
        jLabel71.setText(String.valueOf(rescis));
        if(am0.isSelected()){
            resultadofinal = resultado0;
            jLabel58.setText("0");
            
        }
        
        if(ang90.isSelected()){
            resultadofinal = resultado90;
            jLabel58.setText("90");
        }
        if(angdif.isSelected()){
            String valordoangulo = valorangdif.getText();
            double valordoangulo1 = Double.parseDouble(valordoangulo);
            double valordoangulo2 = Math.toRadians(valordoangulo1);
            double resultadodif = (fc0dmad1*resultado90)/((fc0dmad1*(Math.sin(valordoangulo2))*(Math.sin(valordoangulo2)))+(resultado90*(Math.cos(valordoangulo2))*(Math.cos(valordoangulo2))));
            resultadofinal = resultadodif;
            jLabel58.setText(valorangdif.getText());
        }
        String alfaetexto = String.format(fe.format(alfaeprego));
        jLabel47.setText(alfaetexto);
        String resultca11t = (String.format(fe.format(resultadofinal)));
        jLabel50.setText(resultca11t);
        /*cálculo dos betas*/
        String diamdsf12 = (String.format(fe.format(diametrodoprego)));
        jLabel51.setText(diamdsf12);
        double betcalc;
        double betlimitecalc;
        betcalc = (te/diametrodoprego);
        String betcalcc11 = (String.format(fe.format(betcalc)));
        betlimitecalc = (1.25*Math.sqrt((60/1.1)/resultadofinal));
        String betlimitestr11 = (String.format(fe.format(betlimitecalc)));
        jLabel53.setText(betlimitestr11);
        jLabel52.setText(betcalcc11);
        /*Cálculo da resistÊncia do pinos*/
        double resistpino = 0 ;
        double resistpino1 = 0;
        double resistpino2 = 0;
        double numeprego;
        resistpino2 = 0.625*((diametrodoprego/10)*(diametrodoprego/10)/betlimitecalc)*(60/1.1);
        jLabel73.setText(String.format(fe.format(resistpino2)));
        resistpino1 = 0.40*((te*te)/betcalc)*resultadofinal;
        jLabel74.setText(String.format(fe.format(resistpino1)));
        if(betcalc>betlimitecalc){
            resistpino = resistpino2;
            jLabel65.setText("Beta Limite < Beta");
        }
        if(betcalc<=betlimitecalc){ 
            resistpino= resistpino1;
            jLabel65.setText("Beta Limite > Beta");
        }
        String resin23 = (String.format(fe.format(resistpino)));
        jLabel54.setText(resin23);
        /*Escolha das variações das cargas*/
        /*Ações permanentes pequena variabilidade*/
        String variabilidade = Tipodevariabilidade.getSelectedItem().toString();
        String efeito = paraefeitos.getSelectedItem().toString();
        String comb = combinação.getSelectedItem().toString();
        double majorperma = 0;
        double majorvaria = 0;
        if("Ações de Pequena Variabilidade".equals(variabilidade)&& "Desfavoráveis".equals(efeito)&& "Normais".equals(comb)){
            majorperma = 1.3;
        }
        if("Ações de Pequena Variabilidade".equals(variabilidade)&& "Desfavoráveis".equals(efeito)&& "Especiais ou de Construções".equals(comb)){
            majorperma = 1.2;
        }
        if("Ações de Pequena Variabilidade".equals(variabilidade)&& "Desfavoráveis".equals(efeito)&& "Excepcionais".equals(comb)){
            majorperma = 1.1;
        }
        if("Ações de Pequena Variabilidade".equals(variabilidade)&& "Favoráveis".equals(efeito)&& "Normais".equals(comb)){
            majorperma = 1.0;
        }
        if("Ações de Pequena Variabilidade".equals(variabilidade)&& "Favoráveis".equals(efeito)&& "Especiais ou de Construções".equals(comb)){
            majorperma = 1.0;
        }
        if("Ações de Pequena Variabilidade".equals(variabilidade)&& "Favoráveis".equals(efeito)&& "Excepcionais".equals(comb)){
            majorperma = 1.0;
        }
        /*Ações permanentes de grande variabildiade */
        if("Ações de Grande Variabilidade".equals(variabilidade)&& "Desfavoráveis".equals(efeito)&& "Normais".equals(comb)){
            majorperma = 1.4;
        }
        if("Ações de Grande Variabilidade".equals(variabilidade)&& "Desfavoráveis".equals(efeito)&& "Especiais ou de Construções".equals(comb)){
            majorperma = 1.3;
        }
        if("Ações de Grande Variabilidade".equals(variabilidade)&& "Desfavoráveis".equals(efeito)&& "Excepcionais".equals(comb)){
            majorperma = 1.2;
        }
        if("Ações de Grande Variabilidade".equals(variabilidade)&& "Favoráveis".equals(efeito)&& "Normais".equals(comb)){
            majorperma = 0.9;
        }
        if("Ações de Grande Variabilidade".equals(variabilidade)&& "Favoráveis".equals(efeito)&& "Especiais ou de Construções".equals(comb)){
            majorperma = 0.9;
        }
        if("Ações de Grande Variabilidade".equals(variabilidade)&& "Favoráveis".equals(efeito)&& "Excepcionais".equals(comb)){
            majorperma = 0.9;
        }
        /*Ações variáveis*/
        String varia = variavel.getSelectedItem().toString();
        if("Ações Variáveis em Geral".equals(varia)&& "Normais".equals(comb)){
            majorvaria = 1.4;
        }
        if("Ações Variáveis em Geral".equals(varia)&& "Especiais ou de Construções".equals(comb)){
            majorvaria = 1.2;
        }
        if("Ações Variáveis em Geral".equals(varia)&& "Excepcionais".equals(comb)){
            majorvaria = 1.0;
        }
        if("Efeitos da Temperatura".equals(varia)&& "Excepcionais".equals(comb)){
            majorvaria = 1.2;
        }
        if("Efeitos da Temperatura".equals(varia)&& "Especiais ou de Construções".equals(comb)){
            majorvaria = 1.0;
        }
        if("Efeitos da Temperatura".equals(varia)&& "Excepcionais".equals(comb)){
            majorvaria = 0;
        }
        /*fatores de utilização*/
        double w0 = 0;
        double w1 = 0;
        double w2 = 0;
        double w0c = 0;
        double w1c = 0;
        double w2c = 0;
        /*Ações em estruturas correntes*/
        String Fatores = acoescorrentes.getSelectedItem().toString();
        if("Variações uniformes de Temperatura".equals(Fatores)){
            w0c = 0.6;
            w1c = 0.5;
            w2c = 0.3;
        }
        if("Pressão Dinâmica do Vento".equals(Fatores)){
            w0c = 0.5;
            w1c = 0.2;
            w2c = 0.0;
        }
        /*Cargas acidentais dos edifícios*/
        String aci = cargasacid.getSelectedItem().toString();
        if("Não há pred. de Equipamentos Fixos nem de el. concentr".equals(aci)){
            w0 = 0.4;
            w1 = 0.3;
            w2 = 0.2;
        }
        if("Há pred. de Equipamentos Fixos ou de elev. Concentração.".equals(aci)){
            w0 = 0.7;
            w1 = 0.6;
            w2 = 0.4;
        }
        if("Bibliotecas, arquivos, oficinas ou garagens".equals(aci)){
            w0 = 0.8;
            w1 = 0.7;
            w2 = 0.6;
        }

        /*Combinaçao de ação */
        double Frd = 0;
        double Frd1;
        double Frd2;
        double Frd3 = 0;
        String sob = sobrecarga.getText();
        String perm = permanente.getText();
        String ventod = vento.getText();
        double sobrecarga1 = Double.parseDouble(sob);
        double permanente1 = Double.parseDouble(perm);
        double vento1 = Double.parseDouble(ventod);
        /*Combinação sobrecarga variável principal*/
        Frd1 = ((permanente1*majorperma)+(majorvaria*(sobrecarga1+(w0c*vento1))));
        /*Combinação vento como variável principal*/
        Frd2 = ((permanente1*majorperma)+(majorvaria*(vento1+(w0*sobrecarga1))));
        /*Combinação equipamento fixo*/
        String frdn1mm = (String.format(fe.format(Frd1)));
        jLabel42.setText(frdn1mm);
        String frdn2mm = (String.format(fe.format(Frd2)));
        jLabel43.setText(frdn2mm);
         double soma = Frd1+Frd2;
        if(soma>0){
            jLabel20.setText("Tração");
            jLabel75.setText("+");
        }else{
            jLabel20.setText("Compressão");
            jLabel75.setText("-");
        }
        if(Frd1<0){
            Frd1 = -Frd1;
        }
        if(Frd2<0){
            Frd2 = -Frd2;
        }
        if (Frd2>Frd1){
            Frd = Frd2;
             }else{
            Frd = Frd1;
        }
        
        jLabel76.setText(String.format(fe.format(Frd)));
        /*Cálculo número de pinos*/
        numeprego = (Frd/(resistpino));
        int numedeprego = (int)Math.ceil(numeprego);
        String nusm = String.valueOf(numedeprego);
        jLabel55.setText(nusm);

    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        /*Dados iniciais do primeiro elemento de ligação */
        /*Valor das resistências e caracterisitcas das coníferas*/
        String valorresistencia = null;
        double resmad1 = 0;
        double rescis = 0;
        if(selco.isSelected()){
             valorresistencia = jComboBox2.getSelectedItem().toString();
        }
        if(seldico.isSelected()){
             valorresistencia = jComboBox1.getSelectedItem().toString();
        }
        /*se as duas nao estiverem marcadas*/
        if ((selco.isSelected() == false && seldico.isSelected()== false)){}
        if("C20".equals(valorresistencia)&& selco.isSelected()){
            resmad1 = 20;
            rescis = 4;
            resfc0k.setText("20");
            jLabel26.setText("4");
            resecom.setText("3500");
            respapa.setText("500");
            jLabel72.setText("400");
        }
        if("C25".equals(valorresistencia)&& selco.isSelected()){
            resmad1 = 25;
            rescis = 5;
            resfc0k.setText("25");
            jLabel26.setText("5");
            resecom.setText("8500");
            respapa.setText("550");
            jLabel72.setText("450");
        
        }
        if("C30".equals(valorresistencia)&& selco.isSelected()){
            resmad1 = 30;
            rescis = 6;
            resfc0k.setText("30");
            jLabel26.setText("6");
            resecom.setText("14500");
            respapa.setText("600");
            jLabel72.setText("500");
        }
        /*Valor das resistências e caracterisitcas das dicotiledoneas*/
        if("C20".equals(valorresistencia)&& seldico.isSelected()){
            resmad1 = 20;
            rescis = 4;
            resfc0k.setText("20");
            jLabel26.setText("4");
            resecom.setText("9500");
            respapa.setText("650");
            jLabel72.setText("500");
        }
        if("C30".equals(valorresistencia)&& seldico.isSelected()){
            resmad1 = 30;
            rescis = 5;
            resfc0k.setText("30");
            jLabel26.setText("5");
            resecom.setText("14500");
            respapa.setText("800");
            jLabel72.setText("650");
        }
        if("C40".equals(valorresistencia)&& seldico.isSelected()){
            resmad1 = 40;
            rescis = 6;
            resfc0k.setText("40");
            jLabel26.setText("6");
            resecom.setText("19500");
            respapa.setText("950");
            jLabel72.setText("750");
        }
        if("C60".equals(valorresistencia)&& seldico.isSelected()){
            resmad1 = 60;
            rescis = 8;
            resfc0k.setText("60");
            jLabel26.setText("8");
            resecom.setText("24500");
            respapa.setText("1000");
            jLabel72.setText("800");
        }
        /*tamanho da madeira*/
        DecimalFormat fe = new DecimalFormat("0.00");
        DecimalFormat f = new DecimalFormat("0");
        String t1;
        t1 = espessurat1.getText();
        String t2;
        t2 = espessurat2.getText();
        double t1n = Double.parseDouble(t1);
        double t2n = Double.parseDouble(t2);
        double te = 0;
         /*todos os menores de todos*/
        if((t1n<t2n)){
            te = t1n;
        }
        if((t1n>=t2n)){
            te = t2n;
        }
        String b;
        b = compr.getText();

        /*Valor dos kmod1 e kmod2 e kmod3 do elemento de madeira 1*/
        String kmods = jComboBox10.getSelectedItem().toString();
        String km = jComboBox9.getSelectedItem().toString();
        double kmod1mad1 = 0;

         /*Longa duração para kmod1 da madeira 1*/
        if(("Permanente".equals(kmods)&& "Madeira Serrada".equals(km))){
            kmod1mad1 = 0.60;
        }
        if(("Permanente".equals(kmods)&& "Madeira Laminada Colada".equals(km))){
            kmod1mad1 = 0.60;
        }
        if(("Permanente".equals(kmods)&& "Madeira Compensada".equals(km))){
            kmod1mad1 = 0.60;
        }
        if(("Permanente".equals(kmods)&& "Madeira Recomposta".equals(km))){
            kmod1mad1 = 0.30;
        }
        /*Longa duração para kmod1 da madeira 1*/
        if("Longa duração".equals(kmods)&& "Madeira Serrada".equals(km)){
            kmod1mad1 = 0.70;
        }
        if(("Longa duração".equals(kmods)&& "Madeira Laminada Colada".equals(km))){
            kmod1mad1 = 0.70;
        }
        if(("Longa duração".equals(kmods)&& "Madeira Compensada".equals(km))){
            kmod1mad1 = 0.70;}

        if("Longa duração".equals(kmods)&& "Madeira Recomposta".equals(km)){
            kmod1mad1 = 0.45;
        }
        /*Média duração para kmod1 da madeira 1*/
        if("Média duração".equals(kmods)&& "Madeira Serrada".equals(km)){
            kmod1mad1 = 0.80;
        }
        if("Média duração".equals(kmods)&& "Madeira Laminada Colada".equals(km)){
            kmod1mad1 = 0.80;
        }
        if("Média duração".equals(kmods)&& "Madeira Compensada".equals(km)){
            kmod1mad1 = 0.80;
        }
        if("Média duração".equals(kmods)&& "Madeira Recomposta".equals(km)){
            kmod1mad1 = 0.65;
        }
        /*Curta duração para kmod1 da madeira 1*/
        if("Curta duração".equals(kmods)&& "Madeira Serrada".equals(km)){
            kmod1mad1 = 0.90;
        }
        if("Curta duração".equals(kmods)&& "Madeira Laminada Colada".equals(km)){
            kmod1mad1 = 0.90;
        }
        if("Curta duração".equals(kmods)&& "Madeira Compensada".equals(km)){
            kmod1mad1 = 0.90;
        }
        if("Curta duração".equals(kmods)&& "Madeira Recomposta".equals(km)){
            kmod1mad1 = 0.90;
        }
        /*Instantanea duração para kmod1 da madeira 1*/
        if("Instantânea".equals(kmods)&& "Madeira Serrada".equals(km)){
            kmod1mad1 = 1.10;
        }
        if("Instantânea".equals(kmods)&& "Madeira Laminada Colada".equals(km)){
            kmod1mad1 = 1.10;
        }
        if("Instantânea".equals(kmods)&& "Madeira Compensada".equals(km)){
            kmod1mad1 = 1.10;
        }
        if("Instantânea".equals(kmods)&& "Madeira Recomposta".equals(km)){
            kmod1mad1 = 1.10;
        }
        
        /*kmod 2 da madeira 1*/

        String kmod2 = jComboBox13.getSelectedItem().toString();
        String km2 = jComboBox9.getSelectedItem().toString();
        double kmod2mad1 = 0;

        /*Classe de umidade 1 do kmod2 da madeira 1*/
        if("1".equals(kmod2)){
            kmod2mad1 = 1;
        }
        /*Classe de umidade 2 do kmod2 da madeira 2*/
        if("2".equals(kmod2)){
            kmod2mad1 = 1;
        }

        /*Classe de umidade da 3  kmod2 da madeira 1*/
        if("3".equals(kmod2)&& "Madeira Serrada".equals(km2)){
            kmod2mad1 = 0.8;
        }
        if("3".equals(kmod2)&& "Madeira Laminada Colada".equals(km2)){
            kmod2mad1 = 0.8;
        }
        if("3".equals(kmod2)&& "Madeira Compensada".equals(km2)){
            kmod2mad1 = 0.8;
        }
        if("3".equals(kmod2)&& "Madeira Recomposta".equals(km2)){
            kmod2mad1 = 0.9;
        }
        /*Classe de umidade 2 para kmod2 da madeira 1*/
        if("4".equals(kmod2)&& "Madeira Serrada".equals(km2)){
            kmod2mad1 = 0.8;
        }
        if("4".equals(kmod2)&& "Madeira Laminada Colada".equals(km2)){
            kmod2mad1 = 0.8;
        }
        if("4".equals(kmod2)&& "Madeira Compensada".equals(km2)){
            kmod2mad1 = 0.8;
        }
        if("4".equals(kmod2)&& "Madeira Recomposta".equals(km2)){
            kmod2mad1 = 0.9;
        }
        /*Kmod 3 da madeira 1*/
        String kmod36s2 = jComboBox15.getSelectedItem().toString();
        double kmod3mad1 = 0;
        if("1".equals(kmod36s2)){
            kmod3mad1 = 1;
        }
        if("2".equals(kmod36s2)){
            kmod3mad1 = 0.80;
        }

        /*Cálculo do kmod final é do elemento 1*/
        double kmodfinalmad1;
        kmodfinalmad1 = kmod1mad1*kmod2mad1*kmod3mad1;
        String kmod1certo = String.valueOf(kmod1mad1);
        String kmod2certo = String.valueOf(kmod2mad1);
        String kmod3certo = String.valueOf(kmod3mad1);
        jLabel21.setText(String.format("%.2f", kmod1mad1));
        jLabel24.setText(String.format("%.2f",kmodfinalmad1));
        jLabel22.setText(String.format("%.2f", kmod2mad1));
        jLabel23.setText(String.format("%.2f", kmod3mad1));

        /*Cálculo da resistência da cavilha 1*/
        /*cálculo kmod da cavilha*/
        /*calculo kmod1 da cavilha*/
        String kmods1 = jComboBox10.getSelectedItem().toString();
        String km1 = jComboBox11.getSelectedItem().toString();
        double kmod1mad1cav = 0;

        /*Longa duração para kmod1 da cavilha 1*/
        if(("Permanente".equals(kmods1)&& "Madeira Serrada".equals(km1))){
            kmod1mad1cav = 0.60;
        }
        if(("Permanente".equals(kmods1)&& "Madeira Laminada Colada".equals(km1))){
            kmod1mad1cav = 0.60;
        }
        if(("Permanente".equals(kmods1)&& "Madeira Compensada".equals(km1))){
            kmod1mad1cav = 0.60;
        }
        if(("Permanente".equals(kmods1)&& "Madeira Recomposta".equals(km1))){
            kmod1mad1cav = 0.30;
        }
        /*Longa duração para kmod1 da cavilha 1*/
        if("Longa duração".equals(kmods1)&& "Madeira Serrada".equals(km1)){
            kmod1mad1cav = 0.70;
        }
        if(("Longa duração".equals(kmods1)&& "Madeira Laminada Colada".equals(km1))){
            kmod1mad1cav = 0.70;
        }
        if(("Longa duração".equals(kmods1)&& "Madeira Compensada".equals(km1))){
            kmod1mad1cav = 0.70;}

        if("Longa duração".equals(kmods1)&& "Madeira Recomposta".equals(km1)){
            kmod1mad1cav = 0.45;
        }
        /*Média duração para kmod1 da cavilha 1*/
        if("Média duração".equals(kmods1)&& "Madeira Serrada".equals(km1)){
            kmod1mad1cav = 0.80;
        }
        if("Média duração".equals(kmods1)&& "Madeira Laminada Colada".equals(km1)){
            kmod1mad1cav = 0.80;
        }
        if("Média duração".equals(kmods1)&& "Madeira Compensada".equals(km1)){
            kmod1mad1cav = 0.80;
        }
        if("Média duração".equals(kmods1)&& "Madeira Recomposta".equals(km1)){
            kmod1mad1cav = 0.65;
        }
        /*Curta duração para kmod1 da cavilha 1*/
        if("Curta duração".equals(kmods1)&& "Madeira Serrada".equals(km1)){
            kmod1mad1cav = 0.90;
        }
        if("Curta duração".equals(kmods1)&& "Madeira Laminada Colada".equals(km1)){
            kmod1mad1cav = 0.90;
        }
        if("Curta duração".equals(kmods1)&& "Madeira Compensada".equals(km1)){
            kmod1mad1cav = 0.90;
        }
        if("Curta duração".equals(kmods1)&& "Madeira Recomposta".equals(km1)){
            kmod1mad1cav = 0.90;
        }
        /*Instantanea duração para kmod1 da cavilha 1*/
        if("Instantânea".equals(kmods1)&& "Madeira Serrada".equals(km1)){
            kmod1mad1cav = 1.10;
        }
        if("Instantânea".equals(kmods1)&& "Madeira Laminada Colada".equals(km1)){
            kmod1mad1cav = 1.10;
        }
        if("Instantânea".equals(kmods1)&& "Madeira Compensada".equals(km1)){
            kmod1mad1cav = 1.10;
        }
        if("Instantânea".equals(kmods1)&& "Madeira Recomposta".equals(km1)){
            kmod1mad1cav = 1.10;
        }
        /*kmod 2 da cavilha*/

        String kmod21 = jComboBox14.getSelectedItem().toString();
        String km21 = jComboBox11.getSelectedItem().toString();
        double kmod2mad1cav = 0;

        /*Classe de umidade 1 do kmod2 da cavilha1*/
        if("1".equals(kmod21)){
            kmod2mad1cav = 1;
        }
        /*Classe de umidade 2 do kmod2 da cavilha 2*/
        if("2".equals(kmod21)){
            kmod2mad1cav = 1;
        }

        /*Classe de umidade da 3  kmod2 da  cavilha 1*/
        if("3".equals(kmod21)&& "Madeira Serrada".equals(km21)){
            kmod2mad1cav = 0.8;
        }
        if("3".equals(kmod21)&& "Madeira Laminada Colada".equals(km21)){
            kmod2mad1cav = 0.8;
        }
        if("3".equals(kmod21)&& "Madeira Compensada".equals(km21)){
            kmod2mad1cav = 0.8;
        }
        if("3".equals(kmod21)&& "Madeira Recomposta".equals(km21)){
            kmod2mad1cav = 0.9;
        }
        /*Classe de umidade 2 para kmod2 da cavilha 1*/
        if("4".equals(kmod21)&& "Madeira Serrada".equals(km21)){
            kmod2mad1cav = 0.8;
        }
        if("4".equals(kmod21)&& "Madeira Laminada Colada".equals(km21)){
            kmod2mad1cav = 0.8;
        }
        if("4".equals(kmod21)&& "Madeira Compensada".equals(km21)){
            kmod2mad1cav = 0.8;
        }
        if("4".equals(kmod21)&& "Madeira Recomposta".equals(km21)){
            kmod2mad1cav = 0.9;
        }
        /*Kmod 3 da cavilha 1*/
        String kmod36s21 = jComboBox16.getSelectedItem().toString();
        double kmod3mad1cav = 0;
        if("1".equals(kmod36s21)){
            kmod3mad1cav = 1;
        }
        if("2".equals(kmod36s21)){
            kmod3mad1cav = 0.80;
        }
        /*resistência da madeira em si*/
        double fc0dmad1;
        fc0dmad1 = (kmodfinalmad1*(resmad1/(1.4)))/10;
        double fv0dmad1;
        fv0dmad1 = (kmodfinalmad1*(rescis/(1.8)))/10;
        jLabel81.setText(String.format(fe.format(fv0dmad1)));
        String fc0dmad1certo = (String.format(fe.format(fc0dmad1)));
        jLabel79.setText(fc0dmad1certo);
        
        /*embutimento da madeira 1*/
        double resultado90;
        resultado90 = fc0dmad1*0.25;
        jLabel80.setText(String.format(fe.format(resultado90)));
        double resultado90normal = resmad1*0.25;
        jLabel77.setText(String.format(fe.format(resultado90normal)));
        jLabel78.setText(String.valueOf(rescis));
        double resultadofinal = 0;
        double resultado0;
        double alfae = 0;
      
        resultado0 = fc0dmad1;
        jLabel61.setText(String.valueOf(alfae));
        resultado90 = (0.25*fc0dmad1*alfae);
        jLabel44.setText(String.format(fe.format(resultado90)));
        double fv0d =  (kmodfinalmad1*(rescis/(1.8)))/10;
        jLabel60.setText(String.format(fe.format(fv0d)));
        
        /*kmod final da cavilha1*/
        /*cálculo da resistência final da cavilha*/
        double kmodfinalcav;
        kmodfinalcav = kmod1mad1cav*kmod2mad1cav*kmod3mad1cav;
        jLabel82.setText(String.format(fe.format(kmodfinalcav)));
        double fc0dmad1cav;
        fc0dmad1cav = (kmodfinalcav*(60/(1.4)))/10;
        jLabel25.setText(String.format("%.2f", fc0dmad1cav));
        double fc90dmad1cav = 0.25*(fc0dmad1cav);
        jLabel27.setText(String.format("%.2f",fc90dmad1cav));

        /*cálculo dos betas*/
        String diametroca = cavj.getSelectedItem().toString();
        double diametrodacav1 = Double.parseDouble(diametroca);
        jLabel28.setText(String.format("%.2f",diametrodacav1));
        double diametrocav = Double.parseDouble(diametroca);
        double betcalc1;
        double betlimitecalc1;
        betcalc1 = (te/(diametrocav/10));
        String betcalcc1 = (String.format(fe.format(betcalc1)));
        betlimitecalc1 = Math.sqrt((fc0dmad1cav/fc90dmad1cav));
        String betlimitestr1 = (String.format(fe.format(betlimitecalc1)));
        jLabel30.setText(betlimitestr1);
        jLabel29.setText(betcalcc1);
        /*Cálculo da resistÊncia do pinos*/
        double resistcav = 0 ;
        double resistcav1 = 0;
        double resistcav2 = 0;
        double numedecav = 0;
        resistcav1 = (0.4*((diametrocav/10)*(diametrocav/10)/betlimitecalc1)*fc0dmad1cav);
        jLabel83.setText(String.format(fe.format(resistcav1)));
        resistcav2 = 0.40*((te*te)/betcalc1)*fc90dmad1cav;
        jLabel84.setText(String.format(fe.format(resistcav2)));
        if(betcalc1>betlimitecalc1){
           resistcav = resistcav1;
           jLabel65.setText("Beta Limite < Beta");
        }
        if(betcalc1<=betlimitecalc1){
           resistcav = resistcav2;
           jLabel65.setText("Beta Limite > Beta");
        }
        
        String resincav =(String.format(fe.format(resistcav)));;
        jLabel31.setText(resincav);
        /*Escolha das variações das cargas*/
        /*Ações permanentes pequena variabilidade*/
        String variabilidade = Tipodevariabilidade.getSelectedItem().toString();
        String efeito = paraefeitos.getSelectedItem().toString();
        String comb = combinação.getSelectedItem().toString();
        double majorperma = 0;
        double majorvaria = 0;
        if("Ações de Pequena Variabilidade".equals(variabilidade)&& "Desfavoráveis".equals(efeito)&& "Normais".equals(comb)){
            majorperma = 1.3;
        }
        if("Ações de Pequena Variabilidade".equals(variabilidade)&& "Desfavoráveis".equals(efeito)&& "Especiais ou de Construções".equals(comb)){
            majorperma = 1.2;
        }
        if("Ações de Pequena Variabilidade".equals(variabilidade)&& "Desfavoráveis".equals(efeito)&& "Excepcionais".equals(comb)){
            majorperma = 1.1;
        }
        if("Ações de Pequena Variabilidade".equals(variabilidade)&& "Favoráveis".equals(efeito)&& "Normais".equals(comb)){
            majorperma = 1.0;
        }
        if("Ações de Pequena Variabilidade".equals(variabilidade)&& "Favoráveis".equals(efeito)&& "Especiais ou de Construções".equals(comb)){
            majorperma = 1.0;
        }
        if("Ações de Pequena Variabilidade".equals(variabilidade)&& "Favoráveis".equals(efeito)&& "Excepcionais".equals(comb)){
            majorperma = 1.0;
        }
        /*Ações permanentes de grande variabildiade */
        if("Ações de Grande Variabilidade".equals(variabilidade)&& "Desfavoráveis".equals(efeito)&& "Normais".equals(comb)){
            majorperma = 1.4;
        }
        if("Ações de Grande Variabilidade".equals(variabilidade)&& "Desfavoráveis".equals(efeito)&& "Especiais ou de Construções".equals(comb)){
            majorperma = 1.3;
        }
        if("Ações de Grande Variabilidade".equals(variabilidade)&& "Desfavoráveis".equals(efeito)&& "Excepcionais".equals(comb)){
            majorperma = 1.2;
        }
        if("Ações de Grande Variabilidade".equals(variabilidade)&& "Favoráveis".equals(efeito)&& "Normais".equals(comb)){
            majorperma = 0.9;
        }
        if("Ações de Grande Variabilidade".equals(variabilidade)&& "Favoráveis".equals(efeito)&& "Especiais ou de Construções".equals(comb)){
            majorperma = 0.9;
        }
        if("Ações de Grande Variabilidade".equals(variabilidade)&& "Favoráveis".equals(efeito)&& "Excepcionais".equals(comb)){
            majorperma = 0.9;
        }
        /*Ações variáveis*/
        String varia = variavel.getSelectedItem().toString();
        if("Ações Variáveis em Geral".equals(varia)&& "Normais".equals(comb)){
            majorvaria = 1.4;
        }
        if("Ações Variáveis em Geral".equals(varia)&& "Especiais ou de Construções".equals(comb)){
            majorvaria = 1.2;
        }
        if("Ações Variáveis em Geral".equals(varia)&& "Excepcionais".equals(comb)){
            majorvaria = 1.0;
        }
        if("Efeitos da Temperatura".equals(varia)&& "Excepcionais".equals(comb)){
            majorvaria = 1.2;
        }
        if("Efeitos da Temperatura".equals(varia)&& "Especiais ou de Construções".equals(comb)){
            majorvaria = 1.0;
        }
        if("Efeitos da Temperatura".equals(varia)&& "Excepcionais".equals(comb)){
            majorvaria = 0;
        }
        /*fatores de utilização*/
        double w0 = 0;
        double w1 = 0;
        double w2 = 0;
        double w0c = 0;
        double w1c = 0;
        double w2c = 0;
        /*Ações em estruturas correntes*/
        String Fatores = acoescorrentes.getSelectedItem().toString();
        if("Variações uniformes de Temperatura".equals(Fatores)){
            w0c = 0.6;
            w1c = 0.5;
            w2c = 0.3;
        }
        if("Pressão Dinâmica do Vento".equals(Fatores)){
            w0c = 0.5;
            w1c = 0.2;
            w2c = 0.0;
        }
        /*Cargas acidentais dos edifícios*/
        String aci = cargasacid.getSelectedItem().toString();
        if("Não há pred. de Equipamentos Fixos nem de el. concentr".equals(aci)){
            w0 = 0.4;
            w1 = 0.3;
            w2 = 0.2;
        }
        if("Há pred. de Equipamentos Fixos ou de elev. Concentração.".equals(aci)){
            w0 = 0.7;
            w1 = 0.6;
            w2 = 0.4;
        }
        if("Bibliotecas, arquivos, oficinas ou garagens".equals(aci)){
            w0 = 0.8;
            w1 = 0.7;
            w2 = 0.6;
        }

        /*Combinaçao de ação */
        double Frd = 0;
        double Frd1;
        double Frd2;
        double Frd3 = 0;
        String sob = sobrecarga.getText();
        String perm = permanente.getText();
        String ventod = vento.getText();
        double sobrecarga1 = Double.parseDouble(sob);
        double permanente1 = Double.parseDouble(perm);
        double vento1 = Double.parseDouble(ventod);
        /*Combinação sobrecarga variável principal*/
        Frd1 = ((permanente1*majorperma)+(majorvaria*(sobrecarga1+(w0c*vento1))));
        /*Combinação vento como variável principal*/
        double valor;
        if("Longa Duração".equals(kmods1)){
            valor = 0.7;
        }else{
            valor = 1;
        }
        Frd2 = ((permanente1*majorperma)+(majorvaria*((valor*vento1)+(w0*sobrecarga1))));
        /*Combinação equipamento fixo*/
        String frdn1 = (String.format(fe.format(Frd1)));
        jLabel18.setText(frdn1);
        String frdn2 = (String.format(fe.format(Frd2)));
        jLabel19.setText(frdn2);
        double soma = Frd1+Frd2;
        if(soma>0){
            jLabel20.setText("Tração");
            jLabel75.setText("+");
        }else{
            jLabel20.setText("Compressão");
            jLabel75.setText("-");
        }
        if(Frd1<0){
            Frd1 = -Frd1;
        }
        if(Frd2<0){
            Frd2 = -Frd2;
        }
        if (Frd2>Frd1){
            Frd = Frd2;
             }else{
            Frd = Frd1;
        }
        jLabel76.setText(String.format(fe.format(Frd)));
        /*Cálculo número de pinos*/
        numedecav = (Frd/(resistcav*2));
        int numedecav1 = (int)Math.ceil(numedecav);
        String nus1 = String.valueOf(numedecav1);
        jLabel32.setText(nus1);
    }//GEN-LAST:event_jLabel33MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        /*Dados iniciais do primeiro elemento de ligação */
        /*Valor das resistências e caracterisitcas das coníferas*/
        String valorresistencia = null;
        DecimalFormat fe = new DecimalFormat("0.00");
        double resmad1 = 0;
        double hei;
        double rescis = 0;
        String hei1;
        if(selco.isSelected()){
             valorresistencia = jComboBox2.getSelectedItem().toString();
        }
        if(seldico.isSelected()){
             valorresistencia = jComboBox1.getSelectedItem().toString();
        }
        /*se as duas nao estiverem marcadas*/
        if ((selco.isSelected() == false && seldico.isSelected()== false)){}
        if("C20".equals(valorresistencia)&& selco.isSelected()){
            resmad1 = 20;
            rescis = 4;
            resfc0k.setText("20");
            jLabel26.setText("4");
            jLabel56.setText("400");
            resecom.setText("3500");
            respapa.setText("500");
            hei = 20*0.25;
            hei1 = String.format(fe.format(hei));
            jLabel59.setText(hei1);
        }
        if("C25".equals(valorresistencia)&& selco.isSelected()){
            resmad1 = 25;
            rescis = 5;
            resfc0k.setText("25");
            jLabel26.setText("5");
            jLabel56.setText("450");
            resecom.setText("8500");
            respapa.setText("550");
            hei = 25*0.25;
            hei1 = String.format(fe.format(hei));
            jLabel59.setText(hei1);
        
        }
        if("C30".equals(valorresistencia)&& selco.isSelected()){
            resmad1 = 30;
            rescis =6;
            resfc0k.setText("30");
            jLabel26.setText("6");
            jLabel56.setText("500");
            resecom.setText("14500");
            respapa.setText("600");
            hei = 30*0.25;
            hei1 = String.format(fe.format(hei));
            jLabel59.setText(hei1);
        }
        /*Valor das resistências e caracterisitcas das dicotiledoneas*/
        if("C20".equals(valorresistencia)&& seldico.isSelected()){
            resmad1 = 20;
            rescis = 4;
            resfc0k.setText("20");
            jLabel26.setText("4");
            jLabel56.setText("500");
            resecom.setText("9500");
            respapa.setText("650");
            hei = 20*0.25;
            hei1 = String.format(fe.format(hei));
            jLabel59.setText(hei1);
        }
        if("C30".equals(valorresistencia)&& seldico.isSelected()){
            resmad1 = 30;
            rescis = 5;
            resfc0k.setText("30");
            jLabel26.setText("5");
            jLabel56.setText("650");
            resecom.setText("14500");
            respapa.setText("800");
            hei = 30*0.25;
            hei1 = String.format(fe.format(hei));
            jLabel59.setText(hei1);
        }
        if("C40".equals(valorresistencia)&& seldico.isSelected()){
            resmad1 = 40;
            rescis = 6;
            resfc0k.setText("40");
            jLabel26.setText("6");
            jLabel56.setText("750");
            resecom.setText("19500");
            respapa.setText("950");
            hei = 40*0.25;
            hei1 = String.format(fe.format(hei));
            jLabel59.setText(hei1);
        }
        if("C60".equals(valorresistencia)&& seldico.isSelected()){
            resmad1 = 60;
            rescis = 8;
            resfc0k.setText("60");
            jLabel26.setText("8");
            jLabel56.setText("800");
            resecom.setText("24500");
            respapa.setText("1000");
            hei = 60*0.25;
            hei1 = String.format(fe.format(hei));
            jLabel59.setText(hei1);
        }
        /*tamanho da madeira*/
        
        String t1;
        t1 = espessurat1.getText();
        String t2;
        t2 = espessurat2.getText();
        String t3;
        double t1n = Double.parseDouble(t1);
        double t2n = Double.parseDouble(t2);
        double te = 0;
        /*todos os menores de todos*/
        if((t1n<t2n)){
            te = t1n;
        }
        if((t1n>=(t2n))){
            te = (t2n);
        }

        String b;
        b = compr.getText();

        /*Valor dos kmod1 e kmod2 e kmod3 do elemento de madeira 1*/
        String kmods = jComboBox10.getSelectedItem().toString();
        String km = jComboBox9.getSelectedItem().toString();
        double kmod1mad1 = 0;

         /*Longa duração para kmod1 da madeira 1*/
        if(("Permanente".equals(kmods)&& "Madeira Serrada".equals(km))){
            kmod1mad1 = 0.60;
        }
        if(("Permanente".equals(kmods)&& "Madeira Laminada Colada".equals(km))){
            kmod1mad1 = 0.60;
        }
        if(("Permanente".equals(kmods)&& "Madeira Compensada".equals(km))){
            kmod1mad1 = 0.60;
        }
        if(("Permanente".equals(kmods)&& "Madeira Recomposta".equals(km))){
            kmod1mad1 = 0.30;
        }
        /*Longa duração para kmod1 da madeira 1*/
        if("Longa duração".equals(kmods)&& "Madeira Serrada".equals(km)){
            kmod1mad1 = 0.70;
        }
        if(("Longa duração".equals(kmods)&& "Madeira Laminada Colada".equals(km))){
            kmod1mad1 = 0.70;
        }
        if(("Longa duração".equals(kmods)&& "Madeira Compensada".equals(km))){
            kmod1mad1 = 0.70;}

        if("Longa duração".equals(kmods)&& "Madeira Recomposta".equals(km)){
            kmod1mad1 = 0.45;
        }
        /*Média duração para kmod1 da madeira 1*/
        if("Média duração".equals(kmods)&& "Madeira Serrada".equals(km)){
            kmod1mad1 = 0.80;
        }
        if("Média duração".equals(kmods)&& "Madeira Laminada Colada".equals(km)){
            kmod1mad1 = 0.80;
        }
        if("Média duração".equals(kmods)&& "Madeira Compensada".equals(km)){
            kmod1mad1 = 0.80;
        }
        if("Média duração".equals(kmods)&& "Madeira Recomposta".equals(km)){
            kmod1mad1 = 0.65;
        }
        /*Curta duração para kmod1 da madeira 1*/
        if("Curta duração".equals(kmods)&& "Madeira Serrada".equals(km)){
            kmod1mad1 = 0.90;
        }
        if("Curta duração".equals(kmods)&& "Madeira Laminada Colada".equals(km)){
            kmod1mad1 = 0.90;
        }
        if("Curta duração".equals(kmods)&& "Madeira Compensada".equals(km)){
            kmod1mad1 = 0.90;
        }
        if("Curta duração".equals(kmods)&& "Madeira Recomposta".equals(km)){
            kmod1mad1 = 0.90;
        }
        /*Instantanea duração para kmod1 da madeira 1*/
        if("Instantânea".equals(kmods)&& "Madeira Serrada".equals(km)){
            kmod1mad1 = 1.10;
        }
        if("Instantânea".equals(kmods)&& "Madeira Laminada Colada".equals(km)){
            kmod1mad1 = 1.10;
        }
        if("Instantânea".equals(kmods)&& "Madeira Compensada".equals(km)){
            kmod1mad1 = 1.10;
        }
        if("Instantânea".equals(kmods)&& "Madeira Recomposta".equals(km)){
            kmod1mad1 = 1.10;
        }
        /*kmod 2 da madeira 1*/

        String kmod2 = jComboBox13.getSelectedItem().toString();
        String km2 = jComboBox9.getSelectedItem().toString();
        double kmod2mad1 = 0;

        /*Classe de umidade 1 do kmod2 da madeira 1*/
        if("1".equals(kmod2)){
            kmod2mad1 = 1;
        }
        /*Classe de umidade 2 do kmod2 da madeira 2*/
        if("2".equals(kmod2)){
            kmod2mad1 = 1;
        }

        /*Classe de umidade da 3  kmod2 da madeira 1*/
        if("3".equals(kmod2)&& "Madeira Serrada".equals(km2)){
            kmod2mad1 = 0.8;
        }
        if("3".equals(kmod2)&& "Madeira Laminada Colada".equals(km2)){
            kmod2mad1 = 0.8;
        }
        if("3".equals(kmod2)&& "Madeira Compensada".equals(km2)){
            kmod2mad1 = 0.8;
        }
        if("3".equals(kmod2)&& "Madeira Recomposta".equals(km2)){
            kmod2mad1 = 0.9;
        }
        /*Classe de umidade 2 para kmod2 da madeira 1*/
        if("4".equals(kmod2)&& "Madeira Serrada".equals(km2)){
            kmod2mad1 = 0.8;
        }
        if("4".equals(kmod2)&& "Madeira Laminada Colada".equals(km2)){
            kmod2mad1 = 0.8;
        }
        if("4".equals(kmod2)&& "Madeira Compensada".equals(km2)){
            kmod2mad1 = 0.8;
        }
        if("4".equals(kmod2)&& "Madeira Recomposta".equals(km2)){
            kmod2mad1 = 0.9;
        }
        /*Kmod 3 da madeira 1*/
        String kmod36s2 = jComboBox15.getSelectedItem().toString();
        double kmod3mad1 = 0;
        if("1".equals(kmod36s2)){
            kmod3mad1 = 1;
        }
        if("2".equals(kmod36s2)){
            kmod3mad1 = 0.80;
        }

        /*Cálculo do kmod final é do elemento 1*/
        double kmodfinalmad1;
        kmodfinalmad1 = kmod1mad1*kmod2mad1*kmod3mad1;
        String kmod1certo = (String.format(fe.format(kmod1mad1)));
        String kmod2certo = (String.format(fe.format(kmod2mad1)));
        String kmod3certo = (String.format(fe.format(kmod3mad1)));
        resulkmod1.setText(kmod1certo);
        resulkmod.setText(String.format("%.2f",kmodfinalmad1));
        resulkmod2.setText(kmod2certo);
        resulkmod3.setText(kmod3certo);

        /*Cálculo dos betas do parafuso*/
        /*escolha do parafuso*/
        String escopara1 = escopara.getSelectedItem().toString();
        double diametropara= 10;
        if("12.5".equals(escopara1)){
            diametropara = 1.25;
        }
        if("16.0".equals(escopara1)){
            diametropara = 1.60;
        }
        if("19.0".equals(escopara1)){
            diametropara = 1.90;
        }
        if("22.0".equals(escopara1)){
            diametropara = 2.20;
        }
        if("25.0".equals(escopara1)){
            diametropara = 2.50;
        }
        if("31.0".equals(escopara1)){
            diametropara = 3.10;
        }
        if("38.0".equals(escopara1)){
            diametropara = 3.80;
        }
        /*Cálculo da resistência da madeira 1*/
        double fc0dmad1;
        fc0dmad1 = (kmodfinalmad1*(resmad1/(1.4)))/10;
        String fc0dmad1certo = (String.format(fe.format(fc0dmad1)));
        rescomcal.setText(fc0dmad1certo);

        /*embutimento da madeira 1*/
        double resultado90;
        double resultadofinal = 0;
        double resultado0;
        double alfae = 0;
        if(diametropara==1.25){
            alfae = 1.68;
        }
        if(diametropara==1.60){
            alfae = 1.52;
        }
        if(diametropara==1.90){
            alfae = 1.41;
        }
        if(diametropara==2.20){
            alfae = 1.33;
        }
        if(diametropara==2.50){
            alfae = 1.27;
        }
        if(diametropara==3.10){
            alfae = 1.19;
        }
        if(diametropara==3.80){
            alfae = 1.14;
        }
        resultado0 = fc0dmad1;
        jLabel61.setText(String.valueOf(alfae));
        jLabel98.setText(String.format(fe.format(fc0dmad1)));
        resultado90 = (0.25*fc0dmad1*alfae);
        jLabel99.setText(String.format(fe.format(resultado90)));
        double resultado901 = fc0dmad1*0.25;
        jLabel44.setText(String.format(fe.format(resultado901)));
        double fv0d =  (kmodfinalmad1*(rescis/(1.8)))/10;
        jLabel60.setText(String.format(fe.format(fv0d)));
        if(am0.isSelected()){
            resultadofinal = resultado0;
            jLabel57.setText("0");
        }
        
        if(ang90.isSelected()){
            resultadofinal = resultado90;
            jLabel57.setText("90");
        }
        if(angdif.isSelected()){
            String valordoangulo = valorangdif.getText();
            double valordoangulo1 = Double.parseDouble(valordoangulo);
            double valordoangulo2 = Math.toRadians(valordoangulo1);
            double resultadodif = (fc0dmad1*resultado90)/((fc0dmad1*(Math.sin(valordoangulo2))*(Math.sin(valordoangulo2)))+(resultado90*(Math.cos(valordoangulo2))*(Math.cos(valordoangulo2))));
            resultadofinal = resultadodif;
            jLabel57.setText(valorangdif.getText());
        }
        String resultca1 = (String.format(fe.format(resultadofinal)));
        resutembut.setText(resultca1);
        String alfae1 = (String.format(fe.format(alfae)));
        alfaetext.setText(alfae1);
        /*cálculo dos betas*/
        String diamdsf = (String.format(fe.format(diametropara)));
        diam.setText(diamdsf);
        double betcalc;
        double betlimitecalc;
        betcalc = (te/diametropara);
        String betcalcc = (String.format(fe.format(betcalc)));
        betlimitecalc = (1.25*Math.sqrt((24/1.1)/resultadofinal));
        String betlimitestr = (String.format(fe.format(betlimitecalc)));
        betlimite.setText(betlimitestr);
        bet.setText(betcalcc);
        /*Cálculo da resistÊncia do pinos*/
        double resistpino = 0 ;
        double resistpino2 = 0 ;
        double resistpino1 = 0;
        double numeparafu;
        resistpino2 = 0.625*((diametropara*diametropara)/betlimitecalc)*(24/1.1);
        resistpino1 = 0.40*((te*te)/betcalc)*resultadofinal;
        jLabel62.setText(String.format(fe.format(resistpino1)));
        jLabel63.setText(String.format(fe.format(resistpino2)));
        
     
        String tipov = null;
        if(betlimitecalc>betcalc){
            resistpino = resistpino1;
            tipov = "Beta Limite > Beta";
        }else{
            resistpino = resistpino2;
            tipov = "Beta Limite < Beta";
        }
        jLabel65.setText(tipov);
        String resin =(String.format(fe.format(resistpino)));
        jlabelre.setText(resin);
        /*Escolha das variações das cargas*/
        /*Ações permanentes pequena variabilidade*/
        String variabilidade = Tipodevariabilidade.getSelectedItem().toString();
        String efeito = paraefeitos.getSelectedItem().toString();
        String comb = combinação.getSelectedItem().toString();
        double majorperma = 0;
        double majorvaria = 0;
        if("Ações de Pequena Variabilidade".equals(variabilidade)&& "Desfavoráveis".equals(efeito)&& "Normais".equals(comb)){
            majorperma = 1.3;
        }
        if("Ações de Pequena Variabilidade".equals(variabilidade)&& "Desfavoráveis".equals(efeito)&& "Especiais ou de Construções".equals(comb)){
            majorperma = 1.2;
        }
        if("Ações de Pequena Variabilidade".equals(variabilidade)&& "Desfavoráveis".equals(efeito)&& "Excepcionais".equals(comb)){
            majorperma = 1.1;
        }
        if("Ações de Pequena Variabilidade".equals(variabilidade)&& "Favoráveis".equals(efeito)&& "Normais".equals(comb)){
            majorperma = 1.0;
        }
        if("Ações de Pequena Variabilidade".equals(variabilidade)&& "Favoráveis".equals(efeito)&& "Especiais ou de Construções".equals(comb)){
            majorperma = 1.0;
        }
        if("Ações de Pequena Variabilidade".equals(variabilidade)&& "Favoráveis".equals(efeito)&& "Excepcionais".equals(comb)){
            majorperma = 1.0;
        }
        /*Ações permanentes de grande variabildiade */
        if("Ações de Grande Variabilidade".equals(variabilidade)&& "Desfavoráveis".equals(efeito)&& "Normais".equals(comb)){
            majorperma = 1.4;
        }
        if("Ações de Grande Variabilidade".equals(variabilidade)&& "Desfavoráveis".equals(efeito)&& "Especiais ou de Construções".equals(comb)){
            majorperma = 1.3;
        }
        if("Ações de Grande Variabilidade".equals(variabilidade)&& "Desfavoráveis".equals(efeito)&& "Excepcionais".equals(comb)){
            majorperma = 1.2;
        }
        if("Ações de Grande Variabilidade".equals(variabilidade)&& "Favoráveis".equals(efeito)&& "Normais".equals(comb)){
            majorperma = 0.9;
        }
        if("Ações de Grande Variabilidade".equals(variabilidade)&& "Favoráveis".equals(efeito)&& "Especiais ou de Construções".equals(comb)){
            majorperma = 0.9;
        }
        if("Ações de Grande Variabilidade".equals(variabilidade)&& "Favoráveis".equals(efeito)&& "Excepcionais".equals(comb)){
            majorperma = 0.9;
        }
        /*Ações variáveis*/
        String varia = variavel.getSelectedItem().toString();
        if("Ações Variáveis em Geral".equals(varia)&& "Normais".equals(comb)){
            majorvaria = 1.4;
        }
        if("Ações Variáveis em Geral".equals(varia)&& "Especiais ou de Construções".equals(comb)){
            majorvaria = 1.2;
        }
        if("Ações Variáveis em Geral".equals(varia)&& "Excepcionais".equals(comb)){
            majorvaria = 1.0;
        }
        if("Efeitos da Temperatura".equals(varia)&& "Excepcionais".equals(comb)){
            majorvaria = 1.2;
        }
        if("Efeitos da Temperatura".equals(varia)&& "Especiais ou de Construções".equals(comb)){
            majorvaria = 1.0;
        }
        if("Efeitos da Temperatura".equals(varia)&& "Excepcionais".equals(comb)){
            majorvaria = 0;
        }
        /*fatores de utilização*/
        double w0 = 0;
        double w1 = 0;
        double w2 = 0;
        double w0c = 0;
        double w1c = 0;
        double w2c = 0;
        /*Ações em estruturas correntes*/
        String Fatores = acoescorrentes.getSelectedItem().toString();
        if("Variações uniformes de Temperatura".equals(Fatores)){
            w0c = 0.6;
            w1c = 0.5;
            w2c = 0.3;
        }
        if("Pressão Dinâmica do Vento".equals(Fatores)){
            w0c = 0.5;
            w1c = 0.2;
            w2c = 0.0;
        }
        /*Cargas acidentais dos edifícios*/
        String aci = cargasacid.getSelectedItem().toString();
        if("Não há pred. de Equipamentos Fixos nem de el. concentr".equals(aci)){
            w0 = 0.4;
            w1 = 0.3;
            w2 = 0.2;
        }
        if("Há pred. de Equipamentos Fixos ou de elev. Concentração.".equals(aci)){
            w0 = 0.7;
            w1 = 0.6;
            w2 = 0.4;
        }
        if("Bibliotecas, arquivos, oficinas ou garagens".equals(aci)){
            w0 = 0.8;
            w1 = 0.7;
            w2 = 0.6;
        }

        /*Combinaçao de ação */
        double Frd = 0;
        double Frd1;
        double Frd2;
        double Frd3 = 0;
        String sob = sobrecarga.getText();
        String perm = permanente.getText();
        String ventod = vento.getText();
        double sobrecarga1 = Double.parseDouble(sob);
        double permanente1 = Double.parseDouble(perm);
        double vento1 = Double.parseDouble(ventod);
        double valormult;
        /*Combinação sobrecarga variável principal*/
        Frd1 = ((permanente1*majorperma)+(majorvaria*(sobrecarga1+(w0c*vento1))));
        if("Longa Duração".equals(kmods)){
            valormult = 0.75;
        }else{
            valormult = 1;
        }
        /*Combinação vento como variável principal*/
        Frd2 = ((permanente1*majorperma)+(majorvaria*((valormult*vento1)+(w0*sobrecarga1))));
        /*Combinação equipamento fixo*/
        String frdn1 = (String.format(fe.format(Frd1)));
        resultperma.setText(frdn1);
        String frdn2 = (String.format(fe.format(Frd2)));
        resultvent.setText(frdn2);
        double soma = Frd1+Frd;
        if(soma>0){
            jLabel20.setText("Tração");
            jLabel66.setText("+");
        }else{
            jLabel20.setText("Compressão");
            jLabel66.setText("-");
        }
        if(Frd1<0){
            Frd1 = -Frd1;
        }
        if(Frd2<0){
            Frd2 = -Frd2;
        }
        if (Frd2>Frd1){
            Frd = Frd2;
             }else{
            Frd = Frd1;
        }
        jLabel67.setText(String.format(fe.format(Frd)));
        /*Cálculo número de pinos*/
        numeparafu = (Frd/(resistpino));
        int numeparafu1 = (int)Math.ceil(numeparafu);
        String nus = String.valueOf(numeparafu1);
        numpara.setText(nus);
        /*numero e distancia entre parafuos*/
        /*enviar dados para o pdf*/
       
    }//GEN-LAST:event_jLabel14MouseClicked

    private void escolheraligaçãoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escolheraligaçãoMouseClicked
        jPanel1.setVisible(true);
        tipodeligaçãoaserescolhida.setVisible(true);
        resultadosdospregos.setVisible(false);
        resultadoscavilha.setVisible(false);
        escolhacavilha.setVisible(false);
        Escolhamadeira.setVisible(false);
        escolhadacarga.setVisible(false);
        pregoeparafuso.setVisible(false);
        Resultadoparafuso.setVisible(false);
        valorangdif.setVisible(false);

    }//GEN-LAST:event_escolheraligaçãoMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        jPanel1.setVisible(true);
        tipodeligaçãoaserescolhida.setVisible(false);
        resultadosdospregos.setVisible(false);

        resultadoscavilha.setVisible(false);
        escolhacavilha.setVisible(false);

        Escolhamadeira.setVisible(true);
        escolhadacarga.setVisible(false);
        pregoeparafuso.setVisible(false);
        Resultadoparafuso.setVisible(false);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        jPanel1.setVisible(true);
        tipodeligaçãoaserescolhida.setVisible(false);
        resultadosdospregos.setVisible(false);

        resultadoscavilha.setVisible(false);
        escolhacavilha.setVisible(false);

        Escolhamadeira.setVisible(false);
        escolhadacarga.setVisible(true);
        pregoeparafuso.setVisible(false);
        Resultadoparafuso.setVisible(false);
     

    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        jPanel1.setVisible(false);
        jPanel5.setVisible(false);
        tipodeligaçãoaserescolhida.setVisible(false);
        resultadosdospregos.setVisible(false);
        resultadoscavilha.setVisible(false);
        escolhacavilha.setVisible(false);
        Escolhamadeira.setVisible(false);
        escolhadacarga.setVisible(false);
        pregoeparafuso.setVisible(false);
        Resultadoparafuso.setVisible(false);
        jPanel6.setVisible(true);
        jPanel7.setVisible(true);

    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        if(ligaçãoparafusada1.isSelected()&& ligpara.isSelected()){
            jPanel1.setVisible(true);
            tipodeligaçãoaserescolhida.setVisible(false);
            resultadosdospregos.setVisible(false);

            resultadoscavilha.setVisible(false);
            escolhacavilha.setVisible(false);

            Escolhamadeira.setVisible(false);
            escolhadacarga.setVisible(false);
            pregoeparafuso.setVisible(false);
            Resultadoparafuso.setVisible(true);
        }
        if(ligaçãoparafusada1.isSelected()&& ligprego.isSelected()){
            jPanel1.setVisible(true);
            tipodeligaçãoaserescolhida.setVisible(false);
            resultadosdospregos.setVisible(true);

            resultadoscavilha.setVisible(false);
            escolhacavilha.setVisible(false);

            Escolhamadeira.setVisible(false);
            escolhadacarga.setVisible(false);
            pregoeparafuso.setVisible(false);
            Resultadoparafuso.setVisible(false);
        }
        if(ligacaocavilha1.isSelected()){
            jPanel1.setVisible(true);
            tipodeligaçãoaserescolhida.setVisible(false);
            resultadosdospregos.setVisible(false);

            resultadoscavilha.setVisible(true);
            escolhacavilha.setVisible(false);

            Escolhamadeira.setVisible(false);
            escolhadacarga.setVisible(false);
            pregoeparafuso.setVisible(false);
            Resultadoparafuso.setVisible(false);
        }

    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
        /*Pegando os dados do programa resultado e desenhando depois*/
        /*Pegando Cavilha*/
        String hiudo = diametroprego.getText();
        int diametroprego =10;/* em mm*/
        double diametroprego1 = 10;
        int larguradapeça =100;/*largura da peça mesmo em mm*/
        double larguradapeça2 = 100;
        int numerodeparafuprcav = 8;
        int compdauniaovoupegar =300;/*comprimento da uniao definitito8*/
        double compdauniaovoupegar1 = 300;
        DecimalFormat fe = new DecimalFormat("0.00");
        DecimalFormat casa = new DecimalFormat("0");
        if(ligacaocavilha1.isSelected()){
           /*escolha da quantidade de elementos de ligação*/
           String valordacav = jLabel32.getText();
           int valorrecebido = Integer.parseInt(valordacav);
           if(valorrecebido<2){
               valorrecebido = 2;
           }
           if(valorrecebido>8){
               valorrecebido = 8;
           }
           numerodeparafuprcav = valorrecebido;
           /*comprimento da uniao*/
           String Valordocompr = compr.getText();
           int valorrececompr = Integer.parseInt(Valordocompr)*10;
           compdauniaovoupegar = valorrececompr;
           compdauniaovoupegar1 = Double.parseDouble(Valordocompr)*10;
           /*largura pegar*/
           String Valordalarg = larguralig.getText();
           int valordalarg1 = Integer.parseInt(Valordalarg)*10;
           larguradapeça = valordalarg1;
           larguradapeça2 = Double.parseDouble(Valordalarg)*10;
           /*escolhado diametrocav*/
           String diametrocav1 = cavj.getSelectedItem().toString();
           double diametrocavdo1 = Double.parseDouble(diametrocav1);
           int diametrocavdo = Integer.parseInt(diametrocav1);
           diametroprego = diametrocavdo;
           diametroprego1 = diametrocavdo1;
           jLabel48.setText(diametrocav1);
        }
         if(ligaçãoparafusada1.isSelected()&& ligpara.isSelected()){

           /*escolha da quantidade de elementos de ligação*/
           String valordapara = numpara.getText();
           int valorrecebido = Integer.parseInt(valordapara);
           if(valorrecebido<2){
               valorrecebido = 2;
           }
           if(valorrecebido>8){
               valorrecebido = 8;
           }
           numerodeparafuprcav = valorrecebido;
            /*comprimento da uniao*/
           String Valordocompr = compr.getText();
           int valorrececompr = Integer.parseInt(Valordocompr)*10;
           compdauniaovoupegar = valorrececompr;
           compdauniaovoupegar1 = Double.parseDouble(Valordocompr)*10;
           /*largura pegar*/
           String Valordalarg = larguralig.getText();
           int valordalarg1 = Integer.parseInt(Valordalarg)*10;
           larguradapeça = valordalarg1;
           larguradapeça2 = Double.parseDouble(Valordalarg)*10;
           /*diametro do parafuso*/
           String escopara1 = escopara.getSelectedItem().toString();
           if("9.5".equals(escopara1)){
            diametroprego = (int) 9.5;
            diametroprego1 = 9.5;
           }
            if("12.5".equals(escopara1)){
            diametroprego = (int) 12.5;
            diametroprego1 = 12.5;
           }
           if("16.0".equals(escopara1)){
            diametroprego1 = 16;
            diametroprego = 16;
           }
           if("19.0".equals(escopara1)){
            diametroprego1= 19;
            diametroprego = 19;
           }
           if("22.0".equals(escopara1)){
            diametroprego1 = 22;
            diametroprego = 22;
           }
           if("25.0".equals(escopara1)){
            diametroprego1 = 25;
            diametroprego = 25;
           }
           if("31.0".equals(escopara1)){
            diametroprego1 = 31;
            diametroprego = 31;
           }
           if("38.0".equals(escopara1)){
            diametroprego1 = 38;
            diametroprego = 38;
           }
           if(selco.isSelected()){
              double prefuro = diametroprego1+0.5;
              String prefurac = String.format(fe.format(prefuro));
              jLabel48.setText(prefurac);
           }
           if(seldico.isSelected()){
              double prefuro = diametroprego1+0.5;
              String prefurac = String.format(fe.format(prefuro));
              jLabel48.setText(prefurac);
           }
        }
        if(ligaçãoparafusada1.isSelected()&& ligprego.isSelected()){
           /*escolha da quantidade de elementos de ligação*/
           String valordacav2 = jLabel55.getText();
           int valorrecebido = Integer.parseInt(valordacav2);
           if(valorrecebido<2){
               valorrecebido = 2;
           }
           if(valorrecebido>8){
               valorrecebido = 8;
           }
           numerodeparafuprcav = valorrecebido;
            /*comprimento da uniao*/
           String Valordocompr = compr.getText();
           int valorrececompr = Integer.parseInt(Valordocompr)*10;
           compdauniaovoupegar = valorrececompr;
           compdauniaovoupegar1 = Double.parseDouble(Valordocompr)*10;
           /*largura pegar*/
           String Valordalarg = larguralig.getText();
           int valordalarg1 = Integer.parseInt(Valordalarg)*10;
           larguradapeça = valordalarg1;
           larguradapeça2 = Double.parseDouble(Valordalarg)*10;
           /*escolha diametro do prego*/
             /*escolha do prego*/
        if("3.0".equals(hiudo)){
            diametroprego = 3;
            diametroprego1 = 3;
        }
        if("3.4".equals(hiudo)){
            diametroprego = 3;
            diametroprego1 = 3.40;
        }
        if("3.5".equals(hiudo)){
            diametroprego = 4;
            diametroprego1 = 3.90;
        }
        if("4.4".equals(hiudo)){
           diametroprego = 4;
            diametroprego1 = 4.40;
        }
        if("4.9".equals(hiudo)){
            diametroprego = 4;
            diametroprego1 = 4.90;
        }
        if("5.4".equals(hiudo)){
           diametroprego = 5;
            diametroprego1 = 5.40;
        }
        if("5.9".equals(hiudo)){
            diametroprego = 6;
            diametroprego1 = 5.90;
        }
        if("6.4".equals(hiudo)){
            diametroprego = 6;
            diametroprego1 = 6.40;
        }
        if("7.6".equals(hiudo)){
           diametroprego = 8;
            diametroprego1 = 7.60;
        }
        if(selco.isSelected()){
              double prefuro = 0.85*diametroprego1;
              String prefurac = String.format(fe.format(prefuro));
              jLabel48.setText(prefurac);
           }
           if(seldico.isSelected()){
              double prefuro = 0.98*diametroprego1;
              String prefurac = String.format(fe.format(prefuro));
              jLabel48.setText(prefurac);
           }
        }
        
         if(liganel1.isSelected()){
           String valordacav = jLabel92.getText();
           int valorrecebido = Integer.parseInt(valordacav);
           if(valorrecebido>5){
               valorrecebido=3;
           }
           numerodeparafuprcav = valorrecebido;
            /*comprimento da uniao*/
           String Valordocompr = compr.getText();
           int valorrececompr = Integer.parseInt(Valordocompr)*10;
           compdauniaovoupegar = valorrececompr;
           compdauniaovoupegar1 = Double.parseDouble(Valordocompr)*10;
           /*largura pegar*/
           String Valordalarg = larguralig.getText();
           int valordalarg1 = Integer.parseInt(Valordalarg)*10;
           larguradapeça = valordalarg1;
           larguradapeça2 = Double.parseDouble(Valordalarg)*10;
           String diamanel = jComboBox4.getSelectedItem().toString();
           double diametroaneldou = Double.parseDouble(diamanel);
           double diametrodif = diametroaneldou/10;
           int diametroanelint = Integer.parseInt(diamanel);
           int diametrodifint = diametroanelint/10;
           diametroprego = diametroanelint;
           diametroprego1 = diametroaneldou;
           jLabel48.setText(diamanel);
 
        }
        //*Inicio da desenho técnico do programa*//   
        /*linhas de referencia*/
        jPanel7.setBackground(Color.BLACK);
        
        int alturapainel = jPanel7.getHeight();
        int largurapainel = jPanel7.getWidth();
        /*espessuradafaixa*/
        int espessuradafaixaaltura = alturapainel/6;
        int espessuradafaixalargura = largurapainel/6;
        /*linhasverticais e horizontais*/
        Graphics2D linhasverticais = (Graphics2D) jPanel7.getGraphics();
        Graphics2D linhashorizontais = (Graphics2D) jPanel7.getGraphics();
        linhasverticais.setStroke(new BasicStroke(1));
        linhashorizontais.setStroke(new BasicStroke(1));
        linhasverticais.setColor(Color.red);
        linhashorizontais.setColor(Color.blue);
        /*linhasverticais.drawLine(espessuradafaixalargura,0,espessuradafaixalargura, alturapainel);
        linhasverticais.drawLine(2*espessuradafaixalargura,0,2*espessuradafaixalargura, alturapainel);
        linhasverticais.drawLine(3*espessuradafaixalargura,0,3*espessuradafaixalargura, alturapainel);
        linhasverticais.drawLine(4*espessuradafaixalargura,0,4*espessuradafaixalargura, alturapainel);
        linhasverticais.drawLine(5*espessuradafaixalargura,0,5*espessuradafaixalargura, alturapainel);
        linhasverticais.drawLine(6*espessuradafaixalargura,0,6*espessuradafaixalargura, alturapainel);
        linhashorizontais.drawLine(0,espessuradafaixaaltura, largurapainel,espessuradafaixaaltura);*/
        /*Posição do elementode ligação 1 */
        int centrodoelemento1 = ((espessuradafaixalargura+espessuradafaixalargura)/2);
        int centrodoelemento1h = (espessuradafaixaaltura + (alturapainel-espessuradafaixaaltura)/2);
        /*linhasverticais.drawLine(centrodoelemento1, 0, centrodoelemento1, alturapainel);
        linhashorizontais.drawLine(0,centrodoelemento1h, largurapainel, centrodoelemento1h);

        /*Posição do elemento de ligação 2*/
        int centrodoelemento2v = ((2*espessuradafaixalargura+3*espessuradafaixalargura)/2);
        int centrodoelemento2h = (espessuradafaixaaltura+ (alturapainel-espessuradafaixaaltura)/2);
        /*linhasverticais.drawLine(centrodoelemento2v, 0, centrodoelemento2v, alturapainel);
        linhashorizontais.drawLine(0,centrodoelemento2h, largurapainel, centrodoelemento2h);

        /*Desenhando elemento 1*/
        Graphics2D madsup = (Graphics2D)jPanel7.getGraphics();
        Graphics2D cotas = (Graphics2D)jPanel7.getGraphics();
        Graphics2D linhasdecortedacota = (Graphics2D)jPanel7.getGraphics();
        cotas.setColor(Color.cyan);
        linhasdecortedacota.setColor(Color.white);
        madsup.setColor(Color.ORANGE);
        madsup.setStroke(new BasicStroke(3));
        int espt2 = 40;/*(t2)*/
        String espts = String.valueOf(espt2);
        int espt1 = 40;/*t1*/
        String espts1 = String.valueOf(espt1);
        int espt3 = 40;/*t3*/
        String espts3 = String.valueOf(espt3);
        int alturadoel = 450;/*largura do desenho em planta peça*/
        
        String compdaunito = String.valueOf(compdauniaovoupegar);
        int compdau = compdauniaovoupegar/2;/*comprimentodauniao sobre 2*/
        int distdacota = 20;/*distancia da cota*/
        /*Desenhando os elementos*/
        /*desenhoelementot2*/

        /*Desenhandoelemento2*/
        Graphics2D madlat1 = (Graphics2D)jPanel7.getGraphics();
        Graphics2D madlat2 = (Graphics2D)jPanel7.getGraphics();
        Graphics2D cotaslat1 = (Graphics2D)jPanel7.getGraphics();
        Graphics2D parafuso = (Graphics2D)jPanel7.getGraphics();
        Graphics2D prego = (Graphics2D)jPanel7.getGraphics();
        Graphics2D cavilha = (Graphics2D)jPanel7.getGraphics();

        madlat1.setColor(Color.ORANGE);
        madlat1.setStroke(new BasicStroke(2));
        madlat2.setColor(Color.ORANGE);
        madlat2.setStroke(new BasicStroke(2));
        cotaslat1.setColor(Color.cyan);
        prego.setColor(new Color(193, 193, 193));
        String larguradapeça1 = String.valueOf(larguradapeça);
        String compdauni1 = String.valueOf(compdauniaovoupegar);
        int comprimentodapeça = 600;/*comprimento do desenho da peça*/
        double comprimentodapeça1 = 600;
        String valordia = String.valueOf(diametroprego);
        int distho = (int) (1.5*diametroprego);
        double distho1 = 1.5*diametroprego1;
        int distnomeioentrepregos = 3*diametroprego;
        double distnomeioentrepregos1 = 3*diametroprego1;
        
        String tipodelig = "Parafuso";
        String tipodesol = "Compressão";
        if(jLabel20.getText()=="Tração"){
            tipodesol = "Tração";
        }
        if(jLabel20.getText()=="Compressão"){
            tipodesol = "Compressão";
        }
        if(ligacaocavilha1.isSelected()){
            tipodelig = "Cavilha";
        }
        if(ligaçãoparafusada1.isSelected()&& ligprego.isSelected()){
            tipodelig = "Prego";
        }
        if(ligaçãoparafusada1.isSelected()&& ligpara.isSelected()){
            tipodelig = "Parafuso";
        }
        if(liganel1.isSelected()){
            tipodelig = "Anel";
        }
        int distadacotadesenho2 = 20;
        int distanum = 5;
      
        /*desenhando elementos*/
        madlat1.drawRect(centrodoelemento2v-comprimentodapeça/2+100, centrodoelemento2h-larguradapeça/2, comprimentodapeça, larguradapeça);
        madlat2.drawRect(centrodoelemento2v, centrodoelemento2h-larguradapeça/2, 0, larguradapeça);
        madlat2.drawRect(centrodoelemento2v+compdauniaovoupegar,centrodoelemento2h-larguradapeça/2, 0, larguradapeça);
       
        /*cotas da largura do elemento 2*/
        cotaslat1.drawRect(centrodoelemento2v-comprimentodapeça/2-distadacotadesenho2+100,centrodoelemento2h-larguradapeça/2,  0, larguradapeça);
        cotaslat1.drawString(larguradapeça1,centrodoelemento2v-comprimentodapeça/2-distadacotadesenho2+100-25,centrodoelemento2h);

        /*linhas de corte da largura do elemento 2*/
        Graphics2D linhasdecortedacota9 = (Graphics2D)jPanel7.getGraphics();
        linhasdecortedacota9.setColor(Color.WHITE);
        linhasdecortedacota9.translate(centrodoelemento2v-comprimentodapeça/2-distadacotadesenho2+100-5,centrodoelemento2h-larguradapeça/2-5);
        linhasdecortedacota9.drawLine(0, 10, 10, 0);
        Graphics2D linhasdecortedacota10 = (Graphics2D)jPanel7.getGraphics();
        linhasdecortedacota10.setColor(Color.WHITE);
        linhasdecortedacota10.translate(centrodoelemento2v-comprimentodapeça/2-distadacotadesenho2+100-5,centrodoelemento2h+larguradapeça/2-5);
        linhasdecortedacota10.drawLine(0, 10, 10, 0);

        /*cota da uniao elemento 2*/
        cotaslat1.drawRect(centrodoelemento2v,centrodoelemento2h+larguradapeça/2+distadacotadesenho2*2,compdauniaovoupegar, 0);
        cotaslat1.drawString(compdauni1,centrodoelemento2v+compdauniaovoupegar/2-20,centrodoelemento2h+larguradapeça/2+distadacotadesenho2+distanum);
        Graphics2D linhasdecortedacota11 = (Graphics2D)jPanel7.getGraphics();

        /*linhas de corte da uniao do elemento 2*/
        linhasdecortedacota11.setColor(Color.WHITE);
        linhasdecortedacota11.translate(centrodoelemento2v-5,centrodoelemento2h+larguradapeça/2-5+distadacotadesenho2*2);
        linhasdecortedacota11.drawLine(0, 10, 10, 0);
        Graphics2D linhasdecortedacota12 = (Graphics2D)jPanel7.getGraphics();
        linhasdecortedacota12.setColor(Color.WHITE);
        linhasdecortedacota12.translate(centrodoelemento2v-5+compdauniaovoupegar,centrodoelemento2h+larguradapeça/2-5+distadacotadesenho2*2);
        linhasdecortedacota12.drawLine(0, 10, 10, 0);
        
        /*desenho das linhas de corte do elemento2*/
        madlat1.drawRect(centrodoelemento2v-comprimentodapeça/2+100,centrodoelemento2h-larguradapeça/2-25, 0, 25);
        madlat1.drawRect(centrodoelemento2v-comprimentodapeça/2+100,centrodoelemento2h+larguradapeça/2, 0, 25);
        madlat1.drawRect(centrodoelemento2v+comprimentodapeça/2+100,centrodoelemento2h-larguradapeça/2-25, 0, 25);
        madlat1.drawRect(centrodoelemento2v+comprimentodapeça/2+100,centrodoelemento2h+larguradapeça/2, 0, 25);
        if(ang90.isSelected()){
           Graphics2D sied = (Graphics2D) jPanel7.getGraphics();
        sied.setColor(Color.GREEN);
        sied.drawLine(centrodoelemento2v,centrodoelemento2h+larguradapeça/2,centrodoelemento2v,centrodoelemento2h+larguradapeça/2-250);
        sied.drawLine(centrodoelemento2v+compdauniaovoupegar,centrodoelemento2h+larguradapeça/2,centrodoelemento2v+compdauniaovoupegar,centrodoelemento2h+larguradapeça/2-250);
        sied.drawLine(centrodoelemento2v-25,centrodoelemento2h+larguradapeça/2-250, centrodoelemento2v+compdauniaovoupegar+25,centrodoelemento2h+larguradapeça/2-250); 
        }
      
        /*Condições de Tração e Compressão Quando não for anel*/
        int distextremo = 0; 
        double distextremo1 = 0;
        int distinter = 0;
        double distinter1 = 0;
        int disthoemcima = (int) (1.5*diametroprego);
        double disthoemcima1 = 1.5*diametroprego1;
        int disthoembaixo = (int) (1.5*diametroprego);
        double disthoembaixo1 = 1.5*diametroprego1;
        
        
        if(liganel1.isSelected()){
          if(am0.isSelected()){
          if("Tração".equals(tipodesol)){
           distextremo1 = 1.5*diametroprego1;
           distextremo = (int) (1.5*diametroprego);
           distinter = (int) (1.5*diametroprego);;
           distinter1 = 1.5*diametroprego1;
           disthoemcima = (int) (0.75*diametroprego); 
           disthoemcima1 = 0.75*diametroprego1;
           disthoembaixo = (int) (0.75*diametroprego);
           disthoembaixo1 = 0.75*diametroprego1;
        }
        if("Compressão".equals(tipodesol)){
           distextremo1 = 1*diametroprego1;
           distextremo = 1*diametroprego;
           distinter = (int) (1.5*diametroprego);;
           distinter1 = 1.5*diametroprego1;
           disthoemcima = (int) (0.75*diametroprego); 
           disthoemcima1 = 0.75*diametroprego1;
           disthoembaixo = (int) (0.75*diametroprego);
           disthoembaixo1 = 0.75*diametroprego1;
        }
        }
        if(ang90.isSelected()){
           if("Tração".equals(tipodesol)){
           distextremo1 = 0.75*diametroprego1;
           distextremo = (int) (0.75*diametroprego);
           distinter = (int) (0.75*diametroprego);;
           distinter1 = 0.75*diametroprego1;
           disthoemcima = (int) (1*diametroprego); 
           disthoemcima1 = 1*diametroprego1;
           disthoembaixo = (int) (1.75*diametroprego);
           disthoembaixo1 = 1.75*diametroprego1;
        }
         
        if("Compressão".equals(tipodesol)){
           distextremo1 = 0.75*diametroprego1;
           distextremo = (int) (0.75*diametroprego);
           distinter = (int) (0.75*diametroprego);;
           distinter1 = 0.75*diametroprego1;
           disthoemcima = (int) (0.75*diametroprego); 
           disthoemcima1 = 0.75*diametroprego1;
           disthoembaixo = (int) (1.75*diametroprego);
           disthoembaixo1 = 1.75*diametroprego1;
        }
        
        }       
        }else{
        if(am0.isSelected()){
        if("Tração".equals(tipodesol)){
           distextremo1 = 7*diametroprego1;
           distextremo = 7*diametroprego;
        }
        if("Compressão".equals(tipodesol)){
           distextremo1 = 4*diametroprego1;
           distextremo = 4*diametroprego;
        }
        if("Prego".equals(tipodelig)||"Cavilha".equals(tipodelig)){
            distinter = 6*diametroprego;
            distinter1 = 6*diametroprego1;
        }
        if("Parafuso".equals(tipodelig)){
            distinter = 4*diametroprego;
            distinter1 = 4*diametroprego1;
        }
        }
        if(ang90.isSelected()){
           if("Tração".equals(tipodesol)){
           distextremo1 = 1.5*diametroprego1;
           distextremo = (int) (1.5*diametroprego);
           disthoemcima = 4*diametroprego;
           disthoemcima1 = 4*diametroprego1;
           if("Prego".equals(tipodelig)||"Cavilha".equals(tipodelig)){
            distinter = 3*diametroprego;
            distinter1 = 3*diametroprego1;
            distnomeioentrepregos1 = 6*diametroprego1;
            distnomeioentrepregos = 6*diametroprego;
        }
        if("Parafuso".equals(tipodelig)){
            distinter = 3*diametroprego;
            distinter1 = 3*diametroprego1;
            distnomeioentrepregos1 = 4*diametroprego1;
            distnomeioentrepregos = 4*diametroprego;
        } 
           disthoembaixo = (int) (1.5*diametroprego);
           disthoembaixo1 = 1.5*diametroprego1;
        }
         
        if("Compressão".equals(tipodesol)){
           distextremo1 = 1.5*diametroprego1;
           distextremo = (int) (1.5*diametroprego);
           disthoemcima = (int) (1.5*diametroprego);
           disthoemcima1 = 1.5*diametroprego1;
           if("Prego".equals(tipodelig)||"Cavilha".equals(tipodelig)){
            distinter = 3*diametroprego;
            distinter1 = 3*diametroprego1;
            distnomeioentrepregos1 = 6*diametroprego1;
            distnomeioentrepregos = 6*diametroprego;
        }
        if("Parafuso".equals(tipodelig)){
            distinter = 3*diametroprego;
            distinter1 = 3*diametroprego1;
            distnomeioentrepregos1 = 4*diametroprego1;
            distnomeioentrepregos = 4*diametroprego;
        } 
           disthoembaixo = (int) (4*diametroprego);
           disthoembaixo1 = 4*diametroprego1;
        }
        
        }
        }
        
        
        if(liganel1.isSelected()){
             if(numerodeparafuprcav==1){
              if((larguradapeça2>disthoemcima1+disthoembaixo1) && (compdauniaovoupegar>2*distextremo)){
                    int difhor = (compdauniaovoupegar - distextremo*2)/2;
                    double difhor1 = (compdauniaovoupegar1 - disthoemcima1-disthoembaixo1)/2;
                    prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+difhor,(centrodoelemento2h-diametroprego/2),diametroprego ,diametroprego);
                    /*cota distância entre elementos horizontal*/
                    cotaslat1.drawRect(centrodoelemento2v, centrodoelemento2h-larguradapeça/2-distadacotadesenho2,distextremo+difhor,0);
                    /*linhadacotaesquerda*/
                    Graphics linhasco8 = jPanel7.getGraphics();
                    linhasco8.setColor(Color.WHITE);
                    linhasco8.translate(centrodoelemento2v-15, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                    linhasco8.drawLine(10,20,20,10);
                    cotaslat1.drawString(String.format(fe.format((distextremo1+difhor1))),centrodoelemento2v-15+(distextremo+difhor)/2, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                    /*linhadacotacentro*/
                    Graphics linhasco9 = jPanel7.getGraphics();
                    linhasco9.setColor(Color.WHITE);
                    linhasco9.translate(centrodoelemento2v-15+distextremo+difhor, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                    linhasco9.drawLine(10,20,20,10);

                    /*distância entre elementos na vertical*/
                    cotaslat1.drawRect(centrodoelemento2v-distadacotadesenho2, centrodoelemento2h-larguradapeça/2,0,larguradapeça);
                    /*linha dacota superior*/
                    Graphics linhasco3 = jPanel7.getGraphics();
                    linhasco3.setColor(Color.WHITE);
                    linhasco3.translate(centrodoelemento2v-distadacotadesenho2-15, centrodoelemento2h-larguradapeça/2-15);
                    linhasco3.drawLine(10,20,20,10);
                    cotaslat1.drawString(String.format(fe.format((larguradapeça2)/2)),centrodoelemento2v-distadacotadesenho2*3,centrodoelemento2h-larguradapeça/4);
                    /*linha dacota dosmeios*/
                    Graphics linhasco4 = jPanel7.getGraphics();
                    linhasco4.setColor(Color.WHITE);
                    linhasco4.translate(centrodoelemento2v-distadacotadesenho2-15, centrodoelemento2h-15);
                    linhasco4.drawLine(10,20,20,10);
                    /*linha dacota inferior*/
                    Graphics linhasco6 = jPanel7.getGraphics();
                    linhasco6.setColor(Color.WHITE);
                    linhasco6.translate(centrodoelemento2v-distadacotadesenho2-15, centrodoelemento2h+larguradapeça/2-15);
                    linhasco6.drawLine(10,20,20,10);
                    cotaslat1.drawString(String.format(fe.format((larguradapeça2)/2)),centrodoelemento2v-distadacotadesenho2*3,centrodoelemento2h+larguradapeça/4);
          }else{
                  JOptionPane.showMessageDialog(null,"Esta peça não pode ser desenhada pois não há espaço para isso, Segundo critérios normativos NBR7190","Erro - Falta de espaço na peça",JOptionPane.OK_OPTION); 
             }
             
             }
             if(numerodeparafuprcav==2){
             if((larguradapeça2>disthoemcima1+disthoembaixo1)&&(compdauniaovoupegar>distextremo*2+distinter)){
                    int difhor = (compdauniaovoupegar - distextremo*2-distinter)/4;
                    double difhor1 = (compdauniaovoupegar1 - distextremo1*2-distinter1)/4;
                    prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+difhor,(centrodoelemento2h-diametroprego/2),diametroprego ,diametroprego);
                    /*prego.drawOval(centrodoelemento2v-(diametroprego/2)+diametroprego*4,centrodoelemento2h,diametroprego ,diametroprego);*/
                    prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+distinter+difhor*3,(centrodoelemento2h-diametroprego/2),diametroprego ,diametroprego);
                    /*cota distância entre elementos horizontal*/
                    cotaslat1.drawRect(centrodoelemento2v, centrodoelemento2h-larguradapeça/2-distadacotadesenho2,distextremo+distinter+difhor*3,0);
                    /*linhadacotaesquerda*/
                    Graphics linhasco8 = jPanel7.getGraphics();
                    linhasco8.setColor(Color.WHITE);
                    linhasco8.translate(centrodoelemento2v-15, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                    linhasco8.drawLine(10,20,20,10);
                    cotaslat1.drawString(String.format(fe.format((distextremo1+difhor1))),centrodoelemento2v-15+(distextremo+difhor)/2, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                    /*linhadacotacentro*/
                    Graphics linhasco9 = jPanel7.getGraphics();
                    linhasco9.setColor(Color.WHITE);
                    linhasco9.translate(centrodoelemento2v-15+distextremo+difhor, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                    linhasco9.drawLine(10,20,20,10);
                    /*linhadacotadireita*/
                    Graphics linhasco10 = jPanel7.getGraphics();
                    linhasco10.setColor(Color.WHITE);
                    linhasco10.translate(centrodoelemento2v-15+distextremo+distinter+difhor*3, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                    linhasco10.drawLine(10,20,20,10);
                    cotaslat1.drawString(String.format(fe.format((distinter1+difhor*2))),centrodoelemento2v-15+distextremo+difhor+(distinter+difhor*2)/2, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);

                    /*distância entre elementos na vertical*/
                    cotaslat1.drawRect(centrodoelemento2v-distadacotadesenho2, centrodoelemento2h-larguradapeça/2,0,larguradapeça);
                    /*linha dacota superior*/
                    Graphics linhasco3 = jPanel7.getGraphics();
                    linhasco3.setColor(Color.WHITE);
                    linhasco3.translate(centrodoelemento2v-distadacotadesenho2-15, centrodoelemento2h-larguradapeça/2-15);
                    linhasco3.drawLine(10,20,20,10);
                    cotaslat1.drawString(String.format(fe.format((larguradapeça2)/2)),centrodoelemento2v-distadacotadesenho2*3,centrodoelemento2h-larguradapeça/4);
                    /*linha dacota dosmeios*/
                    Graphics linhasco4 = jPanel7.getGraphics();
                    linhasco4.setColor(Color.WHITE);
                    linhasco4.translate(centrodoelemento2v-distadacotadesenho2-15, centrodoelemento2h-15);
                    linhasco4.drawLine(10,20,20,10);
                    /*linha dacota inferior*/
                    Graphics linhasco6 = jPanel7.getGraphics();
                    linhasco6.setColor(Color.WHITE);
                    linhasco6.translate(centrodoelemento2v-distadacotadesenho2-15, centrodoelemento2h+larguradapeça/2-15);
                    linhasco6.drawLine(10,20,20,10);
                    cotaslat1.drawString(String.format(fe.format((larguradapeça2)/2)),centrodoelemento2v-distadacotadesenho2*3,centrodoelemento2h+larguradapeça/4);
                    }else{
                        JOptionPane.showMessageDialog(null,"Esta peça não pode ser desenhada pois não há espaço para isso, Segundo critérios normativos NBR7190","Erro - Falta de espaço na peça",JOptionPane.OK_OPTION); 
                    }
             }
             
        }else{
        /*desenho dos pregos, parafusos e cavilha para 2*/
        if(numerodeparafuprcav==2){
            if(distnomeioentrepregos1<(larguradapeça2 -disthoemcima1-disthoembaixo1)&& (compdauniaovoupegar1>distextremo1*2)){
                int difhor = (compdauniaovoupegar - distextremo*2)/2;
                double difhor1 = (compdauniaovoupegar1 - distextremo1*2)/2;
                int difver = (larguradapeça -distnomeioentrepregos-disthoembaixo-disthoemcima)/4;
                double difver1 = (larguradapeça2 -distnomeioentrepregos1-disthoembaixo1-disthoemcima1)/4;
                prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+difhor,(-diametroprego/2+centrodoelemento2h-larguradapeça/2+disthoemcima+difver),diametroprego ,diametroprego);
                /*prego.drawOval(centrodoelemento2v-(diametroprego/2)+diametroprego*4,centrodoelemento2h,diametroprego ,diametroprego);*/
                prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+difhor,(-diametroprego/2+centrodoelemento2h+larguradapeça/2-disthoembaixo-difver),diametroprego ,diametroprego);
                /*cota distância entre eles horizontal*/
                cotaslat1.drawRect(centrodoelemento2v, centrodoelemento2h-larguradapeça/2-distadacotadesenho2,distextremo+difhor,0);
                cotaslat1.drawString(String.format(fe.format(distextremo1+difhor1)),centrodoelemento2v+(distextremo+difhor)/2,centrodoelemento2h-larguradapeça/2-distadacotadesenho2-distanum);
                Graphics linhasco5 = jPanel7.getGraphics();
                linhasco5.setColor(Color.WHITE);
                linhasco5.translate(centrodoelemento2v-15, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                linhasco5.drawLine(10,20,20,10);
                Graphics linhasco6 = jPanel7.getGraphics();
                linhasco6.setColor(Color.WHITE);
                linhasco6.translate(centrodoelemento2v-15+distextremo+difhor, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                linhasco6.drawLine(10,20,20,10);

                /*cota distância entre vertical*/
                cotaslat1.drawRect(centrodoelemento2v-distadacotadesenho2*2, centrodoelemento2h-larguradapeça/2,0,larguradapeça);
                cotaslat1.drawString(String.format(fe.format(distnomeioentrepregos1+difver1*2)),centrodoelemento2v-distadacotadesenho2*4,centrodoelemento2h);
                cotaslat1.drawString(String.format(fe.format(disthoemcima1+difver1)),centrodoelemento2v-distadacotadesenho2*4,centrodoelemento2h-larguradapeça/2+(disthoemcima+difver)/2);
                cotaslat1.drawString(String.format(fe.format(disthoembaixo1+difver1)),centrodoelemento2v-distadacotadesenho2*4,centrodoelemento2h+larguradapeça/2-(disthoembaixo+difver)/2);
                /*linhadecimadomeiovertical*/
                Graphics linhasco1 = jPanel7.getGraphics();
                linhasco1.setColor(Color.WHITE);
                linhasco1.translate(centrodoelemento2v-distadacotadesenho2*2-15,centrodoelemento2h-15-larguradapeça/2+disthoemcima+difver);
                linhasco1.drawLine(10,20,20,10);
                Graphics linhasco4 = jPanel7.getGraphics();
                linhasco4.setColor(Color.WHITE);
                linhasco4.translate(centrodoelemento2v-distadacotadesenho2*2-15,centrodoelemento2h-15+larguradapeça/2-disthoembaixo-difver);
                linhasco4.drawLine(10,20,20,10);
                /*linhadebaixodavertical*/
                Graphics linhasco2 = jPanel7.getGraphics();
                linhasco2.setColor(Color.WHITE);
                linhasco2.translate(centrodoelemento2v-distadacotadesenho2*2-15,centrodoelemento2h-15+larguradapeça/2);
                linhasco2.drawLine(10,20,20,10);
                /*linhadecimadavertical*/
                Graphics linhasco3 = jPanel7.getGraphics();
                linhasco3.setColor(Color.WHITE);
                linhasco3.translate(centrodoelemento2v-distadacotadesenho2*2-15,centrodoelemento2h-15-larguradapeça/2);
                linhasco3.drawLine(10,20,20,10);

            }
            if(distnomeioentrepregos1>(larguradapeça2 -disthoemcima1-disthoembaixo1)){
                if((larguradapeça2<disthoembaixo1+disthoemcima1)&&(compdauniaovoupegar1>distextremo1+distinter1)){
                    int difhor = (compdauniaovoupegar - distextremo*2-distinter)/4;
                    double difhor1 = (compdauniaovoupegar1 - distextremo1*2-distinter1)/4;
                    prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+difhor,(centrodoelemento2h-diametroprego/2),diametroprego ,diametroprego);
                    /*prego.drawOval(centrodoelemento2v-(diametroprego/2)+diametroprego*4,centrodoelemento2h,diametroprego ,diametroprego);*/
                    prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+distinter+difhor*3,(centrodoelemento2h-diametroprego/2),diametroprego ,diametroprego);
                    /*cota distância entre elementos horizontal*/
                    cotaslat1.drawRect(centrodoelemento2v, centrodoelemento2h-larguradapeça/2-distadacotadesenho2,distextremo+distinter+difhor*3,0);
                    /*linhadacotaesquerda*/
                    Graphics linhasco8 = jPanel7.getGraphics();
                    linhasco8.setColor(Color.WHITE);
                    linhasco8.translate(centrodoelemento2v-15, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                    linhasco8.drawLine(10,20,20,10);
                    cotaslat1.drawString(String.format(fe.format((distextremo1+difhor1))),centrodoelemento2v-15+(distextremo+difhor)/2, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                    /*linhadacotacentro*/
                    Graphics linhasco9 = jPanel7.getGraphics();
                    linhasco9.setColor(Color.WHITE);
                    linhasco9.translate(centrodoelemento2v-15+distextremo+difhor, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                    linhasco9.drawLine(10,20,20,10);
                    /*linhadacotadireita*/
                    Graphics linhasco10 = jPanel7.getGraphics();
                    linhasco10.setColor(Color.WHITE);
                    linhasco10.translate(centrodoelemento2v-15+distextremo+distinter+difhor*3, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                    linhasco10.drawLine(10,20,20,10);
                    cotaslat1.drawString(String.format(fe.format((distinter1+difhor*2))),centrodoelemento2v-15+distextremo+difhor+(distinter+difhor*2)/2, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);

                    /*distância entre elementos na vertical*/
                    cotaslat1.drawRect(centrodoelemento2v-distadacotadesenho2, centrodoelemento2h-larguradapeça/2,0,larguradapeça);
                    /*linha dacota superior*/
                    Graphics linhasco3 = jPanel7.getGraphics();
                    linhasco3.setColor(Color.WHITE);
                    linhasco3.translate(centrodoelemento2v-distadacotadesenho2-15, centrodoelemento2h-larguradapeça/2-15);
                    linhasco3.drawLine(10,20,20,10);
                    cotaslat1.drawString(String.format(fe.format((larguradapeça2)/2)),centrodoelemento2v-distadacotadesenho2*3,centrodoelemento2h-larguradapeça/4);
                    /*linha dacota dosmeios*/
                    Graphics linhasco4 = jPanel7.getGraphics();
                    linhasco4.setColor(Color.WHITE);
                    linhasco4.translate(centrodoelemento2v-distadacotadesenho2-15, centrodoelemento2h-15);
                    linhasco4.drawLine(10,20,20,10);
                    /*linha dacota inferior*/
                    Graphics linhasco6 = jPanel7.getGraphics();
                    linhasco6.setColor(Color.WHITE);
                    linhasco6.translate(centrodoelemento2v-distadacotadesenho2-15, centrodoelemento2h+larguradapeça/2-15);
                    linhasco6.drawLine(10,20,20,10);
                    cotaslat1.drawString(String.format(fe.format((larguradapeça2)/2)),centrodoelemento2v-distadacotadesenho2*3,centrodoelemento2h+larguradapeça/4);

                }
                else{
                    JOptionPane.showMessageDialog(null,"Esta peça não pode ser desenhada pois não há espaço para isso, Segundo critérios normativos NBR7190","Erro - Falta de espaço na peça",JOptionPane.OK_OPTION);
                }
            }
        }

        /*desenho dos pregos, parafusos e cavilha para 3*/
        if(numerodeparafuprcav==3){
            if((2*distnomeioentrepregos1<(larguradapeça2-disthoembaixo1-disthoemcima1))&&(compdauniaovoupegar1>distextremo1*2)){
                int difhor = (compdauniaovoupegar - distextremo*2)/2;
                double difhor1 = (compdauniaovoupegar1 - distextremo1*2)/2;
                int difver = (larguradapeça - 2*distnomeioentrepregos-disthoemcima-disthoembaixo)/4;
                double difver1 = (larguradapeça2 - 2*distnomeioentrepregos1-disthoemcima1-disthoembaixo1)/4;
                /*primeiralinha*/
                prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+difhor,(-diametroprego/2+centrodoelemento2h-larguradapeça/2+disthoemcima+difver),diametroprego ,diametroprego);
                /*segundalinha*/
                prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+difhor,(-diametroprego/2+centrodoelemento2h),diametroprego ,diametroprego);
                /*terceiralinha*/
                prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+difhor,(-diametroprego/2+centrodoelemento2h+larguradapeça/2-disthoembaixo-difver),diametroprego ,diametroprego);
                /*cota distância entre eles horizontal*/
                cotaslat1.drawRect(centrodoelemento2v, centrodoelemento2h-larguradapeça/2-distadacotadesenho2,distextremo+difhor,0);
                cotaslat1.drawString(String.format(fe.format(distextremo1+difhor)),centrodoelemento2v+(distextremo+difhor)/2,centrodoelemento2h-larguradapeça/2-distadacotadesenho2-distanum);
                Graphics linhasco5 = jPanel7.getGraphics();
                linhasco5.setColor(Color.WHITE);
                linhasco5.translate(centrodoelemento2v-15, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                linhasco5.drawLine(10,20,20,10);
                Graphics linhasco6 = jPanel7.getGraphics();
                linhasco6.setColor(Color.WHITE);
                linhasco6.translate(centrodoelemento2v-15+distextremo+difhor, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                linhasco6.drawLine(10,20,20,10);

                /*cota distância entre vertical*/
                cotaslat1.drawRect(centrodoelemento2v-distadacotadesenho2*2, centrodoelemento2h-larguradapeça/2,0,larguradapeça);
                cotaslat1.drawString(String.format(fe.format(distnomeioentrepregos1+difver1)),centrodoelemento2v-distadacotadesenho2*4,centrodoelemento2h+(distnomeioentrepregos+difver)/2);
                cotaslat1.drawString(String.format(fe.format(distnomeioentrepregos1+difver1)),centrodoelemento2v-distadacotadesenho2*4,centrodoelemento2h-(distnomeioentrepregos+difver)/2);
                cotaslat1.drawString(String.format(fe.format(disthoemcima1+difver1)),centrodoelemento2v-distadacotadesenho2*4,centrodoelemento2h-larguradapeça/2+(disthoemcima+difver)/2);
                cotaslat1.drawString(String.format(fe.format(disthoembaixo1+difver1)),centrodoelemento2v-distadacotadesenho2*4,centrodoelemento2h+larguradapeça/2-(disthoembaixo+difver)/2);
                /*linhadecimadomeiovertical*/
                Graphics linhasco1 = jPanel7.getGraphics();
                linhasco1.setColor(Color.WHITE);
                linhasco1.translate(centrodoelemento2v-distadacotadesenho2*2-15,centrodoelemento2h-15-larguradapeça/2+disthoemcima+difver);
                linhasco1.drawLine(10,20,20,10);
                /*linha de corte no meio*/
                Graphics linhasco123 = jPanel7.getGraphics();
                linhasco123.setColor(Color.WHITE);
                linhasco123.translate(centrodoelemento2v-distadacotadesenho2*2-15,centrodoelemento2h-15);
                linhasco123.drawLine(10,20,20,10);
                /*linhadebaixodomeiovertical*/
                Graphics linhasco4 = jPanel7.getGraphics();
                linhasco4.setColor(Color.WHITE);
                linhasco4.translate(centrodoelemento2v-distadacotadesenho2*2-15,centrodoelemento2h-15+larguradapeça/2-disthoemcima+difver);
                linhasco4.drawLine(10,20,20,10);
                /*linhadebaixodavertical*/
                Graphics linhasco2 = jPanel7.getGraphics();
                linhasco2.setColor(Color.WHITE);
                linhasco2.translate(centrodoelemento2v-distadacotadesenho2*2-15,centrodoelemento2h-15+larguradapeça/2);
                linhasco2.drawLine(10,20,20,10);
                /*linhadecimadavertical*/
                Graphics linhasco3 = jPanel7.getGraphics();
                linhasco3.setColor(Color.WHITE);
                linhasco3.translate(centrodoelemento2v-distadacotadesenho2*2-15,centrodoelemento2h-15-larguradapeça/2);
                linhasco3.drawLine(10,20,20,10);
            }
            if(2*distnomeioentrepregos1>(larguradapeça2 - disthoembaixo1-disthoemcima1)){
                if((larguradapeça2<disthoembaixo1+disthoemcima1)&&(compdauniaovoupegar>distextremo1*2+distinter1*2)){
                    int difhor = (compdauniaovoupegar - distextremo*2-distinter*2)/6;
                    double difhor1 = (compdauniaovoupegar1 - distextremo1*2-distinter*2)/6;
                    /*primeiralinha*/
                    prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+difhor,(-diametroprego/2+centrodoelemento2h),diametroprego ,diametroprego);
                    /*segundalinha*/
                    prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+distinter+difhor*3,(-diametroprego/2+centrodoelemento2h),diametroprego ,diametroprego);
                    /*terceiralinha*/
                    prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+distinter*2+difhor*5,(-diametroprego/2+centrodoelemento2h),diametroprego ,diametroprego);
                     /*cota distância entre elementos horizontal*/
                    cotaslat1.drawRect(centrodoelemento2v, centrodoelemento2h-larguradapeça/2-distadacotadesenho2,distextremo+distinter*2+difhor*5,0);
                    /*linhadacotaesquerda*/
                    Graphics linhasco8 = jPanel7.getGraphics();
                    linhasco8.setColor(Color.WHITE);
                    linhasco8.translate(centrodoelemento2v-15, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                    linhasco8.drawLine(10,20,20,10);
                    cotaslat1.drawString(String.format(fe.format((distextremo1+difhor1))),centrodoelemento2v-15+(distextremo+difhor)/2, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                    /*linhadacotacentro*/
                    Graphics linhasco9 = jPanel7.getGraphics();
                    linhasco9.setColor(Color.WHITE);
                    linhasco9.translate(centrodoelemento2v-15+distextremo+difhor, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                    linhasco9.drawLine(10,20,20,10);
                    /*linhadacotacentrodireita*/
                    Graphics linhasco10 = jPanel7.getGraphics();
                    linhasco10.setColor(Color.WHITE);
                    linhasco10.translate(centrodoelemento2v-15+distextremo+distinter+difhor*3, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                    linhasco10.drawLine(10,20,20,10);
                    cotaslat1.drawString(String.format(fe.format((distinter1+difhor1*2))),centrodoelemento2v-15+distextremo+difhor+(distinter+difhor*2)/2, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                     /*linhadacotadireita*/
                    Graphics linhasco16 = jPanel7.getGraphics();
                    linhasco16.setColor(Color.WHITE);
                    linhasco16.translate(centrodoelemento2v-15+distextremo+distinter*2+difhor*5, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                    linhasco16.drawLine(10,20,20,10);
                    cotaslat1.drawString(String.format(fe.format((distinter1+difhor1*2))),centrodoelemento2v-15+distextremo+difhor*3+distinter+(distinter+difhor*2)/2, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
         
                    /*distância entre elementos na vertical*/
                    cotaslat1.drawRect(centrodoelemento2v-distadacotadesenho2, centrodoelemento2h-larguradapeça/2,0,larguradapeça);
                    /*linha dacota superior*/
                    Graphics linhasco3 = jPanel7.getGraphics();
                    linhasco3.setColor(Color.WHITE);
                    linhasco3.translate(centrodoelemento2v-distadacotadesenho2-15, centrodoelemento2h-larguradapeça/2-15);
                    linhasco3.drawLine(10,20,20,10);
                    cotaslat1.drawString(String.format(fe.format((larguradapeça2)/2)),centrodoelemento2v-distadacotadesenho2*3,centrodoelemento2h-larguradapeça/4);
                    /*linha dacota dosmeios*/
                    Graphics linhasco4 = jPanel7.getGraphics();
                    linhasco4.setColor(Color.WHITE);
                    linhasco4.translate(centrodoelemento2v-distadacotadesenho2-15, centrodoelemento2h-15);
                    linhasco4.drawLine(10,20,20,10);
                    /*linha dacota inferior*/
                    Graphics linhasco6 = jPanel7.getGraphics();
                    linhasco6.setColor(Color.WHITE);
                    linhasco6.translate(centrodoelemento2v-distadacotadesenho2-15, centrodoelemento2h+larguradapeça/2-15);
                    linhasco6.drawLine(10,20,20,10);
                    cotaslat1.drawString(String.format(fe.format((larguradapeça2)/2)),centrodoelemento2v-distadacotadesenho2*3,centrodoelemento2h+larguradapeça/4);
                
                
                }
                else{
                    JOptionPane.showMessageDialog(null,"Esta peça não pode ser desenhada pois não há espaço para isso, Segundo critérios normativos NBR7190","Erro - Falta de espaço na peça",JOptionPane.OK_OPTION);
                }
            }
        }

        /*desenho dos pregos, cavilhas e parafusos para 4*/
        if(numerodeparafuprcav==4 && am0.isSelected()){
            if((distnomeioentrepregos1<(larguradapeça2-disthoemcima1-disthoembaixo1))&&(compdauniaovoupegar1>distextremo1*2+distinter1)){
                int difhor = (compdauniaovoupegar-distextremo*2-distinter)/4;
                double difhor1 = (compdauniaovoupegar1 - distextremo1*2-distinter1)/4;
                int difver = (larguradapeça - distnomeioentrepregos-disthoembaixo-disthoemcima)/4;
                double difver1 = (larguradapeça2 - distnomeioentrepregos1-disthoembaixo1-disthoemcima1)/4;
                prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+difhor,(-diametroprego/2+centrodoelemento2h-larguradapeça/2+disthoemcima+difver),diametroprego ,diametroprego);
                /*prego.drawOval(centrodoelemento2v-(diametroprego/2)+diametroprego*4,centrodoelemento2h,diametroprego ,diametroprego);compressão;*/
                prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+difhor,(-diametroprego/2+centrodoelemento2h+larguradapeça/2-disthoembaixo-difver),diametroprego ,diametroprego);
                /*segunda coluna de pregos*/
                prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+distinter+difhor*3,-diametroprego/2+centrodoelemento2h-larguradapeça/2+disthoemcima+difver, diametroprego, diametroprego);
                prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+distinter+difhor*3,-diametroprego/2+centrodoelemento2h+larguradapeça/2-disthoembaixo-difver, diametroprego, diametroprego);
                /*cota distância entre eles horizontal*/
                cotaslat1.drawRect(centrodoelemento2v, centrodoelemento2h-larguradapeça/2-distadacotadesenho2,distextremo+difhor*3+distinter,0);
                cotaslat1.drawString(String.format(fe.format(distextremo1+difhor1)),centrodoelemento2v+(distextremo+difhor)/2,centrodoelemento2h-larguradapeça/2-distadacotadesenho2-distanum);
                cotaslat1.drawString(String.format(fe.format(distinter1+difhor1*2)),centrodoelemento2v+distextremo+difhor+(distinter+difhor*2)/2,centrodoelemento2h-larguradapeça/2-distadacotadesenho2-distanum);
                Graphics linhasco5 = jPanel7.getGraphics();
                linhasco5.setColor(Color.WHITE);
                linhasco5.translate(centrodoelemento2v-15, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                linhasco5.drawLine(10,20,20,10);
                Graphics linhasco6 = jPanel7.getGraphics();
                linhasco6.setColor(Color.WHITE);
                linhasco6.translate(centrodoelemento2v-15+distextremo+difhor, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                linhasco6.drawLine(10,20,20,10);
                Graphics linhasco8 = jPanel7.getGraphics();
                linhasco8.setColor(Color.WHITE);
                linhasco8.translate(centrodoelemento2v-15+distextremo+difhor*3+distinter, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                linhasco8.drawLine(10,20,20,10);

                /*cota distância entre vertical*/
                cotaslat1.drawRect(centrodoelemento2v-distadacotadesenho2*2, centrodoelemento2h-larguradapeça/2,0,larguradapeça);
                cotaslat1.drawString(String.format(fe.format(distnomeioentrepregos1+difver1*2)),centrodoelemento2v-distadacotadesenho2*4,centrodoelemento2h);
                cotaslat1.drawString(String.format(fe.format(disthoemcima+difver)),centrodoelemento2v-distadacotadesenho2*4,centrodoelemento2h-larguradapeça/2+(disthoemcima+difver)/2);
                cotaslat1.drawString(String.format(fe.format(disthoembaixo+difver)),centrodoelemento2v-distadacotadesenho2*4,centrodoelemento2h+larguradapeça/2-(disthoembaixo+difver)/2);
                /*linhadecimadomeiovertical*/
                Graphics linhasco1 = jPanel7.getGraphics();
                linhasco1.setColor(Color.WHITE);
                linhasco1.translate(centrodoelemento2v-distadacotadesenho2*2-15,centrodoelemento2h-15-larguradapeça+disthoemcima+difver);
                linhasco1.drawLine(10,20,20,10);
                Graphics linhasco4 = jPanel7.getGraphics();
                linhasco4.setColor(Color.WHITE);
                linhasco4.translate(centrodoelemento2v-distadacotadesenho2*2-15,centrodoelemento2h-15+larguradapeça-disthoembaixo-difver);
                linhasco4.drawLine(10,20,20,10);
                /*linhadebaixodavertical*/
                Graphics linhasco2 = jPanel7.getGraphics();
                linhasco2.setColor(Color.WHITE);
                linhasco2.translate(centrodoelemento2v-distadacotadesenho2*2-15,centrodoelemento2h-15+larguradapeça/2);
                linhasco2.drawLine(10,20,20,10);
                /*linhadecimadavertical*/
                Graphics linhasco3 = jPanel7.getGraphics();
                linhasco3.setColor(Color.WHITE);
                linhasco3.translate(centrodoelemento2v-distadacotadesenho2*2-15,centrodoelemento2h-15-larguradapeça/2);
                linhasco3.drawLine(10,20,20,10);
            }
            else{
               JOptionPane.showMessageDialog(null,"Esta peça não pode ser desenhada pois não há espaço para isso, Segundo critérios normativos NBR7190","Erro - Falta de espaço na peça",JOptionPane.OK_OPTION);
            }
        }

        /*desenho dos pregos, cavilhas e parafusos para 5*/
        if(numerodeparafuprcav==5){
            if((2*distnomeioentrepregos1<(larguradapeça2 - disthoemcima1-disthoembaixo1))&&(compdauniaovoupegar1>distextremo1*2+distinter1*2)){
                int difhor = (compdauniaovoupegar - distextremo*2-distinter*2)/6;
                double difhor1 = (compdauniaovoupegar1 - distextremo1*2-distinter1*2)/6;
                int difver = (larguradapeça - 2*distnomeioentrepregos-disthoembaixo-disthoemcima)/4;
                double difver1 = (larguradapeça2 - 2*distnomeioentrepregos1-disthoembaixo1-disthoemcima1)/4;
                /*primeira linha de pregos*/
                prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+difhor,(-diametroprego/2+centrodoelemento2h-larguradapeça/2+disthoemcima+difver),diametroprego ,diametroprego);
                prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+distinter*2+difhor*5,(-diametroprego/2+centrodoelemento2h-larguradapeça/2+disthoemcima+difver),diametroprego ,diametroprego);
                /*segundo linha de pregos*/
                prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+distinter+difhor*3,-diametroprego/2+centrodoelemento2h, diametroprego, diametroprego);
                /*terceira linha de pregos*/
                prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+difhor,-diametroprego/2+centrodoelemento2h+larguradapeça/2-disthoembaixo-difver, diametroprego, diametroprego);
                prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+distinter*2+difhor*5,-diametroprego/2+centrodoelemento2h+larguradapeça/2-disthoembaixo-difver, diametroprego, diametroprego);
                /*cota distância entre elementos horizontal*/
                cotaslat1.drawRect(centrodoelemento2v, centrodoelemento2h-larguradapeça/2-distadacotadesenho2,distextremo+distinter*2+difhor*5,0);
                /*linhadacotaesquerda*/
                Graphics linhasco8 = jPanel7.getGraphics();
                linhasco8.setColor(Color.WHITE);
                linhasco8.translate(centrodoelemento2v-15, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                linhasco8.drawLine(10,20,20,10);
                cotaslat1.drawString(String.format(fe.format(distextremo1+difhor1)),centrodoelemento2v-15+(distextremo+difhor)/2, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                
                /*linhadacotacentro*/
                Graphics linhasco9 = jPanel7.getGraphics();
                linhasco9.setColor(Color.WHITE);
                linhasco9.translate(centrodoelemento2v-15+distextremo+difhor, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                linhasco9.drawLine(10,20,20,10);
                /*linhadacotacentrodireita*/
                Graphics linhasco10 = jPanel7.getGraphics();
                linhasco10.setColor(Color.WHITE);
                linhasco10.translate(centrodoelemento2v-15+distextremo+distinter+difhor*3, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                linhasco10.drawLine(10,20,20,10);
                cotaslat1.drawString(String.format(fe.format((distinter1+difhor1*2))),centrodoelemento2v-15+distextremo+difhor+(distinter+difhor*2)/2, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                /*linhadacotadireita*/
                Graphics linhasco16 = jPanel7.getGraphics();
                linhasco16.setColor(Color.WHITE);
                linhasco16.translate(centrodoelemento2v-15+distextremo+distinter*2+difhor*5, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                linhasco16.drawLine(10,20,20,10);
                cotaslat1.drawString(String.format(fe.format((distinter1+difhor1*2))),centrodoelemento2v-15+distextremo+difhor*3+distinter+(distinter+difhor*2)/2, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
             
                /*cota distância entre vertical*/
                cotaslat1.drawRect(centrodoelemento2v-distadacotadesenho2*2, centrodoelemento2h-larguradapeça/2,0,larguradapeça);
                cotaslat1.drawString(String.format(fe.format(distnomeioentrepregos1+difver1)),centrodoelemento2v-distadacotadesenho2*4,centrodoelemento2h+(distnomeioentrepregos+difver)/2);
                cotaslat1.drawString(String.format(fe.format(distnomeioentrepregos1+difver1)),centrodoelemento2v-distadacotadesenho2*4,centrodoelemento2h-(distnomeioentrepregos+difver)/2);
                cotaslat1.drawString(String.format(fe.format((larguradapeça2-distnomeioentrepregos1*2-difver1*2)/2)),centrodoelemento2v-distadacotadesenho2*4,centrodoelemento2h-larguradapeça/2+(disthoemcima+difver)/2);
                cotaslat1.drawString(String.format(fe.format((larguradapeça2-distnomeioentrepregos1*2-difver1*2)/2)),centrodoelemento2v-distadacotadesenho2*4,centrodoelemento2h+larguradapeça/2-(disthoembaixo+difver)/2);
                /*linhadecimadomeiovertical*/
                Graphics linhasco1 = jPanel7.getGraphics();
                linhasco1.setColor(Color.WHITE);
                linhasco1.translate(centrodoelemento2v-distadacotadesenho2*2-15,centrodoelemento2h-15-larguradapeça/2+disthoemcima+difver);
                linhasco1.drawLine(10,20,20,10);
                /*linha de corte no meio*/
                Graphics linhasco123 = jPanel7.getGraphics();
                linhasco123.setColor(Color.WHITE);
                linhasco123.translate(centrodoelemento2v-distadacotadesenho2*2-15,centrodoelemento2h-15);
                linhasco123.drawLine(10,20,20,10);
                /*linhadebaixodomeiovertical*/
                Graphics linhasco4 = jPanel7.getGraphics();
                linhasco4.setColor(Color.WHITE);
                linhasco4.translate(centrodoelemento2v-distadacotadesenho2*2-15,centrodoelemento2h-15+larguradapeça/2-disthoembaixo-difver);
                linhasco4.drawLine(10,20,20,10);
                /*linhadebaixodavertical*/
                Graphics linhasco2 = jPanel7.getGraphics();
                linhasco2.setColor(Color.WHITE);
                linhasco2.translate(centrodoelemento2v-distadacotadesenho2*2-15,centrodoelemento2h-15+larguradapeça/2);
                linhasco2.drawLine(10,20,20,10);
                /*linhadecimadavertical*/
                Graphics linhasco3 = jPanel7.getGraphics();
                linhasco3.setColor(Color.WHITE);
                linhasco3.translate(centrodoelemento2v-distadacotadesenho2*2-15,centrodoelemento2h-15-larguradapeça/2);
                linhasco3.drawLine(10,20,20,10);
            }
            else{
               JOptionPane.showMessageDialog(null,"Esta peça não pode ser desenhada pois não há espaço para isso, Segundo critérios normativos NBR7190","Erro - Falta de espaço na peça",JOptionPane.OK_OPTION);
            }
        }

        /*desenho dos pregos, cavilhas e parafusos para 6*/
        if(numerodeparafuprcav==6){
            if((2*distnomeioentrepregos1<(larguradapeça2-disthoembaixo1-disthoemcima1))&&(compdauniaovoupegar1>2*distextremo1+distinter)){
                int difhor = (compdauniaovoupegar - distextremo*2-distinter)/4;
                double difhor1 = (compdauniaovoupegar1 - distextremo1*2-distinter1)/4;
                int difver = (larguradapeça - 2*distnomeioentrepregos-disthoemcima-disthoembaixo)/4;
                double difver1 = (larguradapeça2 - 2*distnomeioentrepregos1-disthoemcima1-disthoembaixo1)/4;
                /*primeira linha de pregos*/
                prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+difhor,(-diametroprego/2+centrodoelemento2h),diametroprego ,diametroprego);
                prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+difhor,(-diametroprego/2+centrodoelemento2h-larguradapeça/2+disthoemcima+difver),diametroprego ,diametroprego);
                prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+difhor,(-diametroprego/2+centrodoelemento2h+larguradapeça/2-disthoembaixo-difver),diametroprego ,diametroprego);
                /*segundo linha de pregos*/
                prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+distinter+difhor*3,-diametroprego/2+centrodoelemento2h, diametroprego, diametroprego);
                prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+distinter+difhor*3,-diametroprego/2+centrodoelemento2h-larguradapeça/2+disthoemcima+difver, diametroprego, diametroprego);
                prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+distinter+difhor*3,-diametroprego/2+centrodoelemento2h+larguradapeça/2-disthoembaixo-difver, diametroprego, diametroprego);
                /*cota distância entre elementos horizontal*/
                cotaslat1.drawRect(centrodoelemento2v, centrodoelemento2h-larguradapeça/2-distadacotadesenho2,distextremo+distinter+difhor*3,0);
                /*linhadacotaesquerda*/
                Graphics linhasco8 = jPanel7.getGraphics();
                linhasco8.setColor(Color.WHITE);
                linhasco8.translate(centrodoelemento2v-15, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                linhasco8.drawLine(10,20,20,10);
                cotaslat1.drawString(String.format(fe.format(distextremo1+difhor1)),centrodoelemento2v-15+(distextremo+difhor)/2, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                /*linhadacotacentro*/
                Graphics linhasco9 = jPanel7.getGraphics();
                linhasco9.setColor(Color.WHITE);
                linhasco9.translate(centrodoelemento2v-15+distextremo+difhor, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                linhasco9.drawLine(10,20,20,10);
                /*linhadacotacentrodireita*/
                Graphics linhasco10 = jPanel7.getGraphics();
                linhasco10.setColor(Color.WHITE);
                linhasco10.translate(centrodoelemento2v-15+distextremo+distinter+difhor*3, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                linhasco10.drawLine(10,20,20,10);
                cotaslat1.drawString(String.format(fe.format((distinter1+difhor1*2))),centrodoelemento2v-15+distextremo+difhor+(distinter+difhor*2)/2, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
               
             
                /*cota distância entre vertical*/
                cotaslat1.drawRect(centrodoelemento2v-distadacotadesenho2*2, centrodoelemento2h-larguradapeça/2,0,larguradapeça);
                cotaslat1.drawString(String.format(fe.format(distnomeioentrepregos1+difver1)),centrodoelemento2v-distadacotadesenho2*4,centrodoelemento2h+(distnomeioentrepregos+difver)/2);
                cotaslat1.drawString(String.format(fe.format(distnomeioentrepregos1+difver1)),centrodoelemento2v-distadacotadesenho2*4,centrodoelemento2h-(distnomeioentrepregos+difver)/2);
                cotaslat1.drawString(String.format(fe.format(disthoemcima1+difver1)),centrodoelemento2v-distadacotadesenho2*4,centrodoelemento2h-larguradapeça/2+(disthoemcima+difver)/2);
                cotaslat1.drawString(String.format(fe.format(disthoembaixo1+difver1)),centrodoelemento2v-distadacotadesenho2*4,centrodoelemento2h+larguradapeça/2-(disthoembaixo+difver)/2);
                /*linhadecimadomeiovertical*/
                Graphics linhasco1 = jPanel7.getGraphics();
                linhasco1.setColor(Color.WHITE);
                linhasco1.translate(centrodoelemento2v-distadacotadesenho2*2-15,centrodoelemento2h-15-larguradapeça/2+disthoemcima+difver);
                linhasco1.drawLine(10,20,20,10);
                /*linha de corte no meio*/
                Graphics linhasco123 = jPanel7.getGraphics();
                linhasco123.setColor(Color.WHITE);
                linhasco123.translate(centrodoelemento2v-distadacotadesenho2*2-15,centrodoelemento2h-15);
                linhasco123.drawLine(10,20,20,10);
                /*linhadebaixodomeiovertical*/
                Graphics linhasco4 = jPanel7.getGraphics();
                linhasco4.setColor(Color.WHITE);
                linhasco4.translate(centrodoelemento2v-distadacotadesenho2*2-15,centrodoelemento2h-15+larguradapeça/2-disthoembaixo-difver);
                linhasco4.drawLine(10,20,20,10);
                /*linhadebaixodavertical*/
                Graphics linhasco2 = jPanel7.getGraphics();
                linhasco2.setColor(Color.WHITE);
                linhasco2.translate(centrodoelemento2v-distadacotadesenho2*2-15,centrodoelemento2h-15+larguradapeça/2);
                linhasco2.drawLine(10,20,20,10);
                /*linhadecimadavertical*/
                Graphics linhasco3 = jPanel7.getGraphics();
                linhasco3.setColor(Color.WHITE);
                linhasco3.translate(centrodoelemento2v-distadacotadesenho2*2-15,centrodoelemento2h-15-larguradapeça/2);
                linhasco3.drawLine(10,20,20,10);

            }
            if(2*distnomeioentrepregos1>(larguradapeça2-disthoemcima1-disthoembaixo1)){
                if((distnomeioentrepregos1<larguradapeça2-disthoemcima1-disthoembaixo1)&&(compdauniaovoupegar>2*distextremo+distinter*2)){
                int difhor = (compdauniaovoupegar - distextremo*2-distinter*2)/6;
                double difhor1 = (compdauniaovoupegar1 - distextremo1*2-distinter1*2)/6;
                int difver = (larguradapeça -distnomeioentrepregos- disthoemcima-disthoembaixo)/4;
                double difver1 = (larguradapeça2 -distnomeioentrepregos1-disthoemcima1-disthoembaixo1)/4;   
                 /*primeira coluna de pregos*/
                 prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+difhor,(-diametroprego/2+centrodoelemento2h-larguradapeça/2+disthoemcima+difver),diametroprego ,diametroprego);
                 /*prego.drawOval(centrodoelemento2v-(diametroprego/2)+diametroprego*4,centrodoelemento2h,diametroprego ,diametroprego);compressão;*/
                 prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+difhor,(-diametroprego/2+centrodoelemento2h+larguradapeça/2-disthoembaixo-difver),diametroprego ,diametroprego);
                 /*segunda coluna de pregos*/
                 prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+distinter+difhor*3,-diametroprego/2+centrodoelemento2h-larguradapeça/2+disthoemcima+difver, diametroprego, diametroprego);
                 prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+distinter+difhor*3,-diametroprego/2+centrodoelemento2h+larguradapeça/2-disthoembaixo-difver, diametroprego, diametroprego);
                 /*terceira coluna de pregos*/
                 prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+difhor*5+distinter*2,-diametroprego/2+centrodoelemento2h-larguradapeça/2+disthoemcima+difver, diametroprego, diametroprego);
                 prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+difhor*5+distinter*2,-diametroprego/2+centrodoelemento2h+larguradapeça/2-disthoembaixo-difver, diametroprego, diametroprego);
                 /*cota distância entre elementos horizontal*/
                 cotaslat1.drawRect(centrodoelemento2v, centrodoelemento2h-larguradapeça/2-distadacotadesenho2,distextremo+distinter*2+difhor*5,0);
                 /*linhadacotaesquerda*/
                 Graphics linhasco8 = jPanel7.getGraphics();
                 linhasco8.setColor(Color.WHITE);
                 linhasco8.translate(centrodoelemento2v-15, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                    linhasco8.drawLine(10,20,20,10);
                    cotaslat1.drawString(String.format(fe.format(distextremo1+difhor1)),centrodoelemento2v-15+(distextremo+difhor)/2, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                    /*linhadacotacentro*/
                    Graphics linhasco9 = jPanel7.getGraphics();
                    linhasco9.setColor(Color.WHITE);
                    linhasco9.translate(centrodoelemento2v-15+distextremo+difhor, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                    linhasco9.drawLine(10,20,20,10);
                    /*linhadacotacentrodireita*/
                    Graphics linhasco10 = jPanel7.getGraphics();
                    linhasco10.setColor(Color.WHITE);
                    linhasco10.translate(centrodoelemento2v-15+distextremo+distinter+difhor*3, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                    linhasco10.drawLine(10,20,20,10);
                    cotaslat1.drawString(String.format(fe.format(distinter1+difhor1*2)),centrodoelemento2v-15+distextremo+difhor+(distinter+difhor*2)/2, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                     /*linhadacotadireita*/
                    Graphics linhasco16 = jPanel7.getGraphics();
                    linhasco16.setColor(Color.WHITE);
                    linhasco16.translate(centrodoelemento2v-15+distextremo+distinter*2+difhor*5, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                    linhasco16.drawLine(10,20,20,10);
                    cotaslat1.drawString(String.format(fe.format((distinter1+difhor1*2))),centrodoelemento2v-15+distextremo+difhor*3+distinter+(distinter+difhor*2)/2, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
         
                /*cota distância entre vertical*/
                cotaslat1.drawRect(centrodoelemento2v-distadacotadesenho2*2, centrodoelemento2h-larguradapeça/2,0,larguradapeça);
                cotaslat1.drawString(String.format(fe.format(distnomeioentrepregos1+difver1*2)),centrodoelemento2v-distadacotadesenho2*4,centrodoelemento2h);
                cotaslat1.drawString(String.format(fe.format(disthoemcima1+difver1)),centrodoelemento2v-distadacotadesenho2*4,centrodoelemento2h-larguradapeça/2+(disthoemcima+difver)/2);
                cotaslat1.drawString(String.format(fe.format(disthoembaixo1+difver1)),centrodoelemento2v-distadacotadesenho2*4,centrodoelemento2h+larguradapeça/2-(disthoembaixo+difver)/2);
                /*linhadecimadomeiovertical*/
                Graphics linhasco1 = jPanel7.getGraphics();
                linhasco1.setColor(Color.WHITE);
                linhasco1.translate(centrodoelemento2v-distadacotadesenho2*2-15,centrodoelemento2h-15-larguradapeça/2+disthoemcima+difver);
                linhasco1.drawLine(10,20,20,10);
                Graphics linhasco4 = jPanel7.getGraphics();
                linhasco4.setColor(Color.WHITE);
                linhasco4.translate(centrodoelemento2v-distadacotadesenho2*2-15,centrodoelemento2h-15+larguradapeça/2-disthoembaixo-difver);
                linhasco4.drawLine(10,20,20,10);
                /*linhadebaixodavertical*/
                Graphics linhasco2 = jPanel7.getGraphics();
                linhasco2.setColor(Color.WHITE);
                linhasco2.translate(centrodoelemento2v-distadacotadesenho2*2-15,centrodoelemento2h-15+larguradapeça/2);
                linhasco2.drawLine(10,20,20,10);
                /*linhadecimadavertical*/
                Graphics linhasco3 = jPanel7.getGraphics();
                linhasco3.setColor(Color.WHITE);
                linhasco3.translate(centrodoelemento2v-distadacotadesenho2*2-15,centrodoelemento2h-15-larguradapeça/2);
                linhasco3.drawLine(10,20,20,10);

                }
                else{
                     JOptionPane.showMessageDialog(null,"Esta peça não pode ser desenhada pois não há espaço para isso, Segundo critérios normativos NBR7190","Erro - Falta de espaço na peça",JOptionPane.OK_OPTION);
                }
            }
        }

        /*desenho dos pregos, cavilhas e parafusos para 7*/
        if(numerodeparafuprcav==7){
                if((2*distnomeioentrepregos1<(larguradapeça2 -disthoembaixo-disthoemcima))&&(compdauniaovoupegar1>2*distextremo1+distinter*2)){
                int difhor = (compdauniaovoupegar - distextremo*2-distinter*2)/6;
                double difhor1 = (compdauniaovoupegar1 - distextremo1*2-distinter1*2)/6;
                int difver = (larguradapeça - distnomeioentrepregos-disthoemcima-disthoembaixo)/4;
                double difver1 = (larguradapeça2 - distnomeioentrepregos1-disthoemcima1-disthoembaixo1)/4;                  
                /*primeira linha de pregos*/
                prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+difhor,(-diametroprego/2+centrodoelemento2h),diametroprego ,diametroprego);
                prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+difhor,(-diametroprego/2+centrodoelemento2h-larguradapeça/2+disthoemcima+difver),diametroprego ,diametroprego);
                prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+difhor,(-diametroprego/2+centrodoelemento2h+larguradapeça/2-disthoembaixo-difver),diametroprego ,diametroprego);
                /*segundalinha*/
                prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+distinter+difhor*3,(-diametroprego/2+centrodoelemento2h),diametroprego ,diametroprego);
                /*terceira linha de pregos*/
                prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+distinter*2+difhor*5,-diametroprego/2+centrodoelemento2h, diametroprego, diametroprego);
                prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+distinter*2+difhor*5,-diametroprego/2+centrodoelemento2h-larguradapeça/2+disthoemcima+difver, diametroprego, diametroprego);
                prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+distinter*2+difhor*5,-diametroprego/2+centrodoelemento2h+larguradapeça/2-disthoembaixo-difver, diametroprego, diametroprego);
                
                 /*cota distância entre elementos horizontal*/
                    cotaslat1.drawRect(centrodoelemento2v, centrodoelemento2h-larguradapeça/2-distadacotadesenho2,distextremo+distinter*2+difhor*5,0);
                    /*linhadacotaesquerda*/
                    Graphics linhasco8 = jPanel7.getGraphics();
                    linhasco8.setColor(Color.WHITE);
                    linhasco8.translate(centrodoelemento2v-15, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                    linhasco8.drawLine(10,20,20,10);
                    cotaslat1.drawString(String.format(fe.format((distextremo1+difhor1))),centrodoelemento2v-15+(distextremo+difhor)/2, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                    /*linhadacotacentro*/
                    Graphics linhasco9 = jPanel7.getGraphics();
                    linhasco9.setColor(Color.WHITE);
                    linhasco9.translate(centrodoelemento2v-15+distextremo+difhor, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                    linhasco9.drawLine(10,20,20,10);
                    /*linhadacotacentrodireita*/
                    Graphics linhasco10 = jPanel7.getGraphics();
                    linhasco10.setColor(Color.WHITE);
                    linhasco10.translate(centrodoelemento2v-15+distextremo+distinter+difhor*3, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                    linhasco10.drawLine(10,20,20,10);
                    cotaslat1.drawString(String.format(fe.format((distinter1+difhor1*2))),centrodoelemento2v-15+distextremo+difhor+(distinter+difhor*2)/2, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                     /*linhadacotadireita*/
                    Graphics linhasco16 = jPanel7.getGraphics();
                    linhasco16.setColor(Color.WHITE);
                    linhasco16.translate(centrodoelemento2v-15+distextremo+distinter*2+difhor*5, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                    linhasco16.drawLine(10,20,20,10);
                    cotaslat1.drawString(String.format(fe.format((distinter1+difhor1*2))),centrodoelemento2v-15+distextremo+difhor*3+distinter+(distinter+difhor*2)/2, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
         
                /*cota distância entre vertical*/
                cotaslat1.drawRect(centrodoelemento2v-distadacotadesenho2*2, centrodoelemento2h-larguradapeça/2,0,larguradapeça);
                cotaslat1.drawString(String.format(fe.format(distnomeioentrepregos1+difver1)),centrodoelemento2v-distadacotadesenho2*4,centrodoelemento2h+(diametroprego*3+difver)/2);
                cotaslat1.drawString(String.format(fe.format(distnomeioentrepregos1+difver1)),centrodoelemento2v-distadacotadesenho2*4,centrodoelemento2h-(diametroprego*3+difver)/2);
                cotaslat1.drawString(String.format(fe.format(disthoemcima1+difver1)),centrodoelemento2v-distadacotadesenho2*4,centrodoelemento2h-larguradapeça/2+(disthoemcima+difver)/2);
                cotaslat1.drawString(String.format(fe.format(disthoembaixo1+difver1)),centrodoelemento2v-distadacotadesenho2*4,centrodoelemento2h+larguradapeça/2-(disthoembaixo+difver)/2);
                /*linhadecimadomeiovertical*/
                Graphics linhasco1 = jPanel7.getGraphics();
                linhasco1.setColor(Color.WHITE);
                linhasco1.translate(centrodoelemento2v-distadacotadesenho2*2-15,centrodoelemento2h-15-larguradapeça/2+disthoemcima+difver);
                linhasco1.drawLine(10,20,20,10);
                /*linha de corte no meio*/
                Graphics linhasco123 = jPanel7.getGraphics();
                linhasco123.setColor(Color.WHITE);
                linhasco123.translate(centrodoelemento2v-distadacotadesenho2*2-15,centrodoelemento2h-15);
                linhasco123.drawLine(10,20,20,10);
                /*linhadebaixodomeiovertical*/
                Graphics linhasco4 = jPanel7.getGraphics();
                linhasco4.setColor(Color.WHITE);
                linhasco4.translate(centrodoelemento2v-distadacotadesenho2*2-15,centrodoelemento2h-15+larguradapeça/2-disthoembaixo-difver);
                linhasco4.drawLine(10,20,20,10);
                /*linhadebaixodavertical*/
                Graphics linhasco2 = jPanel7.getGraphics();
                linhasco2.setColor(Color.WHITE);
                linhasco2.translate(centrodoelemento2v-distadacotadesenho2*2-15,centrodoelemento2h-15+larguradapeça/2);
                linhasco2.drawLine(10,20,20,10);
                /*linhadecimadavertical*/
                Graphics linhasco3 = jPanel7.getGraphics();
                linhasco3.setColor(Color.WHITE);
                linhasco3.translate(centrodoelemento2v-distadacotadesenho2*2-15,centrodoelemento2h-15-larguradapeça/2);
                linhasco3.drawLine(10,20,20,10);
                
            }else{
                    JOptionPane.showMessageDialog(null,"Esta peça não pode ser desenhada pois não há espaço para isso, Segundo critérios normativos NBR7190","Erro - Falta de espaço na peça",JOptionPane.OK_OPTION);
                }
            
        }

        /*desenho dos pregos, cavilhas e parafusos para 8*/
        if(numerodeparafuprcav==8){
            if((2*distnomeioentrepregos1<(larguradapeça2 - 2*distho1))&&(compdauniaovoupegar1>2*distextremo1+distinter*4)){
                int difhor = (compdauniaovoupegar - distextremo*2-distinter*4)/10;
                double difhor1 = (compdauniaovoupegar1 - distextremo1*2-distinter1*4)/10;
                int difver = (larguradapeça - 2*distnomeioentrepregos-disthoemcima-disthoembaixo)/4;
                double difver1 = (larguradapeça2 - 2*distnomeioentrepregos1-disthoemcima1-disthoembaixo1)/4;  
                /*primeira linha de pregos*/
                prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+difhor,(-diametroprego/2+centrodoelemento2h-larguradapeça/2+disthoemcima+difver),diametroprego ,diametroprego);
                prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+distinter*2+difhor*5,(-diametroprego/2+centrodoelemento2h-larguradapeça/2+disthoemcima+difver),diametroprego ,diametroprego);
                prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+distinter*4+difhor*9,(-diametroprego/2+centrodoelemento2h-larguradapeça/2+disthoemcima+difver),diametroprego ,diametroprego);

                /*segundo linha de pregos*/
                prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+distinter+difhor*3,-diametroprego/2+centrodoelemento2h, diametroprego, diametroprego);
                prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+distinter*3+difhor*7,-diametroprego/2+centrodoelemento2h, diametroprego, diametroprego);

                /*terceira linha de pregos*/
                prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+difhor,(-diametroprego/2+centrodoelemento2h+larguradapeça/2-disthoembaixo-difver),diametroprego ,diametroprego);
                prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+distinter*2+difhor*5,(-diametroprego/2+centrodoelemento2h+larguradapeça/2-disthoembaixo-difver),diametroprego ,diametroprego);
                prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+distinter*4+difhor*9,(-diametroprego/2+centrodoelemento2h+larguradapeça/2-disthoembaixo-difver),diametroprego ,diametroprego);
                /**/
                
                 /*cota distância entre elementos horizontal*/
                 cotaslat1.drawRect(centrodoelemento2v, centrodoelemento2h-larguradapeça/2-distadacotadesenho2,distextremo+distinter*4+difhor*9,0);
                 /*linhadacotaesquerda*/
                 Graphics linhasco8 = jPanel7.getGraphics();
                 linhasco8.setColor(Color.WHITE);
                 linhasco8.translate(centrodoelemento2v-15, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                 linhasco8.drawLine(10,20,20,10);
                 cotaslat1.drawString(String.format(fe.format(distextremo1+difhor1)),centrodoelemento2v-15+(distextremo+difhor)/2, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                 /*linhadacotacentro*/
                 Graphics linhasco9 = jPanel7.getGraphics();
                 linhasco9.setColor(Color.WHITE);
                 linhasco9.translate(centrodoelemento2v-15+distextremo+difhor, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                 linhasco9.drawLine(10,20,20,10);
                 /*linhadacotacentrodireita*/
                 Graphics linhasco10 = jPanel7.getGraphics();
                 linhasco10.setColor(Color.WHITE);
                 linhasco10.translate(centrodoelemento2v-15+distextremo+distinter+difhor*3, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                 linhasco10.drawLine(10,20,20,10);
                 cotaslat1.drawString(String.format(fe.format(distinter1+difhor*2)),centrodoelemento2v-15+distextremo+difhor+(distinter+difhor*2)/2, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                  /*linhadacotadireita*/
                 Graphics linhasco16 = jPanel7.getGraphics();
                 linhasco16.setColor(Color.WHITE);
                 linhasco16.translate(centrodoelemento2v-15+distextremo+distinter*2+difhor*5, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                 linhasco16.drawLine(10,20,20,10);
                 cotaslat1.drawString(String.format(fe.format((distinter1+difhor*2))),centrodoelemento2v-15+distextremo+difhor*3+distinter+(distinter+difhor*2)/2, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                  /*linhadacotadireita*/
                 Graphics linhasco19 = jPanel7.getGraphics();
                 linhasco19.setColor(Color.WHITE);
                 linhasco19.translate(centrodoelemento2v-15+distextremo+distinter*3+difhor*7, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                 linhasco19.drawLine(10,20,20,10);
                 cotaslat1.drawString(String.format(fe.format((distinter1+difhor*2))),centrodoelemento2v-15+distextremo+difhor*5+distinter*2+(distinter+difhor*2)/2, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                  /*linhadacotadireita*/
                 Graphics linhasco13 = jPanel7.getGraphics();
                 linhasco13.setColor(Color.WHITE);
                 linhasco13.translate(centrodoelemento2v-15+distextremo+distinter*4+difhor*9, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                 linhasco13.drawLine(10,20,20,10);
                 cotaslat1.drawString(String.format(fe.format((distinter+difhor*2))),centrodoelemento2v-15+distextremo+difhor*7+distinter*3+(distinter+difhor*2)/2, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
               
                 /*cota distância entre vertical*/
                cotaslat1.drawRect(centrodoelemento2v-distadacotadesenho2*2, centrodoelemento2h-larguradapeça/2,0,larguradapeça);
                cotaslat1.drawString(String.format(fe.format(distnomeioentrepregos1+difver1)),centrodoelemento2v-distadacotadesenho2*4,centrodoelemento2h+(distnomeioentrepregos+difver)/2);
                cotaslat1.drawString(String.format(fe.format(distnomeioentrepregos1+difver1)),centrodoelemento2v-distadacotadesenho2*4,centrodoelemento2h-(distnomeioentrepregos+difver)/2);
                cotaslat1.drawString(String.format(fe.format(disthoemcima1+difver1)),centrodoelemento2v-distadacotadesenho2*4,centrodoelemento2h-larguradapeça/2+(disthoemcima+difver)/2);
                cotaslat1.drawString(String.format(fe.format(disthoembaixo+difver1)),centrodoelemento2v-distadacotadesenho2*4,centrodoelemento2h+larguradapeça/2-(disthoembaixo+difver)/2);
                /*linhadecimadomeiovertical*/
                Graphics linhasco1 = jPanel7.getGraphics();
                linhasco1.setColor(Color.WHITE);
                linhasco1.translate(centrodoelemento2v-distadacotadesenho2*2-15,centrodoelemento2h-15-larguradapeça/2+disthoemcima+difver);
                linhasco1.drawLine(10,20,20,10);
                /*linha de corte no meio*/
                Graphics linhasco123 = jPanel7.getGraphics();
                linhasco123.setColor(Color.WHITE);
                linhasco123.translate(centrodoelemento2v-distadacotadesenho2*2-15,centrodoelemento2h-15);
                linhasco123.drawLine(10,20,20,10);
                /*linhadebaixodomeiovertical*/
                Graphics linhasco4 = jPanel7.getGraphics();
                linhasco4.setColor(Color.WHITE);
                linhasco4.translate(centrodoelemento2v-distadacotadesenho2*2-15,centrodoelemento2h-15+larguradapeça/2-disthoembaixo-difver);
                linhasco4.drawLine(10,20,20,10);
                /*linhadebaixodavertical*/
                Graphics linhasco2 = jPanel7.getGraphics();
                linhasco2.setColor(Color.WHITE);
                linhasco2.translate(centrodoelemento2v-distadacotadesenho2*2-15,centrodoelemento2h-15+larguradapeça/2);
                linhasco2.drawLine(10,20,20,10);
                /*linhadecimadavertical*/
                Graphics linhasco3 = jPanel7.getGraphics();
                linhasco3.setColor(Color.WHITE);
                linhasco3.translate(centrodoelemento2v-distadacotadesenho2*2-15,centrodoelemento2h-15-larguradapeça/2);
                linhasco3.drawLine(10,20,20,10);
                
            }
            if(2*distnomeioentrepregos1>(larguradapeça2-disthoembaixo-disthoemcima)){
                if((distnomeioentrepregos1<larguradapeça2-2*disthoembaixo-disthoemcima)&&(compdauniaovoupegar1>2*distextremo1+3*distinter1)){
                    int difhor = (compdauniaovoupegar - distextremo*2-distinter*3)/10;
                    double difhor1 = (compdauniaovoupegar1 - distextremo1*2-distinter1*3)/10;
                    int difver = (larguradapeça - 2*distnomeioentrepregos-disthoembaixo-disthoemcima)/4;
                    double difver1 = (larguradapeça2 - 2*distnomeioentrepregos1-disthoemcima1-disthoembaixo1)/4;  
                    /*primeira coluna de pregos*/
                    prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+difhor,(-diametroprego/2+centrodoelemento2h-larguradapeça/2+disthoemcima+difver),diametroprego ,diametroprego);
                    prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+difhor,(-diametroprego/2+centrodoelemento2h+larguradapeça/2-disthoembaixo-difver),diametroprego ,diametroprego);
                    /*segunda coluna*/
                    prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+distinter+difhor*3,-diametroprego/2+centrodoelemento2h-larguradapeça/2+disthoemcima+difver, diametroprego, diametroprego);
                    prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+distinter+difhor*3,-diametroprego/2+centrodoelemento2h+larguradapeça/2-disthoembaixo-difver, diametroprego, diametroprego);
                    /*terceira coluna*/
                    prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+distinter*2+difhor*5,-diametroprego/2+centrodoelemento2h-larguradapeça/2+disthoemcima+difver, diametroprego, diametroprego);
                    prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+distinter*2+difhor*5,-diametroprego/2+centrodoelemento2h+larguradapeça/2-disthoembaixo-difver, diametroprego, diametroprego);
                    /*quarta coluna*/
                    prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+distinter*3+difhor*7,-diametroprego/2+centrodoelemento2h-larguradapeça/2+disthoemcima+difver, diametroprego, diametroprego);
                    prego.fillOval(centrodoelemento2v-(diametroprego/2)+distextremo+distinter*3+difhor*7,-diametroprego/2+centrodoelemento2h+larguradapeça/2-disthoembaixo-difver, diametroprego, diametroprego);
                  /*cota distância entre elementos horizontal*/
                 cotaslat1.drawRect(centrodoelemento2v, centrodoelemento2h-larguradapeça/2-distadacotadesenho2,distextremo+distinter*3+difhor*7,0);
                 /*linhadacotaesquerda*/
                 Graphics linhasco8 = jPanel7.getGraphics();
                 linhasco8.setColor(Color.WHITE);
                 linhasco8.translate(centrodoelemento2v-15, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                 linhasco8.drawLine(10,20,20,10);
                 cotaslat1.drawString(String.format(fe.format(distextremo1+difhor1)),centrodoelemento2v-15+(distextremo+difhor)/2, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                 /*linhadacotacentro*/
                 Graphics linhasco9 = jPanel7.getGraphics();
                 linhasco9.setColor(Color.WHITE);
                 linhasco9.translate(centrodoelemento2v-15+distextremo+difhor, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                 linhasco9.drawLine(10,20,20,10);
                 /*linhadacotacentrodireita*/
                 Graphics linhasco10 = jPanel7.getGraphics();
                 linhasco10.setColor(Color.WHITE);
                 linhasco10.translate(centrodoelemento2v-15+distextremo+distinter+difhor*3, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                 linhasco10.drawLine(10,20,20,10);
                 cotaslat1.drawString(String.format(fe.format(distinter1+difhor1*2)),centrodoelemento2v-15+distextremo+difhor+(distinter+difhor*2)/2, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                  /*linhadacotadireita*/
                 Graphics linhasco16 = jPanel7.getGraphics();
                 linhasco16.setColor(Color.WHITE);
                 linhasco16.translate(centrodoelemento2v-15+distextremo+distinter*2+difhor*5, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                 linhasco16.drawLine(10,20,20,10);
                 cotaslat1.drawString(String.format(fe.format((distinter1+difhor1*2))),centrodoelemento2v-15+distextremo+difhor*3+distinter+(distinter+difhor*2)/2, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                  /*linhadacotadireita*/
                 Graphics linhasco19 = jPanel7.getGraphics();
                 linhasco19.setColor(Color.WHITE);
                 linhasco19.translate(centrodoelemento2v-15+distextremo+distinter*3+difhor*7, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                 linhasco19.drawLine(10,20,20,10);
                 cotaslat1.drawString(String.format(fe.format((distinter1+difhor1*2))),centrodoelemento2v-15+distextremo+difhor*5+distinter*2+(distinter+difhor*2)/2, centrodoelemento2h-larguradapeça/2-distadacotadesenho2-15);
                
                  /*cota distância entre vertical*/
                cotaslat1.drawRect(centrodoelemento2v-distadacotadesenho2*2, centrodoelemento2h-larguradapeça/2,0,larguradapeça);
                cotaslat1.drawString(String.format(fe.format(distnomeioentrepregos1+difver1*2)),centrodoelemento2v-distadacotadesenho2*4,centrodoelemento2h);
                cotaslat1.drawString(String.format(fe.format(disthoemcima1+difver1)),centrodoelemento2v-distadacotadesenho2*4,centrodoelemento2h-larguradapeça/2+(disthoemcima+difver)/2);
                cotaslat1.drawString(String.format(fe.format(disthoembaixo1+difver1)),centrodoelemento2v-distadacotadesenho2*4,centrodoelemento2h+larguradapeça/2-(disthoembaixo+difver)/2);
                /*linhadecimadomeiovertical*/
                Graphics linhasco1 = jPanel7.getGraphics();
                linhasco1.setColor(Color.WHITE);
                linhasco1.translate(centrodoelemento2v-distadacotadesenho2*2-15,centrodoelemento2h-15-larguradapeça/2+disthoemcima+difver);
                linhasco1.drawLine(10,20,20,10);
                Graphics linhasco4 = jPanel7.getGraphics();
                linhasco4.setColor(Color.WHITE);
                linhasco4.translate(centrodoelemento2v-distadacotadesenho2*2-15,centrodoelemento2h-15+larguradapeça/2-disthoembaixo-difver);
                linhasco4.drawLine(10,20,20,10);
                /*linhadebaixodavertical*/
                Graphics linhasco2 = jPanel7.getGraphics();
                linhasco2.setColor(Color.WHITE);
                linhasco2.translate(centrodoelemento2v-distadacotadesenho2*2-15,centrodoelemento2h-15+larguradapeça/2);
                linhasco2.drawLine(10,20,20,10);
                /*linhadecimadavertical*/
                Graphics linhasco3 = jPanel7.getGraphics();
                linhasco3.setColor(Color.WHITE);
                linhasco3.translate(centrodoelemento2v-distadacotadesenho2*2-15,centrodoelemento2h-15-larguradapeça/2);
                linhasco3.drawLine(10,20,20,10);
                    
                }
                else{
                    JOptionPane.showMessageDialog(null,"Esta peça não pode ser desenhada pois não há espaço para isso, Segundo critérios normativos NBR7190","Erro - Falta de espaço na peça",JOptionPane.OK_OPTION);
                }
            }
        }
        }  
    }//GEN-LAST:event_jLabel35MouseClicked

    private void jLabel46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseClicked

            jPanel5.setVisible(true);
            jPanel6.setVisible(false);
            jPanel7.setVisible(false);
            jPanel2.setVisible(true);
            jPanel1.setVisible(true);
            tipodeligaçãoaserescolhida.setVisible(true);
            resultadosdospregos.setVisible(false);
            resultadoscavilha.setVisible(false);
            escolhacavilha.setVisible(false);
            Escolhamadeira.setVisible(false);
            escolhadacarga.setVisible(false);
            pregoeparafuso.setVisible(false);
            Resultadoparafuso.setVisible(false);
        
    }//GEN-LAST:event_jLabel46MouseClicked

    private void seldicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seldicoMouseClicked
        /*removendo items*/
        jComboBox1.setVisible(true);
        jComboBox2.setVisible(false);
    }//GEN-LAST:event_seldicoMouseClicked

    private void selcoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selcoMouseClicked
        /*removendo items*/
        jComboBox1.setVisible(false);
        jComboBox2.setVisible(true);
    }//GEN-LAST:event_selcoMouseClicked

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
       String valorresistencia = jComboBox2.getSelectedItem().toString();
        double resmad1 = 0;
        if ((selco.isSelected() == false && seldico.isSelected()== false)){}
        if("C20".equals(valorresistencia)&& selco.isSelected()){
            resmad1 = 20;
            resfc0k.setText("20");
            jLabel26.setText("4");
            resecom.setText("3500");
            respapa.setText("500");
        }
        if("C25".equals(valorresistencia)&& selco.isSelected()){
            resmad1 = 25;
            resfc0k.setText("25");
            jLabel26.setText("5");
            resecom.setText("8500");
            respapa.setText("550");}
        if("C30".equals(valorresistencia)&& selco.isSelected()){
            resmad1 = 30;
            resfc0k.setText("30");
            jLabel26.setText("6");
            resecom.setText("3500");
            respapa.setText("600");
        } 
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jLabel45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel45MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel45MouseClicked

    private void ang90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ang90ActionPerformed
        
    }//GEN-LAST:event_ang90ActionPerformed

    private void ligaçãoparafusada1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ligaçãoparafusada1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ligaçãoparafusada1ActionPerformed

    private void angdifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_angdifMouseClicked
        if(angdif.isSelected()){
            valorangdif.setVisible(true);
        }else{
            valorangdif.setVisible(false);
        }
    }//GEN-LAST:event_angdifMouseClicked

    private void angdifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angdifActionPerformed
        
    }//GEN-LAST:event_angdifActionPerformed

    private void am0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_am0MouseClicked
        if(am0.isSelected()){
            valorangdif.setVisible(false);
         }
    }//GEN-LAST:event_am0MouseClicked

    private void ang90MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ang90MouseClicked
         if(ang90.isSelected()){
            valorangdif.setVisible(false);
         }
    }//GEN-LAST:event_ang90MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Document documento = new Document();
        DecimalFormat fe = new DecimalFormat("0.00");
        try {
             PdfWriter.getInstance(documento,new FileOutputStream("Memorial de Cálculo Corte Duplo.pdf"));
            documento.open();
            documento.newPage();
            documento.setPageSize(PageSize.A4);
           
            documento.setMargins(85f, 85f, 85f, 85f);
            documento.addCreator("Matheus Felipe de Oliveira Lemos");
            documento.addTitle("Memorial de Cálculo");
            documento.addCreator("Matheus Felipe de Oliveira Lemos");
            documento.addLanguage("Português");
            documento.addKeywords("Ligações,Madeira,Resistência,Solicitação");
            Font f3 = new Font(Font.FontFamily.TIMES_ROMAN, 14f, Font.BOLD);
            Font f4 = new Font(Font.FontFamily.TIMES_ROMAN, 12f, Font.BOLD);
            f4.setColor(BaseColor.WHITE);
            Font f5 = new Font(Font.FontFamily.TIMES_ROMAN, 12f, Font.NORMAL);
            Font f6 = new Font(Font.FontFamily.TIMES_ROMAN, 12f, Font.BOLD);
            Paragraph titulo = new Paragraph();
            /*Título principal */
            titulo.setFont(f3);
            titulo.setAlignment(Element.ALIGN_CENTER);
            titulo.add("Memorial de Cálculo do Corte Duplo\n");
            /*Parágrafo primeiro*/
            Paragraph parágrafo1= new Paragraph();
            parágrafo1.setAlignment(Element.ALIGN_JUSTIFIED);
            parágrafo1.setFont(f6);
            parágrafo1.add("Características das Propriedades da Madeira (De acordo com a Norma NBR 7190/1997).");
            /*espaçamento 1*/
            Paragraph espaçamento1 = new Paragraph();
            for (int i = 0; i < 20; i++) {
                espaçamento1.add(new Chunk(" "));
            }
            /*espaçamento 2*/
            Paragraph espaçamento2 = new Paragraph();
            for (int i = 0; i < 20; i++) {
                espaçamento2.add(new Chunk(" "));
            }
            /*espaçamento 3*/
            Paragraph espaçamento3 = new Paragraph();
            for (int i = 0; i < 1500; i++) {
                espaçamento3.add(new Chunk(" "));
            }
            /*Tabela de Propriedades da Madeira*/
            PdfPTable table1 = new PdfPTable(2);
            /*construindo as celulas da tabela*/
            String categoria1 = "";
            if (seldico.isSelected()){
                categoria1 = "Dicotiledônea";
            }
            if(selco.isSelected()){
                categoria1 = "Conífera";
            }
            PdfPCell propriedad = new PdfPCell(new Phrase("Propriedade da Madeira",f4));
            propriedad.setHorizontalAlignment(Element.ALIGN_CENTER);
            propriedad.setBackgroundColor(new BaseColor(223,104,4));
            PdfPCell categoria = new PdfPCell(new Phrase(categoria1,f4));
            categoria.setHorizontalAlignment(Element.ALIGN_CENTER);
            categoria.setBackgroundColor(new BaseColor(223,104,4));
            PdfPCell classerist = new PdfPCell(new Phrase("Classe de Resistência",f5));
            PdfPCell classerist1 = new PdfPCell(new Phrase("C"+resfc0k.getText(),f5));
            classerist1.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell resistacom = new PdfPCell(new Phrase("Resistência Característica a Compressão Paralela as fibras.",f5));
            PdfPCell comprdf = new PdfPCell(new Phrase(resfc0k.getText()+" MPa",f5));
            comprdf.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell propriedad1 = new PdfPCell(new Phrase("Resistência Característica a Compressão Normal as fibras.",f5));
            PdfPCell dfdfdfd = new PdfPCell(new Phrase(jLabel59.getText()+" MPa",f5));
            dfdfdfd.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell propriedad2 = new PdfPCell(new Phrase("Resistência Característica ao Cisalhamento Paralelo as fibras",f5));
            PdfPCell propriedad3= new PdfPCell(new Phrase(jLabel26.getText()+" MPa",f5));
            propriedad3.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell celulaNome2 = new PdfPCell(new Phrase("Valor médio do módulo de elasticidade na compressão paralela às fibras",f5));
            PdfPCell celulaSexo2 = new PdfPCell(new Phrase(resecom.getText()+" MPa",f5));
            celulaSexo2 .setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell celulaSexo12 = new PdfPCell(new Phrase("Densidade básica",f5));
            PdfPCell celulaSexo121 = new PdfPCell(new Phrase(jLabel56.getText()+" MPa",f5));
            celulaSexo121.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell densidade1 = new PdfPCell(new Phrase("Densidade aparente",f5));
            PdfPCell densidade2 = new PdfPCell(new Phrase(respapa.getText()+" MPa",f5));
            densidade2.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell umidade = new PdfPCell(new Phrase("Umidade",f5));
            PdfPCell umidade2 = new PdfPCell(new Phrase("12%",f5));
            umidade2.setHorizontalAlignment(Element.ALIGN_CENTER);
            /*adicionando as celulas na tabela*/
            float columnWidth[]={300f,100f};
            table1.setTotalWidth(columnWidth);
            table1.addCell(propriedad);
            table1.addCell(categoria);
            table1.addCell(classerist);
            table1.addCell(classerist1);
            table1.addCell(resistacom );
            table1.addCell(comprdf);
            table1.addCell(propriedad1);
            table1.addCell(dfdfdfd);
            table1.addCell(propriedad2);
            table1.addCell(propriedad3);
            table1.addCell(celulaNome2);
            table1.addCell(celulaSexo2);
            table1.addCell(celulaSexo12);
            table1.addCell(celulaSexo121);
            table1.addCell(densidade1);
            table1.addCell(densidade2);
            table1.addCell(umidade);
            table1.addCell(umidade2);
            /*terminar a tabela*/
            
            /*segunda parte do memorial*/
            /*Parágrafo segundo*/
            Paragraph parágrafo2= new Paragraph();
            parágrafo2.setAlignment(Element.ALIGN_JUSTIFIED);
            parágrafo2.setFont(f6);
            parágrafo2.add("Caracterização da Madeira e coeficiente de Modificação (De acordo com a Norma NBR 7190/1997).");
            /*construindo tabela 2*/
            
             /*Tabela de Propriedades da Madeira*/
            PdfPTable table2 = new PdfPTable(2);
            /*construindo as celulas da tabela*/
            
            /*primeira linha tabela 2*/
            PdfPCell Classecarre = new PdfPCell(new Phrase("Especificações para Modificação",f4));
            Classecarre.setBackgroundColor(new BaseColor(223,104,4));
            Classecarre.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell tipodemad = new PdfPCell(new Phrase("Madeira",f4));
            tipodemad.setBackgroundColor(new BaseColor(223,104,4));
            tipodemad.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*segunda linha tabela 2*/
            PdfPCell classecarre1 = new PdfPCell(new Phrase("Classe de Carregamento",f5));
            String classefdv = jComboBox10.getSelectedItem().toString();
            PdfPCell classerist12 = new PdfPCell(new Phrase(classefdv,f5));
            classerist12.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*terceira linha tabela 2*/
            PdfPCell resistacom2 = new PdfPCell(new Phrase("Tipo de Madeira",f5));
            String resistac = jComboBox9.getSelectedItem().toString();
            PdfPCell comprdf2 = new PdfPCell(new Phrase(resistac,f5));
            comprdf2.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*quarta linha tabela 2*/
            PdfPCell propriedad12 = new PdfPCell(new Phrase("Categoria da Madeira",f5));
            String propd = jComboBox15.getSelectedItem().toString();
            PdfPCell dfdfdfd2 = new PdfPCell(new Phrase(propd,f5));
            dfdfdfd2.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*quinta linha tabela 2*/
            PdfPCell propriedad22 = new PdfPCell(new Phrase("Classe de Umidade da Madeira",f5));
            String propd1 = jComboBox13.getSelectedItem().toString();
            PdfPCell propriedad32= new PdfPCell(new Phrase(propd1,f5));
            propriedad32.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*sexta linha tabela 2*/
            PdfPCell celulaNome22 = new PdfPCell(new Phrase("kmod1",f5));
            PdfPCell celulaSexo22 = new PdfPCell(new Phrase(resulkmod1.getText(),f5));
            celulaSexo22.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /* setima linha tabela 2*/
            PdfPCell celulaSexo122 = new PdfPCell(new Phrase("kmod2",f5));
            PdfPCell celulaSexo1212 = new PdfPCell(new Phrase(resulkmod2.getText(),f5));
            celulaSexo1212.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*oitava linha tabela 2*/
            PdfPCell densidade12 = new PdfPCell(new Phrase("kmod3",f5));
            PdfPCell densidade22 = new PdfPCell(new Phrase(resulkmod3.getText(),f5));
            densidade22.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*nona linha tabela 2*/
            PdfPCell umidade21 = new PdfPCell(new Phrase("kmod = kmod1*kmod2*kmod3",f5));
            PdfPCell umidade22 = new PdfPCell(new Phrase(resulkmod.getText(),f5));
            umidade22.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*adicionando as celulas na tabela 2*/
            float columnWidth1[]={300f,100f};
            table2.setWidthPercentage(70);
            
            table2.addCell(Classecarre);
            table2.addCell(tipodemad);
            table2.addCell(classecarre1);
            table2.addCell(classerist12);
            table2.addCell(resistacom2);
            table2.addCell(comprdf2);
            table2.addCell(propriedad12);
            table2.addCell(dfdfdfd2);
            table2.addCell(propriedad22);
            table2.addCell(propriedad32);
            table2.addCell(celulaNome22);
            table2.addCell(celulaSexo22);
            table2.addCell(celulaSexo122);
            table2.addCell(celulaSexo1212);
            table2.addCell(densidade12);
            table2.addCell(densidade22);
            table2.addCell(umidade21);
            table2.addCell(umidade22);
            
            /*terceira parte do memorial*/
            /*Parágrafo terceira*/
            Paragraph parágrafo3= new Paragraph();
            parágrafo3.setAlignment(Element.ALIGN_JUSTIFIED);
            parágrafo3.setFont(f6);
            parágrafo3.add("Dimensões das Peças de Madeira.");
            
            /*construindo tabela 3*/
            
             /*Tabela de peças de madeira*/
            PdfPTable table3 = new PdfPTable(2);
            /*construindo as celulas da tabela*/
            
            /*primeira linha tabela 3*/
            PdfPCell Classecarre3 = new PdfPCell(new Phrase("Peças de Madeira",f4));
            Classecarre3.setBackgroundColor(new BaseColor(223,104,4));
            Classecarre3.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell tipodemad53 = new PdfPCell(new Phrase("Madeira",f4));
            tipodemad53.setBackgroundColor(new BaseColor(223,104,4));
            tipodemad53.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*segunda linha tabela 3*/
            
            PdfPCell classecarre13 = new PdfPCell(new Phrase("t1 (espessura da peça 1)",f5));
            PdfPCell classerist123 = new PdfPCell(new Phrase(espessurat1.getText()+" cm",f5));
            classerist123.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*terceira linha tabela 3*/
            PdfPCell resistacom23 = new PdfPCell(new Phrase("t2 (espessura da peça do meio 2)",f5));
            PdfPCell comprdf23 = new PdfPCell(new Phrase(espessurat2.getText()+" cm",f5));
            comprdf23.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*sexta linha tabela 3*/
            PdfPCell celulaNome223 = new PdfPCell(new Phrase("Comprimento de União dos Elementos.",f5));
            PdfPCell celulaSexo223 = new PdfPCell(new Phrase(compr.getText()+" cm",f5));
            celulaSexo223.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /* setima linha tabela 3*/
            PdfPCell celulaSexo1223 = new PdfPCell(new Phrase("Largura das Peças de Madeira",f5));
            PdfPCell celulaSexo12123 = new PdfPCell(new Phrase(larguralig.getText()+" cm",f5));
            celulaSexo12123.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*oitava linha tabela */
            PdfPCell densidade123 = new PdfPCell(new Phrase("Ângulo entre elemento 2 e os demais.",f5));
            PdfPCell densidade223 = new PdfPCell(new Phrase(jLabel57.getText(),f5));
            densidade223.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            
            /*adicionando as celulas na tabela 3*/
            float columnWidth3[]={300f,100f};
            table3.setWidthPercentage(50);
            table3.setTotalWidth(columnWidth1);
            table3.addCell(Classecarre3);
            table3.addCell(tipodemad53);
            table3.addCell(classecarre13);
            table3.addCell(classerist123);
            table3.addCell(resistacom23);
            table3.addCell(comprdf23);
            table3.addCell(celulaNome223);
            table3.addCell(celulaSexo223);
            table3.addCell(celulaSexo1223);
            table3.addCell(celulaSexo12123);
            table3.addCell(densidade123);
            table3.addCell(densidade223);

               /*Quarta parte do memorial*/
            /*Parágrafo quarto*/
            Paragraph parágrafo4= new Paragraph();
            parágrafo4.setAlignment(Element.ALIGN_JUSTIFIED);
            parágrafo4.setFont(f6);
            parágrafo4.add("Combinação de Ações. (Combinação Normal, Desfavorável).");
            
            /*construindo tabela 4*/
            
             /*Tabela de peças de madeira*/
            PdfPTable table4 = new PdfPTable(3);
            /*construindo as celulas da tabela*/
            
            /*primeira linha tabela 4*/
            PdfPCell Classecarre34 = new PdfPCell(new Phrase("Ações",f4));
            Classecarre34.setHorizontalAlignment(Element.ALIGN_CENTER);
            Classecarre34.setBackgroundColor(new BaseColor(223,104,4));
            PdfPCell tipodemad534 = new PdfPCell(new Phrase("Característica",f4));
            tipodemad534.setHorizontalAlignment(Element.ALIGN_CENTER);
            tipodemad534.setBackgroundColor(new BaseColor(223,104,4));
            PdfPCell classecarre134 = new PdfPCell(new Phrase("Valor(kN)",f4));
            classecarre134.setHorizontalAlignment(Element.ALIGN_CENTER);
            classecarre134.setBackgroundColor(new BaseColor(223,104,4));
            
            /*segunda linha tabela 4*/
            PdfPCell classerist1234 = new PdfPCell(new Phrase("Ações Permanentes",f5));
            classerist1234.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell tipodemad5341 = new PdfPCell(new Phrase(Tipodevariabilidade.getSelectedItem().toString(),f5));
            tipodemad5341.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell classecarre1341 = new PdfPCell(new Phrase(permanente.getText(),f5));
            classecarre1341.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*terceira linha tabela 4*/
            PdfPCell resistacom234 = new PdfPCell(new Phrase("Ações Variáveis (Sobrecarga)",f5));
            PdfPCell comprdf234 = new PdfPCell(new Phrase(variavel.getSelectedItem().toString(),f5));
            comprdf234.setHorizontalAlignment(Element.ALIGN_CENTER);
             PdfPCell propriedad1234 = new PdfPCell(new Phrase(sobrecarga.getText(),f5));
             propriedad1234.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*quarta linha tabela 4*/
            PdfPCell dfdfdfd234 = new PdfPCell(new Phrase("Vento",f5));
            dfdfdfd234.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell propriedad2234 = new PdfPCell(new Phrase(variavel.getSelectedItem().toString(),f5));
            PdfPCell propriedad3234= new PdfPCell(new Phrase(vento.getText(),f5));
            propriedad3234.setHorizontalAlignment(Element.ALIGN_CENTER);
         
            /*quarta linha tabela 4*/
            PdfPCell lin4col1tab4 = new PdfPCell(new Phrase("Força Majorada pela Combinação Sobrecarga Ação Variável Principal",f5));
            lin4col1tab4.setColspan(2);
            lin4col1tab4.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell lin4col2tab4 = new PdfPCell(new Phrase(resultperma.getText()+" kN",f5));
            lin4col2tab4.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*quinta linha tabela 4*/
            PdfPCell lin5col1tab4 = new PdfPCell(new Phrase("Força Majorada pela Combinação Vento como Ação Variável Principal",f5));
            lin5col1tab4.setColspan(2);
            lin5col1tab4.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell lin5col2tab4 = new PdfPCell(new Phrase(resultvent.getText()+" kN",f5));
            lin5col2tab4.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*adicionando as celulas na tabela 4*/
            float columnWidth4[]={100f,100f,100f};
            table4.setTotalWidth(columnWidth4);
            table4.addCell(Classecarre34);
            table4.addCell(tipodemad534);
            table4.addCell(classecarre134);
            table4.addCell(classerist1234);
            table4.addCell(tipodemad5341);
            table4.addCell(classecarre1341 );
            table4.addCell(resistacom234);
            table4.addCell(comprdf234);
            table4.addCell(propriedad1234);
            table4.addCell(dfdfdfd234);
            table4.addCell(propriedad2234);
            table4.addCell(propriedad3234);
            table4.addCell(lin4col1tab4);
            table4.addCell(lin4col2tab4);
            table4.addCell(lin5col1tab4);
            table4.addCell(lin5col2tab4);

               /*Quinta parte do memorial*/
            /*Parágrafo Quinto*/
            Paragraph parágrafo5= new Paragraph();
            parágrafo5.setAlignment(Element.ALIGN_JUSTIFIED);
            parágrafo5.setFont(f6);
            parágrafo5.add("Fatores de Utilização");
            
            /*construindo tabela 5*/
            
             /*Tabela de peças de madeira*/
            PdfPTable table5 = new PdfPTable(2);
            /*construindo as celulas da tabela*/
            
            /*primeira linha tabela 5*/
            PdfPCell Classecarre35 = new PdfPCell(new Phrase("Fatores de Utilização",f4));
            Classecarre35.setHorizontalAlignment(Element.ALIGN_CENTER);
            Classecarre35.setBackgroundColor(new BaseColor(223,104,4));
            PdfPCell tipodemad535 = new PdfPCell(new Phrase("Adotado",f4));
            tipodemad535.setHorizontalAlignment(Element.ALIGN_CENTER);
            tipodemad535.setBackgroundColor(new BaseColor(223,104,4));
            
            /*segunda linha tabela 5*/
            PdfPCell classecarre135 = new PdfPCell(new Phrase("Ações em Estruturas Correntes",f5));
            PdfPCell classerist1235 = new PdfPCell(new Phrase(acoescorrentes.getSelectedItem().toString(),f5));
    
            /*terceira linha tabela 5*/
            PdfPCell resistacom235 = new PdfPCell(new Phrase("Cargas Acidentais dos Edifícios ",f5));
        /*Cargas acidentais dos edifícios*/
        String h1 = null;
        String aci = cargasacid.getSelectedItem().toString();
        if("Não há pred. de Equipamentos Fixos nem de el. concentr".equals(aci)){
            h1 = "Locais em que não há predominância de pesos de equipamentos fixos,ou de elevadas concentrações de pessoas";
        }
        if("Há pred. de Equipamentos Fixos ou de elev. Concentração.".equals(aci)){
            h1 = "Locais onde há predominância de pesos de equipamentos fixos, ou de elevadas concentrações de pessoas";
        }
        if("Bibliotecas, arquivos, oficinas ou garagens".equals(aci)){
            h1 = "Bibliotecas, arquivos, oficinas e garagens";
        }
            PdfPCell comprdf235 = new PdfPCell(new Phrase(h1,f5));
            
            /*adicionando as celulas na tabela 5*/
            table5.addCell(Classecarre35);
            table5.addCell(tipodemad535);
            table5.addCell(classecarre135);
            table5.addCell(classerist1235);
            table5.addCell(resistacom235);
            table5.addCell(comprdf235);
         
               /*Sexta parte do memorial*/
            /*Parágrafo quarto*/
            Paragraph parágrafo6= new Paragraph();
            parágrafo6.setAlignment(Element.ALIGN_JUSTIFIED);
            parágrafo6.setFont(f6);
            parágrafo6.add("Parâmetros de Cálculo da Ligação.");
            
            /*construindo tabela 6*/
            
             /*Tabela de peças de madeira*/
            PdfPTable table6 = new PdfPTable(3);
            /*construindo as celulas da tabela 6*/
            
             /*primeira linha tabela 6*/
            PdfPCell Classecarre361 = new PdfPCell(new Phrase("Parâmetros de Cálculo para a Madeira",f4));
            Classecarre361.setRowspan(4);
            try {
                 com.itextpdf.text.Image hei = com.itextpdf.text.Image.getInstance("C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\imagemtexturamadeira.jpg"); 
                 
                 Classecarre361.setImage(hei);
                 Classecarre361.setVerticalAlignment(Element.ALIGN_MIDDLE);
                 Classecarre361.setHorizontalAlignment(Element.ALIGN_CENTER);
                 
             } catch (BadElementException | IOException ex) {
                 Logger.getLogger(TelaCorteSimples10.class.getName()).log(Level.SEVERE, null, ex);
             }
            Classecarre361.setHorizontalAlignment(Element.ALIGN_CENTER);
             
            /*primeira linha tabela 6*/
            PdfPCell Classecarre36 = new PdfPCell(new Phrase("Parâmetros de Resistência para a Madeira",f4));
            Classecarre36.setBackgroundColor(new BaseColor(223,104,4));
            Classecarre36.setColspan(2);
            Classecarre36.setHorizontalAlignment(Element.ALIGN_CENTER);
            
           
            
            /*segunda linha tabela 6*/
            PdfPCell classecarre136 = new PdfPCell(new Phrase("Resistência de Compressão paralela as fibras (fc0d).",f5));
            PdfPCell classerist1236 = new PdfPCell(new Phrase(rescomcal.getText()+" kN/cm²",f5));
            classerist1236.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*terceira linha tabela 6*/
            PdfPCell resistacom236 = new PdfPCell(new Phrase("Resistência ao Compressão normal as fibras (fc90d).",f5));
            PdfPCell comprdf236 = new PdfPCell(new Phrase(jLabel44.getText()+" kN/cm²",f5));
            comprdf236.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*quarta linha tabela 6*/
            PdfPCell propriedad1236 = new PdfPCell(new Phrase("Resistência ao Cisalhamento paralelo as fibras (fv0d). ",f5));
            PdfPCell dfdfdfd236 = new PdfPCell(new Phrase(jLabel60.getText()+" kN/cm²",f5));
            dfdfdfd236.setHorizontalAlignment(Element.ALIGN_CENTER);        
            
            /*adicionadno imagem*/
            
            /*adicionando as celulas na tabela 6*/
            float columnWidth6[] = {30,120,60};
            table6.setWidths(columnWidth6);
            table6.setWidthPercentage(80);
            table6.addCell(Classecarre361);
            table6.addCell(Classecarre36);
            table6.addCell(classecarre136);
            table6.addCell(classerist1236);
            table6.addCell(resistacom236);
            table6.addCell(comprdf236);
            table6.addCell(propriedad1236);
            table6.addCell(dfdfdfd236);
            
               /*construindo tabela 7*/
            
             /*Tabela de peças de madeira*/
            PdfPTable table7 = new PdfPTable(3);
            /*construindo as celulas da tabela 6*/
            
            PdfPCell Classecarre3671 = new PdfPCell(new Phrase("Parâmetros de Cálculo para o Parafuso",f4));
            Classecarre3671.setRowspan(4);
            Classecarre3671.setHorizontalAlignment(Element.ALIGN_CENTER);
            try {
                 com.itextpdf.text.Image hei1 = com.itextpdf.text.Image.getInstance("C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\parafuso.jpg"); 
                 
                 Classecarre3671.setImage(hei1);
                 Classecarre3671.setVerticalAlignment(Element.ALIGN_MIDDLE);
                 Classecarre3671.setHorizontalAlignment(Element.ALIGN_CENTER);
                 
             } catch (BadElementException | IOException ex) {
                 Logger.getLogger(TelaCorteSimples10.class.getName()).log(Level.SEVERE, null, ex);
             }
            /*primeira linha tabela 7*/
            PdfPCell Classecarre367 = new PdfPCell(new Phrase("Parâmetros de Cálculo para o Parafuso",f4));
            Classecarre367.setBackgroundColor(new BaseColor(223,104,4));
            Classecarre367.setColspan(2);
            Classecarre367.setHorizontalAlignment(Element.ALIGN_CENTER);
           
            
            /*segunda linha tabela 7*/
            PdfPCell classecarre1367 = new PdfPCell(new Phrase("Diâmetro do Parafuso",f5));
            String hig = null;
            if("9.5".equals(escopara.getSelectedItem().toString())){
                hig = "";
            }
            if("12.5".equals(escopara.getSelectedItem().toString())){
                hig = "(1/2 pol.)";
            }
            if("16.0".equals(escopara.getSelectedItem().toString())){
                hig = "(5/8 pol.)";
            }
            if("19.0".equals(escopara.getSelectedItem().toString())){
                hig = "(3/4 pol.)";
            }if("22.0".equals(escopara.getSelectedItem().toString())){
                hig = "(7/8 pol.)";
            }
            if("25.0".equals(escopara.getSelectedItem().toString())){
                hig = "(1 pol.)";
            }
            if("31.0".equals(escopara.getSelectedItem().toString())){
                hig = "(1 1/4 pol.)";
            }
            if("38.0".equals(escopara.getSelectedItem().toString())){
                hig = "(1 1/2 pol.)";
            }
            PdfPCell classerist12367 = new PdfPCell(new Phrase(escopara.getSelectedItem()+" mm ou "+hig,f5));
            classerist12367.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*terceira linha tabela 7*/
         
            PdfPCell resistacom2367 = new PdfPCell(new Phrase("Alfae",f5));
            PdfPCell comprdf2367 = new PdfPCell(new Phrase(jLabel61.getText(),f5));
            comprdf2367.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*quarta linha tabela 7*/
            PdfPCell propriedad12367 = new PdfPCell(new Phrase("Resistência do Parafuso ",f5));
            PdfPCell dfdfdfd2367 = new PdfPCell(new Phrase("240 MPA",f5));
            dfdfdfd2367.setHorizontalAlignment(Element.ALIGN_CENTER);        
            
            /*adicionando as celulas na tabela 7*/
            float columnWidth7[] = {30,120,30};
            table7.setWidths(columnWidth7);
            table7.setWidthPercentage(80);
            table7.addCell(Classecarre3671);
            table7.addCell(Classecarre367);
            table7.addCell(classecarre1367);
            table7.addCell(classerist12367);
            table7.addCell(resistacom2367);
            table7.addCell(comprdf2367);
            table7.addCell(propriedad12367);
            table7.addCell(dfdfdfd2367);
            
                /*construindo tabela 8*/
            
             /*Tabela de peças de madeira*/
            PdfPTable table8 = new PdfPTable(2);
            /*construindo as celulas da tabela 6*/
            
             
            /*primeira linha tabela 8*/
            PdfPCell Classecarre3678 = new PdfPCell(new Phrase("Resistência para embutimento na Madeira",f4));
            Classecarre3678.setBackgroundColor(new BaseColor(223,104,4));
            Classecarre3678.setColspan(2);
            Classecarre3678.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*segunda linha tabela 8*/
            PdfPCell lin2col1tab8 = new PdfPCell(new Phrase("Resistência ao embutimento da Madeira paralelo as fibras (fe0d)",f5));
            PdfPCell lin2col2tab8 = new PdfPCell(new Phrase(jLabel98.getText()+" kN/cm²",f5));
            lin2col2tab8.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*terceira linha tabela 8*/
            PdfPCell lin3col1tab8 = new PdfPCell(new Phrase("Resistência ao embutimento da Madeira normal as fibras (fe90d)",f5));
            PdfPCell lin3col2tab8 = new PdfPCell(new Phrase(jLabel99.getText()+" kN/cm²",f5));
            lin3col2tab8.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*quarta linha tabela 8*/
            PdfPCell classecarre13678 = new PdfPCell(new Phrase("Resistência ao embutimento da Madeira paralelo as fibras (fe"+jLabel57.getText()+"d",f5));
            PdfPCell classerist123678 = new PdfPCell(new Phrase(resutembut.getText()+" kN/cm²",f5));
            classerist123678.setHorizontalAlignment(Element.ALIGN_CENTER);
                    
            
            /*adicionando as celulas na tabela 7*/
            float columnWidth8[]={100f,100f};
            table8.setTotalWidth(columnWidth1);
            table8.addCell(Classecarre3678);
            table8.addCell(lin2col1tab8);
            table8.addCell(lin2col2tab8);
            table8.addCell(lin3col1tab8);
            table8.addCell(lin3col2tab8);
            table8.addCell(classecarre13678);
            table8.addCell(classerist123678);
           
            
            /*mudar a cor das células*/
           
           
            /*construindo tabela 9*/
            
             /*Tabela de peças de madeira*/
            PdfPTable table9 = new PdfPTable(2);
            /*construindo as celulas da tabela 6*/
            
          
            /*primeira linha tabela 9*/
            PdfPCell Classecarre36789 = new PdfPCell(new Phrase("Embutimento na Madeira",f4));
            Classecarre36789.setColspan(2);
            Classecarre36789.setBackgroundColor(new BaseColor(223,104,4));
            Classecarre36789.setHorizontalAlignment(Element.ALIGN_CENTER);
           
            
            /*segunda linha tabela 9*/
            PdfPCell classecarre136789 = new PdfPCell(new Phrase("Beta",f5));
            classecarre136789.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell classerist1236789 = new PdfPCell(new Phrase(bet.getText(),f5));
            classerist1236789.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*terceira linha tabela 9*/
            PdfPCell resistacom236789 = new PdfPCell(new Phrase("Beta Limite",f5));
            resistacom236789.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell comprdf236789 = new PdfPCell(new Phrase(betlimite.getText(),f5));
            comprdf236789.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            PdfPCell resista = new PdfPCell(new Phrase("Resistência de um corte",f5));
            resista.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell compr12= new PdfPCell(new Phrase(jLabel62.getText()+" kN",f5));
            compr12.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*quinta linha tabela 9*/
            PdfPCell dfdfdfd236789 = new PdfPCell(new Phrase(jLabel65.getText().toString(),f5));
            dfdfdfd236789.setColspan(2);
            dfdfdfd236789.setHorizontalAlignment(Element.ALIGN_CENTER);        
            if(("Beta Limite > Beta").equals(jLabel65.getText().toString())){
                dfdfdfd236789.setBackgroundColor(BaseColor.RED);
            }
            
            /*adicionando as celulas na tabela 9*/
            table9.setHorizontalAlignment(Element.ALIGN_CENTER);
            table9.setWidthPercentage(85);
            table9.addCell(Classecarre36789);
            table9.addCell(classecarre136789);
            table9.addCell(classerist1236789);
            table9.addCell(resistacom236789);
            table9.addCell(comprdf236789);
            table9.addCell(resista);
            table9.addCell(compr12);
            table9.addCell(dfdfdfd236789);
            
        double disthorimin;
        String disthorimin1 = null;
        double distvermin;
        String distvermin1 = null;
        double disthorbor;
        String disthorbor1 = null;
        double distvercima;
        String distvercima1 = null;
        double distverbaixo;
        String distverbaixo1 = null;
        String diametropara1 = escopara.getSelectedItem().toString();
        double diametropara = Double.parseDouble(diametropara1);
        if(ligaçãoparafusada1.isSelected() && ligpara.isSelected()){
        if(am0.isSelected() || angdif.isSelected()){
        if("Tração".equals(jLabel20.getText().toString())){
            /*espaçamento mínimo entre pregos na horizontal 6 pregos e cavilhas e 4 parafuso*/
            disthorimin = 4*diametropara/10;
            disthorimin1 = String.valueOf(disthorimin);
            /*espaçamento minimo entre pregos na vertical*/
            distvermin = 3*diametropara/10;
            distvermin1 = String.valueOf(distvermin);
            /*espaçamento borda horizontal*/
            disthorbor = 7*diametropara/10;
            disthorbor1 = String.valueOf(disthorbor);
            /*espaçamento borda vertical em cima*/
            distvercima = 1.5*diametropara/10;
            distvercima1= String.valueOf(distvercima);
            /*espaçamento borda vertical em baixo*/
            distverbaixo = 1.5*diametropara/10;
            distverbaixo1= String.valueOf(distverbaixo);

        }
        if("Compressão".equals(jLabel20.getText().toString())){
             /*espaçamento mínimo entre pregos na horizontal 6 pregos e cavilhas e 4 parafuso*/
            disthorimin = 4*diametropara/10;
            disthorimin1 = String.valueOf(disthorimin);
            /*espaçamento minimo entre pregos na vertical*/
            distvermin = 3*diametropara/10;
            distvermin1 = String.valueOf(distvermin);
            /*espaçamento borda horizontal*/
            disthorbor = 4*diametropara/10;
            disthorbor1= String.valueOf(disthorbor);
            /*espaçamento borda vertical em cima*/
            distvercima = 1.5*diametropara/10;
            distvercima1= String.valueOf(distvercima);
            /*espaçamento borda vertical em baixo*/
            distverbaixo = 1.5*diametropara/10;
            distverbaixo1= String.valueOf(distverbaixo);
        }
        }
        if(ang90.isSelected()){
             if("Tração".equals(jLabel20.getText().toString())){
            /*espaçamento mínimo entre pregos na horizontal 6 pregos e cavilhas e 4 parafuso*/
            disthorimin = 3*diametropara/10;
            disthorimin1 = String.valueOf(disthorimin);
            /*espaçamento minimo entre pregos na vertical*/
            distvermin = 4*diametropara/10;
            distvermin1 = String.valueOf(distvermin);
            /*espaçamento borda horizontal*/
            disthorbor = 1.5*diametropara/10;
            disthorbor1= String.valueOf(disthorbor);
            /*espaçamento borda vertical em cima*/
            distvercima = 4*diametropara/10;
            distvercima1= String.valueOf(distvercima);
            /*espaçamento borda vertical em baixo*/
            distverbaixo = 1.5*diametropara/10;
            distverbaixo1 = String.valueOf(distverbaixo);
     
        }
        if("Compressão".equals(jLabel20.getText().toString())){
             /*espaçamento mínimo entre pregos na horizontal 6 pregos e cavilhas e 4 parafuso*/
            disthorimin = 3*diametropara/10;
            disthorimin1 = String.valueOf(disthorimin);
            /*espaçamento minimo entre pregos na vertical*/
            distvermin = 4*diametropara/10;
            distvermin1 = String.valueOf(distvermin);
            /*espaçamento borda horizontal*/
            disthorbor = 1.5*diametropara/10;
            disthorbor1= String.valueOf(disthorbor);
            /*espaçamento borda vertical em cima*/
            distvercima = 1.5*diametropara/10;
            distvercima1= String.valueOf(distvercima);
            /*espaçamento borda vertical em baixo*/
            distverbaixo = 4*diametropara/10;
            distverbaixo1 = String.valueOf(distverbaixo);
        
        }
        }
        }
        
               /*construindo tabela 10*/
            
             /*Tabela de peças de madeira*/
            PdfPTable table10 = new PdfPTable(2);
            /*construindo as celulas da tabela 6*/
            
             
            /*primeira linha tabela 10*/
            PdfPCell Classecarre367891 = new PdfPCell(new Phrase("Flexão do Pino",f4));
            Classecarre367891.setColspan(2);
            Classecarre367891.setBackgroundColor(new BaseColor(223,104,4));
            Classecarre367891.setHorizontalAlignment(Element.ALIGN_CENTER);
           
            
            /*segunda linha tabela 10*/
            PdfPCell classecarre1367891 = new PdfPCell(new Phrase("Beta",f5));
            classecarre1367891.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell classerist12367891 = new PdfPCell(new Phrase(bet.getText(),f5));
            classerist12367891.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*terceira linha tabela 10*/
            PdfPCell resistacom2367891 = new PdfPCell(new Phrase("Beta Limite",f5));
            resistacom2367891.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell comprdf2367891 = new PdfPCell(new Phrase(betlimite.getText(),f5));
            comprdf2367891.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            PdfPCell resistacom23678912 = new PdfPCell(new Phrase("Resistência de um Corte",f5));
            resistacom23678912.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell comprdf23678912 = new PdfPCell(new Phrase(jLabel63.getText()+"kN",f5));
            comprdf23678912.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*quarta linha tabela 10*/
            PdfPCell dfdfdfd2367891 = new PdfPCell(new Phrase(jLabel65.getText().toString(),f5));
            dfdfdfd2367891.setColspan(2);
            dfdfdfd2367891.setHorizontalAlignment(Element.ALIGN_CENTER);  
            
            if(("Beta Limite < Beta").equals(jLabel65.getText().toString())){
                dfdfdfd2367891.setBackgroundColor(BaseColor.RED);
            }
            
            
            
            /*adicionando as celulas na tabela 10*/
            float coluna [] = {10,10};
            table10.setWidthPercentage(85);
            table10.setHorizontalAlignment(Element.ALIGN_CENTER);
            table10.addCell(Classecarre367891);
            table10.addCell(classecarre1367891);
            table10.addCell(classerist12367891);
            table10.addCell(resistacom2367891);
            table10.addCell(comprdf2367891);
            table10.addCell(resistacom23678912);
            table10.addCell(comprdf23678912);
            table10.addCell(dfdfdfd2367891);
            
             /*Tabela de Propriedades da Madeira*/
            PdfPTable table11 = new PdfPTable(2);
            /*construindo as celulas da tabela*/
            
            PdfPCell propriedad4 = new PdfPCell(new Phrase("Resultados Finais",f4));
            propriedad4.setColspan(2);
            propriedad4.setHorizontalAlignment(Element.ALIGN_CENTER);
            propriedad4.setBackgroundColor(new BaseColor(223,104,4));
            PdfPCell categoria4 = new PdfPCell(new Phrase("Força Solitante Majorada ",f5));
            categoria4.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell classerist4 = new PdfPCell(new Phrase(jLabel66.getText()+jLabel67.getText(),f5));
            classerist4.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell classerist14 = new PdfPCell(new Phrase("Esforço Solicitante",f5));
            classerist14.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell resistacom4 = new PdfPCell(new Phrase(jLabel20.getText()+" kN",f5));
            resistacom4.setHorizontalAlignment(Element.ALIGN_CENTER);
            double numeprego = Double.parseDouble(numpara.getText().toString());
            String hid;
            if (numeprego<2){
                hid = "2";
            }else{
                hid = numpara.getText();
            }
            PdfPCell comprdf4 = new PdfPCell(new Phrase(hid,f5));
            comprdf4.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell propriedad14 = new PdfPCell(new Phrase("Número de Pinos Mínimos necessários",f5));
            propriedad14.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell dfdfdfd4 = new PdfPCell(new Phrase("Espaçamento Mínimo entre Pino na Horizontal",f5));
            dfdfdfd4.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell propriedad24 = new PdfPCell(new Phrase(disthorimin1+" cm",f5));
            propriedad24.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell propriedad34= new PdfPCell(new Phrase("Espaçamento Mínimo entre Pinos na Vertical",f5));
            propriedad34.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell celulaNome24 = new PdfPCell(new Phrase(distvermin1+" cm",f5));
            celulaNome24.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell celulaSexo24 = new PdfPCell(new Phrase("Espaçamento Mínimo do Pino até a Borda Horizontal",f5));
            celulaSexo24.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell celulaSexo124 = new PdfPCell(new Phrase(disthorbor1+" cm",f5));
            celulaSexo124.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell umidade24 = new PdfPCell(new Phrase("Espaçamento mínimo do Pino até a Borda Vertical em cima",f5));
            umidade24.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell umidade242 = new PdfPCell(new Phrase(distvercima1+" cm",f5));
            umidade242.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell umidade241 = new PdfPCell(new Phrase("Espaçamento mínimo do Pino até a Borda Vertical em baixo",f5));
            umidade241.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell umidade244 = new PdfPCell(new Phrase(distverbaixo1+" cm",f5));
            umidade244.setHorizontalAlignment(Element.ALIGN_CENTER);
            /*adicionando as celulas na tabela*/
            float columnWidth11[]={75f,25f};
            table11.setTotalWidth(columnWidth11);
            table11.setWidthPercentage(100);
            table11.addCell(propriedad4);
            table11.addCell(categoria4);
            table11.addCell(classerist4);
            table11.addCell(classerist14);
            table11.addCell(resistacom4);
            table11.addCell(propriedad14);
            table11.addCell(comprdf4);
            table11.addCell(dfdfdfd4);
            table11.addCell(propriedad24);
            table11.addCell(propriedad34);
            table11.addCell(celulaNome24);
            table11.addCell(celulaSexo24);
            table11.addCell(celulaSexo124);
            table11.addCell(umidade24);
            table11.addCell(umidade242);
            table11.addCell(umidade241);
            table11.addCell(umidade244);
            /*terminar a tabela*/
            
            
            /*incluindo items no documento*/
            documento.add(titulo);
            documento.add(espaçamento1);
            String imagemcorte = null;
            if(angdif.isSelected()){
                imagemcorte = "C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\imagemcortesimplesincl.JPG";
            }
            if(ang90.isSelected()){
                 imagemcorte = "C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\Imagemcortesimples90.JPG";
            }
            if(am0.isSelected()){
                 imagemcorte = "C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\imagemcortesimples0.JPG";
            }
            try {
                 com.itextpdf.text.Image hei = com.itextpdf.text.Image.getInstance(imagemcorte); 
                 hei.scaleAbsolute(300,150);
              
                 float x = (PageSize.A4.getWidth()-hei.getScaledWidth())/2;
                 hei.setAlignment((int) x);
                 documento.add(hei);
                 
             } catch (BadElementException | IOException ex) {
                 Logger.getLogger(TelaCorteSimples10.class.getName()).log(Level.SEVERE, null, ex);
             }
             try {
                 com.itextpdf.text.Image heip = com.itextpdf.text.Image.getInstance("C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\Imagem1.png"); 
                 heip.setAbsolutePosition(500, TOP_ALIGNMENT);
                 heip.scaleAbsoluteHeight(PageSize.A4.getHeight()/2);
                 heip.scaleAbsoluteWidth(100);
                 heip.setAlignment(Element.ALIGN_RIGHT);
                 documento.add(heip);
                 
             } catch (BadElementException | IOException ex) {
                 Logger.getLogger(TelaCorteSimples10.class.getName()).log(Level.SEVERE, null, ex);
             }
              try {
                 com.itextpdf.text.Image heip = com.itextpdf.text.Image.getInstance("C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\Imagem1.png"); 
                 heip.setRotationDegrees(180);
                 heip.setAbsolutePosition(0,PageSize.A4.getHeight()/2);
                 heip.scaleAbsoluteHeight(PageSize.A4.getHeight()/2);
                 heip.scaleAbsoluteWidth(100);
                
                 documento.add(heip);
                 
             } catch (BadElementException | IOException ex) {
                 Logger.getLogger(TelaCorteSimples10.class.getName()).log(Level.SEVERE, null, ex);
             }
            parágrafo1.setAlignment(Element.ALIGN_CENTER);
            documento.add(parágrafo1);
            documento.add(espaçamento1);
            documento.add(table1);
            documento.add(espaçamento1);
            parágrafo2.setAlignment(Element.ALIGN_CENTER);
            documento.add(parágrafo2);
            documento.add(espaçamento1);
            documento.add(table2);
            documento.add(espaçamento1);
            parágrafo3.setAlignment(Element.ALIGN_CENTER);
            documento.add(parágrafo3);
            documento.add(espaçamento1);
            documento.add(table3);
            documento.add(espaçamento1);
            documento.add(espaçamento1);
            parágrafo4.setAlignment(Element.ALIGN_CENTER);
            documento.add(parágrafo4);
            documento.add(espaçamento1);
            documento.add(table4);
            documento.add(espaçamento1);
            documento.add(table5);
              try {
                 com.itextpdf.text.Image heip = com.itextpdf.text.Image.getInstance("C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\Imagem1.png"); 
                 heip.setAbsolutePosition(500, TOP_ALIGNMENT);
                 heip.scaleAbsoluteHeight(PageSize.A4.getHeight()/2);
                 heip.scaleAbsoluteWidth(100);
                 heip.setAlignment(Element.ALIGN_RIGHT);
                 documento.add(heip);
                 
             } catch (BadElementException | IOException ex) {
                 Logger.getLogger(TelaCorteSimples10.class.getName()).log(Level.SEVERE, null, ex);
             }
              try {
                 com.itextpdf.text.Image heip = com.itextpdf.text.Image.getInstance("C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\Imagem1.png"); 
                 heip.setRotationDegrees(180);
                 heip.setAbsolutePosition(0,PageSize.A4.getHeight()/2);
                 heip.scaleAbsoluteHeight(PageSize.A4.getHeight()/2);
                 heip.scaleAbsoluteWidth(100);
                
                 documento.add(heip);
                 
             } catch (BadElementException | IOException ex) {
                 Logger.getLogger(TelaCorteSimples10.class.getName()).log(Level.SEVERE, null, ex);
             }
            documento.add(espaçamento1);
            parágrafo6.setAlignment(Element.ALIGN_CENTER);
            documento.add(parágrafo6);
            documento.add(espaçamento1);
            documento.add(table6);
            documento.add(espaçamento1);
            documento.add(table7);
            documento.add(espaçamento1);
            documento.add(table8);
            documento.add(espaçamento1);
            if(("Beta Limite > Beta").equals(jLabel65.getText().toString())){
              documento.add(table9);
              documento.add(espaçamento1);  
            }
            if(("Beta Limite < Beta").equals(jLabel65.getText().toString())){
              documento.add(table10);
              documento.add(espaçamento1); 
            }
             try {
                 com.itextpdf.text.Image heip = com.itextpdf.text.Image.getInstance("C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\Imagem1.png"); 
                 heip.setAbsolutePosition(500, TOP_ALIGNMENT);
                 heip.scaleAbsoluteHeight(PageSize.A4.getHeight()/2);
                 heip.scaleAbsoluteWidth(100);
                 heip.setAlignment(Element.ALIGN_RIGHT);
                 documento.add(heip);
                 
             } catch (BadElementException | IOException ex) {
                 Logger.getLogger(TelaCorteSimples10.class.getName()).log(Level.SEVERE, null, ex);
             }
              try {
                 com.itextpdf.text.Image heip = com.itextpdf.text.Image.getInstance("C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\Imagem1.png"); 
                 heip.setRotationDegrees(180);
                 heip.setAbsolutePosition(0,PageSize.A4.getHeight()/2);
                 heip.scaleAbsoluteHeight(PageSize.A4.getHeight()/2);
                 heip.scaleAbsoluteWidth(100);
                
                 documento.add(heip);
                 
             } catch (BadElementException | IOException ex) {
                 Logger.getLogger(TelaCorteSimples10.class.getName()).log(Level.SEVERE, null, ex);
             }
            documento.add(table11);
            
                    } catch (FileNotFoundException | DocumentException ex) {
           System.out.println("error");
        }finally{
            documento.close();
        }
        try {
            Desktop.getDesktop().open(new File("Memorial de Cálculo Corte Duplo.pdf"));
        } catch (IOException ex) {
            Logger.getLogger(TelaCorteSimples10.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ligacaocavilha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ligacaocavilha1ActionPerformed
       
    }//GEN-LAST:event_ligacaocavilha1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Document documento = new Document();
        DecimalFormat fe = new DecimalFormat("0.00");
        try {
            PdfWriter.getInstance(documento,new FileOutputStream("Memorial de Cálculo Corte Duplo.pdf"));
            documento.open();
            documento.newPage();
            documento.setPageSize(PageSize.A4);
           
            documento.setMargins(85f, 85f, 85f, 85f);
            documento.addCreator("Matheus Felipe de Oliveira Lemos");
            documento.addTitle("Memorial de Cálculo");
            documento.addCreator("Matheus Felipe de Oliveira Lemos");
            documento.addLanguage("Português");
            documento.addKeywords("Ligações,Madeira,Resistência,Solicitação");
            Font f3 = new Font(Font.FontFamily.TIMES_ROMAN, 14f, Font.BOLD);
            Font f4 = new Font(Font.FontFamily.TIMES_ROMAN, 12f, Font.BOLD);
            f4.setColor(BaseColor.WHITE);
            Font f5 = new Font(Font.FontFamily.TIMES_ROMAN, 12f, Font.NORMAL);
            Font f6 = new Font(Font.FontFamily.TIMES_ROMAN, 12f, Font.BOLD);
            Paragraph titulo = new Paragraph();
            /*Título principal */
            titulo.setFont(f3);
            titulo.setAlignment(Element.ALIGN_CENTER);
            titulo.add("Memorial de Cálculo do Corte Duplo\n");
            /*Parágrafo primeiro*/
            Paragraph parágrafo1= new Paragraph();
            parágrafo1.setAlignment(Element.ALIGN_JUSTIFIED);
            parágrafo1.setFont(f6);
            parágrafo1.add("Características das Propriedades da Madeira (De acordo com a Norma NBR 7190/1997).");
            /*espaçamento 1*/
            Paragraph espaçamento1 = new Paragraph();
            for (int i = 0; i < 20; i++) {
                espaçamento1.add(new Chunk(" "));
            }
            /*espaçamento 2*/
            Paragraph espaçamento2 = new Paragraph();
            for (int i = 0; i < 20; i++) {
                espaçamento2.add(new Chunk(" "));
            }
            /*espaçamento 3*/
            Paragraph espaçamento3 = new Paragraph();
            for (int i = 0; i < 1500; i++) {
                espaçamento3.add(new Chunk(" "));
            }
            /*Tabela de Propriedades da Madeira*/
            PdfPTable table1 = new PdfPTable(2);
            /*construindo as celulas da tabela*/
            String categoria1 = "";
            if (seldico.isSelected()){
                categoria1 = "Dicotiledônea";
            }
            if(selco.isSelected()){
                categoria1 = "Conífera";
            }
            PdfPCell propriedad = new PdfPCell(new Phrase("Propriedade da Madeira",f4));
            propriedad.setHorizontalAlignment(Element.ALIGN_CENTER);
            propriedad.setBackgroundColor(new BaseColor(223,104,4));
            PdfPCell categoria = new PdfPCell(new Phrase(categoria1,f4));
            categoria.setHorizontalAlignment(Element.ALIGN_CENTER);
            categoria.setBackgroundColor(new BaseColor(223,104,4));
            PdfPCell classerist = new PdfPCell(new Phrase("Classe de Resistência",f5));
            PdfPCell classerist1 = new PdfPCell(new Phrase("C"+resfc0k.getText(),f5));
            classerist1.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell resistacom = new PdfPCell(new Phrase("Resistência Característica a Compressão Paralela as fibras.",f5));
            PdfPCell comprdf = new PdfPCell(new Phrase(resfc0k.getText()+" MPa",f5));
            comprdf.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell propriedad1 = new PdfPCell(new Phrase("Resistência Característica a Compressão Normal as fibras.",f5));
            PdfPCell dfdfdfd = new PdfPCell(new Phrase(jLabel68.getText()+" MPa",f5));
            dfdfdfd.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell propriedad2 = new PdfPCell(new Phrase("Resistência Característica ao Cisalhamento Paralelo as fibras",f5));
            PdfPCell propriedad3= new PdfPCell(new Phrase(jLabel71.getText()+" MPa",f5));
            propriedad3.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell celulaNome2 = new PdfPCell(new Phrase("Valor médio do módulo de elasticidade na compressão paralela às fibras",f5));
            PdfPCell celulaSexo2 = new PdfPCell(new Phrase(resecom.getText()+" MPa",f5));
            celulaSexo2 .setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell celulaSexo12 = new PdfPCell(new Phrase("Densidade básica",f5));
            PdfPCell celulaSexo121 = new PdfPCell(new Phrase(jLabel72.getText()+" MPa",f5));
            celulaSexo121.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell densidade1 = new PdfPCell(new Phrase("Densidade aparente",f5));
            PdfPCell densidade2 = new PdfPCell(new Phrase(respapa.getText()+" MPa",f5));
            densidade2.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell umidade = new PdfPCell(new Phrase("Umidade",f5));
            PdfPCell umidade2 = new PdfPCell(new Phrase("12%",f5));
            umidade2.setHorizontalAlignment(Element.ALIGN_CENTER);
            /*adicionando as celulas na tabela*/
            float columnWidth[]={300f,100f};
            table1.setTotalWidth(columnWidth);
            table1.addCell(propriedad);
            table1.addCell(categoria);
            table1.addCell(classerist);
            table1.addCell(classerist1);
            table1.addCell(resistacom );
            table1.addCell(comprdf);
            table1.addCell(propriedad1);
            table1.addCell(dfdfdfd);
            table1.addCell(propriedad2);
            table1.addCell(propriedad3);
            table1.addCell(celulaNome2);
            table1.addCell(celulaSexo2);
            table1.addCell(celulaSexo12);
            table1.addCell(celulaSexo121);
            table1.addCell(densidade1);
            table1.addCell(densidade2);
            table1.addCell(umidade);
            table1.addCell(umidade2);
            /*terminar a tabela*/
            
            /*segunda parte do memorial*/
            /*Parágrafo segundo*/
            Paragraph parágrafo2= new Paragraph();
            parágrafo2.setAlignment(Element.ALIGN_JUSTIFIED);
            parágrafo2.setFont(f6);
            parágrafo2.add("Caracterização da Madeira e coeficiente de Modificação (De acordo com a Norma NBR 7190/1997).");
            /*construindo tabela 2*/
            
             /*Tabela de Propriedades da Madeira*/
            PdfPTable table2 = new PdfPTable(2);
            /*construindo as celulas da tabela*/
            
            /*primeira linha tabela 2*/
            PdfPCell Classecarre = new PdfPCell(new Phrase("Especificações para Modificação",f4));
            Classecarre.setBackgroundColor(new BaseColor(223,104,4));
            Classecarre.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell tipodemad = new PdfPCell(new Phrase("Madeira",f4));
            tipodemad.setBackgroundColor(new BaseColor(223,104,4));
            tipodemad.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*segunda linha tabela 2*/
            PdfPCell classecarre1 = new PdfPCell(new Phrase("Classe de Carregamento",f5));
            String classefdv = jComboBox10.getSelectedItem().toString();
            PdfPCell classerist12 = new PdfPCell(new Phrase(classefdv,f5));
            classerist12.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*terceira linha tabela 2*/
            PdfPCell resistacom2 = new PdfPCell(new Phrase("Tipo de Madeira",f5));
            String resistac = jComboBox9.getSelectedItem().toString();
            PdfPCell comprdf2 = new PdfPCell(new Phrase(resistac,f5));
            comprdf2.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*quarta linha tabela 2*/
            PdfPCell propriedad12 = new PdfPCell(new Phrase("Categoria da Madeira",f5));
            String propd = jComboBox15.getSelectedItem().toString();
            PdfPCell dfdfdfd2 = new PdfPCell(new Phrase(propd,f5));
            dfdfdfd2.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*quinta linha tabela 2*/
            PdfPCell propriedad22 = new PdfPCell(new Phrase("Classe de Umidade da Madeira",f5));
            String propd1 = jComboBox13.getSelectedItem().toString();
            PdfPCell propriedad32= new PdfPCell(new Phrase(propd1,f5));
            propriedad32.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*sexta linha tabela 2*/
            PdfPCell celulaNome22 = new PdfPCell(new Phrase("kmod1",f5));
            PdfPCell celulaSexo22 = new PdfPCell(new Phrase(jLabel38.getText(),f5));
            celulaSexo22.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /* setima linha tabela 2*/
            PdfPCell celulaSexo122 = new PdfPCell(new Phrase("kmod2",f5));
            PdfPCell celulaSexo1212 = new PdfPCell(new Phrase(jLabel39.getText(),f5));
            celulaSexo1212.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*oitava linha tabela 2*/
            PdfPCell densidade12 = new PdfPCell(new Phrase("kmod3",f5));
            PdfPCell densidade22 = new PdfPCell(new Phrase(jLabel40.getText(),f5));
            densidade22.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*nona linha tabela 2*/
            PdfPCell umidade21 = new PdfPCell(new Phrase("kmod = kmod1*kmod2*kmod3",f5));
            PdfPCell umidade22 = new PdfPCell(new Phrase(jLabel41.getText(),f5));
            umidade22.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*adicionando as celulas na tabela 2*/
            float columnWidth1[]={300f,100f};
            table2.setWidthPercentage(70);
            
            table2.addCell(Classecarre);
            table2.addCell(tipodemad);
            table2.addCell(classecarre1);
            table2.addCell(classerist12);
            table2.addCell(resistacom2);
            table2.addCell(comprdf2);
            table2.addCell(propriedad12);
            table2.addCell(dfdfdfd2);
            table2.addCell(propriedad22);
            table2.addCell(propriedad32);
            table2.addCell(celulaNome22);
            table2.addCell(celulaSexo22);
            table2.addCell(celulaSexo122);
            table2.addCell(celulaSexo1212);
            table2.addCell(densidade12);
            table2.addCell(densidade22);
            table2.addCell(umidade21);
            table2.addCell(umidade22);
            
            /*terceira parte do memorial*/
            /*Parágrafo terceira*/
            Paragraph parágrafo3= new Paragraph();
            parágrafo3.setAlignment(Element.ALIGN_JUSTIFIED);
            parágrafo3.setFont(f6);
            parágrafo3.add("Dimensões das Peças de Madeira.");
            
            /*construindo tabela 3*/
            
             /*Tabela de peças de madeira*/
            PdfPTable table3 = new PdfPTable(2);
            /*construindo as celulas da tabela*/
            
            /*primeira linha tabela 3*/
            PdfPCell Classecarre3 = new PdfPCell(new Phrase("Peças de Madeira",f4));
            Classecarre3.setBackgroundColor(new BaseColor(223,104,4));
            Classecarre3.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell tipodemad53 = new PdfPCell(new Phrase("Madeira",f4));
            tipodemad53.setBackgroundColor(new BaseColor(223,104,4));
            tipodemad53.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*segunda linha tabela 3*/
            
            PdfPCell classecarre13 = new PdfPCell(new Phrase("t1 (espessura da peça 1)",f5));
            PdfPCell classerist123 = new PdfPCell(new Phrase(espessurat1.getText()+" cm",f5));
            classerist123.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*terceira linha tabela 3*/
            PdfPCell resistacom23 = new PdfPCell(new Phrase("t2 (espessura da peça do meio 2)",f5));
            PdfPCell comprdf23 = new PdfPCell(new Phrase(espessurat2.getText()+" cm",f5));
            comprdf23.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*sexta linha tabela 3*/
            PdfPCell celulaNome223 = new PdfPCell(new Phrase("Comprimento de União dos Elementos.",f5));
            PdfPCell celulaSexo223 = new PdfPCell(new Phrase(compr.getText()+" cm",f5));
            celulaSexo223.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /* setima linha tabela 3*/
            PdfPCell celulaSexo1223 = new PdfPCell(new Phrase("Largura das Peças de Madeira",f5));
            PdfPCell celulaSexo12123 = new PdfPCell(new Phrase(larguralig.getText()+" cm",f5));
            celulaSexo12123.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*oitava linha tabela */
            PdfPCell densidade123 = new PdfPCell(new Phrase("Ângulo entre elemento 2 e os demais.",f5));
            PdfPCell densidade223 = new PdfPCell(new Phrase(jLabel58.getText(),f5));
            densidade223.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            
            /*adicionando as celulas na tabela 3*/
            float columnWidth3[]={300f,100f};
            table3.setWidthPercentage(50);
            table3.setTotalWidth(columnWidth1);
            table3.addCell(Classecarre3);
            table3.addCell(tipodemad53);
            table3.addCell(classecarre13);
            table3.addCell(classerist123);
            table3.addCell(resistacom23);
            table3.addCell(comprdf23);
            table3.addCell(celulaNome223);
            table3.addCell(celulaSexo223);
            table3.addCell(celulaSexo1223);
            table3.addCell(celulaSexo12123);
            table3.addCell(densidade123);
            table3.addCell(densidade223);

               /*Quarta parte do memorial*/
            /*Parágrafo quarto*/
            Paragraph parágrafo4= new Paragraph();
            parágrafo4.setAlignment(Element.ALIGN_JUSTIFIED);
            parágrafo4.setFont(f6);
            parágrafo4.add("Combinação de Ações. (Combinação Normal, Desfavorável).");
            
            /*construindo tabela 4*/
            
             /*Tabela de peças de madeira*/
            PdfPTable table4 = new PdfPTable(3);
            /*construindo as celulas da tabela*/
            
            /*primeira linha tabela 4*/
            PdfPCell Classecarre34 = new PdfPCell(new Phrase("Ações",f4));
            Classecarre34.setHorizontalAlignment(Element.ALIGN_CENTER);
            Classecarre34.setBackgroundColor(new BaseColor(223,104,4));
            PdfPCell tipodemad534 = new PdfPCell(new Phrase("Característica",f4));
            tipodemad534.setHorizontalAlignment(Element.ALIGN_CENTER);
            tipodemad534.setBackgroundColor(new BaseColor(223,104,4));
            PdfPCell classecarre134 = new PdfPCell(new Phrase("Valor(kN)",f4));
            classecarre134.setHorizontalAlignment(Element.ALIGN_CENTER);
            classecarre134.setBackgroundColor(new BaseColor(223,104,4));
            
            /*segunda linha tabela 4*/
            PdfPCell classerist1234 = new PdfPCell(new Phrase("Ações Permanentes",f5));
            classerist1234.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell tipodemad5341 = new PdfPCell(new Phrase(Tipodevariabilidade.getSelectedItem().toString(),f5));
            tipodemad5341.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell classecarre1341 = new PdfPCell(new Phrase(permanente.getText(),f5));
            classecarre1341.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*terceira linha tabela 4*/
            PdfPCell resistacom234 = new PdfPCell(new Phrase("Ações Variáveis (Sobrecarga)",f5));
            PdfPCell comprdf234 = new PdfPCell(new Phrase(variavel.getSelectedItem().toString(),f5));
            comprdf234.setHorizontalAlignment(Element.ALIGN_CENTER);
             PdfPCell propriedad1234 = new PdfPCell(new Phrase(sobrecarga.getText(),f5));
             propriedad1234.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*quarta linha tabela 4*/
            PdfPCell dfdfdfd234 = new PdfPCell(new Phrase("Vento",f5));
            dfdfdfd234.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell propriedad2234 = new PdfPCell(new Phrase(variavel.getSelectedItem().toString(),f5));
            PdfPCell propriedad3234= new PdfPCell(new Phrase(vento.getText(),f5));
            propriedad3234.setHorizontalAlignment(Element.ALIGN_CENTER);
         
             /*quarta linha tabela 4*/
            PdfPCell lin4col1tab4 = new PdfPCell(new Phrase("Força Majorada pela Combinação Sobrecarga Ação Variável Principal",f5));
            lin4col1tab4.setColspan(2);
            lin4col1tab4.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell lin4col2tab4 = new PdfPCell(new Phrase(jLabel42.getText()+" kN",f5));
            lin4col2tab4.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*quinta linha tabela 4*/
            PdfPCell lin5col1tab4 = new PdfPCell(new Phrase("Força Majorada pela Combinação Vento como Ação Variável Principal",f5));
            lin5col1tab4.setColspan(2);
            lin5col1tab4.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell lin5col2tab4 = new PdfPCell(new Phrase(jLabel43.getText()+" kN",f5));
            lin5col2tab4.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*adicionando as celulas na tabela 4*/
            float columnWidth4[]={100f,100f,100f};
            table4.setTotalWidth(columnWidth4);
            table4.addCell(Classecarre34);
            table4.addCell(tipodemad534);
            table4.addCell(classecarre134);
            table4.addCell(classerist1234);
            table4.addCell(tipodemad5341);
            table4.addCell(classecarre1341 );
            table4.addCell(resistacom234);
            table4.addCell(comprdf234);
            table4.addCell(propriedad1234);
            table4.addCell(dfdfdfd234);
            table4.addCell(propriedad2234);
            table4.addCell(propriedad3234);
            table4.addCell(lin4col1tab4);
            table4.addCell(lin4col2tab4);
            table4.addCell(lin5col1tab4);
            table4.addCell(lin5col2tab4);

               /*Quinta parte do memorial*/
            /*Parágrafo Quinto*/
            Paragraph parágrafo5= new Paragraph();
            parágrafo5.setAlignment(Element.ALIGN_JUSTIFIED);
            parágrafo5.setFont(f6);
            parágrafo5.add("Fatores de Utilização");
            
            /*construindo tabela 5*/
            
             /*Tabela de peças de madeira*/
            PdfPTable table5 = new PdfPTable(2);
            /*construindo as celulas da tabela*/
            
            /*primeira linha tabela 5*/
            PdfPCell Classecarre35 = new PdfPCell(new Phrase("Fatores de Utilização",f4));
            Classecarre35.setHorizontalAlignment(Element.ALIGN_CENTER);
            Classecarre35.setBackgroundColor(new BaseColor(223,104,4));
            PdfPCell tipodemad535 = new PdfPCell(new Phrase("Adotado",f4));
            tipodemad535.setHorizontalAlignment(Element.ALIGN_CENTER);
            tipodemad535.setBackgroundColor(new BaseColor(223,104,4));
            
            /*segunda linha tabela 5*/
            PdfPCell classecarre135 = new PdfPCell(new Phrase("Ações em Estruturas Correntes",f5));
            PdfPCell classerist1235 = new PdfPCell(new Phrase(acoescorrentes.getSelectedItem().toString(),f5));
    
            /*terceira linha tabela 5*/
            PdfPCell resistacom235 = new PdfPCell(new Phrase("Cargas Acidentais dos Edifícios ",f5));
        /*Cargas acidentais dos edifícios*/
        String h1 = null;
        String aci = cargasacid.getSelectedItem().toString();
        if("Não há pred. de Equipamentos Fixos nem de el. concentr".equals(aci)){
            h1 = "Locais em que não há predominância de pesos de equipamentos fixos,ou de elevadas concentrações de pessoas";
        }
        if("Há pred. de Equipamentos Fixos ou de elev. Concentração.".equals(aci)){
            h1 = "Locais onde há predominância de pesos de equipamentos fixos, ou de elevadas concentrações de pessoas";
        }
        if("Bibliotecas, arquivos, oficinas ou garagens".equals(aci)){
            h1 = "Bibliotecas, arquivos, oficinas e garagens";
        }
            PdfPCell comprdf235 = new PdfPCell(new Phrase(h1,f5));
            
            /*adicionando as celulas na tabela 5*/
            table5.addCell(Classecarre35);
            table5.addCell(tipodemad535);
            table5.addCell(classecarre135);
            table5.addCell(classerist1235);
            table5.addCell(resistacom235);
            table5.addCell(comprdf235);
         
               /*Sexta parte do memorial*/
            /*Parágrafo quarto*/
            Paragraph parágrafo6= new Paragraph();
            parágrafo6.setAlignment(Element.ALIGN_JUSTIFIED);
            parágrafo6.setFont(f6);
            parágrafo6.add("Parâmetros de Cálculo da Ligação.");
            
            /*construindo tabela 6*/
            
             /*Tabela de peças de madeira*/
            PdfPTable table6 = new PdfPTable(3);
            /*construindo as celulas da tabela 6*/
            
             /*primeira linha tabela 6*/
            PdfPCell Classecarre361 = new PdfPCell(new Phrase("Parâmetros de Cálculo para a Madeira",f4));
            Classecarre361.setRowspan(4);
            try {
                 com.itextpdf.text.Image hei = com.itextpdf.text.Image.getInstance("C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\imagemtexturamadeira.jpg"); 
                 
                 Classecarre361.setImage(hei);
                 Classecarre361.setVerticalAlignment(Element.ALIGN_MIDDLE);
                 Classecarre361.setHorizontalAlignment(Element.ALIGN_CENTER);
                 
             } catch (BadElementException | IOException ex) {
                 Logger.getLogger(TelaCorteSimples10.class.getName()).log(Level.SEVERE, null, ex);
             }
            Classecarre361.setHorizontalAlignment(Element.ALIGN_CENTER);
             
            /*primeira linha tabela 6*/
            PdfPCell Classecarre36 = new PdfPCell(new Phrase("Parâmetros de Resistência para a Madeira",f4));
            Classecarre36.setBackgroundColor(new BaseColor(223,104,4));
            Classecarre36.setColspan(2);
            Classecarre36.setHorizontalAlignment(Element.ALIGN_CENTER);
            
           
            
            /*segunda linha tabela 6*/
            PdfPCell classecarre136 = new PdfPCell(new Phrase("Resistência de Cálculo da Compressão paralela as fibras (fc0d).",f5));
            PdfPCell classerist1236 = new PdfPCell(new Phrase(jLabel49.getText()+" kN/cm²",f5));
            classerist1236.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*terceira linha tabela 6*/
            PdfPCell resistacom236 = new PdfPCell(new Phrase("Resistência de Cálculo Compressão normal as fibras (fc90d).",f5));
            PdfPCell comprdf236 = new PdfPCell(new Phrase(jLabel95.getText()+" kN/cm²",f5));
            comprdf236.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*quarta linha tabela 6*/
            PdfPCell propriedad1236 = new PdfPCell(new Phrase("Resistência de Cálculo Cisalhamento paralelo as fibras (fv0d). ",f5));
            PdfPCell dfdfdfd236 = new PdfPCell(new Phrase(jLabel69.getText()+" kN/cm²",f5));
            dfdfdfd236.setHorizontalAlignment(Element.ALIGN_CENTER);        
            
            /*adicionadno imagem*/
            
            /*adicionando as celulas na tabela 6*/
            float columnWidth6[] = {30,120,60};
            table6.setWidths(columnWidth6);
            table6.setWidthPercentage(80);
            table6.addCell(Classecarre361);
            table6.addCell(Classecarre36);
            table6.addCell(classecarre136);
            table6.addCell(classerist1236);
            table6.addCell(resistacom236);
            table6.addCell(comprdf236);
            table6.addCell(propriedad1236);
            table6.addCell(dfdfdfd236);
            
               /*construindo tabela 7*/
            
             /*Tabela de peças de madeira*/
            PdfPTable table7 = new PdfPTable(3);
            /*construindo as celulas da tabela 6*/
            
            PdfPCell Classecarre3671 = new PdfPCell(new Phrase("Parâmetros de Cálculo para o Prego",f4));
            Classecarre3671.setRowspan(7);
            Classecarre3671.setHorizontalAlignment(Element.ALIGN_CENTER);
            try {
                 com.itextpdf.text.Image hei1 = com.itextpdf.text.Image.getInstance("C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\pregoimagem.jpg"); 
                 
                 Classecarre3671.setImage(hei1);
                 Classecarre3671.setVerticalAlignment(Element.ALIGN_MIDDLE);
                 Classecarre3671.setHorizontalAlignment(Element.ALIGN_CENTER);
                 
             } catch (BadElementException | IOException ex) {
                 Logger.getLogger(TelaCorteSimples10.class.getName()).log(Level.SEVERE, null, ex);
             }
            /*primeira linha tabela 7*/
            PdfPCell Classecarre367 = new PdfPCell(new Phrase("Parâmetros de Cálculo para o Prego",f4));
            Classecarre367.setBackgroundColor(new BaseColor(223,104,4));
            Classecarre367.setColspan(2);
            Classecarre367.setHorizontalAlignment(Element.ALIGN_CENTER);
           
            
            /*segunda linha tabela 7*/
            PdfPCell classecarre1367 = new PdfPCell(new Phrase("Diâmetro do Prego",f5));
            PdfPCell classerist12367 = new PdfPCell(new Phrase(diametroprego.getText()+" mm",f5));
            classerist12367.setHorizontalAlignment(Element.ALIGN_CENTER);
            
             /*quarta linha tabela 7*/
            PdfPCell propriedad12367 = new PdfPCell(new Phrase("Bitola",f5));
            PdfPCell dfdfdfd2367 = new PdfPCell(new Phrase(Bitola.getText()+(" mm x mm"),f5));
            dfdfdfd2367.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*quarta linha tabela 7*/
            PdfPCell propriedadkl = new PdfPCell(new Phrase("Penetração Mínima",f5));
            PdfPCell dfd = new PdfPCell(new Phrase(penmini.getText()+" mm",f5));
            dfd.setHorizontalAlignment(Element.ALIGN_CENTER);
            /*terceira linha tabela 7*/
            
            /*quarta linha tabela 7*/
            PdfPCell propriedadkp = new PdfPCell(new Phrase("Comprimento do Prego",f5));
            PdfPCell dfd23 = new PdfPCell(new Phrase(comprprego.getText()+" mm",f5));
            dfd23.setHorizontalAlignment(Element.ALIGN_CENTER);
            
         
            PdfPCell resi = new PdfPCell(new Phrase("Alfae",f5));
            PdfPCell compr34 = new PdfPCell(new Phrase(jLabel47.getText(),f5));
            compr34.setHorizontalAlignment(Element.ALIGN_CENTER);
            
             PdfPCell resi20 = new PdfPCell(new Phrase("Resistência do Prego",f5));
            PdfPCell compr3420 = new PdfPCell(new Phrase("600 MPA",f5));
            compr3420.setHorizontalAlignment(Element.ALIGN_CENTER);
          
            /*adicionando as celulas na tabela 7*/
            float columnWidth7[] = {30,120,30};
            table7.setWidths(columnWidth7);
            table7.setWidthPercentage(80);
            table7.addCell(Classecarre3671);
            table7.addCell(Classecarre367);
            table7.addCell(classecarre1367);
            table7.addCell(classerist12367);
            table7.addCell(propriedad12367);
            table7.addCell(dfdfdfd2367);
            table7.addCell(propriedadkl);
            table7.addCell(dfd);
            table7.addCell(propriedadkp);
            table7.addCell(dfd23);
            table7.addCell(resi);
            table7.addCell(compr34);
            table7.addCell(resi20);
            table7.addCell(compr3420);

            
                /*construindo tabela 8*/
            
             /*Tabela de peças de madeira*/
            PdfPTable table8 = new PdfPTable(2);
            /*construindo as celulas da tabela 6*/
            
             
            /*primeira linha tabela 8*/
            PdfPCell Classecarre3678 = new PdfPCell(new Phrase("Resistência para embutimento na Madeira",f4));
            Classecarre3678.setBackgroundColor(new BaseColor(223,104,4));
            Classecarre3678.setColspan(2);
            Classecarre3678.setHorizontalAlignment(Element.ALIGN_CENTER);
           
            /*linha 1 da tabela 8*/
            PdfPCell lin1col1tab8 = new PdfPCell(new Phrase("Resistência ao embutimento da Madeira paralelo as fibras (fe0d)",f5));
            PdfPCell lin1col2tab8 = new PdfPCell(new Phrase(jLabel96.getText()+" kN/cm²",f5));
            lin1col2tab8 .setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*linha 2 tabela 8*/
            PdfPCell classecarre13678 = new PdfPCell(new Phrase("Resistência ao embutimento da Madeira normal as fibras (fe90d)",f5));
            PdfPCell classerist123678 = new PdfPCell(new Phrase(jLabel97.getText()+" kN/cm²",f5));
            classerist123678.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*linha 3 tabela 8*/
            PdfPCell lin3col1tab8  = new PdfPCell(new Phrase("Resistência ao embutimento da Madeira paralelo as fibras (fe"+jLabel58.getText()+"d",f5));
            PdfPCell lin3col2tab8  = new PdfPCell(new Phrase(jLabel50.getText()+" kN/cm²",f5));
            lin3col2tab8 .setHorizontalAlignment(Element.ALIGN_CENTER);
                    
            
            /*adicionando as celulas na tabela 7*/
            float columnWidth8[]={100f,100f};
            table8.setTotalWidth(columnWidth1);
            table8.addCell(Classecarre3678);
            table8.addCell(lin1col1tab8);
            table8.addCell(lin1col2tab8);
            table8.addCell(classecarre13678);
            table8.addCell(classerist123678);
            table8.addCell(lin3col1tab8);
            table8.addCell(lin3col2tab8);
            
            /*mudar a cor das células*/
           
           
            /*construindo tabela 9*/
            
             /*Tabela de peças de madeira*/
            PdfPTable table9 = new PdfPTable(2);
            /*construindo as celulas da tabela 6*/
            
            
            /*primeira linha tabela 9*/
            PdfPCell Classecarre36789 = new PdfPCell(new Phrase("Embutimento na Madeira",f4));
            Classecarre36789.setColspan(2);
            Classecarre36789.setBackgroundColor(new BaseColor(223,104,4));
            Classecarre36789.setHorizontalAlignment(Element.ALIGN_CENTER);
           
            
            /*segunda linha tabela 9*/
            PdfPCell classecarre136789 = new PdfPCell(new Phrase("Beta",f5));
            classecarre136789.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell classerist1236789 = new PdfPCell(new Phrase(jLabel52.getText(),f5));
            classerist1236789.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*terceira linha tabela 9*/
            PdfPCell resistacom236789 = new PdfPCell(new Phrase("Beta Limite",f5));
            resistacom236789.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell comprdf236789 = new PdfPCell(new Phrase(jLabel53.getText(),f5));
            comprdf236789.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            PdfPCell resista = new PdfPCell(new Phrase("Resistência de um corte",f5));
            resista.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            PdfPCell compr12= new PdfPCell(new Phrase(jLabel74.getText()+" kN/cm²",f5));
            compr12.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*quinta linha tabela 9*/
            PdfPCell dfdfdfd236789 = new PdfPCell(new Phrase(jLabel65.getText().toString(),f5));
            dfdfdfd236789.setColspan(2);
            dfdfdfd236789.setHorizontalAlignment(Element.ALIGN_CENTER);        
            if(("Beta Limite > Beta").equals(jLabel65.getText().toString())){
                dfdfdfd236789.setBackgroundColor(BaseColor.RED);
            }
            
            /*adicionando as celulas na tabela 9*/
            table9.setHorizontalAlignment(Element.ALIGN_CENTER);
            table9.setWidthPercentage(85);
            table9.addCell(Classecarre36789);
            table9.addCell(classecarre136789);
            table9.addCell(classerist1236789);
            table9.addCell(resistacom236789);
            table9.addCell(comprdf236789);
            table9.addCell(resista);
            table9.addCell(compr12);
            table9.addCell(dfdfdfd236789);
            
        double disthorimin;
        String disthorimin1 = null;
        double distvermin;
        String distvermin1 = null;
        double disthorbor;
        String disthorbor1 = null;
        double distvercima;
        String distvercima1 = null;
        double distverbaixo;
        String distverbaixo1 = null;
        String diametropara1 = diametroprego.getText().toString();
        double diametropara = Double.parseDouble(diametropara1);
        if(ligaçãoparafusada1.isSelected() && ligprego.isSelected()){
        if(am0.isSelected() || angdif.isSelected()){
        if("Tração".equals(jLabel20.getText().toString())){
            /*espaçamento mínimo entre pregos na horizontal 6 pregos e cavilhas e 4 parafuso*/
            disthorimin = 6*diametropara/10;
            disthorimin1 = String.valueOf(disthorimin);
            /*espaçamento minimo entre pregos na vertical*/
            distvermin = 3*diametropara/10;
            distvermin1 = String.valueOf(distvermin);
            /*espaçamento borda horizontal*/
            disthorbor = 7*diametropara/10;
            disthorbor1 = String.valueOf(disthorbor);
            /*espaçamento borda vertical em cima*/
            distvercima = 1.5*diametropara/10;
            distvercima1= String.valueOf(distvercima);
            /*espaçamento borda vertical em baixo*/
            distverbaixo = 1.5*diametropara/10;
            distverbaixo1= String.valueOf(distverbaixo);

        }
        if("Compressão".equals(jLabel20.getText().toString())){
             /*espaçamento mínimo entre pregos na horizontal 6 pregos e cavilhas e 4 parafuso*/
            disthorimin = 6*diametropara/10;
            disthorimin1 = String.valueOf(disthorimin);
            /*espaçamento minimo entre pregos na vertical*/
            distvermin = 3*diametropara/10;
            distvermin1 = String.valueOf(distvermin);
            /*espaçamento borda horizontal*/
            disthorbor = 4*diametropara/10;
            disthorbor1= String.valueOf(disthorbor);
            /*espaçamento borda vertical em cima*/
            distvercima = 1.5*diametropara/10;
            distvercima1= String.valueOf(distvercima);
            /*espaçamento borda vertical em baixo*/
            distverbaixo = 1.5*diametropara/10;
            distverbaixo1= String.valueOf(distverbaixo);
        }
        }
        if(ang90.isSelected()){
             if("Tração".equals(jLabel20.getText().toString())){
            /*espaçamento mínimo entre pregos na horizontal 6 pregos e cavilhas e 4 parafuso*/
            disthorimin = 3*diametropara/10;
            disthorimin1 = String.valueOf(disthorimin);
            /*espaçamento minimo entre pregos na vertical*/
            distvermin = 6*diametropara/10;
            distvermin1 = String.valueOf(distvermin);
            /*espaçamento borda horizontal*/
            disthorbor = 1.5*diametropara/10;
            disthorbor1= String.valueOf(disthorbor);
            /*espaçamento borda vertical em cima*/
            distvercima = 4*diametropara/10;
            distvercima1= String.valueOf(distvercima);
            /*espaçamento borda vertical em baixo*/
            distverbaixo = 1.5*diametropara/10;
            distverbaixo1 = String.valueOf(distverbaixo);
     
        }
        if("Compressão".equals(jLabel20.getText().toString())){
             /*espaçamento mínimo entre pregos na horizontal 6 pregos e cavilhas e 4 parafuso*/
            disthorimin = 3*diametropara/10;
            disthorimin1 = String.valueOf(disthorimin);
            /*espaçamento minimo entre pregos na vertical*/
            distvermin = 6*diametropara/10;
            distvermin1 = String.valueOf(distvermin);
            /*espaçamento borda horizontal*/
            disthorbor = 1.5*diametropara/10;
            disthorbor1= String.valueOf(disthorbor);
            /*espaçamento borda vertical em cima*/
            distvercima = 1.5*diametropara/10;
            distvercima1= String.valueOf(distvercima);
            /*espaçamento borda vertical em baixo*/
            distverbaixo = 4*diametropara/10;
            distverbaixo1 = String.valueOf(distverbaixo);
        
        }
        }
        }
        
               /*construindo tabela 10*/
            
             /*Tabela de peças de madeira*/
            PdfPTable table10 = new PdfPTable(2);
            /*construindo as celulas da tabela 6*/
            
             
            /*primeira linha tabela 10*/
            PdfPCell Classecarre367891 = new PdfPCell(new Phrase("Flexão do Pino",f4));
            Classecarre367891.setColspan(2);
            Classecarre367891.setBackgroundColor(new BaseColor(223,104,4));
            Classecarre367891.setHorizontalAlignment(Element.ALIGN_CENTER);
           
            
            /*segunda linha tabela 10*/
            PdfPCell classecarre1367891 = new PdfPCell(new Phrase("Beta",f5));
            classecarre1367891.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell classerist12367891 = new PdfPCell(new Phrase(jLabel52.getText(),f5));
            classerist12367891.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*terceira linha tabela 10*/
            PdfPCell resistacom2367891 = new PdfPCell(new Phrase("Beta Limite",f5));
            resistacom2367891.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell comprdf2367891 = new PdfPCell(new Phrase(jLabel53.getText(),f5));
            comprdf2367891.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            PdfPCell resistacom23678912 = new PdfPCell(new Phrase("Resistência de um Corte",f5));
            resistacom23678912.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell comprdf23678912 = new PdfPCell(new Phrase(jLabel73.getText()+"kN/cm²",f5));
            comprdf23678912.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*quarta linha tabela 10*/
            PdfPCell dfdfdfd2367891 = new PdfPCell(new Phrase(jLabel65.getText().toString(),f5));
            dfdfdfd2367891.setColspan(2);
            dfdfdfd2367891.setHorizontalAlignment(Element.ALIGN_CENTER);  
            
            if(("Beta Limite < Beta").equals(jLabel65.getText().toString())){
                dfdfdfd2367891.setBackgroundColor(BaseColor.RED);
            }
            
            
            
            /*adicionando as celulas na tabela 10*/
            float coluna [] = {10,10};
            table10.setWidthPercentage(85);
            table10.setHorizontalAlignment(Element.ALIGN_CENTER);
            table10.addCell(Classecarre367891);
            table10.addCell(classecarre1367891);
            table10.addCell(classerist12367891);
            table10.addCell(resistacom2367891);
            table10.addCell(comprdf2367891);
            table10.addCell(resistacom23678912);
            table10.addCell(comprdf23678912);
            table10.addCell(dfdfdfd2367891);
            
             /*Tabela de Propriedades da Madeira*/
            PdfPTable table11 = new PdfPTable(2);
            /*construindo as celulas da tabela*/
            
            PdfPCell propriedad4 = new PdfPCell(new Phrase("Resultados Finais",f4));
            propriedad4.setColspan(2);
            propriedad4.setHorizontalAlignment(Element.ALIGN_CENTER);
            propriedad4.setBackgroundColor(new BaseColor(223,104,4));
            PdfPCell categoria4 = new PdfPCell(new Phrase("Força Solitante Majorada ",f5));
            categoria4.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell classerist4 = new PdfPCell(new Phrase(jLabel75.getText()+jLabel76.getText(),f5));
            classerist4.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell classerist14 = new PdfPCell(new Phrase("Esforço Solicitante",f5));
            classerist14.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell resistacom4 = new PdfPCell(new Phrase(jLabel20.getText(),f5));
            resistacom4.setHorizontalAlignment(Element.ALIGN_CENTER);
            double numeprego = Double.parseDouble(jLabel55.getText().toString());
            String hid;
            if (numeprego<2){
                hid = "2";
            }else{
                hid = jLabel55.getText();
            }
            PdfPCell comprdf4 = new PdfPCell(new Phrase(hid,f5));
            comprdf4.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell propriedad14 = new PdfPCell(new Phrase("Número de Pinos Mínimos necessários",f5));
            propriedad14.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell dfdfdfd4 = new PdfPCell(new Phrase("Espaçamento Mínimo entre Pino na Horizontal",f5));
            dfdfdfd4.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell propriedad24 = new PdfPCell(new Phrase(disthorimin1+" cm",f5));
            propriedad24.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell propriedad34= new PdfPCell(new Phrase("Espaçamento Mínimo entre Pinos na Vertical",f5));
            propriedad34.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell celulaNome24 = new PdfPCell(new Phrase(distvermin1+" cm",f5));
            celulaNome24.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell celulaSexo24 = new PdfPCell(new Phrase("Espaçamento Mínimo do Pino até a Borda Horizontal",f5));
            celulaSexo24.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell celulaSexo124 = new PdfPCell(new Phrase(disthorbor1+" cm",f5));
            celulaSexo124.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell umidade24 = new PdfPCell(new Phrase("Espaçamento mínimo do Pino até a Borda Vertical em cima",f5));
            umidade24.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell umidade242 = new PdfPCell(new Phrase(distvercima1+" cm",f5));
            umidade242.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell umidade241 = new PdfPCell(new Phrase("Espaçamento mínimo do Pino até a Borda Vertical em baixo",f5));
            umidade241.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell umidade244 = new PdfPCell(new Phrase(distverbaixo1+" cm",f5));
            umidade244.setHorizontalAlignment(Element.ALIGN_CENTER);
            /*adicionando as celulas na tabela*/
            float columnWidth11[]={75f,25f};
            table11.setTotalWidth(columnWidth11);
            table11.setWidthPercentage(100);
            table11.addCell(propriedad4);
            table11.addCell(categoria4);
            table11.addCell(classerist4);
            table11.addCell(classerist14);
            table11.addCell(resistacom4);
            table11.addCell(propriedad14);
            table11.addCell(comprdf4);
            table11.addCell(dfdfdfd4);
            table11.addCell(propriedad24);
            table11.addCell(propriedad34);
            table11.addCell(celulaNome24);
            table11.addCell(celulaSexo24);
            table11.addCell(celulaSexo124);
            table11.addCell(umidade24);
            table11.addCell(umidade242);
            table11.addCell(umidade241);
            table11.addCell(umidade244);
            /*terminar a tabela*/
        
            /*terminar a tabela*/
            
            /*incluindo items no documento*/
            documento.add(titulo);
            documento.add(espaçamento1);
            String imagemcorte = null;
            if(angdif.isSelected()){
                imagemcorte = "C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\imagemcortesimplesincl.JPG";
            }
            if(ang90.isSelected()){
                 imagemcorte = "C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\Imagemcortesimples90.JPG";
            }
            if(am0.isSelected()){
                 imagemcorte = "C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\imagemcortesimples0.JPG";
            }
            try {
                 com.itextpdf.text.Image hei = com.itextpdf.text.Image.getInstance(imagemcorte); 
                 hei.scaleAbsolute(300,150);
              
                 float x = (PageSize.A4.getWidth()-hei.getScaledWidth())/2;
                 hei.setAlignment((int) x);
                 documento.add(hei);
                 
             } catch (BadElementException | IOException ex) {
                 Logger.getLogger(TelaCorteSimples10.class.getName()).log(Level.SEVERE, null, ex);
             }
             try {
                 com.itextpdf.text.Image heip = com.itextpdf.text.Image.getInstance("C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\Imagem1.png"); 
                 heip.setAbsolutePosition(500, TOP_ALIGNMENT);
                 heip.scaleAbsoluteHeight(PageSize.A4.getHeight()/2);
                 heip.scaleAbsoluteWidth(100);
                 heip.setAlignment(Element.ALIGN_RIGHT);
                 documento.add(heip);
                 
             } catch (BadElementException | IOException ex) {
                 Logger.getLogger(TelaCorteSimples10.class.getName()).log(Level.SEVERE, null, ex);
             }
              try {
                 com.itextpdf.text.Image heip = com.itextpdf.text.Image.getInstance("C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\Imagem1.png"); 
                 heip.setRotationDegrees(180);
                 heip.setAbsolutePosition(0,PageSize.A4.getHeight()/2);
                 heip.scaleAbsoluteHeight(PageSize.A4.getHeight()/2);
                 heip.scaleAbsoluteWidth(100);
                
                 documento.add(heip);
                 
             } catch (BadElementException | IOException ex) {
                 Logger.getLogger(TelaCorteSimples10.class.getName()).log(Level.SEVERE, null, ex);
             }
            parágrafo1.setAlignment(Element.ALIGN_CENTER);
            documento.add(parágrafo1);
            documento.add(espaçamento1);
            documento.add(table1);
            documento.add(espaçamento1);
            parágrafo2.setAlignment(Element.ALIGN_CENTER);
            documento.add(parágrafo2);
            documento.add(espaçamento1);
            documento.add(table2);
            documento.add(espaçamento1);
            parágrafo3.setAlignment(Element.ALIGN_CENTER);
            documento.add(parágrafo3);
            documento.add(espaçamento1);
            documento.add(table3);
            documento.add(espaçamento1);
            documento.add(espaçamento1);
            parágrafo4.setAlignment(Element.ALIGN_CENTER);
            documento.add(parágrafo4);
            documento.add(espaçamento1);
            documento.add(table4);
            documento.add(espaçamento1);
            documento.add(table5);
              try {
                 com.itextpdf.text.Image heip = com.itextpdf.text.Image.getInstance("C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\Imagem1.png"); 
                 heip.setAbsolutePosition(500, TOP_ALIGNMENT);
                 heip.scaleAbsoluteHeight(PageSize.A4.getHeight()/2);
                 heip.scaleAbsoluteWidth(100);
                 heip.setAlignment(Element.ALIGN_RIGHT);
                 documento.add(heip);
                 
             } catch (BadElementException | IOException ex) {
                 Logger.getLogger(TelaCorteSimples10.class.getName()).log(Level.SEVERE, null, ex);
             }
              try {
                 com.itextpdf.text.Image heip = com.itextpdf.text.Image.getInstance("C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\Imagem1.png"); 
                 heip.setRotationDegrees(180);
                 heip.setAbsolutePosition(0,PageSize.A4.getHeight()/2);
                 heip.scaleAbsoluteHeight(PageSize.A4.getHeight()/2);
                 heip.scaleAbsoluteWidth(100);
                
                 documento.add(heip);
                 
             } catch (BadElementException | IOException ex) {
                 Logger.getLogger(TelaCorteSimples10.class.getName()).log(Level.SEVERE, null, ex);
             }
            documento.add(espaçamento1);
            parágrafo6.setAlignment(Element.ALIGN_CENTER);
            documento.add(parágrafo6);
            documento.add(espaçamento1);
            documento.add(table6);
            documento.add(espaçamento1);
            documento.add(table7);
            documento.add(espaçamento1);
            documento.add(table8);
            documento.add(espaçamento1);
            
            if("Beta Limite > Beta".equals(jLabel65.getText())){
            documento.add(table9);
            documento.add(espaçamento1);
            }
            if("Beta Limite < Beta".equals(jLabel65.getText())){
            documento.add(table10);
            documento.add(espaçamento1);
            }
             try {
                 com.itextpdf.text.Image heip = com.itextpdf.text.Image.getInstance("C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\Imagem1.png"); 
                 heip.setAbsolutePosition(500, TOP_ALIGNMENT);
                 heip.scaleAbsoluteHeight(PageSize.A4.getHeight()/2);
                 heip.scaleAbsoluteWidth(100);
                 heip.setAlignment(Element.ALIGN_RIGHT);
                 documento.add(heip);
                 
             } catch (BadElementException | IOException ex) {
                 Logger.getLogger(TelaCorteSimples10.class.getName()).log(Level.SEVERE, null, ex);
             }
              try {
                 com.itextpdf.text.Image heip = com.itextpdf.text.Image.getInstance("C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\Imagem1.png"); 
                 heip.setRotationDegrees(180);
                 heip.setAbsolutePosition(0,PageSize.A4.getHeight()/2);
                 heip.scaleAbsoluteHeight(PageSize.A4.getHeight()/2);
                 heip.scaleAbsoluteWidth(100);
                
                 documento.add(heip);
                 
             } catch (BadElementException | IOException ex) {
                 Logger.getLogger(TelaCorteSimples10.class.getName()).log(Level.SEVERE, null, ex);
             }
            documento.add(table11);
            
                    } catch (FileNotFoundException | DocumentException ex) {
           System.out.println("error");
        }finally{
            documento.close();
        }
        try {
            Desktop.getDesktop().open(new File("Memorial de Cálculo Corte Duplo.pdf"));
        } catch (IOException ex) {
            Logger.getLogger(TelaCorteSimples10.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Document documento = new Document();
        DecimalFormat fe = new DecimalFormat("0.00");
        try {
            PdfWriter.getInstance(documento,new FileOutputStream("Memorial de Cálculo Corte Duplo.pdf"));
            documento.open();
            documento.newPage();
            documento.setPageSize(PageSize.A4);
           
            documento.setMargins(85f, 85f, 85f, 85f);
            documento.addCreator("Matheus Felipe de Oliveira Lemos");
            documento.addTitle("Memorial de Cálculo");
            documento.addCreator("Matheus Felipe de Oliveira Lemos");
            documento.addLanguage("Português");
            documento.addKeywords("Ligações,Madeira,Resistência,Solicitação");
            Font f3 = new Font(Font.FontFamily.TIMES_ROMAN, 14f, Font.BOLD);
            Font f4 = new Font(Font.FontFamily.TIMES_ROMAN, 12f, Font.BOLD);
            f4.setColor(BaseColor.WHITE);
            Font f5 = new Font(Font.FontFamily.TIMES_ROMAN, 12f, Font.NORMAL);
            Font f6 = new Font(Font.FontFamily.TIMES_ROMAN, 12f, Font.BOLD);
            Paragraph titulo = new Paragraph();
            /*Título principal */
            titulo.setFont(f3);
            titulo.setAlignment(Element.ALIGN_CENTER);
            titulo.add("Memorial de Cálculo do Corte Duplo\n");
            /*Parágrafo primeiro*/
            Paragraph parágrafo1= new Paragraph();
            parágrafo1.setAlignment(Element.ALIGN_JUSTIFIED);
            parágrafo1.setFont(f6);
            parágrafo1.add("Características das Propriedades da Madeira (De acordo com a Norma NBR 7190/1997).");
            /*espaçamento 1*/
            Paragraph espaçamento1 = new Paragraph();
            for (int i = 0; i < 20; i++) {
                espaçamento1.add(new Chunk(" "));
            }
            /*espaçamento 2*/
            Paragraph espaçamento2 = new Paragraph();
            for (int i = 0; i < 20; i++) {
                espaçamento2.add(new Chunk(" "));
            }
            /*espaçamento 3*/
            Paragraph espaçamento3 = new Paragraph();
            for (int i = 0; i < 1500; i++) {
                espaçamento3.add(new Chunk(" "));
            }
            /*Tabela de Propriedades da Madeira*/
            PdfPTable table1 = new PdfPTable(2);
            /*construindo as celulas da tabela*/
            String categoria1 = "";
            if (seldico.isSelected()){
                categoria1 = "Dicotiledônea";
            }
            if(selco.isSelected()){
                categoria1 = "Conífera";
            }
            PdfPCell propriedad = new PdfPCell(new Phrase("Propriedade da Madeira",f4));
            propriedad.setHorizontalAlignment(Element.ALIGN_CENTER);
            propriedad.setBackgroundColor(new BaseColor(223,104,4));
            PdfPCell categoria = new PdfPCell(new Phrase(categoria1,f4));
            categoria.setHorizontalAlignment(Element.ALIGN_CENTER);
            categoria.setBackgroundColor(new BaseColor(223,104,4));
            PdfPCell classerist = new PdfPCell(new Phrase("Classe de Resistência",f5));
            PdfPCell classerist1 = new PdfPCell(new Phrase("C"+resfc0k.getText(),f5));
            classerist1.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell resistacom = new PdfPCell(new Phrase("Resistência Característica a Compressão Paralela as fibras.",f5));
            PdfPCell comprdf = new PdfPCell(new Phrase(resfc0k.getText()+" MPa",f5));
            comprdf.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell propriedad1 = new PdfPCell(new Phrase("Resistência Característica a Compressão Normal as fibras.",f5));
            PdfPCell dfdfdfd = new PdfPCell(new Phrase(jLabel77.getText()+" MPa",f5));
            dfdfdfd.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell propriedad2 = new PdfPCell(new Phrase("Resistência Característica ao Cisalhamento Paralelo as fibras",f5));
            PdfPCell propriedad3= new PdfPCell(new Phrase(jLabel78.getText()+" MPa",f5));
            propriedad3.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell celulaNome2 = new PdfPCell(new Phrase("Valor médio do módulo de elasticidade na compressão paralela às fibras",f5));
            PdfPCell celulaSexo2 = new PdfPCell(new Phrase(resecom.getText()+" MPa",f5));
            celulaSexo2 .setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell celulaSexo12 = new PdfPCell(new Phrase("Densidade básica",f5));
            PdfPCell celulaSexo121 = new PdfPCell(new Phrase(jLabel72.getText()+" MPa",f5));
            celulaSexo121.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell densidade1 = new PdfPCell(new Phrase("Densidade aparente",f5));
            PdfPCell densidade2 = new PdfPCell(new Phrase(respapa.getText()+" MPa",f5));
            densidade2.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell umidade = new PdfPCell(new Phrase("Umidade",f5));
            PdfPCell umidade2 = new PdfPCell(new Phrase("12%",f5));
            umidade2.setHorizontalAlignment(Element.ALIGN_CENTER);
            /*adicionando as celulas na tabela*/
            float columnWidth[]={300f,100f};
            table1.setTotalWidth(columnWidth);
            table1.addCell(propriedad);
            table1.addCell(categoria);
            table1.addCell(classerist);
            table1.addCell(classerist1);
            table1.addCell(resistacom );
            table1.addCell(comprdf);
            table1.addCell(propriedad1);
            table1.addCell(dfdfdfd);
            table1.addCell(propriedad2);
            table1.addCell(propriedad3);
            table1.addCell(celulaNome2);
            table1.addCell(celulaSexo2);
            table1.addCell(celulaSexo12);
            table1.addCell(celulaSexo121);
            table1.addCell(densidade1);
            table1.addCell(densidade2);
            table1.addCell(umidade);
            table1.addCell(umidade2);
            /*terminar a tabela*/
            
            /*segunda parte do memorial*/
            /*Parágrafo segundo*/
            Paragraph parágrafo2= new Paragraph();
            parágrafo2.setAlignment(Element.ALIGN_JUSTIFIED);
            parágrafo2.setFont(f6);
            parágrafo2.add("Caracterização da Madeira e coeficiente de Modificação (De acordo com a Norma NBR 7190/1997).");
            /*construindo tabela 2*/
            
             /*Tabela de Propriedades da Madeira*/
            PdfPTable table2 = new PdfPTable(2);
            /*construindo as celulas da tabela*/
            
            /*primeira linha tabela 2*/
            PdfPCell Classecarre = new PdfPCell(new Phrase("Especificações para Modificação",f4));
            Classecarre.setBackgroundColor(new BaseColor(223,104,4));
            Classecarre.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell tipodemad = new PdfPCell(new Phrase("Madeira",f4));
            tipodemad.setBackgroundColor(new BaseColor(223,104,4));
            tipodemad.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*segunda linha tabela 2*/
            PdfPCell classecarre1 = new PdfPCell(new Phrase("Classe de Carregamento",f5));
            String classefdv = jComboBox10.getSelectedItem().toString();
            PdfPCell classerist12 = new PdfPCell(new Phrase(classefdv,f5));
            classerist12.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*terceira linha tabela 2*/
            PdfPCell resistacom2 = new PdfPCell(new Phrase("Tipo de Madeira",f5));
            String resistac = jComboBox9.getSelectedItem().toString();
            PdfPCell comprdf2 = new PdfPCell(new Phrase(resistac,f5));
            comprdf2.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*quarta linha tabela 2*/
            PdfPCell propriedad12 = new PdfPCell(new Phrase("Categoria da Madeira",f5));
            String propd = jComboBox15.getSelectedItem().toString();
            PdfPCell dfdfdfd2 = new PdfPCell(new Phrase(propd,f5));
            dfdfdfd2.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*quinta linha tabela 2*/
            PdfPCell propriedad22 = new PdfPCell(new Phrase("Classe de Umidade da Madeira",f5));
            String propd1 = jComboBox13.getSelectedItem().toString();
            PdfPCell propriedad32= new PdfPCell(new Phrase(propd1,f5));
            propriedad32.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*sexta linha tabela 2*/
            PdfPCell celulaNome22 = new PdfPCell(new Phrase("kmod1",f5));
            PdfPCell celulaSexo22 = new PdfPCell(new Phrase(jLabel21.getText(),f5));
            celulaSexo22.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /* setima linha tabela 2*/
            PdfPCell celulaSexo122 = new PdfPCell(new Phrase("kmod2",f5));
            PdfPCell celulaSexo1212 = new PdfPCell(new Phrase(jLabel22.getText(),f5));
            celulaSexo1212.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*oitava linha tabela 2*/
            PdfPCell densidade12 = new PdfPCell(new Phrase("kmod3",f5));
            PdfPCell densidade22 = new PdfPCell(new Phrase(jLabel23.getText(),f5));
            densidade22.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*nona linha tabela 2*/
            PdfPCell umidade21 = new PdfPCell(new Phrase("kmod = kmod1*kmod2*kmod3",f5));
            PdfPCell umidade22 = new PdfPCell(new Phrase(jLabel24.getText(),f5));
            umidade22.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*adicionando as celulas na tabela 2*/
            float columnWidth1[]={300f,100f};
            table2.setWidthPercentage(70);
            
            table2.addCell(Classecarre);
            table2.addCell(tipodemad);
            table2.addCell(classecarre1);
            table2.addCell(classerist12);
            table2.addCell(resistacom2);
            table2.addCell(comprdf2);
            table2.addCell(propriedad12);
            table2.addCell(dfdfdfd2);
            table2.addCell(propriedad22);
            table2.addCell(propriedad32);
            table2.addCell(celulaNome22);
            table2.addCell(celulaSexo22);
            table2.addCell(celulaSexo122);
            table2.addCell(celulaSexo1212);
            table2.addCell(densidade12);
            table2.addCell(densidade22);
            table2.addCell(umidade21);
            table2.addCell(umidade22);
            
            /*terceira parte do memorial*/
            /*Parágrafo terceira*/
            Paragraph parágrafo3= new Paragraph();
            parágrafo3.setAlignment(Element.ALIGN_JUSTIFIED);
            parágrafo3.setFont(f6);
            parágrafo3.add("Dimensões das Peças de Madeira.");
            
            /*construindo tabela 3*/
            
             /*Tabela de peças de madeira*/
            PdfPTable table3 = new PdfPTable(2);
            /*construindo as celulas da tabela*/
            
            /*primeira linha tabela 3*/
            PdfPCell Classecarre3 = new PdfPCell(new Phrase("Peças de Madeira",f4));
            Classecarre3.setBackgroundColor(new BaseColor(223,104,4));
            Classecarre3.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell tipodemad53 = new PdfPCell(new Phrase("Madeira",f4));
            tipodemad53.setBackgroundColor(new BaseColor(223,104,4));
            tipodemad53.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*segunda linha tabela 3*/
            
            PdfPCell classecarre13 = new PdfPCell(new Phrase("t1 (espessura da peça 1)",f5));
            PdfPCell classerist123 = new PdfPCell(new Phrase(espessurat1.getText()+" cm",f5));
            classerist123.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*terceira linha tabela 3*/
            PdfPCell resistacom23 = new PdfPCell(new Phrase("t2 (espessura da peça do meio 2)",f5));
            PdfPCell comprdf23 = new PdfPCell(new Phrase(espessurat2.getText()+" cm",f5));
            comprdf23.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            
            /*sexta linha tabela 3*/
            PdfPCell celulaNome223 = new PdfPCell(new Phrase("Comprimento de União dos Elementos.",f5));
            PdfPCell celulaSexo223 = new PdfPCell(new Phrase(compr.getText()+" cm",f5));
            celulaSexo223.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /* setima linha tabela 3*/
            PdfPCell celulaSexo1223 = new PdfPCell(new Phrase("Largura das Peças de Madeira",f5));
            PdfPCell celulaSexo12123 = new PdfPCell(new Phrase(larguralig.getText()+" cm",f5));
            celulaSexo12123.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*oitava linha tabela */
            String angulo = null;
            if(ang90.isSelected()){
                angulo = "90";
            }
            if(am0.isSelected()){
                angulo = "0";
            }
            if(angdif.isSelected()){
                angulo = valorangdif.getText().toString();
            }
            PdfPCell densidade123 = new PdfPCell(new Phrase("Ângulo entre elemento 2 e os demais.",f5));
            PdfPCell densidade223 = new PdfPCell(new Phrase(angulo,f5));
            densidade223.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*adicionando as celulas na tabela 3*/
            float columnWidth3[]={300f,100f};
            table3.setWidthPercentage(50);
            table3.setTotalWidth(columnWidth1);
            table3.addCell(Classecarre3);
            table3.addCell(tipodemad53);
            table3.addCell(classecarre13);
            table3.addCell(classerist123);
            table3.addCell(resistacom23);
            table3.addCell(comprdf23);
            table3.addCell(celulaNome223);
            table3.addCell(celulaSexo223);
            table3.addCell(celulaSexo1223);
            table3.addCell(celulaSexo12123);
            table3.addCell(densidade123);
            table3.addCell(densidade223);

               /*Quarta parte do memorial*/
            /*Parágrafo quarto*/
            Paragraph parágrafo4= new Paragraph();
            parágrafo4.setAlignment(Element.ALIGN_JUSTIFIED);
            parágrafo4.setFont(f6);
            parágrafo4.add("Combinação de Ações. (Combinação Normal, Desfavorável).");
            
            /*construindo tabela 4*/
            
             /*Tabela de peças de madeira*/
            PdfPTable table4 = new PdfPTable(3);
            /*construindo as celulas da tabela*/
            
            /*primeira linha tabela 4*/
            PdfPCell Classecarre34 = new PdfPCell(new Phrase("Ações",f4));
            Classecarre34.setHorizontalAlignment(Element.ALIGN_CENTER);
            Classecarre34.setBackgroundColor(new BaseColor(223,104,4));
            PdfPCell tipodemad534 = new PdfPCell(new Phrase("Característica",f4));
            tipodemad534.setHorizontalAlignment(Element.ALIGN_CENTER);
            tipodemad534.setBackgroundColor(new BaseColor(223,104,4));
            PdfPCell classecarre134 = new PdfPCell(new Phrase("Valor(kN)",f4));
            classecarre134.setHorizontalAlignment(Element.ALIGN_CENTER);
            classecarre134.setBackgroundColor(new BaseColor(223,104,4));
            
            /*segunda linha tabela 4*/
            PdfPCell classerist1234 = new PdfPCell(new Phrase("Ações Permanentes",f5));
            classerist1234.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell tipodemad5341 = new PdfPCell(new Phrase(Tipodevariabilidade.getSelectedItem().toString(),f5));
            tipodemad5341.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell classecarre1341 = new PdfPCell(new Phrase(permanente.getText(),f5));
            classecarre1341.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*terceira linha tabela 4*/
            PdfPCell resistacom234 = new PdfPCell(new Phrase("Ações Variáveis (Sobrecarga)",f5));
            resistacom234.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell comprdf234 = new PdfPCell(new Phrase(variavel.getSelectedItem().toString(),f5));
            comprdf234.setHorizontalAlignment(Element.ALIGN_CENTER);
             PdfPCell propriedad1234 = new PdfPCell(new Phrase(sobrecarga.getText(),f5));
             propriedad1234.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*quarta linha tabela 4*/
            PdfPCell dfdfdfd234 = new PdfPCell(new Phrase("Vento",f5));
            dfdfdfd234.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell propriedad2234 = new PdfPCell(new Phrase(variavel.getSelectedItem().toString(),f5));
            propriedad2234.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell propriedad3234= new PdfPCell(new Phrase(vento.getText(),f5));
            propriedad3234.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*quarta linha tabela 4*/
            PdfPCell lin4col1tab4 = new PdfPCell(new Phrase("Força Majorada pela Combinação Sobrecarga Ação Variável Principal",f5));
            lin4col1tab4.setColspan(2);
            lin4col1tab4.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell lin4col2tab4 = new PdfPCell(new Phrase(jLabel18.getText()+" kN",f5));
            lin4col2tab4.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*quinta linha tabela 4*/
            PdfPCell lin5col1tab4 = new PdfPCell(new Phrase("Força Majorada pela Combinação Vento como Ação Variável Principal",f5));
            lin5col1tab4.setColspan(2);
            lin5col1tab4.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell lin5col2tab4 = new PdfPCell(new Phrase(jLabel19.getText()+" kN",f5));
            lin5col2tab4.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*adicionando as celulas na tabela 4*/
            float columnWidth4[]={100f,100f,100f};
            table4.setTotalWidth(columnWidth4);
            table4.addCell(Classecarre34);
            table4.addCell(tipodemad534);
            table4.addCell(classecarre134);
            table4.addCell(classerist1234);
            table4.addCell(tipodemad5341);
            table4.addCell(classecarre1341 );
            table4.addCell(resistacom234);
            table4.addCell(comprdf234);
            table4.addCell(propriedad1234);
            table4.addCell(dfdfdfd234);
            table4.addCell(propriedad2234);
            table4.addCell(propriedad3234);
            table4.addCell(lin4col1tab4);
            table4.addCell(lin4col2tab4);
            table4.addCell(lin5col1tab4);
            table4.addCell(lin5col2tab4);

               /*Quinta parte do memorial*/
            /*Parágrafo Quinto*/
            Paragraph parágrafo5= new Paragraph();
            parágrafo5.setAlignment(Element.ALIGN_JUSTIFIED);
            parágrafo5.setFont(f6);
            parágrafo5.add("Fatores de Utilização");
            
            /*construindo tabela 5*/
            
             /*Tabela de peças de madeira*/
            PdfPTable table5 = new PdfPTable(2);
            /*construindo as celulas da tabela*/
            
            /*primeira linha tabela 5*/
            PdfPCell Classecarre35 = new PdfPCell(new Phrase("Fatores de Utilização",f4));
            Classecarre35.setHorizontalAlignment(Element.ALIGN_CENTER);
            Classecarre35.setBackgroundColor(new BaseColor(223,104,4));
            PdfPCell tipodemad535 = new PdfPCell(new Phrase("Adotado",f4));
            tipodemad535.setHorizontalAlignment(Element.ALIGN_CENTER);
            tipodemad535.setBackgroundColor(new BaseColor(223,104,4));
            
            /*segunda linha tabela 5*/
            PdfPCell classecarre135 = new PdfPCell(new Phrase("Ações em Estruturas Correntes",f5));
            PdfPCell classerist1235 = new PdfPCell(new Phrase(acoescorrentes.getSelectedItem().toString(),f5));
    
            /*terceira linha tabela 5*/
            PdfPCell resistacom235 = new PdfPCell(new Phrase("Cargas Acidentais dos Edifícios ",f5));
        /*Cargas acidentais dos edifícios*/
        String h1 = null;
        String aci = cargasacid.getSelectedItem().toString();
        if("Não há pred. de Equipamentos Fixos nem de el. concentr".equals(aci)){
            h1 = "Locais em que não há predominância de pesos de equipamentos fixos,ou de elevadas concentrações de pessoas";
        }
        if("Há pred. de Equipamentos Fixos ou de elev. Concentração.".equals(aci)){
            h1 = "Locais onde há predominância de pesos de equipamentos fixos, ou de elevadas concentrações de pessoas";
        }
        if("Bibliotecas, arquivos, oficinas ou garagens".equals(aci)){
            h1 = "Bibliotecas, arquivos, oficinas e garagens";
        }
            PdfPCell comprdf235 = new PdfPCell(new Phrase(h1,f5));
            
            /*adicionando as celulas na tabela 5*/
            table5.setWidthPercentage(100);
            table5.addCell(Classecarre35);
            table5.addCell(tipodemad535);
            table5.addCell(classecarre135);
            table5.addCell(classerist1235);
            table5.addCell(resistacom235);
            table5.addCell(comprdf235);
         
               /*Sexta parte do memorial*/
            /*Parágrafo quarto*/
            Paragraph parágrafo6= new Paragraph();
            parágrafo6.setAlignment(Element.ALIGN_JUSTIFIED);
            parágrafo6.setFont(f6);
            parágrafo6.add("Parâmetros de Cálculo da Ligação.");
            
            /*construindo tabela 6*/
            
             /*Tabela de peças de madeira*/
            PdfPTable table6 = new PdfPTable(3);
            /*construindo as celulas da tabela 6*/
            
             /*primeira linha tabela 6*/
            PdfPCell Classecarre361 = new PdfPCell(new Phrase("Parâmetros de Cálculo para a Madeira",f4));
            Classecarre361.setRowspan(4);
            try {
                 com.itextpdf.text.Image hei = com.itextpdf.text.Image.getInstance("C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\imagemtexturamadeira.jpg"); 
                 
                 Classecarre361.setImage(hei);
                 Classecarre361.setVerticalAlignment(Element.ALIGN_MIDDLE);
                 Classecarre361.setHorizontalAlignment(Element.ALIGN_CENTER);
                 
             } catch (BadElementException | IOException ex) {
                 Logger.getLogger(TelaCorteSimples10.class.getName()).log(Level.SEVERE, null, ex);
             }
            Classecarre361.setHorizontalAlignment(Element.ALIGN_CENTER);
             
            /*primeira linha tabela 6*/
            PdfPCell Classecarre36 = new PdfPCell(new Phrase("Parâmetros de Resistência para a Madeira",f4));
            Classecarre36.setBackgroundColor(new BaseColor(223,104,4));
            Classecarre36.setColspan(2);
            Classecarre36.setHorizontalAlignment(Element.ALIGN_CENTER);
            
           
            
            /*segunda linha tabela 6*/
            PdfPCell classecarre136 = new PdfPCell(new Phrase("Resistência de Compressão paralela as fibras (fc0d).",f5));
            PdfPCell classerist1236 = new PdfPCell(new Phrase(jLabel79.getText()+" kN/cm²",f5));
            classerist1236.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*terceira linha tabela 6*/
            PdfPCell resistacom236 = new PdfPCell(new Phrase("Resistência ao Compressão normal as fibras (fc90d).",f5));
            PdfPCell comprdf236 = new PdfPCell(new Phrase(jLabel80.getText()+" kN/cm²",f5));
            comprdf236.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*quarta linha tabela 6*/
            PdfPCell propriedad1236 = new PdfPCell(new Phrase("Resistência ao Cisalhamento paralelo as fibras (fv0d). ",f5));
            PdfPCell dfdfdfd236 = new PdfPCell(new Phrase(jLabel81.getText()+" kN/cm²",f5));
            dfdfdfd236.setHorizontalAlignment(Element.ALIGN_CENTER);        
            
            /*adicionadno imagem*/
            
            /*adicionando as celulas na tabela 6*/
            float columnWidth6[] = {30,120,60};
            table6.setWidths(columnWidth6);
            table6.setWidthPercentage(80);
            table6.addCell(Classecarre361);
            table6.addCell(Classecarre36);
            table6.addCell(classecarre136);
            table6.addCell(classerist1236);
            table6.addCell(resistacom236);
            table6.addCell(comprdf236);
            table6.addCell(propriedad1236);
            table6.addCell(dfdfdfd236);
            
               /*construindo tabela 7*/
            
             /*Tabela de peças de madeira*/
            PdfPTable table7 = new PdfPTable(3);
            /*construindo as celulas da tabela 6*/
            
            PdfPCell Classecarre3671 = new PdfPCell(new Phrase("Parâmetros de Cálculo para a Cavilha",f4));
            Classecarre3671.setRowspan(9);
            Classecarre3671.setHorizontalAlignment(Element.ALIGN_CENTER);
            try {
                 com.itextpdf.text.Image hei1 = com.itextpdf.text.Image.getInstance("C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\cavilha.jpg"); 
                 
                 Classecarre3671.setImage(hei1);
                 Classecarre3671.setVerticalAlignment(Element.ALIGN_MIDDLE);
                 Classecarre3671.setHorizontalAlignment(Element.ALIGN_CENTER);
                 
             } catch (BadElementException | IOException ex) {
                 Logger.getLogger(TelaCorteSimples10.class.getName()).log(Level.SEVERE, null, ex);
             }
            /*primeira linha tabela 7*/
            PdfPCell Classecarre367 = new PdfPCell(new Phrase("Parâmetros de Cálculo para a Cavilha",f4));
            Classecarre367.setBackgroundColor(new BaseColor(223,104,4));
            Classecarre367.setColspan(2);
            Classecarre367.setHorizontalAlignment(Element.ALIGN_CENTER);
           
            
            /*segunda linha tabela 7*/
            PdfPCell classecarre1367 = new PdfPCell(new Phrase("Diâmetro da Cavilha",f5));
            PdfPCell classerist12367 = new PdfPCell(new Phrase(cavj.getSelectedItem().toString()+" mm",f5));
            classerist12367.setHorizontalAlignment(Element.ALIGN_CENTER);
            
             /*quarta linha tabela 7*/
            PdfPCell propriedad12367 = new PdfPCell(new Phrase("Tipo de Madeira da Cavilha",f5));
            PdfPCell dfdfdfd2367 = new PdfPCell(new Phrase(jComboBox11.getSelectedItem().toString(),f5));
            dfdfdfd2367.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*quarta linha tabela 7*/
            PdfPCell propriedadkl = new PdfPCell(new Phrase("Classe de Umidade da Cavilha",f5));
            PdfPCell dfd = new PdfPCell(new Phrase(jComboBox14.getSelectedItem().toString(),f5));
            dfd.setHorizontalAlignment(Element.ALIGN_CENTER);
            /*terceira linha tabela 7*/
            
            /*quarta linha tabela 7*/
            PdfPCell propriedadkp = new PdfPCell(new Phrase("Categoria da Madeira da Cavilha",f5));
            PdfPCell dfd23 = new PdfPCell(new Phrase(jComboBox16.getSelectedItem().toString(),f5));
            dfd23.setHorizontalAlignment(Element.ALIGN_CENTER);
            
         
            PdfPCell resi = new PdfPCell(new Phrase("kmod da Cavilha",f5));
            PdfPCell compr34 = new PdfPCell(new Phrase(jLabel82.getText(),f5));
            compr34.setHorizontalAlignment(Element.ALIGN_CENTER);
            
             PdfPCell resi20 = new PdfPCell(new Phrase("Resistência e Categoria da Cavilha",f5));
            PdfPCell compr3420 = new PdfPCell(new Phrase("C60 , Dicotiledônea",f5));
            compr3420.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            PdfPCell resi203 = new PdfPCell(new Phrase("Resistência de Cálculo a Compressão paralelas as fibras da cavilha (fc0dcav)",f5));
            PdfPCell compr34203 = new PdfPCell(new Phrase(jLabel25.getText()+" kN/cm²",f5));
            compr34203.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            PdfPCell resi2033 = new PdfPCell(new Phrase("Resistência de Cálculo a Compressão normal as fibras da cavilha (fc90dcav)",f5));
            PdfPCell compr342033= new PdfPCell(new Phrase(jLabel27.getText()+" kN/cm²",f5));
            compr342033.setHorizontalAlignment(Element.ALIGN_CENTER);
          
            /*adicionando as celulas na tabela 7*/
            float columnWidth7[] = {30,120,30};
            table7.setWidths(columnWidth7);
            table7.setWidthPercentage(100);
            table7.addCell(Classecarre3671);
            table7.addCell(Classecarre367);
            table7.addCell(classecarre1367);
            table7.addCell(classerist12367);
            table7.addCell(propriedad12367);
            table7.addCell(dfdfdfd2367);
            table7.addCell(propriedadkl);
            table7.addCell(dfd);
            table7.addCell(propriedadkp);
            table7.addCell(dfd23);
            table7.addCell(resi);
            table7.addCell(compr34);
            table7.addCell(resi20);
            table7.addCell(compr3420);
            table7.addCell(resi203);
            table7.addCell(compr34203);
            table7.addCell(resi2033 );
            table7.addCell(compr342033);
   
           
            /*construindo tabela 9*/
            
             /*Tabela de peças de madeira*/
            PdfPTable table9 = new PdfPTable(2);
            /*construindo as celulas da tabela 6*/
            
          
            /*primeira linha tabela 9*/
            PdfPCell Classecarre36789 = new PdfPCell(new Phrase("Embutimento da Cavilha",f4));
            Classecarre36789.setColspan(2);
            Classecarre36789.setBackgroundColor(new BaseColor(223,104,4));
            Classecarre36789.setHorizontalAlignment(Element.ALIGN_CENTER);
           
            
            /*segunda linha tabela 9*/
            PdfPCell classecarre136789 = new PdfPCell(new Phrase("Beta",f5));
            classecarre136789.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell classerist1236789 = new PdfPCell(new Phrase(jLabel29.getText(),f5));
            classerist1236789.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*terceira linha tabela 9*/
            PdfPCell resistacom236789 = new PdfPCell(new Phrase("Beta Limite",f5));
            resistacom236789.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell comprdf236789 = new PdfPCell(new Phrase(jLabel30.getText(),f5));
            comprdf236789.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            PdfPCell resista = new PdfPCell(new Phrase("Resistência de um corte",f5));
            resista.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            PdfPCell compr12= new PdfPCell(new Phrase(jLabel84.getText()+" kN/cm²",f5));
            compr12.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*quinta linha tabela 9*/
            PdfPCell dfdfdfd236789 = new PdfPCell(new Phrase(jLabel65.getText().toString(),f5));
            dfdfdfd236789.setColspan(2);
            dfdfdfd236789.setHorizontalAlignment(Element.ALIGN_CENTER);        
            if(("Beta Limite > Beta").equals(jLabel65.getText().toString())){
                dfdfdfd236789.setBackgroundColor(BaseColor.RED);
            }
            
            /*adicionando as celulas na tabela 9*/
            table9.setHorizontalAlignment(Element.ALIGN_CENTER);
            table9.setWidthPercentage(85);
            table9.addCell(Classecarre36789);
            table9.addCell(classecarre136789);
            table9.addCell(classerist1236789);
            table9.addCell(resistacom236789);
            table9.addCell(comprdf236789);
            table9.addCell(resista);
            table9.addCell(compr12);
            table9.addCell(dfdfdfd236789);
            
        double disthorimin;
        String disthorimin1 = null;
        double distvermin;
        String distvermin1 = null;
        double disthorbor;
        String disthorbor1 = null;
        double distvercima;
        String distvercima1 = null;
        double distverbaixo;
        String distverbaixo1 = null;
        String diametropara1 = cavj.getSelectedItem().toString();
        double diametropara = Double.parseDouble(diametropara1);
        if(ligacaocavilha1.isSelected()){
        if(am0.isSelected() || angdif.isSelected()){
        if("Tração".equals(jLabel20.getText().toString())){
            /*espaçamento mínimo entre pregos na horizontal 6 pregos e cavilhas e 4 parafuso*/
            disthorimin = 6*diametropara/10;
            disthorimin1 = String.valueOf(disthorimin);
            /*espaçamento minimo entre pregos na vertical*/
            distvermin = 3*diametropara/10;
            distvermin1 = String.valueOf(distvermin);
            /*espaçamento borda horizontal*/
            disthorbor = 7*diametropara/10;
            disthorbor1 = String.valueOf(disthorbor);
            /*espaçamento borda vertical em cima*/
            distvercima = 1.5*diametropara/10;
            distvercima1= String.valueOf(distvercima);
            /*espaçamento borda vertical em baixo*/
            distverbaixo = 1.5*diametropara/10;
            distverbaixo1= String.valueOf(distverbaixo);

        }
        if("Compressão".equals(jLabel20.getText().toString())){
             /*espaçamento mínimo entre pregos na horizontal 6 pregos e cavilhas e 4 parafuso*/
            disthorimin = 6*diametropara/10;
            disthorimin1 = String.valueOf(disthorimin);
            /*espaçamento minimo entre pregos na vertical*/
            distvermin = 3*diametropara/10;
            distvermin1 = String.valueOf(distvermin);
            /*espaçamento borda horizontal*/
            disthorbor = 4*diametropara/10;
            disthorbor1= String.valueOf(disthorbor);
            /*espaçamento borda vertical em cima*/
            distvercima = 1.5*diametropara/10;
            distvercima1= String.valueOf(distvercima);
            /*espaçamento borda vertical em baixo*/
            distverbaixo = 1.5*diametropara/10;
            distverbaixo1= String.valueOf(distverbaixo);
        }
        }
        if(ang90.isSelected()){
             if("Tração".equals(jLabel20.getText().toString())){
            /*espaçamento mínimo entre pregos na horizontal 6 pregos e cavilhas e 4 parafuso*/
            disthorimin = 3*diametropara/10;
            disthorimin1 = String.valueOf(disthorimin);
            /*espaçamento minimo entre pregos na vertical*/
            distvermin = 6*diametropara/10;
            distvermin1 = String.valueOf(distvermin);
            /*espaçamento borda horizontal*/
            disthorbor = 1.5*diametropara/10;
            disthorbor1= String.valueOf(disthorbor);
            /*espaçamento borda vertical em cima*/
            distvercima = 4*diametropara/10;
            distvercima1= String.valueOf(distvercima);
            /*espaçamento borda vertical em baixo*/
            distverbaixo = 1.5*diametropara/10;
            distverbaixo1 = String.valueOf(distverbaixo);
     
        }
        if("Compressão".equals(jLabel20.getText().toString())){
             /*espaçamento mínimo entre pregos na horizontal 6 pregos e cavilhas e 4 parafuso*/
            disthorimin = 3*diametropara/10;
            disthorimin1 = String.valueOf(disthorimin);
            /*espaçamento minimo entre pregos na vertical*/
            distvermin = 6*diametropara/10;
            distvermin1 = String.valueOf(distvermin);
            /*espaçamento borda horizontal*/
            disthorbor = 1.5*diametropara/10;
            disthorbor1= String.valueOf(disthorbor);
            /*espaçamento borda vertical em cima*/
            distvercima = 1.5*diametropara/10;
            distvercima1= String.valueOf(distvercima);
            /*espaçamento borda vertical em baixo*/
            distverbaixo = 4*diametropara/10;
            distverbaixo1 = String.valueOf(distverbaixo);
        
        }
        }
        }
        
               /*construindo tabela 10*/
            
             /*Tabela de peças de madeira*/
            PdfPTable table10 = new PdfPTable(2);
            /*construindo as celulas da tabela 6*/
            
             
            /*primeira linha tabela 10*/
            PdfPCell Classecarre367891 = new PdfPCell(new Phrase("Flexão do Pino",f4));
            Classecarre367891.setColspan(2);
            Classecarre367891.setBackgroundColor(new BaseColor(223,104,4));
            Classecarre367891.setHorizontalAlignment(Element.ALIGN_CENTER);
           
            
            /*segunda linha tabela 10*/
            PdfPCell classecarre1367891 = new PdfPCell(new Phrase("Beta",f5));
            classecarre1367891.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell classerist12367891 = new PdfPCell(new Phrase(jLabel29.getText(),f5));
            classerist12367891.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*terceira linha tabela 10*/
            PdfPCell resistacom2367891 = new PdfPCell(new Phrase("Beta Limite",f5));
            resistacom2367891.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell comprdf2367891 = new PdfPCell(new Phrase(jLabel30.getText(),f5));
            comprdf2367891.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            PdfPCell resistacom23678912 = new PdfPCell(new Phrase("Resistência de um Corte",f5));
            resistacom23678912.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell comprdf23678912 = new PdfPCell(new Phrase(jLabel83.getText()+"kN/cm²",f5));
            comprdf23678912.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*quarta linha tabela 10*/
            PdfPCell dfdfdfd2367891 = new PdfPCell(new Phrase(jLabel65.getText().toString(),f5));
            dfdfdfd2367891.setColspan(2);
            dfdfdfd2367891.setHorizontalAlignment(Element.ALIGN_CENTER); 
            
            if(("Beta Limite < Beta").equals(jLabel65.getText().toString())){
                dfdfdfd2367891.setBackgroundColor(BaseColor.RED);
            }
            
            
            
            /*adicionando as celulas na tabela 10*/
            float coluna [] = {10,10};
            table10.setWidthPercentage(85);
            table10.setHorizontalAlignment(Element.ALIGN_CENTER);
            table10.addCell(Classecarre367891);
            table10.addCell(classecarre1367891);
            table10.addCell(classerist12367891);
            table10.addCell(resistacom2367891);
            table10.addCell(comprdf2367891);
            table10.addCell(resistacom23678912);
            table10.addCell(comprdf23678912);
            table10.addCell(dfdfdfd2367891);
            
             /*Tabela de Propriedades da Madeira*/
            PdfPTable table11 = new PdfPTable(2);
            /*construindo as celulas da tabela*/
            
            PdfPCell propriedad4 = new PdfPCell(new Phrase("Resultados Finais",f4));
            propriedad4.setColspan(2);
            propriedad4.setHorizontalAlignment(Element.ALIGN_CENTER);
            propriedad4.setBackgroundColor(new BaseColor(223,104,4));
            PdfPCell categoria4 = new PdfPCell(new Phrase("Força Solitante Majorada ",f5));
            categoria4.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell classerist4 = new PdfPCell(new Phrase(jLabel75.getText()+jLabel76.getText(),f5));
            classerist4.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell classerist14 = new PdfPCell(new Phrase("Esforço Solicitante",f5));
            classerist14.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell resistacom4 = new PdfPCell(new Phrase(jLabel20.getText(),f5));
            resistacom4.setHorizontalAlignment(Element.ALIGN_CENTER);
            double numeprego = Double.parseDouble(jLabel32.getText());
            String hid;
            if (numeprego<2){
                hid = "2";
            }else{
                hid = jLabel32.getText();
            }
            PdfPCell comprdf4 = new PdfPCell(new Phrase(hid,f5));
            comprdf4.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell propriedad14 = new PdfPCell(new Phrase("Número de Pinos Mínimos necessários",f5));
            propriedad14.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell dfdfdfd4 = new PdfPCell(new Phrase("Espaçamento Mínimo entre Pino na Horizontal",f5));
            dfdfdfd4.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell propriedad24 = new PdfPCell(new Phrase(disthorimin1+" cm",f5));
            propriedad24.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell propriedad34= new PdfPCell(new Phrase("Espaçamento Mínimo entre Pinos na Vertical",f5));
            propriedad34.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell celulaNome24 = new PdfPCell(new Phrase(distvermin1+" cm",f5));
            celulaNome24.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell celulaSexo24 = new PdfPCell(new Phrase("Espaçamento Mínimo do Pino até a Borda Horizontal",f5));
            celulaSexo24.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell celulaSexo124 = new PdfPCell(new Phrase(disthorbor1+" cm",f5));
            celulaSexo124.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell umidade24 = new PdfPCell(new Phrase("Espaçamento mínimo do Pino até a Borda Vertical em cima",f5));
            umidade24.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell umidade242 = new PdfPCell(new Phrase(distvercima1+" cm",f5));
            umidade242.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell umidade241 = new PdfPCell(new Phrase("Espaçamento mínimo do Pino até a Borda Vertical em baixo",f5));
            umidade241.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell umidade244 = new PdfPCell(new Phrase(distverbaixo1+" cm",f5));
            umidade244.setHorizontalAlignment(Element.ALIGN_CENTER);
            /*adicionando as celulas na tabela*/
            float columnWidth11[]={75f,25f};
            table11.setTotalWidth(columnWidth11);
            table11.setWidthPercentage(100);
            table11.addCell(propriedad4);
            table11.addCell(categoria4);
            table11.addCell(classerist4);
            table11.addCell(classerist14);
            table11.addCell(resistacom4);
            table11.addCell(propriedad14);
            table11.addCell(comprdf4);
            table11.addCell(dfdfdfd4);
            table11.addCell(propriedad24);
            table11.addCell(propriedad34);
            table11.addCell(celulaNome24);
            table11.addCell(celulaSexo24);
            table11.addCell(celulaSexo124);
            table11.addCell(umidade24);
            table11.addCell(umidade242);
            table11.addCell(umidade241);
            table11.addCell(umidade244);
            /*terminar a tabela*/
            
            
            /*incluindo items no documento*/
            documento.add(titulo);
            documento.add(espaçamento1);
            String imagemcorte = null;
            if(angdif.isSelected()){
                imagemcorte = "C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\imagemcortesimplesincl.JPG";
            }
            if(ang90.isSelected()){
                 imagemcorte = "C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\Imagemcortesimples90.JPG";
            }
            if(am0.isSelected()){
                 imagemcorte = "C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\imagemcortesimples0.JPG";
            }
            try {
                 com.itextpdf.text.Image hei = com.itextpdf.text.Image.getInstance(imagemcorte); 
                 hei.scaleAbsolute(300,150);
              
                 float x = (PageSize.A4.getWidth()-hei.getScaledWidth())/2;
                 hei.setAlignment((int) x);
                 documento.add(hei);
                 
             } catch (BadElementException | IOException ex) {
                 Logger.getLogger(TelaCorteSimples10.class.getName()).log(Level.SEVERE, null, ex);
             }
             try {
                 com.itextpdf.text.Image heip = com.itextpdf.text.Image.getInstance("C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\Imagem1.png"); 
                 heip.setAbsolutePosition(500, TOP_ALIGNMENT);
                 heip.scaleAbsoluteHeight(PageSize.A4.getHeight()/2);
                 heip.scaleAbsoluteWidth(100);
                 heip.setAlignment(Element.ALIGN_RIGHT);
                 documento.add(heip);
                 
             } catch (BadElementException | IOException ex) {
                 Logger.getLogger(TelaCorteSimples10.class.getName()).log(Level.SEVERE, null, ex);
             }
              try {
                 com.itextpdf.text.Image heip = com.itextpdf.text.Image.getInstance("C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\Imagem1.png"); 
                 heip.setRotationDegrees(180);
                 heip.setAbsolutePosition(0,PageSize.A4.getHeight()/2);
                 heip.scaleAbsoluteHeight(PageSize.A4.getHeight()/2);
                 heip.scaleAbsoluteWidth(100);
                
                 documento.add(heip);
                 
             } catch (BadElementException | IOException ex) {
                 Logger.getLogger(TelaCorteSimples10.class.getName()).log(Level.SEVERE, null, ex);
             }
            parágrafo1.setAlignment(Element.ALIGN_CENTER);
            documento.add(parágrafo1);
            documento.add(espaçamento1);
            documento.add(table1);
            documento.add(espaçamento1);
            parágrafo2.setAlignment(Element.ALIGN_CENTER);
            documento.add(parágrafo2);
            documento.add(espaçamento1);
            documento.add(table2);
            documento.add(espaçamento1);
            parágrafo3.setAlignment(Element.ALIGN_CENTER);
            documento.add(parágrafo3);
            documento.add(espaçamento1);
            documento.add(table3);
            documento.add(espaçamento1);
            documento.add(espaçamento1);
            parágrafo4.setAlignment(Element.ALIGN_CENTER);
            documento.add(parágrafo4);
            documento.add(espaçamento1);
            documento.add(table4);
            documento.add(espaçamento1);
            documento.add(table5);
              try {
                 com.itextpdf.text.Image heip = com.itextpdf.text.Image.getInstance("C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\Imagem1.png"); 
                 heip.setAbsolutePosition(500, TOP_ALIGNMENT);
                 heip.scaleAbsoluteHeight(PageSize.A4.getHeight()/2);
                 heip.scaleAbsoluteWidth(100);
                 heip.setAlignment(Element.ALIGN_RIGHT);
                 documento.add(heip);
                 
             } catch (BadElementException | IOException ex) {
                 Logger.getLogger(TelaCorteSimples10.class.getName()).log(Level.SEVERE, null, ex);
             }
              try {
                 com.itextpdf.text.Image heip = com.itextpdf.text.Image.getInstance("C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\Imagem1.png"); 
                 heip.setRotationDegrees(180);
                 heip.setAbsolutePosition(0,PageSize.A4.getHeight()/2);
                 heip.scaleAbsoluteHeight(PageSize.A4.getHeight()/2);
                 heip.scaleAbsoluteWidth(100);
                
                 documento.add(heip);
                 
             } catch (BadElementException | IOException ex) {
                 Logger.getLogger(TelaCorteSimples10.class.getName()).log(Level.SEVERE, null, ex);
             }
            documento.add(espaçamento1);
            parágrafo6.setAlignment(Element.ALIGN_CENTER);
            documento.add(parágrafo6);
            documento.add(espaçamento1);
            documento.add(table6);
            documento.add(espaçamento1);
            documento.add(table7);
            documento.add(espaçamento1);
            if(("Beta Limite > Beta").equals(jLabel65.getText().toString())){
                documento.add(table9);
                documento.add(espaçamento1);
            }
            if(("Beta Limite < Beta").equals(jLabel65.getText().toString())){
                documento.add(table10);
                documento.add(espaçamento1);
            }
            
            try {
                 com.itextpdf.text.Image heip = com.itextpdf.text.Image.getInstance("C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\Imagem1.png"); 
                 heip.setAbsolutePosition(500, TOP_ALIGNMENT);
                 heip.scaleAbsoluteHeight(PageSize.A4.getHeight()/2);
                 heip.scaleAbsoluteWidth(100);
                 heip.setAlignment(Element.ALIGN_RIGHT);
                 documento.add(heip);
                 
             } catch (BadElementException | IOException ex) {
                 Logger.getLogger(TelaCorteSimples10.class.getName()).log(Level.SEVERE, null, ex);
             }
              try {
                 com.itextpdf.text.Image heip = com.itextpdf.text.Image.getInstance("C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\Imagem1.png"); 
                 heip.setRotationDegrees(180);
                 heip.setAbsolutePosition(0,PageSize.A4.getHeight()/2);
                 heip.scaleAbsoluteHeight(PageSize.A4.getHeight()/2);
                 heip.scaleAbsoluteWidth(100);
                
                 documento.add(heip);
                 
             } catch (BadElementException | IOException ex) {
                 Logger.getLogger(TelaCorteSimples10.class.getName()).log(Level.SEVERE, null, ex);
             }
            documento.add(table11);
           
            
                    } catch (FileNotFoundException | DocumentException ex) {
           System.out.println("error");
        }finally{
            documento.close();
        }
        try {
            Desktop.getDesktop().open(new File("Memorial de Cálculo Corte Duplo.pdf"));
        } catch (IOException ex) {
            Logger.getLogger(TelaCorteSimples10.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel85MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel85MouseClicked
        jPanel1.setVisible(true);
        tipodeligaçãoaserescolhida.setVisible(false);
        resultadosdospregos.setVisible(false);
        telaescolhaanel.setVisible(false);
        resultadoscavilha.setVisible(false);
        escolhacavilha.setVisible(false);
        resultanel.setVisible(false);
        Escolhamadeira.setVisible(true);
        escolhadacarga.setVisible(false);
        pregoeparafuso.setVisible(false);
        Resultadoparafuso.setVisible(false);
    }//GEN-LAST:event_jLabel85MouseClicked

    private void jLabel90MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel90MouseClicked
        /*Dados iniciais do primeiro elemento de ligação */
        /*Valor das resistências e caracterisitcas das coníferas*/
        String valorresistencia = null;
        double resmad1 = 0;
        double rescis = 0;
        if(selco.isSelected()){
            valorresistencia = jComboBox2.getSelectedItem().toString();
        }
        if(seldico.isSelected()){
            valorresistencia = jComboBox1.getSelectedItem().toString();
        }
        /*se as duas nao estiverem marcadas*/
        if ((selco.isSelected() == false && seldico.isSelected()== false)){}
        if("C20".equals(valorresistencia)&& selco.isSelected()){
            resmad1 = 20;
            rescis = 4;
            resfc0k.setText("20");
            jLabel26.setText("4");
            resecom.setText("3500");
            respapa.setText("500");
            jLabel72.setText("400");
            
        }
        if("C25".equals(valorresistencia)&& selco.isSelected()){
            resmad1 = 25;
            rescis = 5;
            resfc0k.setText("25");
            jLabel26.setText("5");
            resecom.setText("8500");
            respapa.setText("550");
            jLabel72.setText("450");
        }
        if("C30".equals(valorresistencia)&& selco.isSelected()){
            resmad1 = 30;
            rescis = 6;
            resfc0k.setText("30");
            jLabel26.setText("6");
            resecom.setText("14500");
            respapa.setText("600");
            jLabel72.setText("500");
        }
        /*Valor das resistências e caracterisitcas das dicotiledoneas*/
        if("C20".equals(valorresistencia)&& seldico.isSelected()){
            resmad1 = 40;
            rescis = 4;
            resfc0k.setText("20");
            jLabel26.setText("4");
            resecom.setText("9500");
            respapa.setText("650");
            jLabel72.setText("500");
        }
        if("C30".equals(valorresistencia)&& seldico.isSelected()){
            resmad1 = 30;
            rescis = 5;
            resfc0k.setText("30");
            jLabel26.setText("5");
            resecom.setText("14500");
            respapa.setText("800");
            jLabel72.setText("650");
        }
        if("C40".equals(valorresistencia)&& seldico.isSelected()){
            resmad1 = 40;
            rescis = 6;
            resfc0k.setText("40");
            jLabel26.setText("6");
            resecom.setText("19500");
            respapa.setText("950");
            jLabel72.setText("750");
        }
        if("C60".equals(valorresistencia)&& seldico.isSelected()){
            resmad1 = 60;
            rescis = 8;
            resfc0k.setText("60");
            jLabel26.setText("8");
            resecom.setText("24500");
            respapa.setText("1000");
            jLabel72.setText("800");
        }
        
        /*tamanho da madeira*/
        DecimalFormat fe = new DecimalFormat("0.00");
        jLabel78.setText(String.format(fe.format(rescis)));
        String t1;
        t1 = espessurat1.getText();
        String t2;
        t2 = espessurat2.getText();
        double t1n = Double.parseDouble(t1);
        double t2n = Double.parseDouble(t2);
        double te = 0;
        if((t1n<t2n)){
            te = t1n;
        }
        if((t1n>=(t2n))){
            te = (t2n);
        }

        String b;
        b = compr.getText();

        /*Valor dos kmod1 e kmod2 e kmod3 do elemento de madeira 1*/
        String kmods = jComboBox10.getSelectedItem().toString();
        String km = jComboBox9.getSelectedItem().toString();
        double kmod1mad1 = 0;

        /*Longa duração para kmod1 da madeira 1*/
        if(("Permanente".equals(kmods)&& "Madeira Serrada".equals(km))){
            kmod1mad1 = 0.60;
        }
        if(("Permanente".equals(kmods)&& "Madeira Laminada Colada".equals(km))){
            kmod1mad1 = 0.60;
        }
        if(("Permanente".equals(kmods)&& "Madeira Compensada".equals(km))){
            kmod1mad1 = 0.60;
        }
        if(("Permanente".equals(kmods)&& "Madeira Recomposta".equals(km))){
            kmod1mad1 = 0.30;
        }
        /*Longa duração para kmod1 da madeira 1*/
        if("Longa duração".equals(kmods)&& "Madeira Serrada".equals(km)){
            kmod1mad1 = 0.70;
        }
        if(("Longa duração".equals(kmods)&& "Madeira Laminada Colada".equals(km))){
            kmod1mad1 = 0.70;
        }
        if(("Longa duração".equals(kmods)&& "Madeira Compensada".equals(km))){
            kmod1mad1 = 0.70;}

        if("Longa duração".equals(kmods)&& "Madeira Recomposta".equals(km)){
            kmod1mad1 = 0.45;
        }
        /*Média duração para kmod1 da madeira 1*/
        if("Média duração".equals(kmods)&& "Madeira Serrada".equals(km)){
            kmod1mad1 = 0.80;
        }
        if("Média duração".equals(kmods)&& "Madeira Laminada Colada".equals(km)){
            kmod1mad1 = 0.80;
        }
        if("Média duração".equals(kmods)&& "Madeira Compensada".equals(km)){
            kmod1mad1 = 0.80;
        }
        if("Média duração".equals(kmods)&& "Madeira Recomposta".equals(km)){
            kmod1mad1 = 0.65;
        }
        /*Curta duração para kmod1 da madeira 1*/
        if("Curta duração".equals(kmods)&& "Madeira Serrada".equals(km)){
            kmod1mad1 = 0.90;
        }
        if("Curta duração".equals(kmods)&& "Madeira Laminada Colada".equals(km)){
            kmod1mad1 = 0.90;
        }
        if("Curta duração".equals(kmods)&& "Madeira Compensada".equals(km)){
            kmod1mad1 = 0.90;
        }
        if("Curta duração".equals(kmods)&& "Madeira Recomposta".equals(km)){
            kmod1mad1 = 0.90;
        }
        /*Instantanea duração para kmod1 da madeira 1*/
        if("Instantânea".equals(kmods)&& "Madeira Serrada".equals(km)){
            kmod1mad1 = 1.10;
        }
        if("Instantânea".equals(kmods)&& "Madeira Laminada Colada".equals(km)){
            kmod1mad1 = 1.10;
        }
        if("Instantânea".equals(kmods)&& "Madeira Compensada".equals(km)){
            kmod1mad1 = 1.10;
        }
        if("Instantânea".equals(kmods)&& "Madeira Recomposta".equals(km)){
            kmod1mad1 = 1.10;
        }
        /*kmod 2 da madeira 1*/

        String kmod2 = jComboBox13.getSelectedItem().toString();
        String km2 = jComboBox9.getSelectedItem().toString();
        double kmod2mad1 = 0;

        /*Classe de umidade 1 do kmod2 da madeira 1*/
        if("1".equals(kmod2)){
            kmod2mad1 = 1;
        }
        /*Classe de umidade 2 do kmod2 da madeira 2*/
        if("2".equals(kmod2)){
            kmod2mad1 = 1;
        }

        /*Classe de umidade da 3  kmod2 da madeira 1*/
        if("3".equals(kmod2)&& "Madeira Serrada".equals(km2)){
            kmod2mad1 = 0.8;
        }
        if("3".equals(kmod2)&& "Madeira Laminada Colada".equals(km2)){
            kmod2mad1 = 0.8;
        }
        if("3".equals(kmod2)&& "Madeira Compensada".equals(km2)){
            kmod2mad1 = 0.8;
        }
        if("3".equals(kmod2)&& "Madeira Recomposta".equals(km2)){
            kmod2mad1 = 0.9;
        }
        /*Classe de umidade 2 para kmod2 da madeira 1*/
        if("4".equals(kmod2)&& "Madeira Serrada".equals(km2)){
            kmod2mad1 = 0.8;
        }
        if("4".equals(kmod2)&& "Madeira Laminada Colada".equals(km2)){
            kmod2mad1 = 0.8;
        }
        if("4".equals(kmod2)&& "Madeira Compensada".equals(km2)){
            kmod2mad1 = 0.8;
        }
        if("4".equals(kmod2)&& "Madeira Recomposta".equals(km2)){
            kmod2mad1 = 0.9;
        }
        /*Kmod 3 da madeira 1*/
        String kmod36s2 = jComboBox15.getSelectedItem().toString();
        double kmod3mad1 = 0;
        if("1".equals(kmod36s2)){
            kmod3mad1 = 1;
        }
        if("2".equals(kmod36s2)){
            kmod3mad1 = 0.80;
        }

        /*Cálculo do kmod final é do elemento 1*/
        double kmodfinalmad1;
        kmodfinalmad1 = kmod1mad1*kmod2mad1*kmod3mad1;
        String kmod1certo = String.valueOf(kmod1mad1);
        String kmod2certo = String.valueOf(kmod2mad1);
        String kmod3certo = String.valueOf(kmod3mad1);
        resulkmod4.setText(String.format(fe.format(kmod1mad1)));
        resulkmod7.setText(String.format(fe.format(kmodfinalmad1)));
        resulkmod5.setText(String.format("%.2f", kmod2mad1));
        resulkmod6.setText(String.format("%.2f", kmod3mad1));

        /*cálculo dos aneis metalicos*/
        String diameanel1 = jComboBox4.getSelectedItem().toString();
        double diametroanel1 = Double.parseDouble(diameanel1);
        diam1.setText(String.valueOf(diametroanel1));

        /*Cálculo da resistência da madeira 1*/
        double fc0dmad1;
        double fc90dmad1;
        double fcdifdmad1;
        fc0dmad1 = (kmodfinalmad1*(resmad1/(1.4)))/10;
        jLabel93.setText(String.format(fe.format(fc0dmad1)));
        fc90dmad1 = (kmodfinalmad1*((resmad1*0.25)/(1.4)))/10;
        jLabel94.setText(String.format(fe.format(fc90dmad1)));
        jLabel77.setText(String.format(fe.format(resmad1*0.25)));
        double fcadotado = 0;
        if(ang90.isSelected()){
            fcadotado = fc90dmad1;
        }
        if(am0.isSelected()){
            fcadotado = fc0dmad1;
        }
        if(angdif.isSelected()){
            String valordoangulo = valorangdif.getText();
            double valordoangulo1 = Double.parseDouble(valordoangulo);
            double valordoangulo2 = Math.toRadians(valordoangulo1);
            double resultadodif = (fc0dmad1*fc90dmad1)/((fc0dmad1*(Math.sin(valordoangulo2))*(Math.sin(valordoangulo2)))+(fc90dmad1*(Math.cos(valordoangulo2))*(Math.cos(valordoangulo2))));
            fcadotado = resultadodif;
        }
        String fc0dmad1certo = (String.format(fe.format(fcadotado)));
        rescomcal1.setText(fc0dmad1certo);
        

        /*Cálculo da resistência cisalhemtno da madeira 1*/
        double fv0dmad1;
        fv0dmad1 = (kmodfinalmad1*(rescis/(1.8)))/10;
        String fv0dmad1certo = (String.format(fe.format(fv0dmad1)));
        resutembut1.setText(fv0dmad1certo);
        /*Resistência do anel1*/
        double resist1anel = (((Math.PI)*(diametroanel1/10)*(diametroanel1/10))/4)*fv0dmad1;
        String resistanel11 = (String.format(fe.format(resist1anel)));
        jLabel87.setText(resistanel11);
        /*Resistência do anel 2*/
        String valorperf = perf.getText();
        jLabel89.setText(valorperf);
        Double perf1 = Double.parseDouble(valorperf);
        double resist1anel2 = fc0dmad1*(perf1/10)*(diametroanel1/10);
        String rest2anel = (String.format(fe.format(resist1anel2)));
        jLabel88.setText(rest2anel);

        /*Escolha das variações das cargas*/
        /*Ações permanentes pequena variabilidade*/
        String variabilidade = Tipodevariabilidade.getSelectedItem().toString();
        String efeito = paraefeitos.getSelectedItem().toString();
        String comb = combinação.getSelectedItem().toString();
        double majorperma = 0;
        double majorvaria = 0;
        if("Ações de Pequena Variabilidade".equals(variabilidade)&& "Desfavoráveis".equals(efeito)&& "Normais".equals(comb)){
            majorperma = 1.3;
        }
        if("Ações de Pequena Variabilidade".equals(variabilidade)&& "Desfavoráveis".equals(efeito)&& "Especiais ou de Construções".equals(comb)){
            majorperma = 1.2;
        }
        if("Ações de Pequena Variabilidade".equals(variabilidade)&& "Desfavoráveis".equals(efeito)&& "Excepcionais".equals(comb)){
            majorperma = 1.1;
        }
        if("Ações de Pequena Variabilidade".equals(variabilidade)&& "Favoráveis".equals(efeito)&& "Normais".equals(comb)){
            majorperma = 1.0;
        }
        if("Ações de Pequena Variabilidade".equals(variabilidade)&& "Favoráveis".equals(efeito)&& "Especiais ou de Construções".equals(comb)){
            majorperma = 1.0;
        }
        if("Ações de Pequena Variabilidade".equals(variabilidade)&& "Favoráveis".equals(efeito)&& "Excepcionais".equals(comb)){
            majorperma = 1.0;
        }
        /*Ações permanentes de grande variabildiade */
        if("Ações de Grande Variabilidade".equals(variabilidade)&& "Desfavoráveis".equals(efeito)&& "Normais".equals(comb)){
            majorperma = 1.4;
        }
        if("Ações de Grande Variabilidade".equals(variabilidade)&& "Desfavoráveis".equals(efeito)&& "Especiais ou de Construções".equals(comb)){
            majorperma = 1.3;
        }
        if("Ações de Grande Variabilidade".equals(variabilidade)&& "Desfavoráveis".equals(efeito)&& "Excepcionais".equals(comb)){
            majorperma = 1.2;
        }
        if("Ações de Grande Variabilidade".equals(variabilidade)&& "Favoráveis".equals(efeito)&& "Normais".equals(comb)){
            majorperma = 0.9;
        }
        if("Ações de Grande Variabilidade".equals(variabilidade)&& "Favoráveis".equals(efeito)&& "Especiais ou de Construções".equals(comb)){
            majorperma = 0.9;
        }
        if("Ações de Grande Variabilidade".equals(variabilidade)&& "Favoráveis".equals(efeito)&& "Excepcionais".equals(comb)){
            majorperma = 0.9;
        }
        /*Ações variáveis*/
        String varia = variavel.getSelectedItem().toString();
        if("Ações Variáveis em Geral".equals(varia)&& "Normais".equals(comb)){
            majorvaria = 1.4;
        }
        if("Ações Variáveis em Geral".equals(varia)&& "Especiais ou de Construções".equals(comb)){
            majorvaria = 1.2;
        }
        if("Ações Variáveis em Geral".equals(varia)&& "Excepcionais".equals(comb)){
            majorvaria = 1.0;
        }
        if("Efeitos da Temperatura".equals(varia)&& "Excepcionais".equals(comb)){
            majorvaria = 1.2;
        }
        if("Efeitos da Temperatura".equals(varia)&& "Especiais ou de Construções".equals(comb)){
            majorvaria = 1.0;
        }
        if("Efeitos da Temperatura".equals(varia)&& "Excepcionais".equals(comb)){
            majorvaria = 0;
        }
        /*fatores de utilização*/
        double w0 = 0;
        double w1 = 0;
        double w2 = 0;
        double w0c = 0;
        double w1c = 0;
        double w2c = 0;
        /*Ações em estruturas correntes*/
        String Fatores = acoescorrentes.getSelectedItem().toString();
        if("Variações uniformes de Temperatura".equals(Fatores)){
            w0c = 0.6;
            w1c = 0.5;
            w2c = 0.3;
        }
        if("Pressão Dinâmica do Vento".equals(Fatores)){
            w0c = 0.5;
            w1c = 0.2;
            w2c = 0.0;
        }
        /*Cargas acidentais dos edifícios*/
        String aci = cargasacid.getSelectedItem().toString();
        if("Não há pred. de Equipamentos Fixos nem de el. concentr".equals(aci)){
            w0 = 0.4;
            w1 = 0.3;
            w2 = 0.2;
        }
        if("Há pred. de Equipamentos Fixos ou de elev. Concentração.".equals(aci)){
            w0 = 0.7;
            w1 = 0.6;
            w2 = 0.4;
        }
        if("Bibliotecas, arquivos, oficinas ou garagens".equals(aci)){
            w0 = 0.8;
            w1 = 0.7;
            w2 = 0.6;
        }

        /*Combinaçao de ação */
        double Frd = 0;
        double Frd1;
        double Frd2;
        double Frd3 = 0;
        String sob = sobrecarga.getText();
        String perm = permanente.getText();
        String ventod = vento.getText();
        double sobrecarga1 = Double.parseDouble(sob);
        double permanente1 = Double.parseDouble(perm);
        double vento1 = Double.parseDouble(ventod);
        /*Combinação sobrecarga variável principal*/
        Frd1 = ((permanente1*majorperma)+(majorvaria*(sobrecarga1+(w0c*vento1))));
        /*Combinação vento como variável principal*/
        Frd2 = ((permanente1*majorperma)+(majorvaria*(vento1+(w0*sobrecarga1))));
        /*Combinação equipamento fixo*/
        if (Frd2>Frd1){
            Frd = Frd2;
        }
        if (Frd2<Frd1){
            Frd = Frd1;
        }
        
        String frdn1 = (String.format(fe.format(Frd1)));
        resultperma1.setText(frdn1);
        String frdn2 = (String.format(fe.format(Frd2)));
        resultvent1.setText(frdn2);
        /*Cálculo número de pinos*/
        double numedeanel;
        double menorresist;
        double soma = Frd1+Frd2;
        if(soma>0){
            jLabel20.setText("Tração");
            jLabel75.setText("+");
        }else{
            jLabel20.setText("Compressão");
            jLabel75.setText("-");
        }
        if(Frd1<0){
            Frd1 = -Frd1;
        }
        if(Frd2<0){
            Frd2 = -Frd2;
        }
        if (Frd2>Frd1){
            Frd = Frd2;
             }else{
            Frd = Frd1;
        }
        jLabel76.setText(String.format(fe.format(Frd)));
        if(resist1anel>resist1anel2){
            menorresist = resist1anel2;
        }else{
            menorresist = resist1anel;
        }
        if(resist1anel==resist1anel2){
            menorresist = resist1anel2;
        }
        numedeanel = (Frd/(menorresist));
        int numedeanel1 = (int)Math.ceil(numedeanel);
        String nus1 = String.valueOf(numedeanel1);
        jLabel92.setText(nus1);

    }//GEN-LAST:event_jLabel90MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Document documento = new Document();
        DecimalFormat fe = new DecimalFormat("0.00");
        try {
            PdfWriter.getInstance(documento,new FileOutputStream("Memorial de Cálculo Corte Simples.pdf"));
            documento.open();
            documento.newPage();
            documento.setPageSize(PageSize.A4);
            documento.setMargins(85f, 85f, 85f, 85f);
            documento.addCreator("Matheus Felipe de Oliveira Lemos");
            documento.addTitle("Memorial de Cálculo");
            documento.addCreator("Matheus Felipe de Oliveira Lemos");
            documento.addLanguage("Português");
            documento.addKeywords("Ligações,Madeira,Resistência,Solicitação");
            Font f3 = new Font(Font.FontFamily.TIMES_ROMAN, 14f, Font.BOLD);
            Font f4 = new Font(Font.FontFamily.TIMES_ROMAN, 12f, Font.BOLD);
            f4.setColor(BaseColor.WHITE);
            Font f5 = new Font(Font.FontFamily.TIMES_ROMAN, 12f, Font.NORMAL);
            Font f6 = new Font(Font.FontFamily.TIMES_ROMAN, 12f, Font.BOLD);
            Paragraph titulo = new Paragraph();
            /*Título principal */
            titulo.setFont(f3);
            titulo.setAlignment(Element.ALIGN_CENTER);
            titulo.add("Memorial de Cálculo do Corte Simples\n");
            /*Parágrafo primeiro*/
            Paragraph parágrafo1= new Paragraph();
            parágrafo1.setAlignment(Element.ALIGN_JUSTIFIED);
            parágrafo1.setFont(f6);
            parágrafo1.add("Características das Propriedades da Madeira (De acordo com a Norma NBR 7190/1997).");
            /*espaçamento 1*/
            Paragraph espaçamento1 = new Paragraph();
            for (int i = 0; i < 20; i++) {
                espaçamento1.add(new Chunk(" "));
            }
            /*espaçamento 2*/
            Paragraph espaçamento2 = new Paragraph();
            for (int i = 0; i < 20; i++) {
                espaçamento2.add(new Chunk(" "));
            }
            /*espaçamento 3*/
            Paragraph espaçamento3 = new Paragraph();
            for (int i = 0; i < 1500; i++) {
                espaçamento3.add(new Chunk(" "));
            }
            /*Tabela de Propriedades da Madeira*/
            PdfPTable table1 = new PdfPTable(2);
            /*construindo as celulas da tabela*/
            String categoria1 = "";
            if (seldico.isSelected()){
                categoria1 = "Dicotiledônea";
            }
            if(selco.isSelected()){
                categoria1 = "Conífera";
            }
            PdfPCell propriedad = new PdfPCell(new Phrase("Propriedade da Madeira",f4));
            propriedad.setHorizontalAlignment(Element.ALIGN_CENTER);
            propriedad.setBackgroundColor(new BaseColor(223,104,4));
            PdfPCell categoria = new PdfPCell(new Phrase(categoria1,f4));
            categoria.setHorizontalAlignment(Element.ALIGN_CENTER);
            categoria.setBackgroundColor(new BaseColor(223,104,4));
            PdfPCell classerist = new PdfPCell(new Phrase("Classe de Resistência",f5));
            PdfPCell classerist1 = new PdfPCell(new Phrase("C"+resfc0k.getText(),f5));
            classerist1.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell resistacom = new PdfPCell(new Phrase("Resistência Característica a Compressão Paralela as fibras.",f5));
            PdfPCell comprdf = new PdfPCell(new Phrase(resfc0k.getText()+" MPa",f5));
            comprdf.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell propriedad1 = new PdfPCell(new Phrase("Resistência Característica a Compressão Normal as fibras.",f5));
            PdfPCell dfdfdfd = new PdfPCell(new Phrase(jLabel77.getText()+" MPa",f5));
            dfdfdfd.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell propriedad2 = new PdfPCell(new Phrase("Resistência Característica ao Cisalhamento Paralelo as fibras",f5));
            PdfPCell propriedad3= new PdfPCell(new Phrase(jLabel78.getText()+" MPa",f5));
            propriedad3.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell celulaNome2 = new PdfPCell(new Phrase("Valor médio do módulo de elasticidade na compressão paralela às fibras",f5));
            PdfPCell celulaSexo2 = new PdfPCell(new Phrase(resecom.getText()+" MPa",f5));
            celulaSexo2 .setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell celulaSexo12 = new PdfPCell(new Phrase("Densidade básica",f5));
            PdfPCell celulaSexo121 = new PdfPCell(new Phrase(jLabel72.getText()+" MPa",f5));
            celulaSexo121.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell densidade1 = new PdfPCell(new Phrase("Densidade aparente",f5));
            PdfPCell densidade2 = new PdfPCell(new Phrase(respapa.getText()+" MPa",f5));
            densidade2.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell umidade = new PdfPCell(new Phrase("Umidade",f5));
            PdfPCell umidade2 = new PdfPCell(new Phrase("12%",f5));
            umidade2.setHorizontalAlignment(Element.ALIGN_CENTER);
            /*adicionando as celulas na tabela*/
            float columnWidth[]={300f,100f};
            table1.setTotalWidth(columnWidth);
            table1.addCell(propriedad);
            table1.addCell(categoria);
            table1.addCell(classerist);
            table1.addCell(classerist1);
            table1.addCell(resistacom );
            table1.addCell(comprdf);
            table1.addCell(propriedad1);
            table1.addCell(dfdfdfd);
            table1.addCell(propriedad2);
            table1.addCell(propriedad3);
            table1.addCell(celulaNome2);
            table1.addCell(celulaSexo2);
            table1.addCell(celulaSexo12);
            table1.addCell(celulaSexo121);
            table1.addCell(densidade1);
            table1.addCell(densidade2);
            table1.addCell(umidade);
            table1.addCell(umidade2);
            /*terminar a tabela*/
            
            /*segunda parte do memorial*/
            /*Parágrafo segundo*/
            Paragraph parágrafo2= new Paragraph();
            parágrafo2.setAlignment(Element.ALIGN_JUSTIFIED);
            parágrafo2.setFont(f6);
            parágrafo2.add("Caracterização da Madeira e coeficiente de Modificação (De acordo com a Norma NBR 7190/1997).");
            /*construindo tabela 2*/
            
             /*Tabela de Propriedades da Madeira*/
            PdfPTable table2 = new PdfPTable(2);
            /*construindo as celulas da tabela*/
            
            /*primeira linha tabela 2*/
            PdfPCell Classecarre = new PdfPCell(new Phrase("Especificações para Modificação",f4));
            Classecarre.setBackgroundColor(new BaseColor(223,104,4));
            Classecarre.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell tipodemad = new PdfPCell(new Phrase("Madeira",f4));
            tipodemad.setBackgroundColor(new BaseColor(223,104,4));
            tipodemad.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*segunda linha tabela 2*/
            PdfPCell classecarre1 = new PdfPCell(new Phrase("Classe de Carregamento",f5));
            String classefdv = jComboBox10.getSelectedItem().toString();
            PdfPCell classerist12 = new PdfPCell(new Phrase(classefdv,f5));
            classerist12.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*terceira linha tabela 2*/
            PdfPCell resistacom2 = new PdfPCell(new Phrase("Tipo de Madeira",f5));
            String resistac = jComboBox9.getSelectedItem().toString();
            PdfPCell comprdf2 = new PdfPCell(new Phrase(resistac,f5));
            comprdf2.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*quarta linha tabela 2*/
            PdfPCell propriedad12 = new PdfPCell(new Phrase("Categoria da Madeira",f5));
            String propd = jComboBox15.getSelectedItem().toString();
            PdfPCell dfdfdfd2 = new PdfPCell(new Phrase(propd,f5));
            dfdfdfd2.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*quinta linha tabela 2*/
            PdfPCell propriedad22 = new PdfPCell(new Phrase("Classe de Umidade da Madeira",f5));
            String propd1 = jComboBox13.getSelectedItem().toString();
            PdfPCell propriedad32= new PdfPCell(new Phrase(propd1,f5));
            propriedad32.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*sexta linha tabela 2*/
            PdfPCell celulaNome22 = new PdfPCell(new Phrase("kmod1",f5));
            PdfPCell celulaSexo22 = new PdfPCell(new Phrase(resulkmod4.getText(),f5));
            celulaSexo22.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /* setima linha tabela 2*/
            PdfPCell celulaSexo122 = new PdfPCell(new Phrase("kmod2",f5));
            PdfPCell celulaSexo1212 = new PdfPCell(new Phrase(resulkmod5.getText(),f5));
            celulaSexo1212.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*oitava linha tabela 2*/
            PdfPCell densidade12 = new PdfPCell(new Phrase("kmod3",f5));
            PdfPCell densidade22 = new PdfPCell(new Phrase(resulkmod6.getText(),f5));
            densidade22.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*nona linha tabela 2*/
            PdfPCell umidade21 = new PdfPCell(new Phrase("kmod = kmod1*kmod2*kmod3",f5));
            PdfPCell umidade22 = new PdfPCell(new Phrase(resulkmod7.getText(),f5));
            umidade22.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*adicionando as celulas na tabela 2*/
            float columnWidth1[]={300f,100f};
            table2.setWidthPercentage(70);
            
            table2.addCell(Classecarre);
            table2.addCell(tipodemad);
            table2.addCell(classecarre1);
            table2.addCell(classerist12);
            table2.addCell(resistacom2);
            table2.addCell(comprdf2);
            table2.addCell(propriedad12);
            table2.addCell(dfdfdfd2);
            table2.addCell(propriedad22);
            table2.addCell(propriedad32);
            table2.addCell(celulaNome22);
            table2.addCell(celulaSexo22);
            table2.addCell(celulaSexo122);
            table2.addCell(celulaSexo1212);
            table2.addCell(densidade12);
            table2.addCell(densidade22);
            table2.addCell(umidade21);
            table2.addCell(umidade22);
            
              /*terceira parte do memorial*/
            /*Parágrafo terceira*/
            Paragraph parágrafo3= new Paragraph();
            parágrafo3.setAlignment(Element.ALIGN_JUSTIFIED);
            parágrafo3.setFont(f6);
            parágrafo3.add("Dimensões das Peças de Madeira.");
            
             /*construindo tabela 3*/
            
             /*Tabela de peças de madeira*/
            PdfPTable table3 = new PdfPTable(2);
            /*construindo as celulas da tabela*/
            
            /*primeira linha tabela 3*/
            PdfPCell Classecarre3 = new PdfPCell(new Phrase("Peças de Madeira",f4));
            Classecarre3.setBackgroundColor(new BaseColor(223,104,4));
            Classecarre3.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell tipodemad53 = new PdfPCell(new Phrase("Madeira",f4));
            tipodemad53.setBackgroundColor(new BaseColor(223,104,4));
            tipodemad53.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*segunda linha tabela 3*/
            
            PdfPCell classecarre13 = new PdfPCell(new Phrase("t1 (espessura da peça 1)",f5));
            PdfPCell classerist123 = new PdfPCell(new Phrase(espessurat1.getText()+" cm",f5));
            classerist123.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*terceira linha tabela 3*/
            PdfPCell resistacom23 = new PdfPCell(new Phrase("t2 (espessura da peça do meio 2)",f5));
            PdfPCell comprdf23 = new PdfPCell(new Phrase(espessurat2.getText()+" cm",f5));
            comprdf23.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            
            /*sexta linha tabela 3*/
            PdfPCell celulaNome223 = new PdfPCell(new Phrase("Comprimento de União dos Elementos.",f5));
            PdfPCell celulaSexo223 = new PdfPCell(new Phrase(compr.getText()+" cm",f5));
            celulaSexo223.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /* setima linha tabela 3*/
            PdfPCell celulaSexo1223 = new PdfPCell(new Phrase("Largura das Peças de Madeira",f5));
            PdfPCell celulaSexo12123 = new PdfPCell(new Phrase(larguralig.getText()+" cm",f5));
            celulaSexo12123.setHorizontalAlignment(Element.ALIGN_CENTER);
            
           /*oitava linha tabela 3*/
            String angulo = null;
            if(ang90.isSelected()){
                angulo = "90";
            }
            if(am0.isSelected()){
                angulo = "0";
            }
            if(angdif.isSelected()){
                angulo = valorangdif.getText().toString();
            }
            PdfPCell densidade123 = new PdfPCell(new Phrase("Ângulo entre elemento 2 e os demais.",f5));
            PdfPCell densidade223 = new PdfPCell(new Phrase(angulo,f5));
            densidade223.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*adicionando as celulas na tabela 3*/
            float columnWidth3[]={300f,100f};
            table3.setWidthPercentage(50);
            table3.setTotalWidth(columnWidth1);
            table3.addCell(Classecarre3);
            table3.addCell(tipodemad53);
            table3.addCell(classecarre13);
            table3.addCell(classerist123);
            table3.addCell(resistacom23);
            table3.addCell(comprdf23);
            table3.addCell(celulaNome223);
            table3.addCell(celulaSexo223);
            table3.addCell(celulaSexo1223);
            table3.addCell(celulaSexo12123);
            table3.addCell(densidade123);
            table3.addCell(densidade223);
            
              /*Quarta parte do memorial*/
            /*Parágrafo quarto*/
            Paragraph parágrafo4= new Paragraph();
            parágrafo4.setAlignment(Element.ALIGN_JUSTIFIED);
            parágrafo4.setFont(f6);
            parágrafo4.add("Combinação de Ações. (Combinação Normal, Desfavorável).");
            
            /*construindo tabela 4*/
            
             /*Tabela de peças de madeira*/
            PdfPTable table4 = new PdfPTable(3);
            /*construindo as celulas da tabela*/
            
            /*primeira linha tabela 4*/
            PdfPCell Classecarre34 = new PdfPCell(new Phrase("Ações",f4));
            Classecarre34.setHorizontalAlignment(Element.ALIGN_CENTER);
            Classecarre34.setBackgroundColor(new BaseColor(223,104,4));
            PdfPCell tipodemad534 = new PdfPCell(new Phrase("Característica",f4));
            tipodemad534.setHorizontalAlignment(Element.ALIGN_CENTER);
            tipodemad534.setBackgroundColor(new BaseColor(223,104,4));
            PdfPCell classecarre134 = new PdfPCell(new Phrase("Valor(kN)",f4));
            classecarre134.setHorizontalAlignment(Element.ALIGN_CENTER);
            classecarre134.setBackgroundColor(new BaseColor(223,104,4));
            
            /*segunda linha tabela 4*/
            PdfPCell classerist1234 = new PdfPCell(new Phrase("Ações Permanentes",f5));
            classerist1234.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell tipodemad5341 = new PdfPCell(new Phrase(Tipodevariabilidade.getSelectedItem().toString(),f5));
            tipodemad5341.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell classecarre1341 = new PdfPCell(new Phrase(permanente.getText(),f5));
            classecarre1341.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*terceira linha tabela 4*/
            PdfPCell resistacom234 = new PdfPCell(new Phrase("Ações Variáveis (Sobrecarga)",f5));
            resistacom234.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell comprdf234 = new PdfPCell(new Phrase(variavel.getSelectedItem().toString(),f5));
            comprdf234.setHorizontalAlignment(Element.ALIGN_CENTER);
             PdfPCell propriedad1234 = new PdfPCell(new Phrase(sobrecarga.getText(),f5));
             propriedad1234.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*quarta linha tabela 4*/
            PdfPCell dfdfdfd234 = new PdfPCell(new Phrase("Vento",f5));
            dfdfdfd234.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell propriedad2234 = new PdfPCell(new Phrase(variavel.getSelectedItem().toString(),f5));
            propriedad2234.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell propriedad3234= new PdfPCell(new Phrase(vento.getText(),f5));
            propriedad3234.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*quarta linha tabela 4*/
            PdfPCell lin4col1tab4 = new PdfPCell(new Phrase("Força Majorada pela Combinação Sobrecarga Ação Variável Principal",f5));
            lin4col1tab4.setColspan(2);
            lin4col1tab4.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell lin4col2tab4 = new PdfPCell(new Phrase(resultperma1.getText()+" kN",f5));
            lin4col2tab4.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*quinta linha tabela 4*/
            PdfPCell lin5col1tab4 = new PdfPCell(new Phrase("Força Majorada pela Combinação Vento como Ação Variável Principal",f5));
            lin5col1tab4.setColspan(2);
            lin5col1tab4.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell lin5col2tab4 = new PdfPCell(new Phrase(resultvent1.getText()+" kN",f5));
            lin5col2tab4.setHorizontalAlignment(Element.ALIGN_CENTER);
           
            /*adicionando as celulas na tabela 4*/
            float columnWidth4[]={100f,100f,100f};
            table4.setTotalWidth(columnWidth4);
            table4.addCell(Classecarre34);
            table4.addCell(tipodemad534);
            table4.addCell(classecarre134);
            table4.addCell(classerist1234);
            table4.addCell(tipodemad5341);
            table4.addCell(classecarre1341 );
            table4.addCell(resistacom234);
            table4.addCell(comprdf234);
            table4.addCell(propriedad1234);
            table4.addCell(dfdfdfd234);
            table4.addCell(propriedad2234);
            table4.addCell(propriedad3234);
            table4.addCell(lin4col1tab4);
            table4.addCell(lin4col2tab4);
            table4.addCell(lin5col1tab4);
            table4.addCell(lin5col2tab4);

               /*Quinta parte do memorial*/
            /*Parágrafo Quinto*/
            Paragraph parágrafo5= new Paragraph();
            parágrafo5.setAlignment(Element.ALIGN_JUSTIFIED);
            parágrafo5.setFont(f6);
            parágrafo5.add("Fatores de Utilização");
            
            /*construindo tabela 5*/
            
             /*Tabela de peças de madeira*/
            PdfPTable table5 = new PdfPTable(2);
            /*construindo as celulas da tabela*/
            
            /*primeira linha tabela 5*/
            PdfPCell Classecarre35 = new PdfPCell(new Phrase("Fatores de Utilização",f4));
            Classecarre35.setHorizontalAlignment(Element.ALIGN_CENTER);
            Classecarre35.setBackgroundColor(new BaseColor(223,104,4));
            PdfPCell tipodemad535 = new PdfPCell(new Phrase("Adotado",f4));
            tipodemad535.setHorizontalAlignment(Element.ALIGN_CENTER);
            tipodemad535.setBackgroundColor(new BaseColor(223,104,4));
            
            /*segunda linha tabela 5*/
            PdfPCell classecarre135 = new PdfPCell(new Phrase("Ações em Estruturas Correntes",f5));
            PdfPCell classerist1235 = new PdfPCell(new Phrase(acoescorrentes.getSelectedItem().toString(),f5));
    
            /*terceira linha tabela 5*/
            PdfPCell resistacom235 = new PdfPCell(new Phrase("Cargas Acidentais dos Edifícios ",f5));
        /*Cargas acidentais dos edifícios*/
        String h1 = null;
        String aci = cargasacid.getSelectedItem().toString();
        if("Não há pred. de Equipamentos Fixos nem de el. concentr".equals(aci)){
            h1 = "Locais em que não há predominância de pesos de equipamentos fixos,ou de elevadas concentrações de pessoas";
        }
        if("Há pred. de Equipamentos Fixos ou de elev. Concentração.".equals(aci)){
            h1 = "Locais onde há predominância de pesos de equipamentos fixos, ou de elevadas concentrações de pessoas";
        }
        if("Bibliotecas, arquivos, oficinas ou garagens".equals(aci)){
            h1 = "Bibliotecas, arquivos, oficinas e garagens";
        }
            PdfPCell comprdf235 = new PdfPCell(new Phrase(h1,f5));
            
            /*adicionando as celulas na tabela 5*/
            table5.setWidthPercentage(100);
            table5.addCell(Classecarre35);
            table5.addCell(tipodemad535);
            table5.addCell(classecarre135);
            table5.addCell(classerist1235);
            table5.addCell(resistacom235);
            table5.addCell(comprdf235);
         
            
               /*Sexta parte do memorial*/
            /*Parágrafo quarto*/
            Paragraph parágrafo6= new Paragraph();
            parágrafo6.setAlignment(Element.ALIGN_JUSTIFIED);
            parágrafo6.setFont(f6);
            parágrafo6.add("Parâmetros de Cálculo da Ligação.");
            
            /*construindo tabela 6*/
            
             /*Tabela de peças de madeira*/
            PdfPTable table6 = new PdfPTable(3);
            /*construindo as celulas da tabela 6*/
            
             /*primeira linha tabela 6*/
            PdfPCell Classecarre361 = new PdfPCell(new Phrase("Parâmetros de Cálculo para a Madeira",f4));
            Classecarre361.setRowspan(4);
            try {
                 com.itextpdf.text.Image hei = com.itextpdf.text.Image.getInstance("C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\imagemtexturamadeira.jpg"); 
                 
                 Classecarre361.setImage(hei);
                 Classecarre361.setVerticalAlignment(Element.ALIGN_MIDDLE);
                 Classecarre361.setHorizontalAlignment(Element.ALIGN_CENTER);
                 
             } catch (BadElementException | IOException ex) {
                 Logger.getLogger(TelaCorteSimples10.class.getName()).log(Level.SEVERE, null, ex);
             }
            Classecarre361.setHorizontalAlignment(Element.ALIGN_CENTER);
             
            /*primeira linha tabela 6*/
            PdfPCell Classecarre36 = new PdfPCell(new Phrase("Parâmetros de Resistência para a Madeira",f4));
            Classecarre36.setBackgroundColor(new BaseColor(223,104,4));
            Classecarre36.setColspan(2);
            Classecarre36.setHorizontalAlignment(Element.ALIGN_CENTER);
            
           
            
            /*segunda linha tabela 6*/
            PdfPCell classecarre136 = new PdfPCell(new Phrase("Resistência de Compressão paralela as fibras (fc0d).",f5));
            PdfPCell classerist1236 = new PdfPCell(new Phrase(jLabel93.getText()+" kN/cm²",f5));
            classerist1236.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*terceira linha tabela 6*/
            PdfPCell resistacom236 = new PdfPCell(new Phrase("Resistência ao Compressão normal as fibras (fc90d).",f5));
            PdfPCell comprdf236 = new PdfPCell(new Phrase(jLabel94.getText()+" kN/cm²",f5));
            comprdf236.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*quarta linha tabela 6*/
            PdfPCell propriedad1236 = new PdfPCell(new Phrase("Resistência ao Cisalhamento paralelo as fibras (fv0d). ",f5));
            PdfPCell dfdfdfd236 = new PdfPCell(new Phrase(resutembut1.getText()+" kN/cm²",f5));
            dfdfdfd236.setHorizontalAlignment(Element.ALIGN_CENTER);        
            
            /*adicionadno imagem*/
            
            /*adicionando as celulas na tabela 6*/
            float columnWidth6[] = {30,120,60};
            table6.setWidths(columnWidth6);
            table6.setWidthPercentage(80);
            table6.addCell(Classecarre361);
            table6.addCell(Classecarre36);
            table6.addCell(classecarre136);
            table6.addCell(classerist1236);
            table6.addCell(resistacom236);
            table6.addCell(comprdf236);
            table6.addCell(propriedad1236);
            table6.addCell(dfdfdfd236);
            
               /*construindo tabela 7*/
            
             /*Tabela de peças de madeira*/
            PdfPTable table7 = new PdfPTable(3);
            /*construindo as celulas da tabela 6*/
            
            PdfPCell Classecarre3671 = new PdfPCell(new Phrase("",f4));
            Classecarre3671.setRowspan(5);
            Classecarre3671.setHorizontalAlignment(Element.ALIGN_CENTER);
            try {
                 com.itextpdf.text.Image hei1 = com.itextpdf.text.Image.getInstance("C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\anelmetalico.JPG"); 
                 
                 Classecarre3671.setImage(hei1);
                 Classecarre3671.setVerticalAlignment(Element.ALIGN_MIDDLE);
                 Classecarre3671.setHorizontalAlignment(Element.ALIGN_CENTER);
                 
             } catch (BadElementException | IOException ex) {
                 Logger.getLogger(TelaCorteSimples10.class.getName()).log(Level.SEVERE, null, ex);
             }
            /*primeira linha tabela 7*/
            PdfPCell Classecarre367 = new PdfPCell(new Phrase("Parâmetros de Cálculo para Anel Metálico",f4));
            Classecarre367.setBackgroundColor(new BaseColor(223,104,4));
            Classecarre367.setColspan(2);
            Classecarre367.setHorizontalAlignment(Element.ALIGN_CENTER);
           
            
            /*segunda linha tabela 7*/
            PdfPCell classecarre1367 = new PdfPCell(new Phrase("Diâmetro do Anel Metálico",f5));
            PdfPCell classerist12367 = new PdfPCell(new Phrase(jComboBox4.getSelectedItem().toString()+" mm",f5));
            classerist12367.setHorizontalAlignment(Element.ALIGN_CENTER);
            String espesu = null;
            String diapar = null;
             /*quarta linha tabela 7*/
            if("64".equals(jComboBox4.getSelectedItem().toString())){
                espesu = "4 mm";
                diapar = "12 mm";
            }
            if("102".equals(jComboBox4.getSelectedItem().toString())){
                espesu = "5 mm";
                diapar = "19 mm";
            }
            PdfPCell propriedad12367 = new PdfPCell(new Phrase("Espessura mínima do Anel",f5));
            PdfPCell dfdfdfd2367 = new PdfPCell(new Phrase(espesu,f5));
            dfdfdfd2367.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*quarta linha tabela 7*/
            PdfPCell propriedadkl = new PdfPCell(new Phrase("Diâmetro do Parafuso Acompanhado",f5));
            PdfPCell dfd = new PdfPCell(new Phrase(diapar,f5));
            dfd.setHorizontalAlignment(Element.ALIGN_CENTER);
            /*terceira linha tabela 7*/
            
            /*quarta linha tabela 7*/
            PdfPCell propriedadkp = new PdfPCell(new Phrase("Penetração do Anel Metálico",f5));
            PdfPCell dfd23 = new PdfPCell(new Phrase(perf.getText()+" mm",f5));
            dfd23.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            /*adicionando as celulas na tabela 7*/
            float columnWidth7[] = {30,120,30};
            table7.setWidths(columnWidth7);
            table7.setWidthPercentage(100);
            table7.addCell(Classecarre3671);
            table7.addCell(Classecarre367);
            table7.addCell(classecarre1367);
            table7.addCell(classerist12367);
            table7.addCell(propriedad12367);
            table7.addCell(dfdfdfd2367);
            table7.addCell(propriedadkl);
            table7.addCell(dfd);
            table7.addCell(propriedadkp);
            table7.addCell(dfd23);

             /*construindo tabela 9*/
            
             /*Tabela de peças de madeira*/
            PdfPTable table9 = new PdfPTable(2);
            /*construindo as celulas da tabela 6*/
            
          
            /*primeira linha tabela 9*/
            PdfPCell Classecarre36789 = new PdfPCell(new Phrase("Parâmetros de Resistência do Anel Metálico",f4));
            Classecarre36789.setColspan(2);
            Classecarre36789.setBackgroundColor(new BaseColor(223,104,4));
            Classecarre36789.setHorizontalAlignment(Element.ALIGN_CENTER);
           
            /*segunda linha tabela 9*/
            PdfPCell classecarre136789 = new PdfPCell(new Phrase("Resistência (R1)",f5));
            classecarre136789.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell classerist1236789 = new PdfPCell(new Phrase(jLabel87.getText()+" kN",f5));
            classerist1236789.setHorizontalAlignment(Element.ALIGN_CENTER);
            
          
            /*terceira linha tabela 9*/
            PdfPCell resistacom236789 = new PdfPCell(new Phrase("Resistência (R2)",f5));
            resistacom236789.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell comprdf236789 = new PdfPCell(new Phrase(jLabel88.getText()+" kN",f5));
            comprdf236789.setHorizontalAlignment(Element.ALIGN_CENTER);
            
          
            
            /*adicionando as celulas na tabela 9*/
            table9.setHorizontalAlignment(Element.ALIGN_CENTER);
            table9.setWidthPercentage(85);
            table9.addCell(Classecarre36789);
            table9.addCell(classecarre136789);
            table9.addCell(classerist1236789);
            table9.addCell(resistacom236789);
            table9.addCell(comprdf236789);

            double disthorimin;
        String disthorimin1 = null;
        double disthorbor;
        String disthorbor1 = null;
        double distvercima;
        String distvercima1 = null;
        double distverbaixo;
        String distverbaixo1 = null;
        String diametropara1 = jComboBox4.getSelectedItem().toString();
        double diametropara = Double.parseDouble(diametropara1);
        if(liganel1.isSelected()){
        if(am0.isSelected() || angdif.isSelected()){
        if("Tração".equals(jLabel20.getText().toString())){
            /*espaçamento mínimo entre aneis horizontal */
            disthorimin = 1.5*diametropara/10;
            disthorimin1 = String.valueOf(disthorimin);
            /*espaçamento borda horizontal*/
            disthorbor = 1.5*diametropara/10;
            disthorbor1 = String.valueOf(disthorbor);
            /*espaçamento borda vertical em cima*/
            distvercima = 0.75*diametropara/10;
            distvercima1= String.valueOf(distvercima);
            /*espaçamento borda vertical em baixo*/
            distverbaixo = 0.75*diametropara/10;
            distverbaixo1= String.valueOf(distverbaixo);

        }
        if("Compressão".equals(jLabel20.getText().toString())){
           /*espaçamento mínimo entre aneis horizontal */
            disthorimin = 1.5*diametropara/10;
            disthorimin1 = String.valueOf(disthorimin);
            /*espaçamento borda horizontal*/
            disthorbor = 1.0*diametropara/10;
            disthorbor1 = String.valueOf(disthorbor);
            /*espaçamento borda vertical em cima*/
            distvercima = 0.75*diametropara/10;
            distvercima1= String.valueOf(distvercima);
            /*espaçamento borda vertical em baixo*/
            distverbaixo = 0.75*diametropara/10;
            distverbaixo1= String.valueOf(distverbaixo);
        }
        }
        if(ang90.isSelected()){
             if("Tração".equals(jLabel20.getText().toString())){
            /*espaçamento mínimo entre aneis na horizontal*/
            disthorimin = 3*diametropara/10;
            disthorimin1 = String.valueOf(disthorimin);
            /*espaçamento borda horizontal*/
            disthorbor = 0.75*diametropara/10;
            disthorbor1= String.valueOf(disthorbor);
            /*espaçamento borda vertical em cima*/
            distvercima = 1*diametropara/10;
            distvercima1= String.valueOf(distvercima);
            /*espaçamento borda vertical em baixo*/
            distverbaixo = 1.5*diametropara/10;
            distverbaixo1 = String.valueOf(distverbaixo);
     
        }
        if("Compressão".equals(jLabel20.getText().toString())){
           /*espaçamento mínimo entre aneis na horizontal*/
            disthorimin = 3*diametropara/10;
            disthorimin1 = String.valueOf(disthorimin);
            /*espaçamento borda horizontal*/
            disthorbor = 0.75*diametropara/10;
            disthorbor1= String.valueOf(disthorbor);
            /*espaçamento borda vertical em cima*/
            distvercima = 0.75*diametropara/10;
            distvercima1= String.valueOf(distvercima);
            /*espaçamento borda vertical em baixo*/
            distverbaixo = 1.5*diametropara/10;
            distverbaixo1 = String.valueOf(distverbaixo);
    
        }
        }
        }
        
            
             /*Tabela de Propriedades da Madeira*/
            PdfPTable table11 = new PdfPTable(2);
            /*construindo as celulas da tabela*/
            
            PdfPCell propriedad4 = new PdfPCell(new Phrase("Resultados Finais",f4));
            propriedad4.setColspan(2);
            propriedad4.setHorizontalAlignment(Element.ALIGN_CENTER);
            propriedad4.setBackgroundColor(new BaseColor(223,104,4));
            PdfPCell categoria4 = new PdfPCell(new Phrase("Força Solitante Majorada ",f5));
            categoria4.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell classerist4 = new PdfPCell(new Phrase(jLabel75.getText()+jLabel76.getText(),f5));
            classerist4.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell classerist14 = new PdfPCell(new Phrase("Esforço Solicitante",f5));
            classerist14.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell resistacom4 = new PdfPCell(new Phrase(jLabel20.getText(),f5));
            resistacom4.setHorizontalAlignment(Element.ALIGN_CENTER);
            double numeprego = Double.parseDouble(jLabel92.getText());
            String hid;
                hid = jLabel92.getText();
            
            PdfPCell comprdf4 = new PdfPCell(new Phrase(hid,f5));
            comprdf4.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell propriedad14 = new PdfPCell(new Phrase("Número de Pinos Mínimos necessários",f5));
            propriedad14.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell dfdfdfd4 = new PdfPCell(new Phrase("Espaçamento Mínimo entre Anéis na Horizontal",f5));
            dfdfdfd4.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell propriedad24 = new PdfPCell(new Phrase(disthorimin1+" cm",f5));
            propriedad24.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell celulaSexo24 = new PdfPCell(new Phrase("Espaçamento Mínimo do Anel até a Borda Horizontal",f5));
            celulaSexo24.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell celulaSexo124 = new PdfPCell(new Phrase(disthorbor1+" cm",f5));
            celulaSexo124.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell umidade24 = new PdfPCell(new Phrase("Espaçamento mínimo do Anel até a Borda Vertical em cima",f5));
            umidade24.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell umidade242 = new PdfPCell(new Phrase(distvercima1+" cm",f5));
            umidade242.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell umidade241 = new PdfPCell(new Phrase("Espaçamento mínimo do Anel até a Borda Vertical em baixo",f5));
            umidade241.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell umidade244 = new PdfPCell(new Phrase(distverbaixo1+" cm",f5));
            umidade244.setHorizontalAlignment(Element.ALIGN_CENTER);
            /*adicionando as celulas na tabela*/
            float columnWidth11[]={75f,25f};
            table11.setTotalWidth(columnWidth11);
            table11.setWidthPercentage(100);
            table11.addCell(propriedad4);
            table11.addCell(categoria4);
            table11.addCell(classerist4);
            table11.addCell(classerist14);
            table11.addCell(resistacom4);
            table11.addCell(propriedad14);
            table11.addCell(comprdf4);
            table11.addCell(dfdfdfd4);
            table11.addCell(propriedad24);
            table11.addCell(celulaSexo24);
            table11.addCell(celulaSexo124);
            table11.addCell(umidade24);
            table11.addCell(umidade242);
            table11.addCell(umidade241);
            table11.addCell(umidade244);
            /*terminar a tabela*/
            
            /*incluindo items no documento*/
            documento.add(titulo);
            documento.add(espaçamento1);
            String imagemcorte = null;
            if(angdif.isSelected()){
                imagemcorte = "C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\imagemcortesimplesincl.JPG";
            }
            if(ang90.isSelected()){
                 imagemcorte = "C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\Imagemcortesimples90.JPG";
            }
            if(am0.isSelected()){
                 imagemcorte = "C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\imagemcortesimples0.JPG";
            }
            try {
                 com.itextpdf.text.Image hei = com.itextpdf.text.Image.getInstance(imagemcorte); 
                 hei.scaleAbsolute(300,150);
              
                 float x = (PageSize.A4.getWidth()-hei.getScaledWidth())/2;
                 hei.setAlignment((int) x);
                 documento.add(hei);
                 
             } catch (BadElementException | IOException ex) {
                 Logger.getLogger(TelaCorteSimples10.class.getName()).log(Level.SEVERE, null, ex);
             }
             try {
                 com.itextpdf.text.Image heip = com.itextpdf.text.Image.getInstance("C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\Imagem1.png"); 
                 heip.setAbsolutePosition(500, TOP_ALIGNMENT);
                 heip.scaleAbsoluteHeight(PageSize.A4.getHeight()/2);
                 heip.scaleAbsoluteWidth(100);
                 heip.setAlignment(Element.ALIGN_RIGHT);
                 documento.add(heip);
                 
             } catch (BadElementException | IOException ex) {
                 Logger.getLogger(TelaCorteSimples10.class.getName()).log(Level.SEVERE, null, ex);
             }
              try {
                 com.itextpdf.text.Image heip = com.itextpdf.text.Image.getInstance("C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\Imagem1.png"); 
                 heip.setRotationDegrees(180);
                 heip.setAbsolutePosition(0,PageSize.A4.getHeight()/2);
                 heip.scaleAbsoluteHeight(PageSize.A4.getHeight()/2);
                 heip.scaleAbsoluteWidth(100);
                
                 documento.add(heip);
                 
             } catch (BadElementException | IOException ex) {
                 Logger.getLogger(TelaCorteSimples10.class.getName()).log(Level.SEVERE, null, ex);
             }
            parágrafo1.setAlignment(Element.ALIGN_CENTER);
            documento.add(parágrafo1);
            documento.add(espaçamento1);
            documento.add(table1);
            documento.add(espaçamento1);
            parágrafo2.setAlignment(Element.ALIGN_CENTER);
            documento.add(parágrafo2);
            documento.add(espaçamento1);
            documento.add(table2);
            documento.add(espaçamento1);
            parágrafo3.setAlignment(Element.ALIGN_CENTER);
            documento.add(parágrafo3);
            documento.add(espaçamento1);
            documento.add(table3);
            documento.add(espaçamento1);
            documento.add(espaçamento1);
             parágrafo4.setAlignment(Element.ALIGN_CENTER);
            documento.add(parágrafo4);
            documento.add(espaçamento1);
            documento.add(table4);
            documento.add(espaçamento1);
            documento.add(table5);
              try {
                 com.itextpdf.text.Image heip = com.itextpdf.text.Image.getInstance("C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\Imagem1.png"); 
                 heip.setAbsolutePosition(500, TOP_ALIGNMENT);
                 heip.scaleAbsoluteHeight(PageSize.A4.getHeight()/2);
                 heip.scaleAbsoluteWidth(100);
                 heip.setAlignment(Element.ALIGN_RIGHT);
                 documento.add(heip);
                 
             } catch (BadElementException | IOException ex) {
                 Logger.getLogger(TelaCorteSimples10.class.getName()).log(Level.SEVERE, null, ex);
             }
              try {
                 com.itextpdf.text.Image heip = com.itextpdf.text.Image.getInstance("C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\Imagem1.png"); 
                 heip.setRotationDegrees(180);
                 heip.setAbsolutePosition(0,PageSize.A4.getHeight()/2);
                 heip.scaleAbsoluteHeight(PageSize.A4.getHeight()/2);
                 heip.scaleAbsoluteWidth(100);
                
                 documento.add(heip);
                 
             } catch (BadElementException | IOException ex) {
                 Logger.getLogger(TelaCorteSimples10.class.getName()).log(Level.SEVERE, null, ex);
             }
            documento.add(espaçamento1);
            parágrafo6.setAlignment(Element.ALIGN_CENTER);
            documento.add(parágrafo6);
            documento.add(espaçamento1);
            documento.add(table6);
            documento.add(espaçamento1);
            documento.add(table7);
            documento.add(espaçamento1);
            documento.add(table9);
            documento.add(espaçamento1);
            documento.add(espaçamento1);
             try {
                 com.itextpdf.text.Image heip = com.itextpdf.text.Image.getInstance("C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\Imagem1.png"); 
                 heip.setAbsolutePosition(500, TOP_ALIGNMENT);
                 heip.scaleAbsoluteHeight(PageSize.A4.getHeight()/2);
                 heip.scaleAbsoluteWidth(100);
                 heip.setAlignment(Element.ALIGN_RIGHT);
                 documento.add(heip);
                 
             } catch (BadElementException | IOException ex) {
                 Logger.getLogger(TelaCorteSimples10.class.getName()).log(Level.SEVERE, null, ex);
             }
              try {
                 com.itextpdf.text.Image heip = com.itextpdf.text.Image.getInstance("C:\\Users\\mathe\\Documents\\NetBeansProjects\\ProjetoMadeira\\src\\imagens\\Imagem1.png"); 
                 heip.setRotationDegrees(180);
                 heip.setAbsolutePosition(0,PageSize.A4.getHeight()/2);
                 heip.scaleAbsoluteHeight(PageSize.A4.getHeight()/2);
                 heip.scaleAbsoluteWidth(100);
                
                 documento.add(heip);
                 
             } catch (BadElementException | IOException ex) {
                 Logger.getLogger(TelaCorteSimples10.class.getName()).log(Level.SEVERE, null, ex);
             }
            documento.add(table11);
            
                    } catch (FileNotFoundException | DocumentException ex) {
           System.out.println("error");
        }finally{
            documento.close();
        }
        try {
            Desktop.getDesktop().open(new File("Memorial de Cálculo Corte Simples.pdf"));
        } catch (IOException ex) {
            Logger.getLogger(TelaCorteSimples10.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox9ActionPerformed
 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCorteSimples10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCorteSimples10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCorteSimples10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCorteSimples10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCorteSimples10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bitola;
    private javax.swing.JPanel Escolhamadeira;
    private javax.swing.JPanel Resultadoparafuso;
    private javax.swing.JComboBox<String> Tipodevariabilidade;
    private javax.swing.JComboBox<String> acoescorrentes;
    private javax.swing.JLabel alfaetext;
    private javax.swing.JRadioButton am0;
    private javax.swing.JRadioButton ang90;
    private javax.swing.JRadioButton angdif;
    private javax.swing.JLabel bet;
    private javax.swing.JLabel betlimite;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JComboBox<String> cargasacid;
    private javax.swing.JComboBox<String> cavj;
    private javax.swing.JComboBox<String> combinação;
    private javax.swing.JTextField compr;
    private javax.swing.JLabel comprprego;
    private javax.swing.JLabel diam;
    private javax.swing.JLabel diam1;
    private javax.swing.JLabel diametroprego;
    private javax.swing.JPanel escolhacavilha;
    private javax.swing.JPanel escolhadacarga;
    private javax.swing.JLabel escolheraligação;
    private javax.swing.JComboBox<String> escopara;
    private javax.swing.JComboBox<String> escoprego;
    private javax.swing.JTextField espessurat1;
    private javax.swing.JTextField espessurat2;
    private javax.swing.JLabel fundodatelaligação;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox15;
    private javax.swing.JComboBox<String> jComboBox16;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JLabel jlabelre;
    private javax.swing.JTextField larguralig;
    private javax.swing.JRadioButton ligacaocavilha1;
    private javax.swing.JRadioButton liganel1;
    private javax.swing.JRadioButton ligaçãoparafusada1;
    private javax.swing.JRadioButton ligpara;
    private javax.swing.JRadioButton ligprego;
    private javax.swing.JLabel numpara;
    private javax.swing.JComboBox<String> paraefeitos;
    private javax.swing.JLabel penmini;
    private javax.swing.JTextField perf;
    private javax.swing.JTextField permanente;
    private javax.swing.JPanel pregoeparafuso;
    private javax.swing.JLabel rescomcal;
    private javax.swing.JLabel rescomcal1;
    private javax.swing.JLabel resecom;
    private javax.swing.JLabel resfc0k;
    private javax.swing.JLabel respapa;
    private javax.swing.JLabel resulkmod;
    private javax.swing.JLabel resulkmod1;
    private javax.swing.JLabel resulkmod2;
    private javax.swing.JLabel resulkmod3;
    private javax.swing.JLabel resulkmod4;
    private javax.swing.JLabel resulkmod5;
    private javax.swing.JLabel resulkmod6;
    private javax.swing.JLabel resulkmod7;
    private javax.swing.JPanel resultadoscavilha;
    private javax.swing.JPanel resultadosdospregos;
    private javax.swing.JPanel resultanel;
    private javax.swing.JLabel resultperma;
    private javax.swing.JLabel resultperma1;
    private javax.swing.JLabel resultvent;
    private javax.swing.JLabel resultvent1;
    private javax.swing.JLabel resutembut;
    private javax.swing.JLabel resutembut1;
    private javax.swing.JRadioButton selco;
    private javax.swing.JRadioButton seldico;
    private javax.swing.JTextField sobrecarga;
    private javax.swing.JLabel teladefundoprincipal;
    private javax.swing.JPanel telaescolhaanel;
    private javax.swing.JPanel tipodeligaçãoaserescolhida;
    private javax.swing.JTextField valorangdif;
    private javax.swing.JComboBox<String> variavel;
    private javax.swing.JTextField vento;
    // End of variables declaration//GEN-END:variables
}
