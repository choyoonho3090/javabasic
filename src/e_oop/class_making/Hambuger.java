package e_oop.class_making;

import java.util.Scanner;

public class Hambuger {
 
    public static void main(String[] args) {
    	
    	Hambuger a = new Hambuger();
        a.insertmoney();
    	
        
    }
    
    
    	Scanner sc = new Scanner(System.in);
    	
    	int money, choice, choice2, choice3, change; // 넣은 금액, 메뉴 선택, 잔돈
	    int 오징어버거, 불고기버거, 새우버거, 데리버거; //햄버거 mainmenu
	    int 양념감자, 오징어링, 포테이토, 콘샐러드; //사이드 sidemenu
	    int 콜라, 아메리카노, 아이스티, 레몬에이드; //드링크 drinkmenu
	    int tenThousandWon, fiveThousandWon, oneThousandWon, fiveHundredWon, oneHundredWon; // 천원, 오백원, 백원
    	
	    Hambuger(){
    		money= 0;
    		choice= 0;
    		choice2= 0;
    		choice3= 0;
    		change= 0;
    		오징어버거= 4100;
            불고기버거= 4500; 
            새우버거= 4500;
            데리버거= 3000; 
            양념감자= 2500; 
    	    오징어링= 2500; 
    	    포테이토= 2000;
    	    콘샐러드= 2000;
    	    콜라= 2200;
    	    아메리카노= 2500;
    	    아이스티 = 2700;
    	    레몬에이드 = 3000;
            tenThousandWon = 0;
            fiveThousandWon =0;
            oneThousandWon= 0;
            fiveHundredWon= 0;
            oneHundredWon = 0;
    	}
    	
    	void insertmoney(){
    		 System.out.println("금액을 입력하세요.");
    	        money = sc.nextInt();
    	        mainmenu(); //메서드 호출
    	}
    	
    	void mainmenu(){
    		 System.out.println("-버거를 고르세요");
    	     System.out.print("1.오징어버거(4100원) 2.불고기버거(4500원) 3.새우버거(4500원) 4.데리버거(3000원) >> ");
    	        choice = sc.nextInt();
    	        if (choice==1 && money>오징어버거) {
                    change = money - 오징어버거;
                    System.out.println("잔돈 : " + change + "원");
                    change();
                } else if (choice==2 && money>불고기버거) {
                    change = money - 불고기버거;
                    System.out.println("잔돈 : " + change + "원");
                    change();
                } else if (choice==3 && money>새우버거) {
                    change = money - 새우버거;
                    System.out.println("잔돈 : " + change + "원");
                    change();
                } else if (choice==4 && money>데리버거) {
                    change = money - 데리버거;  
                    System.out.println("잔돈 : " + change + "원");
                    change();
                } else{	
                    System.out.println("돈이 부족합니다.");
                }
    	        sidemenu(); //메서드 호출
    	}
    	
    	
    	void sidemenu(){
    		if(change >= 2000){
    		System.out.println("-------------------------");
    		System.out.println("-사이드메뉴를 고르세요");
	        System.out.print("1.양념감자(2500원) 2.오징어링(2500원) 3.포테이토(2000원) 4.콘샐러드(2000원) >> ");
    		}
	        	money = money - (money -change);
		        choice2 = sc.nextInt();
	        	if (choice2==1 && money>양념감자) {
	                change = money - 양념감자;
	                System.out.println("잔돈 : " + change + "원");
	                change();
	            } else if (choice2==2 && money>오징어링) {
	                change = money - 오징어링;
	                System.out.println("잔돈 : " + change + "원");
	                change();
	            } else if (choice2==3 && money>포테이토) {
	                change = money - 포테이토;
	                System.out.println("잔돈 : " + change + "원");
	                change();
	            } else if (choice2==4 && money>콘샐러드) {
	                change = money - 콘샐러드;  
	                System.out.println("잔돈 : " + change + "원");
	                change();
	            }  else{	
                    System.out.println("돈이 부족합니다.");
                }
	    		drinkmenu();
    	}
    	
    	
    	void drinkmenu(){
    		if(change >= 2200){
    		System.out.println("-------------------------");
    		System.out.println("-드링크메뉴를 고르세요");
	        System.out.print("1.콜라(2200원) 2.아메리카노(2500원) 3.아이스티(2700원) 4.레몬에이드(3000원) >> ");
    		}
	        	money = money - (money -change);
		        choice3 = sc.nextInt();
	        	if (choice3==1 && money>콜라) {
	                change = money - 콜라;
	                System.out.println("잔돈 : " + change + "원");
	              
	            } else if (choice3==2 && money>아메리카노) {
	                change = money - 아메리카노;
	                System.out.println("잔돈 : " + change + "원");
	                
	            } else if (choice3==3 && money>아이스티) {
	                change = money - 아이스티;
	                System.out.println("잔돈 : " + change + "원");
	               
	            } else if (choice3==4 && money>레몬에이드) {
	                change = money - 레몬에이드;  
	                System.out.println("잔돈 : " + change + "원");
	                
	            } else{	
                    System.out.println("돈이 부족합니다.");
                }
	    		change();
    	}
    	
    	
    	
    	void change(){
    		
    		tenThousandWon = change/10000;
    		fiveThousandWon = change%10000/5000;
            oneThousandWon = change%5000/1000;
            fiveHundredWon = change%1000/500;
            oneHundredWon = change%1000%500/100;
            System.out.print("만원 : " + tenThousandWon + "개, " );
            System.out.print("오천원 : " + fiveThousandWon + "개, " );
            System.out.print("천원 : " + oneThousandWon + "개, " );
            System.out.print("오백원 : " + fiveHundredWon + "개, ");
            System.out.println("백원 : " + oneHundredWon + "개");
            System.out.println("맛있게 드세요.");
    	}
    	
}