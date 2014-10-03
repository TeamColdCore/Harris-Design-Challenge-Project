import java.util.Scanner;

public class Decoder {
	
	//declare variables
	public static int smallestFactor = 0;
	public static int factorInput = 169;

	public static void main(String[] args) {
		System.out.println("Input string");
		Scanner input = new Scanner(System.in);//accept string input
		String inputStr = input.nextLine();
		char[] charArray = inputStr.toCharArray(); //define array
		factorInput = charArray.length; //set the factor input to the lenght of the array
		factor(); //find the lowest factor
		for(int place = 0 ; place <= charArray.length + smallestFactor - 2; place += smallestFactor){//repeat until the statement is printed
			if(place >= charArray.length) place -= charArray.length - 1; //if the place is past the length of the array and the statment has not been fully printed, go back to the beginning + 1 forward
			System.out.print(charArray[place]); //print the character in theslot of the array
		}
	}
	public static void factor(){
		//declares x the array's lowest factor if it is divisable x, where x is the number it is checking
		//goes from highest to lowest to prevent a higher number from being declared the smallest factor
		if((factorInput%13)==0){
			factorInput = factorInput / 13;
			smallestFactor = 13;
		}
		if((factorInput%11)==0){
			factorInput = factorInput / 11;
			smallestFactor = 11;
		}
		if((factorInput%7)==0){
			factorInput = factorInput / 7;
			smallestFactor = 7;
		}
		if((factorInput%5)==0){
			factorInput = factorInput / 5;
			smallestFactor = 5;
		}
		if((factorInput%3)==0){
			factorInput = factorInput / 3;
			smallestFactor = 3;
		}
		if((factorInput%2)==0){
			factorInput = factorInput / 2;
			smallestFactor = 2;
		}
	}

}

//Luurk_ef,a_tIh_earm!_~y~o~
//Wlh,o_’osr__tthhee__mfooroel__fwohool_ifsohl;l_otwhse__hfiomo?
//W_hsyc,r_uyfofuy_-sltouockki_nugp_,N_ehrafl_fh-ewridtetre.d~,~
//Kleeodeo_pkq__uyleoisuktrei__odynioisunt’gar_nebc_aekr,ek_e.Cp)hi_enIwg_i_deyo,on_u’brtu__tdk_indsootwna.’n_tcF,el_.yy__’(ckGanrsouuwma,bl_l.
//Rt_2es-rtD_r2ta,hn_agyneo__utc_ook_mntporuwut_sebtre_!ta~
