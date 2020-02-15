
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class MainPage extends javax.swing.JFrame {
    
    Connection con;
    public MainPage() {
        initComponents();
        connectdb();
        
    }
    public void connectdb() 
    {
        
        try
        {
            con=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\asus\\Desktop\\staj.db");
            JOptionPane.showMessageDialog(null, "Veritabanına Bağlandı");
            
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Veritabanına Bağlanılamadı");
        }
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        Komisyon = new javax.swing.JPanel();
        Komisyonici = new javax.swing.JTabbedPane();
        Olustur = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        k_ekle_no = new javax.swing.JTextField();
        k_ekle_isim = new javax.swing.JTextField();
        k_ekle_soyad = new javax.swing.JTextField();
        k_kaydetbut = new javax.swing.JButton();
        Guncelle = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        kg_eski_no = new javax.swing.JTextField();
        kg_eski_ad = new javax.swing.JTextField();
        kg_eski_soyad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        kg_yeni_no = new javax.swing.JTextField();
        kg_yeni_ad = new javax.swing.JTextField();
        k_guncellebutton = new javax.swing.JButton();
        kg_yeni_soyad = new javax.swing.JTextField();
        Sil = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        ks_no = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        komisyon_sil = new javax.swing.JButton();
        üye_sil = new javax.swing.JButton();
        küs_no = new javax.swing.JTextField();
        küs_ad = new javax.swing.JTextField();
        Mulakat = new javax.swing.JPanel();
        KomisyonInfo = new javax.swing.JPanel();
        kseccombo = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        muye1 = new javax.swing.JTextField();
        muye2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        OgrenciBilgi = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        mograd = new javax.swing.JTextField();
        mogrsoyad = new javax.swing.JTextField();
        sinifcombo = new javax.swing.JComboBox<>();
        mogrno = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        ogretimtex = new javax.swing.JTextField();
        StajInfo = new javax.swing.JPanel();
        argecheck = new javax.swing.JCheckBox();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        ssehir = new javax.swing.JTextField();
        stopgun = new javax.swing.JTextField();
        basdatechooser = new datechooser.beans.DateChooserCombo();
        bitişdatechooser = new datechooser.beans.DateChooserCombo();
        krumadicombo = new javax.swing.JComboBox<>();
        mulakat = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        devamspin = new javax.swing.JSpinner();
        cabaspin = new javax.swing.JSpinner();
        vaktindeisspin = new javax.swing.JSpinner();
        amirspin = new javax.swing.JSpinner();
        arkadaşdavspin = new javax.swing.JSpinner();
        mdproje = new javax.swing.JTextField();
        mdduzen = new javax.swing.JTextField();
        mdsunum = new javax.swing.JTextField();
        mdiçerik = new javax.swing.JTextField();
        mdmulakatsonuc = new javax.swing.JTextField();
        mgunhesaplabuton = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        mkedilengun = new javax.swing.JTextField();
        mulakattarihlabel = new javax.swing.JLabel();
        msonucbuton = new javax.swing.JButton();
        Listeler = new javax.swing.JPanel();
        mulakatkayıtpane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        msorgubasdatechooser = new datechooser.beans.DateChooserCombo();
        msorgubitisdate = new datechooser.beans.DateChooserCombo();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lsorguono = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        OgrenciBilgi1 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        mogrno1 = new javax.swing.JTextField();
        mograd1 = new javax.swing.JTextField();
        mogrsoyad1 = new javax.swing.JTextField();
        ogretimcombo1 = new javax.swing.JComboBox<>();
        sinifcombo1 = new javax.swing.JComboBox<>();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        mutarihchooser1 = new datechooser.beans.DateChooserCombo();
        musaatspinner1 = new javax.swing.JSpinner();
        mudakkaspinner1 = new javax.swing.JSpinner();
        mulakatkayıtbutton = new javax.swing.JButton();
        mulakatkayıtexcel = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        Komisyonici.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Komisyon No:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Üye İsim:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Üye Soyisim:");

        k_ekle_no.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        k_ekle_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                k_ekle_noKeyPressed(evt);
            }
        });

        k_ekle_isim.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        k_ekle_isim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                k_ekle_isimKeyPressed(evt);
            }
        });

        k_ekle_soyad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        k_ekle_soyad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                k_ekle_soyadKeyPressed(evt);
            }
        });

        k_kaydetbut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        k_kaydetbut.setText("Kaydet");
        k_kaydetbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k_kaydetbutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OlusturLayout = new javax.swing.GroupLayout(Olustur);
        Olustur.setLayout(OlusturLayout);
        OlusturLayout.setHorizontalGroup(
            OlusturLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OlusturLayout.createSequentialGroup()
                .addGap(0, 506, Short.MAX_VALUE)
                .addGroup(OlusturLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OlusturLayout.createSequentialGroup()
                        .addGroup(OlusturLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(OlusturLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(k_ekle_soyad, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(OlusturLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(OlusturLayout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(k_ekle_isim, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(OlusturLayout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(k_ekle_no, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(494, 494, 494))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OlusturLayout.createSequentialGroup()
                        .addComponent(k_kaydetbut)
                        .addGap(557, 557, 557))))
        );
        OlusturLayout.setVerticalGroup(
            OlusturLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OlusturLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(OlusturLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(k_ekle_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(OlusturLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(k_ekle_isim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(55, 55, 55)
                .addGroup(OlusturLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(k_ekle_soyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(58, 58, 58)
                .addComponent(k_kaydetbut)
                .addContainerGap(286, Short.MAX_VALUE))
        );

        Komisyonici.addTab("Komisyon Oluştur", Olustur);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Komisyon No:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Üye İsim:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Üye Soyisim:");

        kg_eski_no.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kg_eski_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kg_eski_noKeyPressed(evt);
            }
        });

        kg_eski_ad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kg_eski_ad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kg_eski_adKeyPressed(evt);
            }
        });

        kg_eski_soyad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kg_eski_soyad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kg_eski_soyadKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Yeni Komisyon No:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Yeni Üye İsim:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Yeni Üye Soyisim:");

        kg_yeni_no.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kg_yeni_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kg_yeni_noKeyPressed(evt);
            }
        });

        kg_yeni_ad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kg_yeni_ad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kg_yeni_adKeyPressed(evt);
            }
        });

        k_guncellebutton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        k_guncellebutton.setText("Güncelle");
        k_guncellebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k_guncellebuttonActionPerformed(evt);
            }
        });

        kg_yeni_soyad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kg_yeni_soyad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kg_yeni_soyadKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout GuncelleLayout = new javax.swing.GroupLayout(Guncelle);
        Guncelle.setLayout(GuncelleLayout);
        GuncelleLayout.setHorizontalGroup(
            GuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GuncelleLayout.createSequentialGroup()
                .addGroup(GuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GuncelleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(GuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(23, 23, 23)
                        .addGroup(GuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kg_eski_ad)
                            .addComponent(kg_eski_no)
                            .addComponent(kg_eski_soyad, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                        .addGap(227, 227, 227)
                        .addGroup(GuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(GuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kg_yeni_no, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(kg_yeni_ad)
                            .addComponent(kg_yeni_soyad)))
                    .addGroup(GuncelleLayout.createSequentialGroup()
                        .addGap(428, 428, 428)
                        .addComponent(k_guncellebutton)))
                .addContainerGap(395, Short.MAX_VALUE))
        );
        GuncelleLayout.setVerticalGroup(
            GuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GuncelleLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(GuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(kg_eski_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(kg_yeni_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(GuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GuncelleLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(GuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(kg_eski_ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(GuncelleLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(GuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(kg_yeni_ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGroup(GuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GuncelleLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(GuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(kg_eski_soyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(GuncelleLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(GuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(kg_yeni_soyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(68, 68, 68)
                .addComponent(k_guncellebutton)
                .addContainerGap(256, Short.MAX_VALUE))
        );

        Komisyonici.addTab("Komisyon Güncelle", Guncelle);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Komisyon No:");

        ks_no.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ks_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ks_noKeyPressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Komisyon No:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Üye İsmi:");

        komisyon_sil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        komisyon_sil.setText("Komisyon Sil");
        komisyon_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                komisyon_silActionPerformed(evt);
            }
        });

        üye_sil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        üye_sil.setText("Üye Sil");
        üye_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                üye_silActionPerformed(evt);
            }
        });

        küs_no.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        küs_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                küs_noKeyPressed(evt);
            }
        });

        küs_ad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        küs_ad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                küs_adKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout SilLayout = new javax.swing.GroupLayout(Sil);
        Sil.setLayout(SilLayout);
        SilLayout.setHorizontalGroup(
            SilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SilLayout.createSequentialGroup()
                .addGroup(SilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SilLayout.createSequentialGroup()
                        .addGroup(SilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SilLayout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(jLabel10))
                            .addGroup(SilLayout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(ks_no, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(249, 249, 249)
                        .addGroup(SilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)))
                    .addGroup(SilLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(komisyon_sil)))
                .addGap(30, 30, 30)
                .addGroup(SilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(üye_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(SilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(küs_ad, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                        .addComponent(küs_no)))
                .addContainerGap(413, Short.MAX_VALUE))
        );
        SilLayout.setVerticalGroup(
            SilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SilLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(SilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(küs_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(SilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SilLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(SilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(küs_ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(SilLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(ks_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(SilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(üye_sil)
                    .addComponent(komisyon_sil))
                .addContainerGap(356, Short.MAX_VALUE))
        );

        Komisyonici.addTab("Komisyon Sil", Sil);

        javax.swing.GroupLayout KomisyonLayout = new javax.swing.GroupLayout(Komisyon);
        Komisyon.setLayout(KomisyonLayout);
        KomisyonLayout.setHorizontalGroup(
            KomisyonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Komisyonici, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        KomisyonLayout.setVerticalGroup(
            KomisyonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KomisyonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Komisyonici))
        );

        jTabbedPane2.addTab("Komisyon", Komisyon);

        Mulakat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MulakatMouseClicked(evt);
            }
        });

        KomisyonInfo.setBackground(new java.awt.Color(255, 51, 102));
        KomisyonInfo.setForeground(new java.awt.Color(51, 51, 51));
        KomisyonInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KomisyonInfoMouseClicked(evt);
            }
        });

        kseccombo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Komisyon:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("1.Üye");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("2.Üye");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        muye1.setEditable(false);
        muye1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        muye2.setEditable(false);
        muye2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 0, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Getir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout KomisyonInfoLayout = new javax.swing.GroupLayout(KomisyonInfo);
        KomisyonInfo.setLayout(KomisyonInfoLayout);
        KomisyonInfoLayout.setHorizontalGroup(
            KomisyonInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KomisyonInfoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(KomisyonInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(KomisyonInfoLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(KomisyonInfoLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kseccombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(KomisyonInfoLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGroup(KomisyonInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(KomisyonInfoLayout.createSequentialGroup()
                                .addGap(238, 238, 238)
                                .addGroup(KomisyonInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18))
                                .addGap(0, 51, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KomisyonInfoLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(KomisyonInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(muye2)
                                    .addComponent(muye1))
                                .addContainerGap())))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KomisyonInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        KomisyonInfoLayout.setVerticalGroup(
            KomisyonInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KomisyonInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(KomisyonInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kseccombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addGap(29, 29, 29)
                .addGroup(KomisyonInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(KomisyonInfoLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(KomisyonInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(muye2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18))
                    .addGroup(KomisyonInfoLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(KomisyonInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(muye1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(50, 50, 50))
        );

        OgrenciBilgi.setBackground(new java.awt.Color(51, 153, 255));
        OgrenciBilgi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OgrenciBilgiMouseClicked(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Öğrenci No:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Öğrenci Ad:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Öğr.Soyad:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Öğretim:");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Sınıfı:");

        mograd.setEditable(false);
        mograd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mograd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mogradKeyPressed(evt);
            }
        });

        mogrsoyad.setEditable(false);
        mogrsoyad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mogrsoyad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mogrsoyadKeyPressed(evt);
            }
        });

        sinifcombo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sinifcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", " " }));

        mogrno.setBackground(new java.awt.Color(0, 204, 255));
        mogrno.setEditable(true);
        mogrno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton7.setText("Getir");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        ogretimtex.setEditable(false);
        ogretimtex.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout OgrenciBilgiLayout = new javax.swing.GroupLayout(OgrenciBilgi);
        OgrenciBilgi.setLayout(OgrenciBilgiLayout);
        OgrenciBilgiLayout.setHorizontalGroup(
            OgrenciBilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OgrenciBilgiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OgrenciBilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OgrenciBilgiLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(mogrno, 0, 243, Short.MAX_VALUE))
                    .addGroup(OgrenciBilgiLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(mograd))
                    .addGroup(OgrenciBilgiLayout.createSequentialGroup()
                        .addGroup(OgrenciBilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24))
                        .addGap(18, 18, 18)
                        .addGroup(OgrenciBilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mogrsoyad)
                            .addGroup(OgrenciBilgiLayout.createSequentialGroup()
                                .addComponent(sinifcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton7)
                                .addGap(43, 43, 43))
                            .addComponent(ogretimtex))))
                .addContainerGap())
        );
        OgrenciBilgiLayout.setVerticalGroup(
            OgrenciBilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OgrenciBilgiLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(OgrenciBilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20)
                    .addComponent(mogrno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(OgrenciBilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(mograd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(OgrenciBilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(mogrsoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(OgrenciBilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel23)
                    .addComponent(ogretimtex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(OgrenciBilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(sinifcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        StajInfo.setBackground(new java.awt.Color(255, 255, 153));
        StajInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StajInfoMouseClicked(evt);
            }
        });

        argecheck.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        argecheck.setText("Ar-Ge");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setText("Kurum Adı:");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel26.setText("Şehir:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel27.setText("Başlangıç Tar.");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel28.setText("Bitiş Tarihi:");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel29.setText("Toplam Gün:");

        ssehir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        stopgun.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        krumadicombo.setEditable(true);
        krumadicombo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        krumadicombo.setMaximumRowCount(20);
        krumadicombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                krumadicomboMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout StajInfoLayout = new javax.swing.GroupLayout(StajInfo);
        StajInfo.setLayout(StajInfoLayout);
        StajInfoLayout.setHorizontalGroup(
            StajInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StajInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(StajInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StajInfoLayout.createSequentialGroup()
                        .addGroup(StajInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel28)
                            .addComponent(jLabel27))
                        .addGap(18, 18, 18)
                        .addGroup(StajInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stopgun)
                            .addGroup(StajInfoLayout.createSequentialGroup()
                                .addGroup(StajInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(basdatechooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bitişdatechooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 57, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StajInfoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(argecheck)
                        .addGap(119, 119, 119))
                    .addGroup(StajInfoLayout.createSequentialGroup()
                        .addGroup(StajInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26))
                        .addGap(18, 18, 18)
                        .addGroup(StajInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(krumadicombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ssehir))
                        .addContainerGap())))
        );
        StajInfoLayout.setVerticalGroup(
            StajInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StajInfoLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(StajInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(krumadicombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(StajInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ssehir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addGap(44, 44, 44)
                .addGroup(StajInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(basdatechooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(StajInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(bitişdatechooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(StajInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(stopgun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(argecheck)
                .addGap(43, 43, 43))
        );

        mulakat.setBackground(new java.awt.Color(102, 255, 102));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel30.setText("Mülakat Tarihi:");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel32.setText("DEĞERLENDİRME");

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel33.setText("Devamlılık");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel34.setText("Çaba ve Çalışma");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel35.setText("İşi vaktinde yetiştirme");

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel36.setText("Amire Davranış");

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel40.setText("İş Arkadaşlarına Davranış");

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel41.setText("Düzen:");

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel42.setText("Sunum:");

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel43.setText("İçerik:");

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel44.setText("Mülakat:");

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel37.setText("Proje:");

        devamspin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        devamspin.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        devamspin.setName(""); // NOI18N

        cabaspin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cabaspin.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        vaktindeisspin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vaktindeisspin.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        amirspin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        amirspin.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        arkadaşdavspin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        arkadaşdavspin.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        mdproje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mdprojeKeyPressed(evt);
            }
        });

        mdduzen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mdduzenKeyPressed(evt);
            }
        });

        mdsunum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mdsunumKeyPressed(evt);
            }
        });

        mdiçerik.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mdiçerikKeyPressed(evt);
            }
        });

        mgunhesaplabuton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mgunhesaplabuton.setText("Hesapla");
        mgunhesaplabuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgunhesaplabutonActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel38.setText("Kabul Edilen Gün");

        mkedilengun.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mkedilengun.setText("              0");

        mulakattarihlabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout mulakatLayout = new javax.swing.GroupLayout(mulakat);
        mulakat.setLayout(mulakatLayout);
        mulakatLayout.setHorizontalGroup(
            mulakatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mulakatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mulakatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mulakatLayout.createSequentialGroup()
                        .addGroup(mulakatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mulakatLayout.createSequentialGroup()
                                .addGroup(mulakatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(mulakatLayout.createSequentialGroup()
                                        .addGap(261, 261, 261)
                                        .addGroup(mulakatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel44)
                                            .addGroup(mulakatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel37)
                                                .addComponent(jLabel41)
                                                .addComponent(jLabel43)
                                                .addComponent(jLabel42)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mulakatLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(mulakatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(mkedilengun)
                                            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(51, 51, 51)))
                                .addGroup(mulakatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mgunhesaplabuton)
                                    .addGroup(mulakatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(mdproje)
                                        .addComponent(mdduzen)
                                        .addComponent(mdsunum)
                                        .addComponent(mdiçerik)
                                        .addComponent(mdmulakatsonuc, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))))
                            .addGroup(mulakatLayout.createSequentialGroup()
                                .addGroup(mulakatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(mulakatLayout.createSequentialGroup()
                                        .addComponent(jLabel36)
                                        .addGap(73, 73, 73)
                                        .addComponent(amirspin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(mulakatLayout.createSequentialGroup()
                                        .addGroup(mulakatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel33)
                                            .addComponent(jLabel34)
                                            .addComponent(jLabel35))
                                        .addGap(18, 18, 18)
                                        .addGroup(mulakatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(vaktindeisspin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cabaspin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(devamspin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(mulakatLayout.createSequentialGroup()
                        .addGroup(mulakatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mulakatLayout.createSequentialGroup()
                                .addComponent(jLabel40)
                                .addGap(27, 27, 27)
                                .addComponent(arkadaşdavspin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mulakatLayout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addGap(45, 45, 45)
                                .addGroup(mulakatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel32)
                                    .addComponent(mulakattarihlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        mulakatLayout.setVerticalGroup(
            mulakatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mulakatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mulakatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mulakattarihlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addComponent(jLabel32)
                .addGap(43, 43, 43)
                .addGroup(mulakatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jLabel37)
                    .addComponent(devamspin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mdproje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(mulakatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel41)
                    .addComponent(cabaspin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mdduzen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(mulakatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(mdsunum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(vaktindeisspin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(mulakatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(mdiçerik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mulakatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(amirspin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(mulakatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(mdmulakatsonuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(mulakatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(arkadaşdavspin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(mulakatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mgunhesaplabuton)
                    .addComponent(jLabel38))
                .addGap(18, 18, 18)
                .addComponent(mkedilengun, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        msonucbuton.setBackground(new java.awt.Color(51, 153, 255));
        msonucbuton.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        msonucbuton.setForeground(new java.awt.Color(255, 0, 0));
        msonucbuton.setText("Sonuçlandır");
        msonucbuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msonucbutonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MulakatLayout = new javax.swing.GroupLayout(Mulakat);
        Mulakat.setLayout(MulakatLayout);
        MulakatLayout.setHorizontalGroup(
            MulakatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MulakatLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(MulakatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(OgrenciBilgi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(KomisyonInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(MulakatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MulakatLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(msonucbuton))
                    .addGroup(MulakatLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StajInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(mulakat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        MulakatLayout.setVerticalGroup(
            MulakatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MulakatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MulakatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mulakat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MulakatLayout.createSequentialGroup()
                        .addGroup(MulakatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MulakatLayout.createSequentialGroup()
                                .addComponent(KomisyonInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(OgrenciBilgi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(MulakatLayout.createSequentialGroup()
                                .addComponent(StajInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(msonucbuton)))
                        .addContainerGap())))
        );

        jTabbedPane2.addTab("Mülakat", Mulakat);

        mulakatkayıtpane.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTable1.setBackground(new java.awt.Color(204, 255, 51));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(255, 102, 51));
        jTable1.setSelectionForeground(new java.awt.Color(153, 153, 0));
        jScrollPane1.setViewportView(jTable1);

        jButton2.setBackground(new java.awt.Color(204, 255, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("Getir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(204, 255, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton6.setText("Excel Dosyası");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 982, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jButton2)
                .addGap(53, 53, 53)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mulakatkayıtpane.addTab("Stajı Biten Öğrenciler", jPanel1);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Başlangıç Tarihi");

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel39.setText("Bitiş Tarihi ");

        jButton3.setBackground(new java.awt.Color(0, 204, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 0, 102));
        jButton3.setText("Getir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable2.setBackground(new java.awt.Color(255, 204, 51));
        jTable2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButton5.setBackground(new java.awt.Color(51, 153, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(153, 0, 153));
        jButton5.setText("Excel Dosyası");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel39))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(msorgubitisdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(msorgubasdatechooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton5)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1098, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(msorgubasdatechooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(msorgubitisdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jButton3)
                .addGap(34, 34, 34)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                .addContainerGap())
        );

        mulakatkayıtpane.addTab("Mülakat Sonuçları", jPanel2);

        lsorguono.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton4.setBackground(new java.awt.Color(0, 153, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton4.setText("Getir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel45.setText("Öğrenci No:");

        jTable3.setBackground(new java.awt.Color(51, 153, 255));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lsorguono, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1076, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel45)
                        .addGap(33, 33, 33)
                        .addComponent(lsorguono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jButton4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mulakatkayıtpane.addTab("Öğrenci Staj Bilgileri", jPanel3);

        OgrenciBilgi1.setBackground(new java.awt.Color(51, 153, 255));

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel46.setText("Öğrenci No:");

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel47.setText("Öğrenci Ad:");

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel48.setText("Öğr.Soyad:");

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel49.setText("Öğretim:");

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel50.setText("Sınıfı:");

        mogrno1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mogrno1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mogrno1KeyPressed(evt);
            }
        });

        mograd1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mograd1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mograd1KeyPressed(evt);
            }
        });

        mogrsoyad1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mogrsoyad1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mogrsoyad1KeyPressed(evt);
            }
        });

        ogretimcombo1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ogretimcombo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.Öğretim", "2.Öğretim" }));

        sinifcombo1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sinifcombo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", " " }));

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel51.setText("Mülakat Tarihi:");

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel52.setText("Mülakat Saati:");

        musaatspinner1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        musaatspinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));

        mudakkaspinner1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mudakkaspinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        mulakatkayıtbutton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mulakatkayıtbutton.setText("Kayıt Yap");
        mulakatkayıtbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulakatkayıtbuttonActionPerformed(evt);
            }
        });

        mulakatkayıtexcel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mulakatkayıtexcel.setText("Excel Dosyası");
        mulakatkayıtexcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulakatkayıtexcelActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton8.setText("Kayıtlari Tabloda Göster");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OgrenciBilgi1Layout = new javax.swing.GroupLayout(OgrenciBilgi1);
        OgrenciBilgi1.setLayout(OgrenciBilgi1Layout);
        OgrenciBilgi1Layout.setHorizontalGroup(
            OgrenciBilgi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OgrenciBilgi1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OgrenciBilgi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OgrenciBilgi1Layout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addGap(18, 18, 18)
                        .addComponent(mogrno1))
                    .addGroup(OgrenciBilgi1Layout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addGap(18, 18, 18)
                        .addComponent(mograd1))
                    .addGroup(OgrenciBilgi1Layout.createSequentialGroup()
                        .addGroup(OgrenciBilgi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel48)
                            .addComponent(jLabel49)
                            .addComponent(jLabel50))
                        .addGap(18, 18, 18)
                        .addGroup(OgrenciBilgi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mogrsoyad1)
                            .addGroup(OgrenciBilgi1Layout.createSequentialGroup()
                                .addGroup(OgrenciBilgi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ogretimcombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sinifcombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(OgrenciBilgi1Layout.createSequentialGroup()
                        .addGroup(OgrenciBilgi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(OgrenciBilgi1Layout.createSequentialGroup()
                                .addGroup(OgrenciBilgi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel52)
                                    .addComponent(jLabel51))
                                .addGap(27, 27, 27)
                                .addGroup(OgrenciBilgi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(OgrenciBilgi1Layout.createSequentialGroup()
                                        .addComponent(musaatspinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(mudakkaspinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(mutarihchooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(OgrenciBilgi1Layout.createSequentialGroup()
                                .addComponent(mulakatkayıtbutton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mulakatkayıtexcel)))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(OgrenciBilgi1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jButton8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        OgrenciBilgi1Layout.setVerticalGroup(
            OgrenciBilgi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OgrenciBilgi1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(OgrenciBilgi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(mogrno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(OgrenciBilgi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(mograd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(OgrenciBilgi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(mogrsoyad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(OgrenciBilgi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel49)
                    .addComponent(ogretimcombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(OgrenciBilgi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(sinifcombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(OgrenciBilgi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(OgrenciBilgi1Layout.createSequentialGroup()
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel52))
                    .addGroup(OgrenciBilgi1Layout.createSequentialGroup()
                        .addComponent(mutarihchooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(OgrenciBilgi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(musaatspinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mudakkaspinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(OgrenciBilgi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mulakatkayıtbutton)
                    .addComponent(mulakatkayıtexcel))
                .addGap(31, 31, 31)
                .addComponent(jButton8)
                .addGap(36, 36, 36))
        );

        jTable4.setBackground(new java.awt.Color(102, 0, 255));
        jTable4.setForeground(new java.awt.Color(0, 153, 255));
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OgrenciBilgi1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addComponent(OgrenciBilgi1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        mulakatkayıtpane.addTab("Mülakat Kaydı Yap", jPanel4);

        javax.swing.GroupLayout ListelerLayout = new javax.swing.GroupLayout(Listeler);
        Listeler.setLayout(ListelerLayout);
        ListelerLayout.setHorizontalGroup(
            ListelerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListelerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mulakatkayıtpane)
                .addContainerGap())
        );
        ListelerLayout.setVerticalGroup(
            ListelerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListelerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mulakatkayıtpane, javax.swing.GroupLayout.PREFERRED_SIZE, 655, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Listeler", Listeler);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void k_kaydetbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k_kaydetbutActionPerformed
        String query ="insert into komisyon (komisyonno,uyeismi,uyesoyismi) values (?,?,?)";
        String limitquery="select count(komisyonno) as mycount from komisyon where komisyonno=?";
        int count;
        try
        {
            PreparedStatement ps1 = con.prepareStatement(limitquery);
            PreparedStatement ps = con.prepareStatement(query);
            ps1.setInt(1,Integer.parseInt(k_ekle_no.getText()));
            ResultSet rs=ps1.executeQuery();
            count=rs.getInt("mycount");
            System.out.println(count);
            if(count<2)
            {
                ps.setInt(1, Integer.parseInt(k_ekle_no.getText()));
                ps.setString(2, k_ekle_isim.getText());
                ps.setString(3, k_ekle_soyad.getText());
                ps.execute();
                JOptionPane.showMessageDialog(null, "Kayıt Oluşturuldu.");
                k_ekle_no.setText(null);
                k_ekle_isim.setText(null);
                k_ekle_soyad.setText(null);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Bir Komisyonda iki üyeden fazla üye olamaz");
            }
            ps.close();
            rs.close();
            ps1.close();
            k_ekle_no.setText(null);
            k_ekle_isim.setText(null);
            k_ekle_soyad.setText(null);
        }catch(SQLException e){e.printStackTrace();}
        
        
    }//GEN-LAST:event_k_kaydetbutActionPerformed

    private void k_ekle_noKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_k_ekle_noKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            k_ekle_isim.requestFocus();
        }
    }//GEN-LAST:event_k_ekle_noKeyPressed

    private void k_ekle_isimKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_k_ekle_isimKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            k_ekle_soyad.requestFocus();
        }
    }//GEN-LAST:event_k_ekle_isimKeyPressed

    private void k_ekle_soyadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_k_ekle_soyadKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
           String query ="insert into komisyon (komisyonno,uyeismi,uyesoyismi) values (?,?,?)";
        String limitquery="select count(komisyonno) as mycount from komisyon where komisyonno=?";
        int count;
        try
        {
            PreparedStatement ps1 = con.prepareStatement(limitquery);
            PreparedStatement ps = con.prepareStatement(query);
            ps1.setInt(1,Integer.parseInt(k_ekle_no.getText()));
            ResultSet rs=ps1.executeQuery();
            count=rs.getInt("mycount");
            System.out.println(count);
            if(count<2)
            {
                ps.setInt(1, Integer.parseInt(k_ekle_no.getText()));
                ps.setString(2, k_ekle_isim.getText());
                ps.setString(3, k_ekle_soyad.getText());
                ps.execute();
                JOptionPane.showMessageDialog(null, "Kayıt Oluşturuldu.");
                k_ekle_no.setText(null);
                k_ekle_isim.setText(null);
                k_ekle_soyad.setText(null);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Bir Komisyonda iki üyeden fazla üye olamaz");
            }
            ps.close();
            rs.close();
            ps1.close();
            k_ekle_no.setText(null);
            k_ekle_isim.setText(null);
            k_ekle_soyad.setText(null);
        }catch(SQLException e){e.printStackTrace();}
        
        }
   
    }//GEN-LAST:event_k_ekle_soyadKeyPressed

    private void kg_eski_noKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kg_eski_noKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER)
       {
           kg_eski_ad.requestFocus();
       }
    }//GEN-LAST:event_kg_eski_noKeyPressed

    private void kg_eski_adKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kg_eski_adKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
       {
           kg_eski_soyad.requestFocus();
       }
    }//GEN-LAST:event_kg_eski_adKeyPressed

    private void kg_eski_soyadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kg_eski_soyadKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER)
       {
           kg_yeni_no.requestFocus();
       }
    }//GEN-LAST:event_kg_eski_soyadKeyPressed

    private void kg_yeni_noKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kg_yeni_noKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
       {
           kg_yeni_ad.requestFocus();
       }
    }//GEN-LAST:event_kg_yeni_noKeyPressed

    private void kg_yeni_adKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kg_yeni_adKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER)
       {
           kg_yeni_soyad.requestFocus();
       }
    }//GEN-LAST:event_kg_yeni_adKeyPressed

    private void k_guncellebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k_guncellebuttonActionPerformed
       String query="update komisyon set komisyonno=?,uyeismi=?,uyesoyismi=? where komisyonno=? and uyeismi=? and uyesoyismi=? ";
          try
          {
              PreparedStatement ps = con.prepareStatement(query);
              ps.setInt(1, Integer.parseInt(kg_yeni_no.getText()));
              ps.setString(2, kg_yeni_ad.getText());
              ps.setString(3, kg_yeni_soyad.getText());
              ps.setInt(4,Integer.parseInt(kg_eski_no.getText()));
              ps.setString(5, kg_eski_ad.getText());
              ps.setString(6, kg_eski_soyad.getText());
              ps.execute();
              ps.close();
              JOptionPane.showMessageDialog(null, "Kayıt Oluşturuldu.");
              kg_eski_no.setText(null);
              kg_eski_ad.setText(null);
              kg_eski_soyad.setText(null);
              kg_yeni_no.setText(null);
              kg_yeni_ad.setText(null);
              kg_yeni_soyad.setText(null);
              
              
              
          }catch(SQLException e){e.printStackTrace();}
    }//GEN-LAST:event_k_guncellebuttonActionPerformed

    private void kg_yeni_soyadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kg_yeni_soyadKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
       {
           String query="update komisyon set komisyonno=?,uyeismi=?,uyesoyismi=? where komisyonno=? and uyeismi=? and uyesoyismi=? ";
          try
          {
              PreparedStatement ps = con.prepareStatement(query);
              ps.setInt(1, Integer.parseInt(kg_yeni_no.getText()));
              ps.setString(2, kg_yeni_ad.getText());
              ps.setString(3, kg_yeni_soyad.getText());
              ps.setInt(4,Integer.parseInt(kg_eski_no.getText()));
              ps.setString(5, kg_eski_ad.getText());
              ps.setString(6, kg_eski_soyad.getText());
              ps.execute();
              ps.close();
              JOptionPane.showMessageDialog(null, "Kayıt Oluşturuldu.");
              kg_eski_no.setText(null);
              kg_eski_ad.setText(null);
              kg_eski_soyad.setText(null);
              kg_yeni_no.setText(null);
              kg_yeni_ad.setText(null);
              kg_yeni_soyad.setText(null);
              
              
              
          }catch(SQLException e){e.printStackTrace();}
       }
    }//GEN-LAST:event_kg_yeni_soyadKeyPressed

    private void komisyon_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_komisyon_silActionPerformed
        String query="select count(komisyonno) as mycount from komisyon where komisyonno=?";
        String deletequery="delete from komisyon where komisyonno=?";
        int count;
        int action=JOptionPane.showConfirmDialog(null, "Silmek İstiyor musunuz?", "Uyarı",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
        try
        {
            PreparedStatement ps = con.prepareStatement(query);
            PreparedStatement ps1 = con.prepareStatement(deletequery);
            ps.setInt(1, Integer.parseInt(ks_no.getText()));
            ps1.setInt(1, Integer.parseInt(ks_no.getText()));
            ResultSet rs = ps.executeQuery();
            
            count=rs.getInt("mycount");
            if(action==0)
            {
                while(count>0)
            {
                ps1.execute();
                count--;
            }
            }
            ks_no.setText(null);
            
        }catch(SQLException e){e.printStackTrace();}
        
        
    }//GEN-LAST:event_komisyon_silActionPerformed

    private void ks_noKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ks_noKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
             String query="select count(komisyonno) as mycount from komisyon where komisyonno=?";
             String deletequery="delete from komisyon where komisyonno=?";
        int count;
        int action=JOptionPane.showConfirmDialog(null, "Silmek İstiyor musunuz?", "Uyarı",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
        try
        {
            PreparedStatement ps = con.prepareStatement(query);
            PreparedStatement ps1 = con.prepareStatement(deletequery);
            ps.setInt(1, Integer.parseInt(ks_no.getText()));
            ps1.setInt(1, Integer.parseInt(ks_no.getText()));
            ResultSet rs = ps.executeQuery();
            
            count=rs.getInt("mycount");
            if(action==0)
            {
                while(count>0)
            {
                ps1.execute();
                count--;
            }
            }
            ps1.close();
            ps.close();
            JOptionPane.showMessageDialog(null, "Komisyon Silindi.");
            ks_no.setText(null);
            
        }catch(SQLException e){e.printStackTrace();}
        
        
        }
    }//GEN-LAST:event_ks_noKeyPressed

    private void küs_noKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_küs_noKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            küs_ad.requestFocus();
        }
    }//GEN-LAST:event_küs_noKeyPressed

    private void küs_adKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_küs_adKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER)
       {
           String query="delete from komisyon where komisyonno=? and uyeismi=?";
           try
           {
               PreparedStatement ps = con.prepareStatement(query);
               ps.setInt(1, Integer.parseInt(küs_no.getText()));
               ps.setString(2, küs_ad.getText());
               ps.execute();
               JOptionPane.showMessageDialog(null, "Kayıt Silindi.");
               ps.close();
           }catch(SQLException e){e.printStackTrace();}
       }
    }//GEN-LAST:event_küs_adKeyPressed

    private void üye_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_üye_silActionPerformed
            String query="delete from komisyon where komisyonno=? and uyeismi=?";
           try
           {
               PreparedStatement ps = con.prepareStatement(query);
               ps.setInt(1, Integer.parseInt(küs_no.getText()));
               ps.setString(2, küs_ad.getText());
               ps.execute();
               JOptionPane.showMessageDialog(null, "Kayıt Silindi.");
               ps.close();
           }catch(SQLException e){e.printStackTrace();}
    }//GEN-LAST:event_üye_silActionPerformed

    private void MulakatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MulakatMouseClicked
            
    }//GEN-LAST:event_MulakatMouseClicked

    private void KomisyonInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KomisyonInfoMouseClicked
            kseccombo.removeAllItems();
            String query="select count(distinct komisyonno) as mycount from komisyon order by komisyonno";
            String query2="select komisyonno from komisyon where komisyonno >?";
            int count,i=0,index=0;
            Integer no;
            try
            {
                PreparedStatement ps = con.prepareStatement(query);
                PreparedStatement ps1 = con.prepareStatement(query2);
                ResultSet rs = ps.executeQuery();
                ResultSet rs1;
                count=rs.getInt("mycount");
                while(count>0)
                {
                    ps1.setInt(1, i);
                    rs1=ps1.executeQuery();
                    no=rs1.getInt("komisyonno");
                    kseccombo.insertItemAt(no.toString(), index);
                    index++;count--;i++;
                    
                }
                ps.close();
                ps1.close();
                rs.close();
                
                
            }catch(SQLException e){e.printStackTrace();}
            
    }//GEN-LAST:event_KomisyonInfoMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            String query="select uyeismi,uyesoyismi from komisyon where komisyonno=?";
            int no =Integer.parseInt((String)kseccombo.getSelectedItem());
            
            
            try
            {
                PreparedStatement ps = con.prepareStatement(query);
                ps.setInt(1, no);
                ResultSet rs=ps.executeQuery();
                muye1.setText(rs.getString("uyeismi")+" "+rs.getString("uyesoyismi"));
                
                while(rs.next())//tam bizim istediğimizmiş eğer devamı varsa onlarıda getir demek bu rs.next ilk app de yanlış yapmışız
                {
                     muye2.setText(rs.getString("uyeismi")+" "+rs.getString("uyesoyismi"));
                }
               
                 
                   
                  rs.close();
                  ps.close();
                
            }catch(SQLException e){e.printStackTrace();}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mgunhesaplabutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgunhesaplabutonActionPerformed
            double devam,amir,caba,arkadasdavranis,vakit,sonuc;
            int proje,icerik,duzen,sunum,mulakat,sonucinteger,kabulgun;
            
            devam=(int)devamspin.getValue()*0.8;
            amir=(int)amirspin.getValue()*0.8;
            caba=(int)cabaspin.getValue()*0.8;
            arkadasdavranis=(int)arkadaşdavspin.getValue()*0.8;
            vakit=(int)vaktindeisspin.getValue()*0.8;
            
            proje=Integer.parseInt(mdproje.getText());
            sunum=Integer.parseInt(mdsunum.getText());
            duzen=Integer.parseInt(mdduzen.getText());
            icerik =Integer.parseInt(mdiçerik.getText());
            mulakat=Integer.parseInt(mdmulakatsonuc.getText());
            
            if(proje>100||proje<0)
            {
                JOptionPane.showMessageDialog(null, "Proje ye 0-100 arası not verilebilir");
                mdproje.setText(null);
            }
            else if(sunum>100||sunum<0)
            {
                JOptionPane.showMessageDialog(null, "Proje ye 0-100 arası not verilebilir");
                mdsunum.setText(null);
            }
             else if(icerik>100||icerik<0)
            {
                JOptionPane.showMessageDialog(null, "Proje ye 0-100 arası not verilebilir");
                mdiçerik.setText(null);
            }
            else if(duzen>100||duzen<0)
            {
                JOptionPane.showMessageDialog(null, "Proje ye 0-100 arası not verilebilir");
                mdduzen.setText(null);
            }
            else if(mulakat>100||mulakat<0)
            {
                JOptionPane.showMessageDialog(null, "Proje ye 0-100 arası not verilebilir");
                mdmulakatsonuc.setText(null);
            }
            sonuc=((proje*15)/100)+((duzen*5)/100)+((sunum*5)/100)+((icerik*15)/100)+((mulakat*40)/100)+devam+amir+caba+arkadasdavranis+vakit;
            sonucinteger=(int)Math.round(sonuc);
            int toplamgun=Integer.parseInt(stopgun.getText());
            kabulgun=(int)Math.round((toplamgun*sonucinteger)/100);
            mkedilengun.setText(String.valueOf(kabulgun));
            
    }//GEN-LAST:event_mgunhesaplabutonActionPerformed

    private void mdprojeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mdprojeKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            mdduzen.requestFocus();
        }
    }//GEN-LAST:event_mdprojeKeyPressed

    private void mdduzenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mdduzenKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER)
       {
           mdsunum.requestFocus();
       }    
    }//GEN-LAST:event_mdduzenKeyPressed

    private void mdsunumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mdsunumKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            mdiçerik.requestFocus();
        }
    }//GEN-LAST:event_mdsunumKeyPressed

    private void mdiçerikKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mdiçerikKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            mdmulakatsonuc.requestFocus();
        }
    }//GEN-LAST:event_mdiçerikKeyPressed

    private void msonucbutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msonucbutonActionPerformed
        
        String stajquery="insert into stajinfo (kurumadi,city,startdate,finishdate,arge,studentnumber,internday,confirmday,mulakattarih,stajsinif) values (?,?,?,?,?,?,?,?,?,?)";
       
        String confirmdayquery="select sum(confirmday) as mysum from stajinfo where studentnumber=?";
        
        String stajtamamquery="update Ogrenci set stajtammi=? where studentno=?";
        int sınıf=Integer.parseInt((String)sinifcombo.getSelectedItem());
        int topgun=Integer.parseInt(stopgun.getText());
        
        int kabulgun;
        
        Calendar cl = basdatechooser.getSelectedDate();
        Calendar clf = bitişdatechooser.getSelectedDate();
        
        
        
        int startday=cl.get(Calendar.DAY_OF_MONTH);
        int startmonth=cl.get(Calendar.MONTH)+1;
        int startyear=cl.get(Calendar.YEAR);
        
        int finishyear=clf.get(Calendar.YEAR);
        int finishmonth=clf.get(Calendar.MONTH)+1;
        int finishday=clf.get(Calendar.DAY_OF_MONTH);
        
       
        String startdate=startyear+"-"+startmonth+"-"+startday;
        String finishdate=finishyear+"-"+finishmonth+"-"+finishday;
        
        try
        {
            
            PreparedStatement pres= con.prepareStatement(confirmdayquery);
            pres.setInt(1, Integer.parseInt((String)mogrno.getSelectedItem()));
            ResultSet rss; 
            rss= pres.executeQuery();
            int kabulgunsorgu=rss.getInt("mysum");
            
            if(topgun<15)
            {
                JOptionPane.showMessageDialog(null, "15 Günden Az Staj Yapılamaz!");
                stopgun.setText(null);
            }
            else if(kabulgunsorgu>=57)
            {
                
                JOptionPane.showMessageDialog(null, "Bu Öğrenci Stajını Tamamlamıştır!");
                stopgun.setText(null);
            }
            else if(clf.before(cl))
            {
                JOptionPane.showMessageDialog(null, "Staja Başlangıç Tarihi Bitiş Tarihinden Sonra Olamaz!");
            }
            
           
            else
            {
                if(topgun>25)
                {
                    if(sınıf==2)
                    {
                        JOptionPane.showMessageDialog(null,"2.Sınıflar 25 Günden Fazla Staj Yapamaz!");
                        stopgun.setText(null);
                    }
                    else
                    {
                        if(topgun>40)
                        {
                           if(!argecheck.isSelected())
                           {
                               JOptionPane.showMessageDialog(null, "Sadece Ar-Ge Kurumlarında 40 Günden Fazla Gün Staj Yapılabilir!");
                               stopgun.setText(null);
                           }
                           else
                           {
                               //yapsın
                               
                               PreparedStatement ps1 = con.prepareStatement(stajquery);
                               ps1.setString(1, (String)krumadicombo.getSelectedItem());
                               ps1.setString(2, ssehir.getText());
                               ps1.setString(3, startdate);
                               ps1.setString(4, finishdate);
                               ps1.setString(5, "Evet");
                               ps1.setInt(6, Integer.parseInt((String)mogrno.getSelectedItem()));
                               ps1.setInt(7, Integer.parseInt(stopgun.getText()));
                               ps1.setInt(8, Integer.parseInt(mkedilengun.getText()));
                               ps1.setString(9, mulakattarihlabel.getText());
                               ps1.setInt(10, Integer.parseInt((String)sinifcombo.getSelectedItem()));
                               ps1.execute();
                               
                               
                              
                               rss=pres.executeQuery();
                               kabulgun=rss.getInt("mysum");
                               if(kabulgun>=57){
                                   PreparedStatement bool  = con.prepareStatement(stajtamamquery);
                                    bool.setString(1, "tamamlandı");
                                    bool.setInt(2,Integer.parseInt((String)mogrno.getSelectedItem()));
                                    bool.execute();
                                   bool.close();
                               }
                               
                                
                              
                               ps1.close();
                            
                               mograd.setText(null);
                               mogrsoyad.setText(null);
                               
                              ssehir.setText(null);
                              stopgun.setText(null);
                                 mdduzen.setText(null);
                            mdiçerik.setText(null);
                            mdmulakatsonuc.setText(null);
                            mdproje.setText(null);
                            mdsunum.setText(null);
                            muye1.setText(null);
                             muye2.setText(null);
                               
                           }
                        }
                        else
                        {
                                //yapsın
                           
                               
                               PreparedStatement ps1 = con.prepareStatement(stajquery);
                               ps1.setString(1, (String)krumadicombo.getSelectedItem());
                               ps1.setString(2, ssehir.getText());
                               ps1.setString(3, startdate);
                               ps1.setString(4, finishdate);
                               ps1.setString(5, "Hayır");
                               ps1.setInt(6, Integer.parseInt((String)mogrno.getSelectedItem()));
                               ps1.setInt(7, Integer.parseInt(stopgun.getText()));
                               ps1.setInt(8, Integer.parseInt(mkedilengun.getText()));
                               ps1.setString(9, mulakattarihlabel.getText());
                               ps1.setInt(10, Integer.parseInt((String)sinifcombo.getSelectedItem()));
                               ps1.execute();
                               
                               
                              
                              
                               
                                  rss=pres.executeQuery();
                               kabulgun=rss.getInt("mysum");
                               if(kabulgun>=57){
                                   PreparedStatement bool  = con.prepareStatement(stajtamamquery);
                                    bool.setString(1, "tamamlandı");
                                    bool.setInt(2,Integer.parseInt((String)mogrno.getSelectedItem()));
                                    bool.execute();
                                   bool.close();
                               }
                               
                               
                               
                               ps1.close();
                               
                               mograd.setText(null);
                                 mogrsoyad.setText(null);
                               
                             ssehir.setText(null);
                                stopgun.setText(null);
                                mdduzen.setText(null);
                                mdiçerik.setText(null);
                            mdmulakatsonuc.setText(null);
                            mdproje.setText(null);
                            mdsunum.setText(null);
                             muye1.setText(null);
                             muye2.setText(null);
                        }
                       
                    }
                }
                else
                {
                    //yapsın
                    /*PreparedStatement ps = con.prepareStatement(ogrquery);
                               ps.setInt(1,Integer.parseInt((String)mogrno.getSelectedItem()));
                               ps.setString(2, mograd.getText());
                               ps.setString(3, mogrsoyad.getText());
                               ps.setString(4, (String)ogretimcombo.getSelectedItem());
                               ps.setInt(5, Integer.parseInt((String)sinifcombo.getSelectedItem()));
                               
                               ps.execute();*/
                               
                               PreparedStatement ps1 = con.prepareStatement(stajquery);
                               ps1.setString(1, (String)krumadicombo.getSelectedItem());
                               ps1.setString(2, ssehir.getText());
                               ps1.setString(3, startdate);
                               ps1.setString(4, finishdate);
                               ps1.setString(5, "Hayır");
                               ps1.setInt(6, Integer.parseInt((String)mogrno.getSelectedItem()));
                               ps1.setInt(7, Integer.parseInt(stopgun.getText()));
                               ps1.setInt(8, Integer.parseInt(mkedilengun.getText()));
                               ps1.setString(9, mulakattarihlabel.getText());
                               ps1.setInt(10, Integer.parseInt((String)sinifcombo.getSelectedItem()));
                               ps1.execute();
                               
                             
                               
                               
                               
                               rss=pres.executeQuery();
                               kabulgun=rss.getInt("mysum");
                               if(kabulgun>=57){
                                   PreparedStatement bool  = con.prepareStatement(stajtamamquery);
                                    bool.setString(1, "tamamlandı");
                                    bool.setInt(2,Integer.parseInt((String)mogrno.getSelectedItem()));
                                    bool.execute();
                                   bool.close();
                               }
                               
                               
                               //ps.close();
                               ps1.close();
                              
                               mograd.setText(null);
                                mogrsoyad.setText(null);
                                
                                ssehir.setText(null);
                                stopgun.setText(null);
                                mdduzen.setText(null);
                                mdiçerik.setText(null);
                                mdmulakatsonuc.setText(null);
                             mdproje.setText(null);
                            mdsunum.setText(null);
                                muye1.setText(null);
                            muye2.setText(null);
                }
            }
           
            
            
        }catch(SQLException e){e.printStackTrace();}
    }//GEN-LAST:event_msonucbutonActionPerformed

    private void mogradKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mogradKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            mogrsoyad.requestFocus();
        }
    }//GEN-LAST:event_mogradKeyPressed

    private void mogrsoyadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mogrsoyadKeyPressed
        
    }//GEN-LAST:event_mogrsoyadKeyPressed

    private void StajInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StajInfoMouseClicked
        krumadicombo.removeAllItems();
       String query1="select distinct kurumadi from stajinfo";
       int index=0;
       try
       {
           
           PreparedStatement ps1 = con.prepareStatement(query1);
           ResultSet rs1=ps1.executeQuery();
           
           while(rs1.next())
           {
               krumadicombo.insertItemAt(rs1.getString("kurumadi"), index);//böyle yapılabilir dizi gibi indexli koymalarda rs.next ilk kayıttan baslar ilk kaıt için basa bi yere yazmaya gerek yok hepsi while içinde olabilir
               index++;
           }
           ps1.close();
           rs1.close();
           
          
       }catch(SQLException e){e.printStackTrace();}
    }//GEN-LAST:event_StajInfoMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String query="select distinct * from Ogrenci where stajtammi=?";
        try
        {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, "tamamlandı");
            ResultSet rs = ps.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
            rs.close();
            ps.close();
        }catch(SQLException e){e.printStackTrace();}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String query="select distinct studentno,name,surname,program,o.class,kurumadi,city,arge,internday,confirmday from mulakat m ,stajinfo s,Ogrenci o where m.mulakattarih between ? and ? and s.mulakattarih=m.mulakattarih and o.studentno=s.studentnumber and o.class=s.stajsinif";
        Calendar scl=msorgubasdatechooser.getSelectedDate();
        Calendar fcl=msorgubitisdate.getSelectedDate();
        int smonth=scl.get(Calendar.MONTH)+1;
        int sday=scl.get(Calendar.DAY_OF_MONTH);
        int syear=scl.get(Calendar.YEAR);
        
        int fmonth=fcl.get(Calendar.MONTH)+1;
        int fday=fcl.get(Calendar.DAY_OF_MONTH);
        int fyear=fcl.get(Calendar.YEAR);
        String startdate=syear+"-"+smonth+"-"+sday;
        String finishdate=fyear+"-"+fmonth+"-"+fday;  
        System.out.println(startdate+"   "+finishdate);
       try
        {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, startdate);
            ps.setString(2, finishdate);
            ResultSet rs = ps.executeQuery();
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            ps.close();
            
        }catch(Exception e){e.printStackTrace();}
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String query="select distinct studentno,name,surname,o.class,kurumadi,city,arge,internday,confirmday from stajinfo s,Ogrenci o where o.studentno=? and s.studentnumber=? and o.class=s.stajsinif";
        int number=Integer.parseInt(lsorguono.getText());
        try
        {
            
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, number);
            ps.setInt(2, number);
            ResultSet rs = ps.executeQuery();
            jTable3.setModel(DbUtils.resultSetToTableModel(rs));
            ps.close();
            rs.close();
            
        }catch(SQLException e){e.printStackTrace();}
                
    }//GEN-LAST:event_jButton4ActionPerformed

    private void krumadicomboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_krumadicomboMouseClicked
       
       
 
    }//GEN-LAST:event_krumadicomboMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            try{
            File f = new File("C:\\Users\\asus\\Desktop\\Mulakatsonuc.xls");
            WritableWorkbook wb = Workbook.createWorkbook(f);
            WritableSheet sheet =wb.createSheet("mysheet", 0);
             for(int i=0;i<jTable2.getColumnCount();i++)
            {
                jxl.write.Label l1 = new jxl.write.Label(i, 0,jTable2.getColumnName(i).toString());
                    sheet.addCell(l1);
            }
            
            for(int row=0;row<jTable2.getRowCount();row++)
            {
                for(int col=0;col<jTable2.getColumnCount();col++)
                {
                    jxl.write.Label l = new jxl.write.Label(col, row+1,jTable2.getValueAt(row, col).toString());
                    sheet.addCell(l);
                }
            }
            wb.write();
            wb.close();
            
            }catch(Exception e){e.printStackTrace();}
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try{
            File f = new File("C:\\Users\\asus\\Desktop\\BitenStajlar.xls");
            WritableWorkbook wb = Workbook.createWorkbook(f);
            WritableSheet sheet =wb.createSheet("mysheet", 0);
            for(int i=0;i<jTable1.getColumnCount();i++)
            {
                jxl.write.Label l1 = new jxl.write.Label(i, 0,jTable1.getColumnName(i).toString());
                    sheet.addCell(l1);
            }
            for(int row=0;row<jTable1.getRowCount();row++)
            {
                for(int col=0;col<jTable1.getColumnCount();col++)
                {
                    jxl.write.Label l = new jxl.write.Label(col, row+1,jTable1.getValueAt(row, col).toString());//row+1 attribute larıda al
                    sheet.addCell(l);
                }
            }
            wb.write();
            wb.close();
            
            }catch(Exception e){e.printStackTrace();}
    }//GEN-LAST:event_jButton6ActionPerformed

    private void mogrno1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mogrno1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            mograd1.requestFocus();
        }
    }//GEN-LAST:event_mogrno1KeyPressed

    private void mograd1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mograd1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            mogrsoyad1.requestFocus();
        }
    }//GEN-LAST:event_mograd1KeyPressed

    private void mogrsoyad1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mogrsoyad1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            ogretimcombo1.requestFocus();
        }
    }//GEN-LAST:event_mogrsoyad1KeyPressed

    private void mulakatkayıtbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulakatkayıtbuttonActionPerformed
        String ogrquery="insert into Ogrenci (studentno,name,surname,program,class) values (?,?,?,?,?)";
        String muquery="insert into mulakat (mulakattarih,mulakatsaat,mulakatogrno,mulakatogrsinif) values (?,?,?,?)";
        
        Calendar mulakatcl=mutarihchooser1.getSelectedDate();
        
        int mukayitmonth=mulakatcl.get(Calendar.MONTH)+1;
        int mukayitday=mulakatcl.get(Calendar.DAY_OF_MONTH);
        int mukayityear=mulakatcl.get(Calendar.YEAR);
        int muhour=(int)musaatspinner1.getValue();
        int mudak=(int)mudakkaspinner1.getValue();
        
        String mulakatdate=mukayityear+"-"+mukayitmonth+"-"+mukayitday;
        String mulakatsaat=muhour+":"+mudak;
        
       try
        {
            PreparedStatement ps = con.prepareStatement(ogrquery);
            PreparedStatement ps1 = con.prepareStatement(muquery);
            
            ps.setInt(1, Integer.parseInt(mogrno1.getText()));
            ps.setString(2, mograd1.getText());
            ps.setString(3, mogrsoyad1.getText());
            ps.setString(4, (String)ogretimcombo1.getSelectedItem());
            ps.setInt(5, Integer.parseInt((String)sinifcombo1.getSelectedItem()));
            ps.execute();
            
            ps1.setString(1, mulakatdate);
            ps1.setString(2, mulakatsaat);
            ps1.setInt(3, Integer.parseInt(mogrno1.getText()));
            ps1.setInt(4, Integer.parseInt((String)sinifcombo1.getSelectedItem()));
            ps1.execute();
            ps.close();
            ps1.close();
            
                  
            mograd1.setText(null);
            mogrno1.setText(null);
            mogrsoyad1.setText(null);
            
        }catch(Exception e){e.printStackTrace();}
        
    }//GEN-LAST:event_mulakatkayıtbuttonActionPerformed

    private void OgrenciBilgiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OgrenciBilgiMouseClicked
        mogrno.removeAllItems();
       String query1="select distinct studentno from Ogrenci";
       int index=0;
       try
       {
           
           PreparedStatement ps1 = con.prepareStatement(query1);
           ResultSet rs1=ps1.executeQuery();
           
           while(rs1.next())
           {
                mogrno.insertItemAt(rs1.getString("studentno"), index);//böyle yapılabilir dizi gibi indexli koymalarda rs.next ilk kayıttan baslar ilk kaıt için basa bi yere yazmaya gerek yok hepsi while içinde olabilir
               index++;
           }
           ps1.close();
           rs1.close();
           
          
       }catch(SQLException e){e.printStackTrace();}
    }//GEN-LAST:event_OgrenciBilgiMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       
       String query1="select name,surname,program from Ogrenci where studentno=? and class=?";
       String query2 = "select mulakattarih from mulakat where mulakatogrno=? and mulakatogrsinif=?";
       
       try
       {
           
           PreparedStatement ps1 = con.prepareStatement(query1);
           PreparedStatement ps2 = con.prepareStatement(query2);
           ps1.setInt(1, Integer.parseInt((String)mogrno.getSelectedItem()));
           ps1.setInt(2, Integer.parseInt((String)sinifcombo.getSelectedItem()));
           ps2.setInt(1, Integer.parseInt((String)mogrno.getSelectedItem()));
           ps2.setInt(2, Integer.parseInt((String)sinifcombo.getSelectedItem()));
           ResultSet rs1=ps1.executeQuery();
           ResultSet rs2 = ps2.executeQuery();
           mulakattarihlabel.setText(rs2.getString("mulakattarih"));
           mograd.setText(rs1.getString("name"));
           mogrsoyad.setText(rs1.getString("surname"));
           ogretimtex.setText(rs1.getString("program"));

           ps1.close();
           rs1.close();
           ps2.close();
           rs2.close();
          
       }catch(SQLException e){e.printStackTrace();}
    }//GEN-LAST:event_jButton7ActionPerformed

    private void mulakatkayıtexcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulakatkayıtexcelActionPerformed
         try{
            File f = new File("C:\\Users\\asus\\Desktop\\MulakatTarihleri.xls");
            WritableWorkbook wb = Workbook.createWorkbook(f);
            WritableSheet sheet =wb.createSheet("mysheet", 0);
            for(int i=0;i<jTable4.getColumnCount();i++)
            {
                jxl.write.Label l1 = new jxl.write.Label(i, 0,jTable4.getColumnName(i).toString());
                    sheet.addCell(l1);
            }
            for(int row=0;row<jTable4.getRowCount();row++)
            {
                for(int col=0;col<jTable4.getColumnCount();col++)
                {
                    jxl.write.Label l = new jxl.write.Label(col, row+1,jTable4.getValueAt(row, col).toString());//row+1 attribute larıda al
                    sheet.addCell(l);
                }
            }
            wb.write();
            wb.close();
            
            }catch(Exception e){e.printStackTrace();}
    }//GEN-LAST:event_mulakatkayıtexcelActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String tablequery="select distinct studentno,name,surname,mulakattarih,mulakatsaat from Ogrenci o,mulakat m where o.studentno=m.mulakatogrno";
        try
        {
            PreparedStatement ps2 = con.prepareStatement(tablequery);
            ResultSet rs = ps2.executeQuery();
            jTable4.setModel(DbUtils.resultSetToTableModel(rs));
            
            ps2.close();
            rs.close();
            
        }catch(SQLException e){e.printStackTrace();}
    }//GEN-LAST:event_jButton8ActionPerformed

   
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Guncelle;
    private javax.swing.JPanel Komisyon;
    private javax.swing.JPanel KomisyonInfo;
    private javax.swing.JTabbedPane Komisyonici;
    private javax.swing.JPanel Listeler;
    private javax.swing.JPanel Mulakat;
    private javax.swing.JPanel OgrenciBilgi;
    private javax.swing.JPanel OgrenciBilgi1;
    private javax.swing.JPanel Olustur;
    private javax.swing.JPanel Sil;
    private javax.swing.JPanel StajInfo;
    private javax.swing.JSpinner amirspin;
    private javax.swing.JCheckBox argecheck;
    private javax.swing.JSpinner arkadaşdavspin;
    private datechooser.beans.DateChooserCombo basdatechooser;
    private datechooser.beans.DateChooserCombo bitişdatechooser;
    private javax.swing.JSpinner cabaspin;
    private javax.swing.JSpinner devamspin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField k_ekle_isim;
    private javax.swing.JTextField k_ekle_no;
    private javax.swing.JTextField k_ekle_soyad;
    private javax.swing.JButton k_guncellebutton;
    private javax.swing.JButton k_kaydetbut;
    private javax.swing.JTextField kg_eski_ad;
    private javax.swing.JTextField kg_eski_no;
    private javax.swing.JTextField kg_eski_soyad;
    private javax.swing.JTextField kg_yeni_ad;
    private javax.swing.JTextField kg_yeni_no;
    private javax.swing.JTextField kg_yeni_soyad;
    private javax.swing.JButton komisyon_sil;
    private javax.swing.JComboBox<String> krumadicombo;
    private javax.swing.JTextField ks_no;
    private javax.swing.JComboBox<String> kseccombo;
    private javax.swing.JTextField küs_ad;
    private javax.swing.JTextField küs_no;
    private javax.swing.JTextField lsorguono;
    private javax.swing.JTextField mdduzen;
    private javax.swing.JTextField mdiçerik;
    private javax.swing.JTextField mdmulakatsonuc;
    private javax.swing.JTextField mdproje;
    private javax.swing.JTextField mdsunum;
    private javax.swing.JButton mgunhesaplabuton;
    private javax.swing.JTextField mkedilengun;
    private javax.swing.JTextField mograd;
    private javax.swing.JTextField mograd1;
    private javax.swing.JComboBox<String> mogrno;
    private javax.swing.JTextField mogrno1;
    private javax.swing.JTextField mogrsoyad;
    private javax.swing.JTextField mogrsoyad1;
    private javax.swing.JButton msonucbuton;
    private datechooser.beans.DateChooserCombo msorgubasdatechooser;
    private datechooser.beans.DateChooserCombo msorgubitisdate;
    private javax.swing.JSpinner mudakkaspinner1;
    private javax.swing.JPanel mulakat;
    private javax.swing.JButton mulakatkayıtbutton;
    private javax.swing.JButton mulakatkayıtexcel;
    private javax.swing.JTabbedPane mulakatkayıtpane;
    private javax.swing.JLabel mulakattarihlabel;
    private javax.swing.JSpinner musaatspinner1;
    private datechooser.beans.DateChooserCombo mutarihchooser1;
    private javax.swing.JTextField muye1;
    private javax.swing.JTextField muye2;
    private javax.swing.JComboBox<String> ogretimcombo1;
    private javax.swing.JTextField ogretimtex;
    private javax.swing.JComboBox<String> sinifcombo;
    private javax.swing.JComboBox<String> sinifcombo1;
    private javax.swing.JTextField ssehir;
    private javax.swing.JTextField stopgun;
    private javax.swing.JSpinner vaktindeisspin;
    private javax.swing.JButton üye_sil;
    // End of variables declaration//GEN-END:variables
}
