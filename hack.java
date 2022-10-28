import java.util.Arrays; 
public class solution {
	public static void main(String[] args) {
		int[] nums = {-7, 1, 5, 2, -4, 3, 0};
		System.out.println("Original array: "+Arrays.toString(nums));
		equlibrium_indices(nums);
	}
 
	public static void equlibrium_indices(int[] nums){
		//find total sum
		int totalSum = 0;
		for (int n : nums) {
			totalSum += n;
		}
		//compare running sum to remaining sum to find equlibrium indices
		int runningSum = 0;
		for (int i = 0; i < nums.length; i++) {
			int n = nums[i];
			if (totalSum - runningSum - n == runningSum) {
				System.out.println("Equilibrium indices found at : "+i);
			}
			runningSum += n;
		}
	}
}

<Html>  
<head>   
<title>  
Registration Page  
</title>  
</head>  
<body bgcolor="Lightskyblue">  
<br>  
<br>  
<form>  
  
<label> Firstname </label>         
<input type="text" name="firstname" size="15"/> <br> <br>  
<label> Middlename: </label>     
<input type="text" name="middlename" size="15"/> <br> <br>  
<label> Lastname: </label>         
<input type="text" name="lastname" size="15"/> <br> <br>  
  
<label>   
Course :  
</label>   
<select>  
<option value="Course">Course</option>  
<option value="BCA">BCA</option>  
<option value="BBA">BBA</option>  
<option value="B.Tech">B.Tech</option>  
<option value="MBA">MBA</option>  
<option value="MCA">MCA</option>  
<option value="M.Tech">M.Tech</option>  
</select>  
  
<br>  
<br>  
<label>   
Gender :  
</label><br>  
<input type="radio" name="male"/> Male <br>  
<input type="radio" name="female"/> Female <br>  
<input type="radio" name="other"/> Other  
<br>  
<br>  
  
<label>   
Phone :  
</label>  
<input type="text" name="country code"  value="+91" size="2"/>   
<input type="text" name="phone" size="10"/> <br> <br>  
Address  
<br>  
<textarea cols="80" rows="5" value="address">  
</textarea>  
<br> <br>  
Email:  
<input type="email" id="email" name="email"/> <br>    
<br> <br>  
Password:  
<input type="Password" id="pass" name="pass"> <br>   
<br> <br>  
Re-type password:  
<input type="Password" id="repass" name="repass"> <br> <br>  
<input type="button" value="Submit"/>  
</form>  
</body>  
</html> 
