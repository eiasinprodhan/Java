package view;

import dao.CategoryDao;
import dao.CustomersDao;
import dao.ProductsDAO;
import dao.PurchaseDao;
import dao.ReportDao;
import dao.SalesDao;
import dao.StockDao;
import dao.SupplierDao;
import java.awt.event.ItemEvent;
import java.util.Date;
import javax.swing.JOptionPane;
import util.DateConverter;

public class POSView extends javax.swing.JFrame {

    private String userRole;

    CustomersDao cd = new CustomersDao();
    ProductsDAO pd = new ProductsDAO();
    CategoryDao cd1 = new CategoryDao();
    SupplierDao sd = new SupplierDao();
    PurchaseDao pd1 = new PurchaseDao();
    StockDao sd1 = new StockDao();
    ReportDao rd = new ReportDao();
    SalesDao sd2 = new SalesDao();
    DateConverter converter = new DateConverter();

    public POSView() {
        initComponents();
        cd.showCustomers(tableCustomers);
        cd1.showCategory(tableCategories);
        pd.loadCategoryToProduct(comboProductCategory);
        pd.loadCategoryToProduct(comboPurchaseCategory);
        sd.showSuppliers(tableSuppliers);
        pd.showAllProducts(tableProducts);
        sd.showAllSupplierToCombo(comboPurchaseSupplier);
        pd1.showPurchase(tablePurchase);
        sd1.showStock(tableStock);
        pd.loadCategoryToProduct(comboSalesCategories);
        cd.showCustomersForSales(comboSalesCustomers);
        sd2.showSales(tableSales);

        comboPurchaseCategory.addItemListener((ItemEvent e) -> {
            String categoryName = comboPurchaseCategory.getSelectedItem().toString();
            pd.getAllProductsByCategory(categoryName, comboPurchaseName);
        });

        comboSalesCategories.addItemListener((ItemEvent e) -> {
            String categoryName = comboSalesCategories.getSelectedItem().toString();
            pd.getAllProductsByCategory(categoryName, comboSalesProducts);
        });
    }

    public void setUsername(String userRole) {
        this.userRole = userRole;
        if (userRole.equalsIgnoreCase("manager")) {
            btnPurchases.setVisible(false);
        } else if (userRole.equalsIgnoreCase("cashier")) {
            btnSuppliers.setVisible(false);
            btnPurchases.setVisible(false);
            btnStock.setVisible(false);
        } else {
            this.setVisible(false);
            LoginView lv = new LoginView();
            lv.setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnDashboard = new javax.swing.JButton();
        btnProducts = new javax.swing.JButton();
        btnCustomers = new javax.swing.JButton();
        btnSuppliers = new javax.swing.JButton();
        btnCategories = new javax.swing.JButton();
        btnPurchases = new javax.swing.JButton();
        btnSales = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        btnStock = new javax.swing.JButton();
        tabPOS = new javax.swing.JTabbedPane();
        tabDashboard = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        tabProducts = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtProductID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProducts = new javax.swing.JTable();
        comboProductCategory = new javax.swing.JComboBox<>();
        tabCustomers = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCustomersID = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCustomersName = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCustomersEmail = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtCustomersPhone = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtCustomersAddress = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableCustomers = new javax.swing.JTable();
        btnCustomerSearch = new javax.swing.JButton();
        btnCustomerRefresh = new javax.swing.JButton();
        tabSuppliers = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtSupplierID = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtSupplierName = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtSupplierEmail = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtSupplierCell = new javax.swing.JTextField();
        txtSupplierContactPerson = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        btnSupplierSave = new javax.swing.JButton();
        btnSupplierEdit = new javax.swing.JButton();
        btnSupplierDelete = new javax.swing.JButton();
        btnSupplierReset = new javax.swing.JButton();
        btnSupplierSearch = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableSuppliers = new javax.swing.JTable();
        tabCategories = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtCategoryID = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtCategoryName = new javax.swing.JTextField();
        btnCategorySave = new javax.swing.JButton();
        btnCategotyEdit = new javax.swing.JButton();
        btnCategotyDelete = new javax.swing.JButton();
        btnCategotyReset = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableCategories = new javax.swing.JTable();
        tabPurchases = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtPurchaseID = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        comboPurchaseCategory = new javax.swing.JComboBox<>();
        comboPurchaseName = new javax.swing.JComboBox<>();
        comboPurchaseSupplier = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        txtPurchaseQuantity = new javax.swing.JTextField();
        txtPurchaseUnitPrice = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtPurchaseTotalPrice = new javax.swing.JTextField();
        btnPurchaseSave = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablePurchase = new javax.swing.JTable();
        tabSales = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtSalesID = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        txtSalesUnitPrice = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txtSalesQuantity = new javax.swing.JTextField();
        comboSalesCategories = new javax.swing.JComboBox<>();
        comboSalesProducts = new javax.swing.JComboBox<>();
        comboSalesCustomers = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        txtSalesTotalPrice = new javax.swing.JTextField();
        btnSalesSell = new javax.swing.JButton();
        btnSalesEdit = new javax.swing.JButton();
        btnSalesReset = new javax.swing.JButton();
        btnSalesDelete = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableSales = new javax.swing.JTable();
        jLabel42 = new javax.swing.JLabel();
        txtSalesStock = new javax.swing.JTextField();
        tabStock = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableStock = new javax.swing.JTable();
        tabReport = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        dateReportTo = new com.toedter.calendar.JDateChooser();
        dateReportFrom = new com.toedter.calendar.JDateChooser();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tableReport = new javax.swing.JTable();
        btnReportPurchaseShow = new javax.swing.JButton();
        btnReportPurchaseShow1 = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 800));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 70));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("POS SYSTEM");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 90));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Main Menu");

        btnDashboard.setBackground(new java.awt.Color(0, 204, 153));
        btnDashboard.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDashboard.setText("Dashboard");
        btnDashboard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btnDashboard.setBorderPainted(false);
        btnDashboard.setFocusPainted(false);
        btnDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDashboardMouseClicked(evt);
            }
        });
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });

        btnProducts.setBackground(new java.awt.Color(255, 153, 0));
        btnProducts.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnProducts.setText("Products");
        btnProducts.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btnProducts.setBorderPainted(false);
        btnProducts.setFocusPainted(false);
        btnProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductsMouseClicked(evt);
            }
        });

        btnCustomers.setBackground(new java.awt.Color(255, 153, 0));
        btnCustomers.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCustomers.setText("Customers");
        btnCustomers.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btnCustomers.setBorderPainted(false);
        btnCustomers.setFocusPainted(false);
        btnCustomers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCustomersMouseClicked(evt);
            }
        });
        btnCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomersActionPerformed(evt);
            }
        });

        btnSuppliers.setBackground(new java.awt.Color(255, 153, 0));
        btnSuppliers.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSuppliers.setText("Suppliers");
        btnSuppliers.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btnSuppliers.setBorderPainted(false);
        btnSuppliers.setFocusPainted(false);
        btnSuppliers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuppliersMouseClicked(evt);
            }
        });

        btnCategories.setBackground(new java.awt.Color(255, 153, 0));
        btnCategories.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCategories.setText("Categories");
        btnCategories.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btnCategories.setBorderPainted(false);
        btnCategories.setFocusPainted(false);
        btnCategories.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCategoriesMouseClicked(evt);
            }
        });

        btnPurchases.setBackground(new java.awt.Color(255, 153, 0));
        btnPurchases.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPurchases.setText("Purchases");
        btnPurchases.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btnPurchases.setBorderPainted(false);
        btnPurchases.setFocusPainted(false);
        btnPurchases.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPurchasesMouseClicked(evt);
            }
        });
        btnPurchases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurchasesActionPerformed(evt);
            }
        });

        btnSales.setBackground(new java.awt.Color(255, 153, 0));
        btnSales.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSales.setText("Sales");
        btnSales.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btnSales.setBorderPainted(false);
        btnSales.setFocusPainted(false);
        btnSales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalesMouseClicked(evt);
            }
        });

        btnReport.setBackground(new java.awt.Color(102, 153, 255));
        btnReport.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnReport.setText("Report");
        btnReport.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btnReport.setBorderPainted(false);
        btnReport.setFocusPainted(false);
        btnReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReportMouseClicked(evt);
            }
        });

        btnStock.setBackground(new java.awt.Color(255, 153, 0));
        btnStock.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnStock.setText("Stock");
        btnStock.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btnStock.setBorderPainted(false);
        btnStock.setFocusPainted(false);
        btnStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStockMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSales, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPurchases, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCategories, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSuppliers, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCustomers, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSuppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCategories, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPurchases, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSales, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnStock, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 256, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 200, 710));

        tabPOS.setPreferredSize(new java.awt.Dimension(800, 810));

        tabDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        tabDashboard.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        tabPOS.addTab("Dashboard", tabDashboard);

        tabProducts.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(1000, 60));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Products");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, 1070, 60));

        tabProducts.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 60));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("ID");
        tabProducts.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 49, -1));
        tabProducts.add(txtProductID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 200, 40));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Categories");
        tabProducts.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 80, -1));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Name");
        tabProducts.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 49, -1));
        tabProducts.add(txtProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 200, 40));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Save");
        jButton1.setFocusPainted(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        tabProducts.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 90, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Edit");
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        tabProducts.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 90, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("Delete");
        jButton3.setFocusPainted(false);
        tabProducts.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 90, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("Reset");
        jButton4.setFocusPainted(false);
        tabProducts.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 90, -1));

        tableProducts.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableProducts);

        tabProducts.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 900, 440));

        comboProductCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        tabProducts.add(comboProductCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 200, 40));

        tabPOS.addTab("Products", tabProducts);

        tabCustomers.setPreferredSize(new java.awt.Dimension(1000, 740));

        jPanel4.setBackground(new java.awt.Color(255, 153, 0));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Customers");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 60));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText(" ID");

        txtCustomersID.setText(" ");
        txtCustomersID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomersIDActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Name");

        txtCustomersName.setText(" ");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Email");

        txtCustomersEmail.setText(" ");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Phone");

        txtCustomersPhone.setText(" ");
        txtCustomersPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomersPhoneActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Address");

        txtCustomersAddress.setText(" ");

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setText("Save");
        jButton5.setFocusPainted(false);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setText("Delete");
        jButton6.setFocusPainted(false);
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setText("Edit");
        jButton7.setFocusPainted(false);
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton8.setText("Reset");
        jButton8.setFocusPainted(false);
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        tableCustomers.setModel(new javax.swing.table.DefaultTableModel(
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
        tableCustomers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCustomersMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableCustomers);

        btnCustomerSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCustomerSearch.setText("Search");
        btnCustomerSearch.setFocusPainted(false);
        btnCustomerSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCustomerSearchMouseClicked(evt);
            }
        });

        btnCustomerRefresh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCustomerRefresh.setText("Refresh");
        btnCustomerRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCustomerRefreshMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tabCustomersLayout = new javax.swing.GroupLayout(tabCustomers);
        tabCustomers.setLayout(tabCustomersLayout);
        tabCustomersLayout.setHorizontalGroup(
            tabCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(tabCustomersLayout.createSequentialGroup()
                .addGroup(tabCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabCustomersLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(tabCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtCustomersID, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(tabCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCustomersName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(tabCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCustomersEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(tabCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabCustomersLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCustomersPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(tabCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCustomersAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tabCustomersLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 924, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabCustomersLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(btnCustomerSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCustomerRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabCustomersLayout.setVerticalGroup(
            tabCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCustomersLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(tabCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabCustomersLayout.createSequentialGroup()
                        .addGroup(tabCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(tabCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14)
                                .addComponent(jLabel15)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tabCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCustomersPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(txtCustomersEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCustomersAddress)))
                    .addGroup(tabCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(tabCustomersLayout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCustomersName))
                        .addGroup(tabCustomersLayout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCustomersID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(tabCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8)
                    .addGroup(tabCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCustomerSearch)
                        .addComponent(jButton5)
                        .addComponent(jButton7)
                        .addComponent(jButton6)
                        .addComponent(btnCustomerRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
        );

        tabPOS.addTab("Customers", tabCustomers);

        jPanel7.setBackground(new java.awt.Color(255, 153, 0));
        jPanel7.setPreferredSize(new java.awt.Dimension(900, 60));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Suppliers");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setText("ID");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setText("Name");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setText("Email");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel26.setText("Cell");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setText("Contact Person");

        btnSupplierSave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSupplierSave.setText("Save");
        btnSupplierSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSupplierSaveMouseClicked(evt);
            }
        });

        btnSupplierEdit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSupplierEdit.setText("Edit");

        btnSupplierDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSupplierDelete.setText("Delete");

        btnSupplierReset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSupplierReset.setText("Reset");

        btnSupplierSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSupplierSearch.setText("Search");

        tableSuppliers.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(tableSuppliers);

        javax.swing.GroupLayout tabSuppliersLayout = new javax.swing.GroupLayout(tabSuppliers);
        tabSuppliers.setLayout(tabSuppliersLayout);
        tabSuppliersLayout.setHorizontalGroup(
            tabSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
            .addGroup(tabSuppliersLayout.createSequentialGroup()
                .addGroup(tabSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabSuppliersLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(tabSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabSuppliersLayout.createSequentialGroup()
                                .addGroup(tabSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSupplierID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tabSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tabSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSupplierEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tabSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSupplierCell, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tabSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSupplierContactPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27)))
                            .addGroup(tabSuppliersLayout.createSequentialGroup()
                                .addGap(235, 235, 235)
                                .addComponent(btnSupplierSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSupplierEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSupplierDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSupplierReset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSupplierSearch))))
                    .addGroup(tabSuppliersLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 892, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        tabSuppliersLayout.setVerticalGroup(
            tabSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSuppliersLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(tabSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tabSuppliersLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSupplierID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabSuppliersLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSupplierEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabSuppliersLayout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSupplierCell, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabSuppliersLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabSuppliersLayout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSupplierContactPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(tabSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSupplierSave)
                    .addComponent(btnSupplierEdit)
                    .addComponent(btnSupplierDelete)
                    .addComponent(btnSupplierReset)
                    .addComponent(btnSupplierSearch))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 83, Short.MAX_VALUE))
        );

        tabPOS.addTab("Suppliers", tabSuppliers);

        jPanel5.setBackground(new java.awt.Color(255, 153, 0));
        jPanel5.setMinimumSize(new java.awt.Dimension(937, 60));
        jPanel5.setPreferredSize(new java.awt.Dimension(1000, 50));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Catagories");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 6, 1000, 50));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("Category ID");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("Category Name");

        btnCategorySave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCategorySave.setText("Save");
        btnCategorySave.setPreferredSize(new java.awt.Dimension(72, 30));
        btnCategorySave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCategorySaveMouseClicked(evt);
            }
        });

        btnCategotyEdit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCategotyEdit.setText("Edit");
        btnCategotyEdit.setPreferredSize(new java.awt.Dimension(72, 30));

        btnCategotyDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCategotyDelete.setText("Delete");
        btnCategotyDelete.setPreferredSize(new java.awt.Dimension(72, 30));

        btnCategotyReset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCategotyReset.setText("Reset");
        btnCategotyReset.setPreferredSize(new java.awt.Dimension(72, 30));

        tableCategories.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tableCategories);

        javax.swing.GroupLayout tabCategoriesLayout = new javax.swing.GroupLayout(tabCategories);
        tabCategories.setLayout(tabCategoriesLayout);
        tabCategoriesLayout.setHorizontalGroup(
            tabCategoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(tabCategoriesLayout.createSequentialGroup()
                .addGroup(tabCategoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabCategoriesLayout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addGroup(tabCategoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(txtCategoryID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tabCategoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(txtCategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tabCategoriesLayout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(btnCategorySave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCategotyEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCategotyDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCategotyReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabCategoriesLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabCategoriesLayout.setVerticalGroup(
            tabCategoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCategoriesLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabCategoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabCategoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCategoryID, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txtCategoryName))
                .addGap(18, 18, 18)
                .addGroup(tabCategoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCategorySave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCategotyEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCategotyDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCategotyReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        tabPOS.addTab("Categories", tabCategories);

        tabPurchases.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 153, 0));
        jPanel8.setPreferredSize(new java.awt.Dimension(1000, 60));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Purchases");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        tabPurchases.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("ID");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Product Category");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setText("Product Name");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setText("Supplier");

        comboPurchaseCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboPurchaseName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboPurchaseSupplier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setText("Quantity");

        txtPurchaseQuantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPurchaseQuantityFocusLost(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setText("Unit Price");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel30.setText("Total Price");

        btnPurchaseSave.setText("Save");
        btnPurchaseSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPurchaseSaveMouseClicked(evt);
            }
        });

        jButton10.setText("Edit");

        jButton11.setText("Delete");

        jButton12.setText("Reset");

        tablePurchase.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(tablePurchase);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPurchaseID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboPurchaseCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboPurchaseName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboPurchaseSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(133, 133, 133))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPurchaseUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPurchaseQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPurchaseTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(btnPurchaseSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboPurchaseName)
                            .addComponent(comboPurchaseSupplier)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPurchaseID)
                            .addComponent(comboPurchaseCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPurchaseQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPurchaseUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPurchaseTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPurchaseSave)
                    .addComponent(jButton10)
                    .addComponent(jButton11)
                    .addComponent(jButton12))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        tabPurchases.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1000, 660));

        tabPOS.addTab("Purchases", tabPurchases);

        tabSales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(255, 153, 0));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Sales");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tabSales.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel35.setText("ID");
        tabSales.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 66, 50, -1));
        tabSales.add(txtSalesID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 88, 200, 40));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel36.setText("Categories");
        tabSales.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 66, 72, -1));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel37.setText("Products");
        tabSales.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 66, -1, -1));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel38.setText("Customers");
        tabSales.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 66, 90, -1));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel39.setText("Unit Price");
        tabSales.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 134, 74, -1));
        tabSales.add(txtSalesUnitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 156, 200, 40));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel40.setText("Quantity");
        tabSales.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 134, 50, -1));

        txtSalesQuantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSalesQuantityFocusLost(evt);
            }
        });
        tabSales.add(txtSalesQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 156, 200, 40));

        comboSalesCategories.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        tabSales.add(comboSalesCategories, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 88, 200, 40));

        comboSalesProducts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        tabSales.add(comboSalesProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 88, 200, 40));

        comboSalesCustomers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        tabSales.add(comboSalesCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 88, 200, 40));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel41.setText("Total Price");
        tabSales.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 134, 84, -1));
        tabSales.add(txtSalesTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 156, 200, 40));

        btnSalesSell.setText("Sell");
        btnSalesSell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalesSellMouseClicked(evt);
            }
        });
        tabSales.add(btnSalesSell, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 214, -1, -1));

        btnSalesEdit.setText("Edit");
        tabSales.add(btnSalesEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 214, -1, -1));

        btnSalesReset.setText("Reset");
        tabSales.add(btnSalesReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 214, -1, -1));

        btnSalesDelete.setText("Delete");
        tabSales.add(btnSalesDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 214, -1, -1));

        tableSales.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tableSales);

        tabSales.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 255, 930, 450));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel42.setText("Stock");
        tabSales.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 134, 74, -1));
        tabSales.add(txtSalesStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 200, 40));

        tabPOS.addTab("Sales", tabSales);

        jPanel10.setBackground(new java.awt.Color(255, 153, 0));
        jPanel10.setPreferredSize(new java.awt.Dimension(1000, 60));

        jLabel31.setBackground(new java.awt.Color(0, 0, 0));
        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Stock");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        tableStock.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane7.setViewportView(tableStock);

        javax.swing.GroupLayout tabStockLayout = new javax.swing.GroupLayout(tabStock);
        tabStock.setLayout(tabStockLayout);
        tabStockLayout.setHorizontalGroup(
            tabStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(tabStockLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        tabStockLayout.setVerticalGroup(
            tabStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabStockLayout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 158, Short.MAX_VALUE))
        );

        tabPOS.addTab("Stock", tabStock);

        jPanel11.setBackground(new java.awt.Color(51, 102, 255));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Report");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel33.setText("To");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel34.setText("From");

        tableReport.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane8.setViewportView(tableReport);

        btnReportPurchaseShow.setText("Show Purchase Report");
        btnReportPurchaseShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReportPurchaseShowMouseClicked(evt);
            }
        });

        btnReportPurchaseShow1.setText("Show Sales Report");

        javax.swing.GroupLayout tabReportLayout = new javax.swing.GroupLayout(tabReport);
        tabReport.setLayout(tabReportLayout);
        tabReportLayout.setHorizontalGroup(
            tabReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(tabReportLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(tabReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateReportFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addGroup(tabReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateReportTo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabReportLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(btnReportPurchaseShow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReportPurchaseShow1)
                .addGap(181, 181, 181))
            .addGroup(tabReportLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabReportLayout.setVerticalGroup(
            tabReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabReportLayout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(tabReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34))
                .addGap(18, 18, 18)
                .addGroup(tabReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateReportTo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateReportFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tabReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReportPurchaseShow1)
                    .addComponent(btnReportPurchaseShow))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabPOS.addTab("Report", tabReport);

        getContentPane().add(tabPOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 1000, 740));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void btnDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMouseClicked
        // TODO add your handling code here:
        tabPOS.setSelectedIndex(0);
    }//GEN-LAST:event_btnDashboardMouseClicked

    private void btnProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductsMouseClicked
        // TODO add your handling code here:
        tabPOS.setSelectedIndex(1);
        pd.loadCategoryToProduct(comboProductCategory);
        pd.showAllProducts(tableProducts);
    }//GEN-LAST:event_btnProductsMouseClicked

    private void btnCustomersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomersMouseClicked
        // TODO add your handling code here:
        tabPOS.setSelectedIndex(2);
        cd.showCustomers(tableCustomers);
    }//GEN-LAST:event_btnCustomersMouseClicked

    private void btnSuppliersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuppliersMouseClicked
        // TODO add your handling code here:
        tabPOS.setSelectedIndex(3);
        sd.showSuppliers(tableSuppliers);
    }//GEN-LAST:event_btnSuppliersMouseClicked

    private void btnCategoriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoriesMouseClicked
        // TODO add your handling code here:
        tabPOS.setSelectedIndex(4);
        cd1.showCategory(tableCategories);

    }//GEN-LAST:event_btnCategoriesMouseClicked

    private void btnPurchasesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPurchasesMouseClicked
        // TODO add your handling code here:
        tabPOS.setSelectedIndex(5);
    }//GEN-LAST:event_btnPurchasesMouseClicked

    private void btnSalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalesMouseClicked
        // TODO add your handling code here:
        tabPOS.setSelectedIndex(6);
    }//GEN-LAST:event_btnSalesMouseClicked

    private void btnStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStockMouseClicked
        // TODO add your handling code here:
        tabPOS.setSelectedIndex(7);
        sd1.showStock(tableStock);
    }//GEN-LAST:event_btnStockMouseClicked

    private void btnReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportMouseClicked
        // TODO add your handling code here:
        tabPOS.setSelectedIndex(8);
    }//GEN-LAST:event_btnReportMouseClicked

    private void btnCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCustomersActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnCategorySaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategorySaveMouseClicked
        // TODO add your handling code here:
        String name = txtCategoryName.getText().trim();
        cd1.saveCategory(name);
        cd1.showCategory(tableCategories);
    }//GEN-LAST:event_btnCategorySaveMouseClicked

    private void btnSupplierSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupplierSaveMouseClicked
        // TODO add your handling code here:
        String name = txtSupplierName.getText().trim();
        String email = txtSupplierEmail.getText().trim();
        String cell = txtSupplierCell.getText().trim();
        String contactPerson = txtSupplierContactPerson.getText().trim();
        sd.saveSupplier(name, email, cell, contactPerson);
        sd.showSuppliers(tableSuppliers);
    }//GEN-LAST:event_btnSupplierSaveMouseClicked

    private void btnPurchasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurchasesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPurchasesActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        String name = txtProductName.getText();
        String category = comboProductCategory.getSelectedItem().toString();

        pd.saveProduct(name, category);
        pd.showAllProducts(tableProducts);

        sd1.saveStock(name, category);
        sd1.showStock(tableStock);
    }//GEN-LAST:event_jButton1MouseClicked

    private void txtPurchaseQuantityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPurchaseQuantityFocusLost
        // TODO add your handling code here:
        float unitPrice = Float.parseFloat(txtPurchaseUnitPrice.getText().trim());
        float quantity = Float.parseFloat(txtPurchaseQuantity.getText().trim());

        float totalPrice = unitPrice * quantity;

        txtPurchaseTotalPrice.setText(String.valueOf(totalPrice));
    }//GEN-LAST:event_txtPurchaseQuantityFocusLost

    private void btnPurchaseSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPurchaseSaveMouseClicked
        // TODO add your handling code here:
        String category = comboPurchaseCategory.getSelectedItem().toString();
        String name = comboPurchaseName.getSelectedItem().toString();
        String supplier = comboPurchaseSupplier.getSelectedItem().toString();
        Float unitPrice = Float.valueOf(txtPurchaseUnitPrice.getText().trim());
        Float quantity = Float.valueOf(txtPurchaseQuantity.getText().trim());
        Float totalPrice = Float.valueOf(txtPurchaseTotalPrice.getText().trim());
        pd1.savePurchase(category, name, supplier, unitPrice, quantity, totalPrice);
        pd1.showPurchase(tablePurchase);
        sd1.updateStock(name, quantity);
        sd1.showStock(tableStock);
    }//GEN-LAST:event_btnPurchaseSaveMouseClicked

    private void btnReportPurchaseShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportPurchaseShowMouseClicked
        // TODO add your handling code here:
        Date fromData = dateReportFrom.getDate();
        Date toData = dateReportTo.getDate();

        java.sql.Date from = converter.utilDateToSqlDate(fromData);
        java.sql.Date to = converter.utilDateToSqlDate(toData);

        rd.generatePDFReportForPurchase(from, to, tableReport);

        System.out.println(to);
    }//GEN-LAST:event_btnReportPurchaseShowMouseClicked

    private void txtSalesQuantityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSalesQuantityFocusLost
        // TODO add your handling code here:
        String productName = comboSalesProducts.getSelectedItem().toString();
        float quantity = Float.parseFloat(txtSalesQuantity.getText().trim());
        float unitPrice = Float.parseFloat(txtSalesUnitPrice.getText().trim());
        Float checkStock = sd2.checkStock(productName);
        System.out.println(checkStock);
        
        if (txtSalesQuantity.getText().trim() != null && txtSalesUnitPrice.getText().trim() != null && checkStock >= quantity && checkStock > 0) {
            float totalPrice = unitPrice * quantity;
            txtSalesTotalPrice.setText(String.valueOf(totalPrice));
        } else {
            JOptionPane.showMessageDialog(null, "Products not available.");
        }
    }//GEN-LAST:event_txtSalesQuantityFocusLost

    private void btnSalesSellMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalesSellMouseClicked
        // TODO add your handling code here:
        String productName = comboSalesProducts.getSelectedItem().toString();
        float quantity = Float.parseFloat(txtSalesQuantity.getText());
        Float checkStock = sd2.checkStock(productName);
        if (checkStock >= quantity && checkStock>0) {
            String category = comboSalesCategories.getSelectedItem().toString();
            String customerName = comboSalesCustomers.getSelectedItem().toString();
            float unitPrice = Float.parseFloat(txtSalesUnitPrice.getText());
            float totalPrice = Float.parseFloat(txtSalesTotalPrice.getText());
            sd2.updateStock(productName, quantity);
            sd2.saveSales(category, productName, customerName, unitPrice, quantity, totalPrice);
            sd2.showSales(tableSales);
        } else {
            JOptionPane.showMessageDialog(null, "Products not available.");
        }
    }//GEN-LAST:event_btnSalesSellMouseClicked

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnCustomerRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomerRefreshMouseClicked
        // TODO add your handling code here:
        cd.showCustomers(tableCustomers);
    }//GEN-LAST:event_btnCustomerRefreshMouseClicked

    private void btnCustomerSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomerSearchMouseClicked
        // TODO add your handling code here:
        int id = Integer.parseInt(txtCustomersID.getText().trim());
        cd.showCustomersById(tableCustomers, id);
    }//GEN-LAST:event_btnCustomerSearchMouseClicked

    private void tableCustomersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCustomersMouseClicked
        // TODO add your handling code here:
        int rowIndex = tableCustomers.getSelectedRow();

        String id = tableCustomers.getModel().getValueAt(rowIndex, 0).toString();
        String name = tableCustomers.getModel().getValueAt(rowIndex, 1).toString();
        String email = tableCustomers.getModel().getValueAt(rowIndex, 2).toString();
        String phone = tableCustomers.getModel().getValueAt(rowIndex, 3).toString();
        String address = tableCustomers.getModel().getValueAt(rowIndex, 4).toString();

        txtCustomersID.setText(id);
        txtCustomersName.setText(name);
        txtCustomersEmail.setText(email);
        txtCustomersPhone.setText(phone);
        txtCustomersAddress.setText(address);
    }//GEN-LAST:event_tableCustomersMouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
        int id = Integer.parseInt(txtCustomersID.getText());
        String name = txtCustomersName.getText().trim();
        String email = txtCustomersEmail.getText().trim();
        String phone = txtCustomersPhone.getText().trim();
        String address = txtCustomersAddress.getText().trim();
        cd.editCustomer(id, name, email, phone, address);
        cd.showCustomers(tableCustomers);
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
        int id = Integer.parseInt(txtCustomersID.getText());
        cd.deleteCustomer(id);
        reset();
        cd.showCustomers(tableCustomers);
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        String name = txtCustomersName.getText().trim();
        String email = txtCustomersEmail.getText().trim();
        String phone = txtCustomersPhone.getText().trim();
        String address = txtCustomersAddress.getText().trim();
        cd.saveCustomer(name, email, phone, address);
        cd.showCustomers(tableCustomers);
        reset();
    }//GEN-LAST:event_jButton5MouseClicked

    private void txtCustomersPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomersPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomersPhoneActionPerformed

    private void txtCustomersIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomersIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomersIDActionPerformed

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
            java.util.logging.Logger.getLogger(POSView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(POSView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POSView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(POSView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new POSView().setVisible(true);
        });
    }

    public void reset() {
        txtCustomersID.setText("");
        txtCustomersName.setText("");
        txtCustomersEmail.setText("");
        txtCustomersPhone.setText("");
        txtCustomersAddress.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCategories;
    private javax.swing.JButton btnCategorySave;
    private javax.swing.JButton btnCategotyDelete;
    private javax.swing.JButton btnCategotyEdit;
    private javax.swing.JButton btnCategotyReset;
    private javax.swing.JButton btnCustomerRefresh;
    private javax.swing.JButton btnCustomerSearch;
    private javax.swing.JButton btnCustomers;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnProducts;
    private javax.swing.JButton btnPurchaseSave;
    private javax.swing.JButton btnPurchases;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnReportPurchaseShow;
    private javax.swing.JButton btnReportPurchaseShow1;
    private javax.swing.JButton btnSales;
    private javax.swing.JButton btnSalesDelete;
    private javax.swing.JButton btnSalesEdit;
    private javax.swing.JButton btnSalesReset;
    private javax.swing.JButton btnSalesSell;
    private javax.swing.JButton btnStock;
    private javax.swing.JButton btnSupplierDelete;
    private javax.swing.JButton btnSupplierEdit;
    private javax.swing.JButton btnSupplierReset;
    private javax.swing.JButton btnSupplierSave;
    private javax.swing.JButton btnSupplierSearch;
    private javax.swing.JButton btnSuppliers;
    private javax.swing.JComboBox<String> comboProductCategory;
    private javax.swing.JComboBox<String> comboPurchaseCategory;
    private javax.swing.JComboBox<String> comboPurchaseName;
    private javax.swing.JComboBox<String> comboPurchaseSupplier;
    private javax.swing.JComboBox<String> comboSalesCategories;
    private javax.swing.JComboBox<String> comboSalesCustomers;
    private javax.swing.JComboBox<String> comboSalesProducts;
    private com.toedter.calendar.JDateChooser dateReportFrom;
    private com.toedter.calendar.JDateChooser dateReportTo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JPanel tabCategories;
    private javax.swing.JPanel tabCustomers;
    private javax.swing.JPanel tabDashboard;
    private javax.swing.JTabbedPane tabPOS;
    private javax.swing.JPanel tabProducts;
    private javax.swing.JPanel tabPurchases;
    private javax.swing.JPanel tabReport;
    private javax.swing.JPanel tabSales;
    private javax.swing.JPanel tabStock;
    private javax.swing.JPanel tabSuppliers;
    private javax.swing.JTable tableCategories;
    private javax.swing.JTable tableCustomers;
    private javax.swing.JTable tableProducts;
    private javax.swing.JTable tablePurchase;
    private javax.swing.JTable tableReport;
    private javax.swing.JTable tableSales;
    private javax.swing.JTable tableStock;
    private javax.swing.JTable tableSuppliers;
    private javax.swing.JTextField txtCategoryID;
    private javax.swing.JTextField txtCategoryName;
    private javax.swing.JTextField txtCustomersAddress;
    private javax.swing.JTextField txtCustomersEmail;
    private javax.swing.JTextField txtCustomersID;
    private javax.swing.JTextField txtCustomersName;
    private javax.swing.JTextField txtCustomersPhone;
    private javax.swing.JTextField txtProductID;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtPurchaseID;
    private javax.swing.JTextField txtPurchaseQuantity;
    private javax.swing.JTextField txtPurchaseTotalPrice;
    private javax.swing.JTextField txtPurchaseUnitPrice;
    private javax.swing.JTextField txtSalesID;
    private javax.swing.JTextField txtSalesQuantity;
    private javax.swing.JTextField txtSalesStock;
    private javax.swing.JTextField txtSalesTotalPrice;
    private javax.swing.JTextField txtSalesUnitPrice;
    private javax.swing.JTextField txtSupplierCell;
    private javax.swing.JTextField txtSupplierContactPerson;
    private javax.swing.JTextField txtSupplierEmail;
    private javax.swing.JTextField txtSupplierID;
    private javax.swing.JTextField txtSupplierName;
    // End of variables declaration//GEN-END:variables
}
