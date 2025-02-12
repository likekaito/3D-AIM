package AIM;

public class Parameter {
	
	/* smart phone imei (user) */
	public static String[] imei = {
		"353567051351832"
		//"353567051351956"
		//"353567051352475"
		//"353567051353648"
		//"353567051354810"
		//"353567051354901"
		//"353567051355254"
		//"355027051966921"
		//"355027054515550"
		//"355387051404228"
		//"355859056961972"
		//"356440047806292"
		//"863360029004219"
		//"864690022758703"
		
		//"352241062477314",
		//"354855061711965",
		//"356063057559765",
		//"865312025215222"

	};

	/* path of hardware training data*/
	public static String[] hardwareTraining = {
		
		/* random dataset */
		"D:\\STAIM\\input\\Hardware_Training\\"+imei[0]
		/* learning curve dataset */
		//"D:\\STAIM\\input\\learning_curve\\60\\Hardware_Training\\"+imei[0] 
		/* cross validation dataset */
		//"D:\\STAIM\\input\\cross_validation\\80_100\\Hardware_Training\\"+imei[0]
				
		// 4026 GPS
		//"D:\\STAIM\\input\\Hardware_Training\\353567051351832"
		// 891 GPS
		//"D:\\STAIM\\input\\Hardware_Training\\353567051351956"
		// 67661 gps
		//"D:\\STAIM\\input\\Hardware_Training\\353567051352475" 
		// 1330, 
		//"D:\\STAIM\\input\\Hardware_Training\\353567051353648"
		// 4101 gps
		//"D:\\STAIM\\input\\Hardware_Training\\353567051354810"
		// 0 gps
		//"D:\\STAIM\\input\\Hardware_Training\\353567051354901"
		// 0 gps
		//"D:\\STAIM\\input\\Hardware_Training\\353567051355254"
		// 2287 gps
		//"D:\\STAIM\\input\\Hardware_Training\\355027051966921"
		// 550 gps,
		//"D:\\STAIM\\input\\Hardware_Training\\355027054515550"
		// 39 gps,
		//"D:\\STAIM\\input\\Hardware_Training\\355387051404228"
		// 0 GPS
		//"D:\\STAIM\\input\\Hardware_Training\\355859056961972"
		// 974 gps, 
		//"D:\\STAIM\\input\\Hardware_Training\\356440047806292"
		// 0 GPS
		//"D:\\STAIM\\input\\Hardware_Training\\863360029004219"
		// 3656 GPS,
		//"D:\\STAIM\\input\\Hardware_Training\\864690022758703"	
		
		//For 100% training, 100% testing
		// 4026 GPS
		//"D:\\STAIM\\input\\Hardware_new\\353567051351832"
		// 891 GPS
		//"D:\\STAIM\\input\\Hardware_new\\353567051351956"
		// 67661 gps
		//"D:\\STAIM\\input\\Hardware_new\\353567051352475" 
		// 1330, 
		//"D:\\STAIM\\input\\Hardware_new\\353567051353648"
		// 4101 gps
		//"D:\\STAIM\\input\\Hardware_new\\353567051354810"
		// 0 gps
		//"D:\\STAIM\\input\\Hardware_new\\353567051354901"
		// 0 gps
		//"D:\\STAIM\\input\\Hardware_new\\353567051355254"
		// 2287 gps
		//"D:\\STAIM\\input\\Hardware_new\\355027051966921"
		// 550 gps,
		//"D:\\STAIM\\input\\Hardware_new\\355027054515550"
		// 39 gps,
		//"D:\\STAIM\\input\\Hardware_new\\355387051404228"
		// 0 GPS
		//"D:\\STAIM\\input\\Hardware_new\\355859056961972"
		// 974 gps, 
		//"D:\\STAIM\\input\\Hardware_new\\356440047806292"
		// 0 GPS
		//"D:\\STAIM\\input\\Hardware_new\\863360029004219"
		// 3656 GPS,
		//"D:\\STAIM\\input\\Hardware_new\\864690022758703"		
		

		//"D:\\STAIM\\input\\V1(from lalala)\\353567051351832",
		//"D:\\STAIM\\input\\V1(from lalala)\\353567051353556",
		//"D:\\STAIM\\input\\V1(from lalala)\\353567051353648",
		//"D:\\STAIM\\input\\V1(from lalala)\\353567051354810",
		//"D:\\STAIM\\input\\V1(from lalala)\\353567051354935",
		//"D:\\STAIM\\input\\V1(from lalala)\\353567051351840",
		//"D:\\STAIM\\input\\V1(from lalala)\\353567051351956",
		//"D:\\STAIM\\input\\V1(from lalala)\\353567051352285",
		//"D:\\STAIM\\input\\V1(from lalala)\\353567051352392",
		//"D:\\STAIM\\input\\V1(from lalala)\\353567051352475",
		//"D:\\STAIM\\input\\V1(from lalala)\\353567051352525",
		//"D:\\STAIM\\input\\V1(from lalala)\\353567051353440",
		//"D:\\STAIM\\input\\V1(from lalala)\\353567051354752",
		//"D:\\STAIM\\input\\V1(from lalala)\\353567051354828",
		//"D:\\STAIM\\input\\V1(from lalala)\\353567051354943",
		//"D:\\STAIM\\input\\V1(from lalala)\\353567051355270",
		//"D:\\STAIM\\input\\V1(from lalala)\\354435050036417",
		//"D:\\STAIM\\input\\V1(from lalala)\\354435050195460",
	};
	
	/* path of hardware testing data*/
	public static String[] hardwareTesting = {
		"D:\\STAIM\\input\\Hardware_Testing\\"+imei[0] 
		//"D:\\STAIM\\input\\cross_validation\\0_20\\Hardware_Testing\\"+imei[0]
		//"D:\\STAIM\\input\\learning_curve\\testing\\Hardware_Testing\\"	+imei[0]
	};
	
	
	public static String[] softwareTrainingFromRaw = {
		"D:\\STAIM\\input\\Software_Training\\"+imei[0]
		//"D:\\STAIM\\input\\learning_curve\\60\\Software_Training\\"+imei[0] 				
	};
	
	public static String[] softwareTesting = {
		"D:\\STAIM\\input\\Software_Testing\\" +imei[0]
	};
	
	public static String[] model_path = {
		"D:\\STAIM\\input\\libSVM\\AIM\\"+imei[0]+".txt"
	};
	
	
	public String loggerVersion = "V2";
	
	// parameter of stay point
	public long timeThreshold = 10;
	public double distanceThreshold = 0.1;
	
	// parameter of OPTICS
	public double radius = 0.1;
	public int mpt = 2;
	
	public double learningRatio = 0.2;
	public int[] learningCurveTraining = new int[700];
	public int learningNumber = 0;
}
