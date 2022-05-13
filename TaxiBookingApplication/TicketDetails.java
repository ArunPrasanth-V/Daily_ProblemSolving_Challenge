package TaxiBookingApplication;

public class TicketDetails {
	static private int maxSize=2;
    static private int upper=1;
    static private int lower=1;
    static private int middle=1;
    static  int re=1;
    static  int wt=1;
    
    static String checkBerth(String level) {
    	if(level.equals("U")) {
    		if(upper!=0) {
    			upper--;
    			return "U";}
    		level ="M";
    	}
    	if(level.equals("M")) {
    		if(middle!=0) {
    			middle--;
    			return "M";}
    		level ="L";
    	}
    	if(level.equals("L")) {
    		if(lower!=0) {
    			lower--;
    			return "L";
    			}
    		level ="RE";
    	}
    	if(level.equals("RE")) {
    		if(re!=0) {
    			re--;
    			return "RE";
    			}
    		level ="WT";
    	}
    	if(level.equals("WT")) {
    		if(wt!=0) {
    			wt--;
    			return "WT";
    			}
    	}
    	
    	return "NO Ticket Currenly Available :(";
    	
    }
    
    static boolean increment(String level) {
    	if(level.equals("U")) {
    		if(upper!=0  && upper<maxSize) {
    			upper++;
    			return true;
    			}
    		level ="M";
    	}
    	if(level.equals("M") && middle<maxSize) {
    		if(middle!=0) {
    			middle++;
    			return true;
    			}
    		level ="L";
    	}
    	if(level.equals("L")&& lower<maxSize) {
    		if(lower!=0) {
    			lower++;
    			return true;
    			}
    		level ="RE";
    	}
    	if(level.equals("RE")&& re<maxSize) {
    		if(re!=0) {
    			re++;
    			return true;
    			}
    		level ="WT";
    	}
    	if(level.equals("WT")&& wt<maxSize) {
    		if(wt!=0) {
    			wt++;
    			return true;
    			}
    	}
    	return false;
    	// "NO Ticket Currenly Available :(";
    	
    }
}
