import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;

import java.awt.Label;
import java.awt.Button;

import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.ImageIcon;
import javax.swing.JToolBar;
import javax.swing.JButton;

import java.awt.TextField;

import javax.swing.JTextArea;
import javax.swing.JComboBox;

import metier.HibernateUtil;
import metier.Interpolation;
import metier.VerificationDonnees;

import com.toedter.calendar.JDateChooser;

import données.Indicateur;
import données.PerformanceGlobale;
import données.Project;
import données.Project;

import javax.swing.JTabbedPane;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.awt.Panel;

import javax.swing.JTable;


public class IntelligStock {

	private static JFrame framePricipale;
	private JTextField textField_nom_etude;
	private JTextField textField_objectif_globale;
	private JTextField textField_valeur;
	private JTextField textField_unite;
	private JTextField textField_nbr_indicateur;
	private JTextField textField_label_indica;
	private JTextField textField_abreviation_label_indica;
	private JTextField textField_description_text;
	private JTextField textField_mesure_actuelle;
	private JTextField textField_unite_mesure;
	private JTextField textField_abrevia_unite_mesure;
	private JTextField textField_performance_nulle;
	private JTextField textField_perf_totale;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_interp;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntelligStock window = new IntelligStock();
					window.framePricipale.setVisible(true);
					window.framePricipale.setSize(320, 320);
				
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IntelligStock() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		framePricipale = new JFrame();
		framePricipale.setTitle("IntelligStock");
		framePricipale.getContentPane().setBackground(Color.CYAN);
		framePricipale.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		final VerificationDonnees verifobj=new VerificationDonnees();
		framePricipale.getContentPane().setLayout(null);
		
		
		
		final List<JTextField> fieldsIndica = new ArrayList<JTextField>() ;
		//JToolBar toolBar = new JToolBar();
		//toolBar.setBounds(0, 0, 1061, 33);
		//framePricipale.getContentPane().add(toolBar);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("C:\\Users\\dadi\\Desktop\\imageProject\\tab_new_raised.png"));
		//toolBar.add(button);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\dadi\\Desktop\\imageProject\\disc_icon.jpg"));
		//toolBar.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\dadi\\Desktop\\imageProject\\help.png"));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 1400,665);
		framePricipale.getContentPane().add(tabbedPane);
		
		final JPanel panel = new JPanel();
		tabbedPane.addTab("Information globales du projet", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNomDeLtude = new JLabel("Nom de l'\u00E9tude");
		lblNomDeLtude.setBounds(21, 40, 85, 14);
		panel.add(lblNomDeLtude);
		
		textField_nom_etude = new JTextField();
		textField_nom_etude.setBounds(116, 37, 139, 20);
		panel.add(textField_nom_etude);
		textField_nom_etude.setColumns(10);
		
		final JDateChooser dateChooser_debut_projet = new JDateChooser();
		dateChooser_debut_projet.setBounds(116, 108, 87, 20);
		dateChooser_debut_projet.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(dateChooser_debut_projet);
		
		final JDateChooser dateChooser_fin_projet = new JDateChooser();
		dateChooser_fin_projet.setBounds(358, 108, 87, 20);
		panel.add(dateChooser_fin_projet);
		
		JLabel lblDbut = new JLabel("D\u00E9but Etude");
		lblDbut.setBounds(21, 108, 85, 14);
		panel.add(lblDbut);
		
		JLabel lblFinEtude = new JLabel("Fin Etude");
		lblFinEtude.setBounds(274, 108, 74, 14);
		panel.add(lblFinEtude);
		
		JLabel lblObjectifGloble = new JLabel("Objectif Global");
		lblObjectifGloble.setBounds(21, 168, 97, 14);
		panel.add(lblObjectifGloble);
		
		textField_objectif_globale = new JTextField();
		textField_objectif_globale.setBounds(116, 165, 247, 20);
		panel.add(textField_objectif_globale);
		textField_objectif_globale.setColumns(10);
		
		JLabel lblValeur = new JLabel("Valeur");
		lblValeur.setBounds(43, 225, 46, 14);
		panel.add(lblValeur);
		
		textField_valeur = new JTextField();
		textField_valeur.setBounds(117, 222, 86, 20);
		panel.add(textField_valeur);
		textField_valeur.setColumns(10);
		
		JLabel lblUnit = new JLabel("Unit\u00E9");
		lblUnit.setBounds(262, 228, 46, 14);
		panel.add(lblUnit);
		
		textField_unite = new JTextField();
		textField_unite.setBounds(307, 222, 86, 20);
		panel.add(textField_unite);
		textField_unite.setColumns(10);
		
		JLabel lblNombreDindicateurs = new JLabel("Nombre d'indicateurs");
		lblNombreDindicateurs.setBounds(21, 280, 114, 14);
		panel.add(lblNombreDindicateurs);
		
		textField_nbr_indicateur = new JTextField();
		textField_nbr_indicateur.setBounds(145, 277, 55, 20);
		panel.add(textField_nbr_indicateur);
		textField_nbr_indicateur.setColumns(10);
		
		final VerificationDonnees verif =new VerificationDonnees();
		
		//enregistrer le nouveau projet avec ses indicateurs
		
		JButton btnNewButton_2 = new JButton("Enregistrer");
		btnNewButton_2.addActionListener(new ActionListener() {
		
			@SuppressWarnings("null")
			public void actionPerformed(ActionEvent e) {	
				
				// save project object 
				
				Project p=new Project() ;
				p.setNom(textField_nom_etude.getText()) ;
		        p.setDateDebut(dateChooser_debut_projet.getDate());
		        p.setDateFin(dateChooser_fin_projet.getDate());
		        p.setObjectifGlobal(textField_objectif_globale.getText());
		        p.setValeure(Float.valueOf(textField_valeur.getText() ) );
		        p.setUnite(textField_unite.getText());
		        p.setNbrIndicateur(Integer.parseInt(textField_nbr_indicateur.getText() ) );
		       
		        
				SessionFactory sef =HibernateUtil.getSessionFactory() ;
				Session session=sef.openSession() ;
				session.beginTransaction() ;
				
		        
				Set<Indicateur>  indicateurs = new HashSet<Indicateur>();
		        for(int i=0 ;i<p.getNbrIndicateur();i++){
		        	
		        	Indicateur ind = new Indicateur() ;
		        	ind.setProjetDb(p);
		        	
		        	ind.setLabel(fieldsIndica.get(i).getText()) ;
		        	indicateurs.add(ind) ;
		        	session.save(ind) ; 	
		        		
		        }
		        p.setIndicateurs( indicateurs ) ;
	         
		        session.save(p) ;
		        
		        session.getTransaction().commit();
				session.close();
				
				textField_label_indica.setText(fieldsIndica.get(0).getText());
				
				
				
				
			}
		});
		
		btnNewButton_2.setBounds(248, 292, 89, 23);
		panel.add(btnNewButton_2);
		
		JButton btnE = new JButton("Annuler");
		btnE.setBounds(342, 292, 89, 23);
		panel.add(btnE);
		
		JLabel lblIndicateurs_3 = new JLabel("Indicateurs");
		lblIndicateurs_3.setBounds(564, 62, 74, 14);
		panel.add(lblIndicateurs_3);
		
		
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Définition des indicateurs", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblCaractristiqueDeLindicateur = new JLabel("Caract\u00E9ristique de l'indicateur");
		lblCaractristiqueDeLindicateur.setBounds(10, 30, 149, 14);
		panel_1.add(lblCaractristiqueDeLindicateur);
		
		JLabel lblLabel = new JLabel("Label");
		lblLabel.setBounds(10, 76, 46, 14);
		panel_1.add(lblLabel);
		
		textField_label_indica = new JTextField();
		textField_label_indica.setBounds(74, 73, 118, 20);
		panel_1.add(textField_label_indica);
		textField_label_indica.setColumns(10);
		
		JLabel lblAbrviation = new JLabel("Abr\u00E9viation");
		lblAbrviation.setBounds(245, 79, 79, 14);
		panel_1.add(lblAbrviation);
		
		textField_abreviation_label_indica = new JTextField();
		textField_abreviation_label_indica.setBounds(334, 73, 86, 20);
		panel_1.add(textField_abreviation_label_indica);
		textField_abreviation_label_indica.setColumns(10);
		
		JLabel lblDescriptionTextuelle = new JLabel("Description Textuelle");
		lblDescriptionTextuelle.setBounds(10, 136, 109, 14);
		panel_1.add(lblDescriptionTextuelle);
		
		textField_description_text = new JTextField();
		textField_description_text.setBounds(10, 161, 182, 33);
		panel_1.add(textField_description_text);
		textField_description_text.setColumns(10);
		
		JLabel lblMesurePhysiqueActuelle = new JLabel("Mesure_ actuelle");
		lblMesurePhysiqueActuelle.setBounds(334, 161, 141, 14);
		panel_1.add(lblMesurePhysiqueActuelle);
		
		textField_mesure_actuelle = new JTextField();
		textField_mesure_actuelle.setBounds(472, 158, 86, 20);
		panel_1.add(textField_mesure_actuelle);
		textField_mesure_actuelle.setColumns(10);
		
		JLabel lblUnitDeMesure = new JLabel("Unit\u00E9 de mesure");
		lblUnitDeMesure.setBounds(10, 273, 109, 14);
		panel_1.add(lblUnitDeMesure);
		
		textField_unite_mesure = new JTextField();
		textField_unite_mesure.setBounds(129, 270, 86, 20);
		panel_1.add(textField_unite_mesure);
		textField_unite_mesure.setColumns(10);
		
		JLabel lblAbrviation_ = new JLabel("Abr\u00E9viation");
		lblAbrviation_.setBounds(278, 273, 69, 14);
		panel_1.add(lblAbrviation_);
		
		textField_abrevia_unite_mesure = new JTextField();
		textField_abrevia_unite_mesure.setBounds(345, 270, 69, 20);
		panel_1.add(textField_abrevia_unite_mesure);
		textField_abrevia_unite_mesure.setColumns(10);
		
		JButton btnEnregistrer = new JButton("Interpolation");
		btnEnregistrer.setBounds(189, 301, 104, 23);
		btnEnregistrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double [] x={ Double.parseDouble( textField_performance_nulle.getText() ),Double.parseDouble(textField_perf_totale.getText()) };
				double [] y ={ 0 ,1 };
				
				Interpolation inter = new Interpolation() ;
			double res=	inter.linearInterpolation( x, y, Double.parseDouble(textField_mesure_actuelle.getText() ),true) ;
				
			textField_interp.setText( String.valueOf( res )) ;		
				
				
				
			}
		});
		panel_1.add(btnEnregistrer);
		
		JLabel lblPerformanceNulle = new JLabel("Performance nulle");
		lblPerformanceNulle.setBounds(334, 200, 97, 14);
		panel_1.add(lblPerformanceNulle);
		
		textField_performance_nulle = new JTextField();
		textField_performance_nulle.setBounds(472, 197, 86, 20);
		panel_1.add(textField_performance_nulle);
		textField_performance_nulle.setColumns(10);
		
		JLabel lblPerformanceTotale = new JLabel("Performance totale");
		lblPerformanceTotale.setBounds(334, 236, 97, 14);
		panel_1.add(lblPerformanceTotale);
		
		textField_perf_totale = new JTextField();
		textField_perf_totale.setBounds(472, 228, 86, 20);
		panel_1.add(textField_perf_totale);
		textField_perf_totale.setColumns(10);
		
		
	
		 
		JButton button_1 = new JButton(">");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
		
				SessionFactory sf = HibernateUtil.getSessionFactory();
		        Session session=sf.openSession();
		        session.beginTransaction();
		        
				Query cle=session.createQuery("select max(projetDb) as etranger from Indicateur" );
				List list1=cle.list();
			    
		        
		        Query qupdate=session.createQuery(" update Indicateur set abrevLabel= :abrv ,descTextuelle=:desc,mesureActuel=:ma,perfNulle=:perN,perfTotale=:perft,uniteMesure=:um , abrevUnite =:abre  where label= :name  and projetDb= :pro ");
		        
		        qupdate.setParameter("abrv",textField_abreviation_label_indica.getText());
		        qupdate.setParameter("desc", textField_description_text.getText());
		        qupdate.setParameter("ma", Float.valueOf(  textField_mesure_actuelle.getText() ));
		        qupdate.setParameter("perN",Float.valueOf(  textField_performance_nulle.getText() ));
		        qupdate.setParameter("perft",Float.valueOf( textField_perf_totale.getText() ));
		        
		        qupdate.setParameter("um",textField_unite_mesure.getText());  
		        qupdate.setParameter("abre",textField_abrevia_unite_mesure.getText() ); 
		        qupdate.setParameter("name",textField_label_indica.getText()) ;
		        qupdate.setParameter("pro",list1.get(0));
		        
		        
		        
		        int result = qupdate.executeUpdate();

		        session.beginTransaction().commit();       
		        session.close();
		              
				
				
			}
		});
		button_1.setBounds(662, 76, 46, 14);
		panel_1.add(button_1);
		
		JLabel lblSuivant = new JLabel("Suivant");
		lblSuivant.setBounds(616, 76, 46, 14);
		panel_1.add(lblSuivant);
		
		textField_interp = new JTextField();
		textField_interp.setBounds(303, 302, 86, 20);
		panel_1.add(textField_interp);
		textField_interp.setColumns(10);
		
		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//enregistrer la performance elementaire calculé 
				SessionFactory sf = HibernateUtil.getSessionFactory();
			    Session session=sf.openSession();			
			    session.beginTransaction();
			    
			    PerformanceGlobale  per =new PerformanceGlobale () ;
				per.setPerfElem(Float.valueOf( textField_interp.getText() )) ;
				session.save(per) ;
				
				// pour referencer les indicateuurs du dernier projet créé 
			    Query cle=session.createQuery("select max(projetDb) as etranger from Indicateur" );
				List list1=cle.list();
			    
		        
		        Query q=session.createQuery(" update Indicateur set performanceGlobale=:pe  where label= :name  and projetDb= :pro ");
		        q.setParameter("pe",per) ;
			    q.setParameter("name",textField_label_indica.getText()) ;
			    q.setParameter("pro", list1.get(0)) ;
		        q.executeUpdate() ;
			
				session.beginTransaction().commit();
				session.close();
				
						
			}
		});
		btnValider.setBounds(419, 301, 89, 23);
		panel_1.add(btnValider);
		
		final JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Paramètres d'agrégation", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblPoidsimportanceRlative = new JLabel("Poids ( importance r\u00E9lative ) des indicateurs");
		lblPoidsimportanceRlative.setBounds(23, 56, 237, 14);
		panel_2.add(lblPoidsimportanceRlative);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Poids");
		lblNewLabel_1.setBounds(383, 56, 46, 14);
		panel_2.add(lblNewLabel_1);
		
		
		JLabel lblSomme = new JLabel("Somme");
		lblSomme.setBounds(504, 56, 46, 14);
		panel_2.add(lblSomme);
		
		textField_6 = new JTextField();
		textField_6.setBounds(504, 96, 46, 20);
		panel_2.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnAg = new JButton("Agr\u00E9gation");
		btnAg.setBounds(504, 186, 89, 23);
		panel_2.add(btnAg);
		
		
		final JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Cout de l'amélioration", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblCoutUnitaireDe = new JLabel("Cout unitaire de l'am\u00E9lioration");
		lblCoutUnitaireDe.setBounds(10, 36, 166, 14);
		panel_3.add(lblCoutUnitaireDe);
		
		JLabel lblIndicateurs = new JLabel("Indicateurs");
		lblIndicateurs.setBounds(10, 73, 69, 14);
		panel_3.add(lblIndicateurs);
		

		
		JLabel lblCoutUnitaire = new JLabel("Cout unitaire");
		lblCoutUnitaire.setBounds(375, 73, 80, 14);
		panel_3.add(lblCoutUnitaire);
		
		
		
		JLabel lblUnitMontaire = new JLabel("Unit\u00E9 mon\u00E9taire");
		lblUnitMontaire.setBounds(527, 73, 88, 14);
		panel_3.add(lblUnitMontaire);
		
		textField_13 = new JTextField();
		textField_13.setBounds(527, 104, 86, 20);
		panel_3.add(textField_13);
		textField_13.setColumns(10);	
		
		final JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Optimisation", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Performance finale fix\u00E9");
		lblNewLabel.setBounds(10, 23, 170, 14);
		panel_4.add(lblNewLabel);
		
		JLabel lblPerformancelmentaire = new JLabel("Performance \u00E9l\u00E9mentaire initiales ");
		lblPerformancelmentaire.setBounds(10, 54, 170, 14);
		panel_4.add(lblPerformancelmentaire);
		
		JLabel lblIndicateurs_1 = new JLabel("Indicateurs");
		lblIndicateurs_1.setBounds(10, 90, 72, 14);
		panel_4.add(lblIndicateurs_1);
		
		
		
		JLabel lblPerformance = new JLabel("Performance");
		lblPerformance.setBounds(219, 90, 72, 14);
		panel_4.add(lblPerformance);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("MPhysique");
		lblNewLabel_2.setBounds(301, 90, 64, 14);
		panel_4.add(lblNewLabel_2);
		
		
		
		JLabel lblNewLabel_3 = new JLabel("Budjet fix\u00E9");
		lblNewLabel_3.setBounds(452, 23, 64, 14);
		panel_4.add(lblNewLabel_3);
		
		JLabel lblPerformancelmentaireFinale = new JLabel("Performance \u00E9l\u00E9mentaire finale ");
		lblPerformancelmentaireFinale.setBounds(452, 54, 170, 14);
		panel_4.add(lblPerformancelmentaireFinale);
		
		JLabel lblIndicateurs_2 = new JLabel("Indicateurs");
		lblIndicateurs_2.setBounds(452, 90, 64, 14);
		panel_4.add(lblIndicateurs_2);
		
		
		
		JLabel lblPerformance_1 = new JLabel("Performance");
		lblPerformance_1.setBounds(632, 90, 72, 14);
		panel_4.add(lblPerformance_1);
		
		
		
		JLabel lblMphysique = new JLabel("MPhysique");
		lblMphysique.setBounds(709, 90, 64, 14);
		panel_4.add(lblMphysique);
		
		JLabel lblUnit_1 = new JLabel("Unit\u00E9");
		lblUnit_1.setBounds(375, 90, 35, 14);
		panel_4.add(lblUnit_1);
		
		
		JLabel lblNewLabel_4 = new JLabel("Unit\u00E9");
		lblNewLabel_4.setBounds(772, 90, 46, 14);
		panel_4.add(lblNewLabel_4);
		
		
		final List<JTextField> fieldParam = new ArrayList<JTextField>() ;
		final List<JTextField> fieldPoid = new ArrayList<JTextField>() ;
		final List<JTextField> fieldind_cout = new ArrayList<JTextField>() ;
		final List<JTextField> field_cout = new ArrayList<JTextField>() ;
		final List<JTextField> field_ind_opt1 = new ArrayList<JTextField>() ;
		final List<JTextField> field_per_opt1 = new ArrayList<JTextField>() ;
		final List<JTextField> field_mp_opt1 = new ArrayList<JTextField>() ;
		final List<JTextField> field_unit_opt1 = new ArrayList<JTextField>() ;
		
		
		JButton btnAjouterIndicateur = new JButton("Ajouter Indicateur");
		btnAjouterIndicateur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int j=0 ;
				int k=0;
				for(int i=0 ; i< Integer.parseInt( textField_nbr_indicateur.getText() ) ;i++  ){
					
				 j+=30 ;
				 k+=40;
				 
				 JTextField textField_ajoutInd = new JTextField() ;
				 JTextField textFielt_parametre_agreg =new JTextField() ;
				 JTextField textField_poid =new JTextField();
				 JTextField textField_cout = new JTextField() ;
				 JTextField textField_ind_cout= new JTextField() ;
				 
				 JTextField textField_ind_opt1 = new JTextField() ;
				 JTextField textField_per_opt1 = new JTextField() ;
				 JTextField textField_mp_opt1 = new JTextField() ;
				 JTextField textField_unit_opt1 = new JTextField() ;
				 
				 JTextField textField_ind_opt2 = new JTextField() ;
				 JTextField textField_per_opt2 = new JTextField() ;
				 JTextField textField_mp_opt2 = new JTextField() ;
				 JTextField textField_unit_opt2 = new JTextField() ;
				 
				 textField_ajoutInd.setBounds(564, 90+i+j , 196, 20) ;
				 textFielt_parametre_agreg.setBounds(23, 45+i+k, 291, 20) ;
				 textField_poid.setBounds(372,45+i+k, 46, 20) ;
				 textField_cout.setBounds(375, 64+i+k, 58, 20) ;
				 textField_ind_cout.setBounds(10, 64+i+k, 296, 20) ;
				 
				 textField_ind_opt1.setBounds(10, 85+k, 188, 20) ;
				 textField_per_opt1.setBounds(219, 85+k, 64, 20) ;
				 textField_mp_opt1.setBounds(301, 85+k, 64, 20);
				 textField_unit_opt1.setBounds(375, 85+k, 35, 20);
				 
				 textField_ind_opt2.setBounds(452, 85+k, 170, 20) ;
				 textField_per_opt2.setBounds(632, 85+k, 64, 20) ;
				 textField_mp_opt2.setBounds(706, 85+k, 52, 20);
				 textField_unit_opt2.setBounds(771, 85+k, 35, 20);
				 
				 panel.add(textField_ajoutInd) ;
				 
				 panel_2.add(textFielt_parametre_agreg) ;
				 panel_2.add(textField_poid);
				 
				 panel_3.add(textField_ind_cout);
				 panel_3.add(textField_cout);
				 
				 panel_4.add(textField_ind_opt1);
				 panel_4.add(textField_per_opt1);
				 panel_4.add( textField_mp_opt1);
				 panel_4.add( textField_unit_opt1);
				 
				 panel_4.add(textField_ind_opt2);
				 panel_4.add(textField_per_opt2);
				 panel_4.add( textField_mp_opt2);
				 panel_4.add( textField_unit_opt2);
				 
				 
				 
				 panel.validate();
				 panel.repaint();
				 
				 fieldsIndica.add(textField_ajoutInd) ;
				 fieldParam.add(textFielt_parametre_agreg) ;
				 fieldPoid.add(textField_poid) ;
				 fieldind_cout.add(textField_ind_cout) ;
				 field_cout.add(textField_cout);
				 field_ind_opt1.add(textField_ind_opt1);
				 field_per_opt1.add(textField_per_opt1);
				 field_mp_opt1.add(textField_mp_opt1);
				 field_unit_opt1.add(textField_unit_opt1);
				 
				}
				
			}
		});
		
		btnAjouterIndicateur.setBounds(452, 292, 149, 23);
		panel.add(btnAjouterIndicateur);
		
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(240, 240, 240));
		framePricipale.setJMenuBar(menuBar);
		
		JMenu fileVar = new JMenu("file");
		menuBar.add(fileVar);
		
		 JMenuItem newProjectVar = new JMenuItem("new project");
		 newProjectVar.setIcon(new ImageIcon("C:\\Users\\dadi\\Desktop\\imageProject\\tab_new_raised.png"));
		fileVar.add(newProjectVar);
		
		JMenuItem openProjectVar = new JMenuItem("open project");
		fileVar.add(openProjectVar);
		
		JSeparator separator = new JSeparator();
		fileVar.add(separator);
		
		JMenuItem saveVar = new JMenuItem("save");
		saveVar.setIcon(new ImageIcon("C:\\Users\\dadi\\Desktop\\imageProject\\disc_icon.jpg"));
		fileVar.add(saveVar);
		
		JMenuItem saveAsVar = new JMenuItem("save as");
		saveAsVar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				 
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setDialogTitle("Specify a file to save");   
				 
				int userSelection = fileChooser.showSaveDialog(null);
				 
				if (userSelection == JFileChooser.APPROVE_OPTION) {
				    File fileToSave = fileChooser.getSelectedFile();
				    /*à implémenter pour enregistrer les fichiers     */
				    System.out.println("Save as file: " + fileToSave.getAbsolutePath());
				}
				
				
			}
		});
		fileVar.add(saveAsVar);
		
		JSeparator separator_1 = new JSeparator();
		fileVar.add(separator_1);
		
		JMenuItem importProjectVar = new JMenuItem("import project");
		fileVar.add(importProjectVar);
		
		JMenuItem deleteProjectVar = new JMenuItem("delete ");
		deleteProjectVar.setIcon(new ImageIcon("C:\\Users\\dadi\\Desktop\\imageProject\\delete_practice_icon.gif"));
		fileVar.add(deleteProjectVar);
		
		JSeparator separator_2 = new JSeparator();
		fileVar.add(separator_2);
		
		JMenuItem exitVar = new JMenuItem("exit");
		exitVar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(JFrame.EXIT_ON_CLOSE);
			}
		});
		fileVar.add(exitVar);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar.add(menuBar_1);
	}
}
