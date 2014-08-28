package cavity_map;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CavityMap 
{
	public static void checkCavity(char numbers[][], int n) 
	{
		List<Integer> pos = new ArrayList<Integer>();
		for(int i = 1; i < n - 1; i++)
		{
			for(int j = 1; j < n - 1; j++)
			{
				if(numbers[i][j] > numbers[i - 1][j] && numbers[i][j] > numbers[i][j - 1] && numbers[i][j] > numbers[i][j + 1] && numbers[i][j] > numbers[i + 1][j])
				{
					pos.add(i);
					pos.add(j);
				}
			}
		}
		for(int i = 0; i < pos.size(); i++)
		{
			numbers[pos.get(i)][pos.get(++i)] = 'X';
		}
	}

	public static void main(String[] args) 
	{
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt();
		String array[] = new String[n];
		char numbers[][] = new char[n][n];
		for(int i = 0; i < n; i++)
		{
			array[i] = sr.next();
			numbers[i] = array[i].toCharArray();
		}
		checkCavity(numbers, n);
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print(numbers[i][j]);
			}
			System.out.println();
		}
		sr.close();
	}

}
