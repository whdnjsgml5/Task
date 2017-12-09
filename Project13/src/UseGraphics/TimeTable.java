package UseGraphics;

public class TimeTable {
	
	//3 dimension array 
	//[grade][dateOfWeek][contents]
	
	public static final String[][][] sb = {
		// 1학년
		{
			// 1학년 월요일
			{ "수업시작 전", "", "", "1", "MONDAY", "0" },
			{ "디지털시스템", "8623", "최영호", "1", "MONDAY", "1" },
			{ "디지털시스템", "8623", "최영호", "1", "MONDAY", "2" },
			{ "디지털시스템", "8623", "최영호", "1", "MONDAY", "3" }, 
			{ "영어회화", "1521", "Arturo", "1", "MONDAY", "4" },
			{ "영어회화", "1521", "Arturo", "1", "MONDAY", "5" },
			{ "Lunch Break", "", "", "1", "MONDAY", "6" },
			{ "Lunch Break", "", "", "1", "MONDAY", "7" },
			{ "Lunch Break", "", "", "1", "MONDAY", "8" },		
			{ "기초프로그래밍II", "8613", "최영호", "1", "MONDAY", "9" },
			{ "기초프로그래밍II", "8613", "최영호", "1", "MONDAY", "10" }, 
			{ "기초프로그래밍II", "8613", "최영호", "1", "MONDAY", "11" },
			{ "기초프로그래밍II", "8613", "최영호", "1", "MONDAY", "12" }, 
			{ "인성함양세미나", "5분반", "평생지도교수", "1", "MONDAY", "13" },
			{ "인성함양세미나", "5분반", "평생지도교수", "1", "MONDAY", "14" }, 
			{ "금일 수업 종료", "", "", "1", "MONDAY", "15" },
			{ "금일 수업 종료", "", "", "1", "MONDAY", "16" },
			{ "금일 수업 종료", "", "", "1", "MONDAY", "17" },
			{ "금일 수업 종료", "", "", "1", "MONDAY", "18" },
			{ "금일 수업 종료", "", "", "1", "MONDAY", "19" },
			{ "금일 수업 종료", "", "", "1", "MONDAY", "20" },
			// 1학년 화요일
			{ "물리학및실험", "8613", "성진택", "1", "TUESDAY", "0" },
			{ "물리학및실험", "8613", "성진택", "1", "TUESDAY", "1" }, 
			{ "물리학및실험", "8613", "성진택", "1", "TUESDAY", "2" },
			{ "인성함양세미나", "8602", "강은주", "1", "TUESDAY", "3" },
			{ "인성함양세미나", "8602", "강은주", "1", "TUESDAY", "4" },
			{ "휴식시간", "", "", "1", "TUESDAY", "5" },
			{ "Lunch Break", "", "", "1", "TUESDAY", "6" },
			{ "Lunch Break", "", "", "1", "TUESDAY", "7" },
			{ "Lunch Break", "", "", "1", "TUESDAY", "8" },
			{ "미적분학", "8623", "강은주", "1", "TUESDAY", "9" }, 
			{ "미적분학", "8623", "강은주", "1", "TUESDAY", "10" },
			{ "미적분학", "8623", "강은주", "1", "TUESDAY", "11" }, 
			{ "창의공학설계", "8622", "성진택", "1", "TUESDAY", "12" },
			{ "창의공학설계", "8622", "성진택", "1", "TUESDAY", "13" }, 
			{ "창의공학설계", "8622", "성진택", "1", "TUESDAY", "14" },
			{ "금일 수업 종료", "", "", "1", "TUESDAY", "15" },
			{ "금일 수업 종료", "", "", "1", "TUESDAY", "16" },
			{ "금일 수업 종료", "", "", "1", "TUESDAY", "17" },
			{ "금일 수업 종료", "", "", "1", "TUESDAY", "18" },
			{ "금일 수업 종료", "", "", "1", "TUESDAY", "19" },
			{ "금일 수업 종료", "", "", "1", "TUESDAY", "20" },
			// 1학년 수요일
			{ "교양강좌 수업일", "", "", "1", "WEDNESDAY", "0" },
			{ "교양강좌 수업일", "", "", "1", "WEDNESDAY", "1" },
			{ "교양강좌 수업일", "", "", "1", "WEDNESDAY", "2" },
			{ "교양강좌 수업일", "", "", "1", "WEDNESDAY", "3" },
			{ "교양강좌 수업일", "", "", "1", "WEDNESDAY", "4" },
			{ "교양강좌 수업일", "", "", "1", "WEDNESDAY", "5" },
			{ "Lunch Break", "", "", "1", "WEDNESDAY", "6" },
			{ "Lunch Break", "", "", "1", "WEDNESDAY", "7" },
			{ "Lunch Break", "", "", "1", "WEDNESDAY", "8" },
			{ "교양강좌 수업일", "", "", "1", "WEDNESDAY", "9" },
			{ "교양강좌 수업일", "", "", "1", "WEDNESDAY", "10" },
			{ "교양강좌 수업일", "", "", "1", "WEDNESDAY", "11" },
			{ "교양강좌 수업일", "", "", "1", "WEDNESDAY", "12" },
			{ "교양강좌 수업일", "", "", "1", "WEDNESDAY", "13" },
			{ "금일 수업 종료", "", "", "1", "WEDNESDAY", "14" },
			{ "금일 수업 종료", "", "", "1", "WEDNESDAY", "15" },
			{ "금일 수업 종료", "", "", "1", "WEDNESDAY", "16" },
			{ "금일 수업 종료", "", "", "1", "WEDNESDAY", "17" },
			{ "금일 수업 종료", "", "", "1", "WEDNESDAY", "18" },
			{ "금일 수업 종료", "", "", "1", "WEDNESDAY", "19" },
			{ "금일 수업 종료", "", "", "1", "WEDNESDAY", "20" }, 
			// 1학년 목요일
			{ "수업 시작 전", "", "", "1", "THURSDAY", "0" },
			{ "디지털시스템", "8623", "최영호", "1", "THURSDAY", "1" },
			{ "디지털시스템", "8623", "최영호", "1", "THURSDAY", "2" },
			{ "디지털시스템", "8623", "최영호", "1", "THURSDAY", "3" },
			{ "영어회화", "1521", "Arturo", "1", "THURSDAY", "4" },
			{ "영어회화", "1521", "Arturo", "1", "THURSDAY", "5" },
			{ "Lunch Break", "", "", "1", "THURSDAY", "6" },
			{ "Lunch Break", "", "", "1", "THURSDAY", "7" },
			{ "Lunch Break", "", "", "1", "THURSDAY", "8" },
			{ "기초프로그래밍II", "8613", "최영호", "1", "THURSDAY", "9" },
			{ "기초프로그래밍II", "8613", "최영호", "1", "THURSDAY", "10" },
			{ "기초프로그래밍II", "8613", "최영호", "1", "THURSDAY", "11" },
			{ "기초프로그래밍II", "8613", "최영호", "1", "THURSDAY", "12" }, 
			{ "금일 수업 종료", "", "", "1", "THURSDAY", "13" },
			{ "금일 수업 종료", "", "", "1", "THURSDAY", "14" },
			{ "금일 수업 종료", "", "", "1", "THURSDAY", "15" },
			{ "금일 수업 종료", "", "", "1", "THURSDAY", "16" },
			{ "금일 수업 종료", "", "", "1", "THURSDAY", "17" },
			{ "금일 수업 종료", "", "", "1", "THURSDAY", "18" },
			{ "금일 수업 종료", "", "", "1", "THURSDAY", "19" },
			{ "금일 수업 종료", "", "", "1", "THURSDAY", "20" },
			// 1학년 금요일
			{ "수업 시작 전", "", "", "1", "FRIDAY", "0" },
			{ "수업 시작 전", "", "", "1", "FRIDAY", "1" },
			{ "수업 시작 전", "", "", "1", "FRIDAY", "2" },
			{ "창의공학설계", "8622", "성진택", "1", "FRIDAY", "3" },
			{ "창의공학설계", "8622", "성진택", "1", "FRIDAY", "4" }, 
			{ "창의공학설계", "8622", "성진택", "1", "FRIDAY", "5" },
			{ "Lunch Break", "", "", "1", "FRIDAY", "6" },
			{ "Lunch Break", "", "", "1", "FRIDAY", "7" },
			{ "Lunch Break", "", "", "1", "FRIDAY", "8" },
			{ "미적분학", "8623", "강은주", "1", "FRIDAY", "9" },
			{ "미적분학", "8623", "강은주", "1", "FRIDAY", "10" },		
			{ "미적분학", "8623", "강은주", "1", "FRIDAY", "11" },
			{ "물리학및실험", "8613", "성진택", "1", "FRIDAY", "12" },
			{ "물리학및실험", "8613", "성진택", "1", "FRIDAY", "13" },
			{ "물리학및실험", "8613", "성진택", "1", "FRIDAY", "14" },
			{ "금일 수업 종료", "", "", "1", "FRIDAY", "15" },
			{ "금일 수업 종료", "", "", "1", "FRIDAY", "16" },
			{ "금일 수업 종료", "", "", "1", "FRIDAY", "17" },
			{ "금일 수업 종료", "", "", "1", "FRIDAY", "18" },
			{ "금일 수업 종료", "", "", "1", "FRIDAY", "19" },
			{ "금일 수업 종료", "", "", "1", "FRIDAY", "20" }},
		// 2학년 
		{ 
			// 2학년 월요일
			{ "멀티미디어통신", "8613", "손남례", "2", "MONDAY", "0" }, 
			{ "멀티미디어통신", "8613", "손남례", "2", "MONDAY", "1" },
			{ "멀티미디어통신", "8613", "손남례", "2", "MONDAY", "2" },
			{ "고급프로그래밍", "8619", "이양원", "2", "MONDAY", "3" },
			{ "고급프로그래밍", "8619", "이양원", "2", "MONDAY", "4" }, 
			{ "고급프로그래밍", "8619", "이양원", "2", "MONDAY", "5" },
			{ "고급프로그래밍", "8619", "이양원", "2", "MONDAY", "6" },
			{ "Lunch Break", "", "", "1", "MONDAY", "7" },
			{ "Lunch Break", "", "", "1", "MONDAY", "8" },			
			{ "신호해석", "8619", "이양원", "2", "MONDAY", "9" },
			{ "신호해석", "8619", "이양원", "2", "MONDAY", "10" }, 
			{ "신호해석", "8619", "이양원", "2", "MONDAY", "11" },
			{ "금일 수업 종료", "", "", "2", "MONDAY", "12" },
			{ "금일 수업 종료", "", "", "2", "MONDAY", "13" },
			{ "금일 수업 종료", "", "", "2", "MONDAY", "14" },
			{ "금일 수업 종료", "", "", "2", "MONDAY", "15" },
			{ "금일 수업 종료", "", "", "2", "MONDAY", "16" },
			{ "금일 수업 종료", "", "", "2", "MONDAY", "17" },
			{ "금일 수업 종료", "", "", "2", "MONDAY", "18" },
			{ "금일 수업 종료", "", "", "2", "MONDAY", "19" },
			{ "금일 수업 종료", "", "", "2", "MONDAY", "20" },
			// 2학년 화요일
			{ "수업 시작 전", "", "", "2", "TUESDAY", "0" },
			{ "영어회화", "8612", "Arturo", "2", "TUESDAY", "1" },
			{ "영어회화", "8612", "Arturo", "2", "TUESDAY", "2" }, 
			{ "선형대수", "8622", "성진택", "2", "TUESDAY", "3" },
			{ "선형대수", "8622", "성진택", "2", "TUESDAY", "4" },
			{ "선형대수", "8622", "성진택", "2", "TUESDAY", "5" },
			{ "Lunch Break", "", "", "2", "TUESDAY", "6" },
			{ "Lunch Break", "", "", "2", "TUESDAY", "7" },
			{ "Lunch Break", "", "", "2", "TUESDAY", "8" },
			{ "디지털회로실험", "8613", "최영호", "2", "TUESDAY", "9" },
			{ "디지털회로실험", "8613", "최영호", "2", "TUESDAY", "10" },
			{ "디지털회로실험", "8613", "최영호", "2", "TUESDAY", "11" },
			{ "디지털회로실험", "8613", "최영호", "2", "TUESDAY", "12" },
			{ "디지털회로실험", "8613", "최영호", "2", "TUESDAY", "13" },
			{ "디지털회로실험", "8613", "최영호", "2", "TUESDAY", "14" },
			{ "디지털회로실험", "8613", "최영호", "2", "TUESDAY", "15" },
			{ "디지털회로실험", "8613", "최영호", "2", "TUESDAY", "16" },
			{ "금일 수업 종료", "", "", "2", "TUESDAY", "17" },
			{ "금일 수업 종료", "", "", "2", "TUESDAY", "18" },
			{ "금일 수업 종료", "", "", "2", "TUESDAY", "19" },
			{ "금일 수업 종료", "", "", "2", "TUESDAY", "20" },
			// 2학년 수요일	 
			{ "교양강좌 수업일", "", "", "2", "WEDNESDAY", "0" },
			{ "교양강좌 수업일", "", "", "2", "WEDNESDAY", "1" },
			{ "교양강좌 수업일", "", "", "2", "WEDNESDAY", "2" },
			{ "교양강좌 수업일", "", "", "2", "WEDNESDAY", "3" },
			{ "교양강좌 수업일", "", "", "2", "WEDNESDAY", "4" },
			{ "교양강좌 수업일", "", "", "2", "WEDNESDAY", "5" },
			{ "Lunch Break", "", "", "2", "WEDNESDAY", "6" },
			{ "Lunch Break", "", "", "2", "WEDNESDAY", "7" },
			{ "Lunch Break", "", "", "2", "WEDNESDAY", "8" },
			{ "교양강좌 수업일", "", "", "2", "WEDNESDAY", "9" },
			{ "교양강좌 수업일", "", "", "2", "WEDNESDAY", "10" },
			{ "교양강좌 수업일", "", "", "2", "WEDNESDAY", "11" },
			{ "교양강좌 수업일", "", "", "2", "WEDNESDAY", "12" },
			{ "교양강좌 수업일", "", "", "2", "WEDNESDAY", "13" },
			{ "금일 수업 종료", "", "", "2", "WEDNESDAY", "14" },
			{ "금일 수업 종료", "", "", "2", "WEDNESDAY", "15" },
			{ "금일 수업 종료", "", "", "2", "WEDNESDAY", "16" },
			{ "금일 수업 종료", "", "", "2", "WEDNESDAY", "17" },
			{ "금일 수업 종료", "", "", "2", "WEDNESDAY", "18" },
			{ "금일 수업 종료", "", "", "2", "WEDNESDAY", "19" },
			{ "금일 수업 종료", "", "", "2", "WEDNESDAY", "20" }, 
			// 2학년 목요일						
			{ "멀티미디어통신", "8613", "손남례", "2", "THURSDAY", "0" },
			{ "멀티미디어통신", "8613", "손남례", "2", "THURSDAY", "1" },
			{ "멀티미디어통신", "8613", "손남례", "2", "THURSDAY", "2" },
			{ "고급프로그래밍", "8619", "이양원", "2", "THURSDAY", "3" },
			{ "고급프로그래밍", "8619", "이양원", "2", "THURSDAY", "4" },
			{ "고급프로그래밍", "8619", "이양원", "2", "THURSDAY", "5" },
			{ "고급프로그래밍", "8619", "이양원", "2", "THURSDAY", "6" },
			{ "Lunch Break", "", "", "2", "THURSDAY", "7" },
			{ "Lunch Break", "", "", "2", "THURSDAY", "8" },
			{ "신호해석", "8619", "이양원", "2", "THURSDAY", "9" },
			{ "신호해석", "8619", "이양원", "2", "THURSDAY", "10" },
			{ "신호해석", "8619", "이양원", "2", "THURSDAY", "11" } ,
			{ "금일 수업 종료", "", "", "2", "THURSDAY", "12" },
			{ "금일 수업 종료", "", "", "2", "THURSDAY", "13" },
			{ "금일 수업 종료", "", "", "2", "THURSDAY", "14" },
			{ "금일 수업 종료", "", "", "2", "THURSDAY", "15" },
			{ "금일 수업 종료", "", "", "2", "THURSDAY", "16" },
			{ "금일 수업 종료", "", "", "2", "THURSDAY", "17" },
			{ "금일 수업 종료", "", "", "2", "THURSDAY", "18" },
			{ "금일 수업 종료", "", "", "2", "THURSDAY", "19" },
			{ "금일 수업 종료", "", "", "2", "THURSDAY", "20" },
			//2학년 금요일
			{ "수업 시작 전", "", "", "2", "FRIDAY", "0" },
			{ "영어회화", "8612", "Arturo", "2", "FRIDAY", "1" },
			{ "영어회화", "8612", "Arturo", "2", "FRIDAY", "2" }, 
			{ "수업없음", "", "", "2", "FRIDAY", "3" },
			{ "수업없음", "", "", "2", "FRIDAY", "4" },
			{ "수업없음", "", "", "2", "FRIDAY", "5" },
			{ "Lunch Break", "", "", "2", "FRIDAY", "6" },
			{ "Lunch Break", "", "", "2", "FRIDAY", "7" },
			{ "Lunch Break", "", "", "2", "FRIDAY", "8" },
			{ "선형대수", "8622", "성진택", "2", "FRIDAY", "9" },
			{ "선형대수", "8622", "성진택", "2", "FRIDAY", "10" },
			{ "선형대수", "8622", "성진택", "2", "FRIDAY", "11" },
			{ "금일 수업 종료", "", "", "2", "FRIDAY", "12" },
			{ "금일 수업 종료", "", "", "2", "FRIDAY", "13" },
			{ "금일 수업 종료", "", "", "2", "FRIDAY", "14" },
			{ "금일 수업 종료", "", "", "2", "FRIDAY", "15" },
			{ "금일 수업 종료", "", "", "2", "FRIDAY", "16" },
			{ "금일 수업 종료", "", "", "2", "FRIDAY", "17" },
			{ "금일 수업 종료", "", "", "2", "FRIDAY", "18" },
			{ "금일 수업 종료", "", "", "2", "FRIDAY", "19" },
			{ "금일 수업 종료", "", "", "2", "FRIDAY", "20" }},
		// 3학년
		{
			//3학년 월요일
			{ "수업 시작 전", "", "", "3", "MONDAY", "0" },	
			{ "수업 시작 전", "", "", "3", "MONDAY", "1" },	
			{ "수업 시작 전", "", "", "3", "MONDAY", "2" },	
			{ "마이크로프로세서", "8622", "성진택", "3", "MONDAY", "3" }, 
			{ "마이크로프로세서", "8622", "성진택", "3", "MONDAY", "4" },
			{ "마이크로프로세서", "8622", "성진택", "3", "MONDAY", "5" },
			{ "마이크로프로세서", "8622", "성진택", "3", "MONDAY", "6" }, 
			{ "Lunch Break", "", "", "3", "MONDAY", "7" },
			{ "Lunch Break", "", "", "3", "MONDAY", "8" },				
			{ "디지털통신", "8618", "나현식", "3", "MONDAY", "9" },
			{ "디지털통신", "8618", "나현식", "3", "MONDAY", "10" }, 
			{ "디지털통신", "8618", "나현식", "3", "MONDAY", "11" },
			{ "쉬는시간", "", "", "3", "MONDAY", "12" },			
			{ "확률및통계", "8618", "강은주", "3", "MONDAY", "13" }, 
			{ "확률및통계", "8618", "강은주", "3", "MONDAY", "14" },
			{ "확률및통계", "8618", "강은주", "3", "MONDAY", "15" },
			{ "금일 수업 종료", "", "", "3", "MONDAY", "16" },
			{ "금일 수업 종료", "", "", "3", "MONDAY", "17" },
			{ "금일 수업 종료", "", "", "3", "MONDAY", "18" },
			{ "금일 수업 종료", "", "", "3", "MONDAY", "19" },
			{ "금일 수업 종료", "", "", "3", "MONDAY", "20" },
			//3학년 화요일
			{ "수업 시작 전", "", "", "3", "TUESDAY", "0" },	
			{ "수업 시작 전", "", "", "3", "TUESDAY", "1" },	
			{ "수업 시작 전", "", "", "3", "TUESDAY", "2" },	
			{ "수업 시작 전", "", "", "3", "TUESDAY", "3" },	
			{ "수업 시작 전", "", "", "3", "TUESDAY", "4" },	
			{ "수업 시작 전", "", "", "3", "TUESDAY", "5" },	
			{ "Lunch Break", "", "", "3", "TUESDAY", "6" },
			{ "Lunch Break", "", "", "3", "TUESDAY", "7" },
			{ "Lunch Break", "", "", "3", "TUESDAY", "8" },			
			{ "웹프로그래밍", "8619", "이양원", "3", "TUESDAY", "9" },
			{ "웹프로그래밍", "8619", "이양원", "3", "TUESDAY", "10" },
			{ "웹프로그래밍", "8619", "이양원", "3", "TUESDAY", "11" },
			{ "웹프로그래밍", "8619", "이양원", "3", "TUESDAY", "12" },
			{ "웹프로그래밍", "8619", "이양원", "3", "TUESDAY", "13" },
			{ "웹프로그래밍", "8619", "이양원", "3", "TUESDAY", "14" },
			{ "웹프로그래밍", "8619", "이양원", "3", "TUESDAY", "15" },
			{ "웹프로그래밍", "8619", "이양원", "3", "TUESDAY", "16" },
			{ "금일 수업 종료", "", "", "3", "TUESDAY", "17" },
			{ "금일 수업 종료", "", "", "3", "TUESDAY", "18" },
			{ "금일 수업 종료", "", "", "3", "TUESDAY", "19" },
			{ "금일 수업 종료", "", "", "3", "TUESDAY", "20" }, 
			//3학년 수요일
			{ "교양강좌 수업일", "", "", "3", "WEDNESDAY", "0" },
			{ "교양강좌 수업일", "", "", "3", "WEDNESDAY", "1" },
			{ "교양강좌 수업일", "", "", "3", "WEDNESDAY", "2" },
			{ "교양강좌 수업일", "", "", "3", "WEDNESDAY", "3" },
			{ "교양강좌 수업일", "", "", "3", "WEDNESDAY", "4" },
			{ "교양강좌 수업일", "", "", "3", "WEDNESDAY", "5" },
			{ "Lunch Break", "", "", "3", "WEDNESDAY", "6" },
			{ "Lunch Break", "", "", "3", "WEDNESDAY", "7" },
			{ "Lunch Break", "", "", "3", "WEDNESDAY", "8" },
			{ "교양강좌 수업일", "", "", "3", "WEDNESDAY", "9" },
			{ "교양강좌 수업일", "", "", "3", "WEDNESDAY", "10" },
			{ "교양강좌 수업일", "", "", "3", "WEDNESDAY", "11" },
			{ "교양강좌 수업일", "", "", "3", "WEDNESDAY", "12" },
			{ "교양강좌 수업일", "", "", "3", "WEDNESDAY", "13" },
			{ "금일 수업 종료", "", "", "3", "WEDNESDAY", "14" },
			{ "금일 수업 종료", "", "", "3", "WEDNESDAY", "15" },
			{ "금일 수업 종료", "", "", "3", "WEDNESDAY", "16" },
			{ "금일 수업 종료", "", "", "3", "WEDNESDAY", "17" },
			{ "금일 수업 종료", "", "", "3", "WEDNESDAY", "18" },
			{ "금일 수업 종료", "", "", "3", "WEDNESDAY", "19" },
			{ "금일 수업 종료", "", "", "3", "WEDNESDAY", "20" }, 
			//3학년 목요일
			{ "수업 시작 전", "", "", "3", "THURSDAY", "0" },	
			{ "수업 시작 전", "", "", "3", "THURSDAY", "1" },	
			{ "수업 시작 전", "", "", "3", "THURSDAY", "2" },	
			{ "마이크로프로세서", "8622", "성진택", "3", "THURSDAY", "3" },
			{ "마이크로프로세서", "8622", "성진택", "3", "THURSDAY", "4" },
			{ "마이크로프로세서", "8622", "성진택", "3", "THURSDAY", "5" },
			{ "마이크로프로세서", "8622", "성진택", "3", "THURSDAY", "6" },
			{ "Lunch Break", "", "", "3", "THURSDAY", "7" },
			{ "Lunch Break", "", "", "3", "THURSDAY", "8" },
			{ "디지털통신", "8618", "나현식", "3", "THURSDAY", "9" }, 
			{ "디지털통신", "8618", "나현식", "3", "THURSDAY", "10" },
			{ "디지털통신", "8618", "나현식", "3", "THURSDAY", "11" },
			{ "쉬는시간", "", "", "3", "THURSDAY", "12" },
			{ "확률및통계", "8618", "강은주", "3", "THURSDAY", "13" },
			{ "확률및통계", "8618", "강은주", "3", "THURSDAY", "14" },
			{ "확률및통계", "8618", "강은주", "3", "THURSDAY", "15" },
			{ "금일 수업 종료", "", "", "3", "THURSDAY", "16" },
			{ "금일 수업 종료", "", "", "3", "THURSDAY", "17" },
			{ "금일 수업 종료", "", "", "3", "THURSDAY", "18" },
			{ "금일 수업 종료", "", "", "3", "THURSDAY", "19" },
			{ "금일 수업 종료", "", "", "3", "THURSDAY", "20" },
			//3학년 금요일
			{ "수업 없음", "", "", "3", "FRIDAY", "0" },
			{ "수업 없음", "", "", "3", "FRIDAY", "1" },
			{ "수업 없음", "", "", "3", "FRIDAY", "2" },
			{ "수업 없음", "", "", "3", "FRIDAY", "3" },
			{ "수업 없음", "", "", "3", "FRIDAY", "4" },
			{ "수업 없음", "", "", "3", "FRIDAY", "5" },
			{ "Lunch Break", "", "", "3", "FRIDAY", "6" },
			{ "Lunch Break", "", "", "3", "FRIDAY", "7" },
			{ "Lunch Break", "", "", "3", "FRIDAY", "8" },
			{ "수업 없음", "", "", "3", "FRIDAY", "9" },
			{ "수업 없음", "", "", "3", "FRIDAY", "10" },
			{ "수업 없음", "", "", "3", "FRIDAY", "11" },
			{ "수업 없음", "", "", "3", "FRIDAY", "12" },
			{ "수업 없음", "", "", "3", "FRIDAY", "13" },
			{ "수업 없음", "", "", "3", "FRIDAY", "14" },
			{ "수업 없음", "", "", "3", "FRIDAY", "15" },
			{ "수업 없음", "", "", "3", "FRIDAY", "16" },
			{ "수업 없음", "", "", "3", "FRIDAY", "17" },
			{ "수업 없음", "", "", "3", "FRIDAY", "18" },
			{ "수업 없음", "", "", "3", "FRIDAY", "19" },
			{ "수업 없음", "", "", "3", "FRIDAY", "20" }},
		// 4학년
		{ 
			//4학년 월요일
			{ "수업 시작 전", "", "", "4", "MONDAY", "0" },	
			{ "수업 시작 전", "", "", "4", "MONDAY", "1" },	
			{ "수업 시작 전", "", "", "4", "MONDAY", "2" },	
			{ "정보통신특강", "8618", "나현식", "4", "MONDAY", "3" }, 
			{ "정보통신특강", "8618", "나현식", "4", "MONDAY", "4" },
			{ "정보통신특강", "8618", "나현식", "4", "MONDAY", "5" },
			{ "Lunch Break", "", "", "4", "MONDAY", "6" },
			{ "Lunch Break", "", "", "4", "MONDAY", "7" },
			{ "Lunch Break", "", "", "4", "MONDAY", "8" },	
			{ "금일 수업 종료", "", "", "4", "MONDAY", "9" },
			{ "금일 수업 종료", "", "", "4", "MONDAY", "10" },
			{ "금일 수업 종료", "", "", "4", "MONDAY", "11" },
			{ "금일 수업 종료", "", "", "4", "MONDAY", "12" },
			{ "금일 수업 종료", "", "", "4", "MONDAY", "13" },
			{ "금일 수업 종료", "", "", "4", "MONDAY", "14" },
			{ "금일 수업 종료", "", "", "4", "MONDAY", "15" },				
			{ "금일 수업 종료", "", "", "4", "MONDAY", "16" },
			{ "금일 수업 종료", "", "", "4", "MONDAY", "17" },
			{ "금일 수업 종료", "", "", "4", "MONDAY", "18" },
			{ "금일 수업 종료", "", "", "4", "MONDAY", "19" },
			{ "금일 수업 종료", "", "", "4", "MONDAY", "20" },
			//4학년 화요일				
			{ "캡스톤디자인", "8622", "나현식", "4", "TUESDAY", "0" }, 
			{ "캡스톤디자인", "8622", "나현식", "4", "TUESDAY", "1" },
			{ "캡스톤디자인", "8622", "나현식", "4", "TUESDAY", "2" },
			{ "캡스톤디자인", "8612", "최영호", "4", "TUESDAY", "3" }, 
			{ "캡스톤디자인", "8612", "최영호", "4", "TUESDAY", "4" },
			{ "캡스톤디자인", "8612", "최영호", "4", "TUESDAY", "5" }, 
			{ "Lunch Break", "", "", "4", "TUESDAY", "6" },
			{ "Lunch Break", "", "", "4", "TUESDAY", "7" },
			{ "Lunch Break", "", "", "4", "TUESDAY", "8" },
			{ "캡스톤디자인", "8618", "성진택", "4", "TUESDAY", "9" },
			{ "캡스톤디자인", "8618", "성진택", "4", "TUESDAY", "10" },
			{ "캡스톤디자인", "8618", "성진택", "4", "TUESDAY", "11" },
			{ "금일 수업 종료", "", "", "4", "TUESDAY", "12" },
			{ "금일 수업 종료", "", "", "4", "TUESDAY", "13" },
			{ "금일 수업 종료", "", "", "4", "TUESDAY", "14" },
			{ "금일 수업 종료", "", "", "4", "TUESDAY", "15" }, 
			{ "금일 수업 종료", "", "", "4", "TUESDAY", "16" }, 
			{ "금일 수업 종료", "", "", "4", "TUESDAY", "17" },
			{ "금일 수업 종료", "", "", "4", "TUESDAY", "18" },
			{ "금일 수업 종료", "", "", "4", "TUESDAY", "19" },
			{ "금일 수업 종료", "", "", "4", "TUESDAY", "20" }, 
			//4학년 수요일
			{ "교양강좌 수업일", "", "", "4", "WEDNESDAY", "0" },
			{ "교양강좌 수업일", "", "", "4", "WEDNESDAY", "1" },
			{ "교양강좌 수업일", "", "", "4", "WEDNESDAY", "2" },
			{ "교양강좌 수업일", "", "", "4", "WEDNESDAY", "3" },
			{ "교양강좌 수업일", "", "", "4", "WEDNESDAY", "4" },
			{ "교양강좌 수업일", "", "", "4", "WEDNESDAY", "5" },
			{ "Lunch Break", "", "", "4", "WEDNESDAY", "6" },
			{ "Lunch Break", "", "", "4", "WEDNESDAY", "7" },
			{ "Lunch Break", "", "", "4", "WEDNESDAY", "8" },
			{ "캡스톤디자인", "8619", "이양원", "4", "WEDNESDAY", "9" },
			{ "캡스톤디자인", "8619", "이양원", "4", "WEDNESDAY", "10" },
			{ "캡스톤디자인", "8619", "이양원", "4", "WEDNESDAY", "11" }, 
			{ "교양강좌 수업일", "", "", "4", "WEDNESDAY", "12" },
			{ "교양강좌 수업일", "", "", "4", "WEDNESDAY", "13" },
			{ "금일 수업 종료", "", "", "4", "WEDNESDAY", "14" },
			{ "금일 수업 종료", "", "", "4", "WEDNESDAY", "15" },
			{ "금일 수업 종료", "", "", "4", "WEDNESDAY", "16" },
			{ "금일 수업 종료", "", "", "4", "WEDNESDAY", "17" },
			{ "금일 수업 종료", "", "", "4", "WEDNESDAY", "18" },
			{ "금일 수업 종료", "", "", "4", "WEDNESDAY", "19" },
			{ "금일 수업 종료", "", "", "4", "WEDNESDAY", "20" }, 
			//4학년 목요일
			{ "수업 시작 전", "", "", "4", "THURSDAY", "0" },	
			{ "수업 시작 전", "", "", "4", "THURSDAY", "1" },	
			{ "수업 시작 전", "", "", "4", "THURSDAY", "2" },
			{ "정보통신특강", "8618", "나현식", "4", "THURSDAY", "3" },
			{ "정보통신특강", "8618", "나현식", "4", "THURSDAY", "4" },
			{ "정보통신특강", "8618", "나현식", "4", "THURSDAY", "5" },  
			{ "Lunch Break", "", "", "4", "THURSDAY", "6" },
			{ "Lunch Break", "", "", "4", "THURSDAY", "7" },
			{ "Lunch Break", "", "", "4", "THURSDAY", "8" },
			{ "금일 수업 종료", "", "", "4", "THURSDAY", "9" },
			{ "금일 수업 종료", "", "", "4", "THURSDAY", "10" },
			{ "금일 수업 종료", "", "", "4", "THURSDAY", "11" },
			{ "금일 수업 종료", "", "", "4", "THURSDAY", "12" },
			{ "금일 수업 종료", "", "", "4", "THURSDAY", "13" },
			{ "금일 수업 종료", "", "", "4", "THURSDAY", "14" },
			{ "금일 수업 종료", "", "", "4", "THURSDAY", "15" },
			{ "금일 수업 종료", "", "", "4", "THURSDAY", "16" },
			{ "금일 수업 종료", "", "", "4", "THURSDAY", "17" },
			{ "금일 수업 종료", "", "", "4", "THURSDAY", "18" },
			{ "금일 수업 종료", "", "", "4", "THURSDAY", "19" },
			{ "금일 수업 종료", "", "", "4", "THURSDAY", "20" }, 
			//4학년 금요일		 
			{ "캡스톤디자인", "8622", "나현식", "4", "FRIDAY", "0" }, 
			{ "캡스톤디자인", "8622", "나현식", "4", "FRIDAY", "1" },
			{ "캡스톤디자인", "8622", "나현식", "4", "FRIDAY", "2" }, 
			{ "캡스톤디자인", "8612", "최영호", "4", "FRIDAY", "3" },
			{ "캡스톤디자인", "8612", "최영호", "4", "FRIDAY", "4" }, 
			{ "캡스톤디자인", "8612", "최영호", "4", "FRIDAY", "5" },
			{ "Lunch Break", "", "", "4", "FRIDAY", "6" },
			{ "Lunch Break", "", "", "4", "FRIDAY", "7" },
			{ "Lunch Break", "", "", "4", "FRIDAY", "8" },
			{ "금일 수업 종료", "", "", "4", "FRIDAY", "9" },
			{ "금일 수업 종료", "", "", "4", "FRIDAY", "10" },
			{ "금일 수업 종료", "", "", "4", "FRIDAY", "11" },
			{ "금일 수업 종료", "", "", "4", "FRIDAY", "12" },
			{ "금일 수업 종료", "", "", "4", "FRIDAY", "13" },
			{ "금일 수업 종료", "", "", "4", "FRIDAY", "14" },
			{ "금일 수업 종료", "", "", "4", "FRIDAY", "15" },
			{ "금일 수업 종료", "", "", "4", "FRIDAY", "16" },
			{ "금일 수업 종료", "", "", "4", "FRIDAY", "17" },
			{ "금일 수업 종료", "", "", "4", "FRIDAY", "18" },
			{ "금일 수업 종료", "", "", "4", "FRIDAY", "19" },
			{ "금일 수업 종료", "", "", "4", "FRIDAY", "20" }}
	};

}
