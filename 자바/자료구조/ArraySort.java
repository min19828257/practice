//최대값 최소값을 구할 int배열
int array[] = {4,3,2,1,10,8,7,6,9,5};
int max = array[0]; //최대값
int min = array[0]; //최소값
		
Arrays.sort(array); // 배열 정렬

// 최소값(Min) 출력
 System.out.println("최소값은 : "+array[0]);

// 최대값(Max) 출력
System.out.println("최대값은 : " +array[array.length - 1]);
