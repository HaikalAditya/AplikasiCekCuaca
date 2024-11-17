import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

public class cekCuacaForm extends javax.swing.JFrame {
    
    public cekCuacaForm() {
        initComponents();
        jComboBox1.setModel(new DefaultComboBoxModel<>());
        jTable1.setModel(new DefaultTableModel(
    new Object[][] {},
    new String[] { "Kota", "Deskripsi", "Suhu", "Kelembapan" }
));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        fieldInput = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnCek = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        weatherImageLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        weatherLabel = new javax.swing.JLabel();
        btnMuat = new javax.swing.JButton();
        lblTemp = new javax.swing.JLabel();
        lblHum = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(647, 800));

        jPanel1.setLayout(new java.awt.CardLayout());

        jLabel2.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Aplikasi Cek Cuaca");
        jPanel1.add(jLabel2, "card2");

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setPreferredSize(new java.awt.Dimension(647, 750));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        fieldInput.setPreferredSize(new java.awt.Dimension(150, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(fieldInput, gridBagConstraints);

        jComboBox1.setPreferredSize(new java.awt.Dimension(150, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(jComboBox1, gridBagConstraints);

        btnCek.setText("Cek Cuaca");
        btnCek.setPreferredSize(new java.awt.Dimension(150, 30));
        btnCek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(btnCek, gridBagConstraints);

        btnSimpan.setText("Simpan");
        btnSimpan.setPreferredSize(new java.awt.Dimension(150, 30));
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(btnSimpan, gridBagConstraints);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(456, 206));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Lokasi", "Deskripsi"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(jScrollPane1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(weatherImageLabel, gridBagConstraints);

        jLabel3.setText("Input Lokasi");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(jLabel3, gridBagConstraints);

        jLabel4.setText("Lokasi Favorit");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(jLabel4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(weatherLabel, gridBagConstraints);

        btnMuat.setText("Muat Data");
        btnMuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMuatActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(btnMuat, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(lblTemp, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(lblHum, gridBagConstraints);

        jLabel1.setText("Deskripsi :");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(jLabel1, gridBagConstraints);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Suhu :");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(jLabel5, gridBagConstraints);

        jLabel6.setText("Kelembapan :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(jLabel6, gridBagConstraints);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private JSONObject getWeather(String city) throws Exception {
    String urlString = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=689671f023701e36b88b6f19da669dd0&units=metric";
    URL url = new URL(urlString);
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setRequestMethod("GET");

    // Periksa kode respons
    int responseCode = connection.getResponseCode();
    if (responseCode != 200) {
        throw new RuntimeException("HTTP Request Failed: Error Code " + responseCode);
    }

    // Baca respons
    BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
    StringBuilder response = new StringBuilder();
    String line;
    while ((line = reader.readLine()) != null) {
        response.append(line);
    }
    reader.close();

    // Parse JSON respons
    JSONParser parser = new JSONParser();
    return (JSONObject) parser.parse(response.toString());
}

    
    
    private void btnCekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCekActionPerformed
        try {
        String city = fieldInput.getText(); // Ambil nama kota dari JTextField
        JSONObject weatherData = getWeather(city); // Ambil data dari API

        // Ambil data cuaca dari JSON
        JSONArray weatherArray = (JSONArray) weatherData.get("weather");
        JSONObject weatherDetails = (JSONObject) weatherArray.get(0);
        String description = (String) weatherDetails.get("description");
        String iconCode = (String) weatherDetails.get("icon"); // Ambil kode icon

        JSONObject mainData = (JSONObject) weatherData.get("main");
        double temperature = (double) mainData.get("temp");
        long humidity = (long) mainData.get("humidity");

        // Tampilkan data di JLabel
        weatherLabel.setText(description);
        lblTemp.setText(String.valueOf(temperature));
        lblHum.setText(String.valueOf(humidity));
        // Tampilkan gambar sesuai kondisi cuaca
          updateWeatherImageWithURL(iconCode);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Gagal mengambil data cuaca!\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnCekActionPerformed

    private void btnMuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMuatActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0); // Hapus data lama di tabel

    try (BufferedReader reader = new BufferedReader(new FileReader("weather_data.csv"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");
            model.addRow(data);
        }
        JOptionPane.showMessageDialog(this, "Data berhasil dimuat ke tabel.");
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Gagal memuat data dari file.", "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
    }//GEN-LAST:event_btnMuatActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
         String city = fieldInput.getText();
         String description = weatherLabel.getText();
         String temperature = lblTemp.getText();
         String humidity = lblHum.getText();
    saveToFavorites(city);
    saveWeatherToFile(city, description, temperature, humidity); // Simpan data cuaca ke CSV
    }//GEN-LAST:event_btnSimpanActionPerformed
    
private void updateWeatherImageWithURL(String iconCode) {
    try {
        // URL icon bawaan OpenWeatherMap
        String iconUrl = "http://openweathermap.org/img/wn/" + iconCode + "@2x.png";

        // Muat gambar dari URL
        ImageIcon icon = new ImageIcon(new URL(iconUrl));
        weatherImageLabel.setIcon(icon);
    } catch (Exception e) {
        // Tampilkan pesan error jika gagal memuat icon
        weatherImageLabel.setText("Icon tidak tersedia");
        e.printStackTrace();
    }
}
//membuat favorit
private void saveToFavorites(String city) {
    if (!city.isEmpty() && ((DefaultComboBoxModel<String>) jComboBox1.getModel()).getIndexOf(city) == -1) {
        ((DefaultComboBoxModel<String>) jComboBox1.getModel()).addElement(city);
        JOptionPane.showMessageDialog(this, "Kota berhasil disimpan ke favorit.");
    } else {
        JOptionPane.showMessageDialog(this, "Kota sudah ada di daftar favorit atau kosong.");
    }
}
//method simpan
//menyimpan data
private void saveWeatherToFile(String city, String description, String temperature, String humidity) {
    try (FileWriter writer = new FileWriter("weather_data.csv", true)) {
        writer.append(city).append(",");
        writer.append(description).append(",");
        writer.append(temperature).append(",");
        writer.append(humidity).append("\n");
        JOptionPane.showMessageDialog(this, "Data cuaca berhasil disimpan ke file CSV.");
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Gagal menyimpan data ke file.", "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
}
//




    
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
            java.util.logging.Logger.getLogger(cekCuacaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cekCuacaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cekCuacaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cekCuacaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cekCuacaForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCek;
    private javax.swing.JButton btnMuat;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JTextField fieldInput;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblHum;
    private javax.swing.JLabel lblTemp;
    private javax.swing.JLabel weatherImageLabel;
    private javax.swing.JLabel weatherLabel;
    // End of variables declaration//GEN-END:variables
}
