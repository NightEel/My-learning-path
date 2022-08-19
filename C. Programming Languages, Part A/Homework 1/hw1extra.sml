fun alternate (list_of_numbers : int list) =
   let fun auxiliar (xs : int list, bit : int) =
	   if null xs
	   then 0
	   else if (bit = 0)
	        then (hd xs) + auxiliar(tl xs, 1)
	        else (~(hd xs)) + auxiliar(tl xs, 0)
   in auxiliar(list_of_numbers, 0)
   end
