package sparseArray;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//������ά����
	//1:�� 2:��
	int[][] chessArr=new int[11][11];
	chessArr[1][2]=1;
	chessArr[2][3]=2;

	//���ԭʼ����
	System.out.println("ԭʼ����");
	for(int i=0;i<chessArr.length;i++) {
		for(int j=0;j<chessArr[i].length;j++) {
			System.out.print(chessArr[i][j]+" ");
		}
		System.out.println();
	}
	/*
	for(int[] row:chessArr) {
		for(int data:row) {
			System.out.print("\t"+data);
		}
		System.out.println();
	}
	*/

	//������ά���飬�õ��������ݸ���
	int sum=0;
	for(int i=0;i<chessArr.length;i++) {
		for(int j=0;j<chessArr[i].length;j++) {
			if(chessArr[i][j]!=0) {
				sum++;
			}
		}
	}
	//System.out.println(sum);
	
	//������Ӧϡ������
	int[][] sparseArr=new int[sum+1][3];
	//��һ��
	sparseArr[0][0]=11;
	sparseArr[0][1]=11;
	sparseArr[0][2]=sum;
	
	//����ԭʼ���飬������ֵ����ϡ��������
	int row=1;
	for(int i=0;i<chessArr.length;i++) {
		for(int j=0;j<chessArr[i].length;j++) {
			if(chessArr[i][j]!=0) {
				sparseArr[row][0]=i;
				sparseArr[row][1]=j;
				sparseArr[row][2]=chessArr[i][j];
				row++;
			}
		}
	}
	
	//���ϡ������
	System.out.println("ϡ������");
	for(int i=0;i<sum+1;i++) {
		System.out.println(sparseArr[i][0]+"\t"+sparseArr[i][1]+"\t"+sparseArr[i][2]);
	}
	
	//��ϡ������ָ�Ϊԭʼ����
	int[][] chessArray=new int[sparseArr[0][0]][sparseArr[0][0]];
	for(int i=1;i<sum+1;i++) {
		chessArray[sparseArr[i][0]][sparseArr[i][1]]=sparseArr[i][2];
	}
	
	//�������
	/*
	for(int i=0;i<chessArray.length;i++) {
		for(int j=0;j<chessArray[i].length;j++) {
			System.out.println(chessArray[i][j]+"\t");
			}
	}
	*/
	System.out.println("�ָ��������");
	for(int i=0;i<chessArray.length;i++) {
		for(int j=0;j<chessArray[i].length;j++) {
			System.out.print(chessArray[i][j]+" ");
		}
		System.out.println();
	}
	/*
	for(int[] row1:chessArray) {
		for(int data:row1) {
			System.out.print("\t"+data);
		}
		System.out.println();
	}
	*/
	}

}
