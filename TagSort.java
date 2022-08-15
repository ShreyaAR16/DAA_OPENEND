import java.util.Scanner;
class TagSort
{
	public void tagsort(int[] collection, int[] tag, int size)
	{
		int i = 0;
		int j = 0;
		int temp = 0;
		for (i = 0; i < size; i++)
		{
			for (j = i + 1; j < size; j++)
			{
				if (collection[tag[i]] > collection[tag[j]])
				{
					temp = tag[i];
					tag[i] = tag[j];
					tag[j] = temp;
				}
			}
		}
	}
	
	public void display(int[] collection, int[] tag, int size)
	{
		int i = 0;
		for (i = 0; i < size; i++)
		{
			System.out.print("  " + collection[tag[i]]);
		}
	}
	
	public static void main(String[] args)
	{
		TagSort obj = new TagSort();
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.print("Enter the size of the array : ");
		size = sc.nextInt();
		int[] collection = new int[size];
		System.out.println("Enter the elements of the array : ");
		for (int i = 0; i < size; i++)
			collection[i] = sc.nextInt();
		
		int[] tag = new int[size];
		int i = 0;
		
		for (i = 0; i < size; ++i)
		{
			tag[i] = i;
		}
		System.out.print("Before Sort:");
		obj.display(collection, tag, size);
		obj.tagsort(collection, tag, size);
		System.out.print("\nAfter Sort:");
		obj.display(collection, tag, size);
	}
}