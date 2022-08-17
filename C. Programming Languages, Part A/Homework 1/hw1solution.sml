fun is_older ((year1:int, month1:int, day1:int), (year2:int, month2:int, day2:int)) =
    if (year1 = year2)
    then if (month1 = month2)
	 then (day1 < day2)
	 else (month1 < month2)
    else (year1 < year2)

fun number_in_month (dates : (int * int * int) list, month : int) =
    if null dates
    then 0
    else if (#2 (hd dates) = month)
         then 1 + number_in_month(tl dates, month)
         else number_in_month(tl dates, month)

fun number_in_months (dates : (int * int * int) list, months : int list) =
    if null months
    then 0
    else number_in_month(dates, hd months) + number_in_months(dates, tl months)

fun dates_in_month (dates : (int * int * int) list, month : int) =
    if null dates
    then []
    else if (#2 (hd dates) = month)
         then (hd dates) :: dates_in_month(tl dates, month)
	 else dates_in_month(tl dates, month)
			     
fun dates_in_months (dates : (int * int * int) list, months : int list) =
    if null months
    then []
    else dates_in_month(dates, hd months) @ dates_in_months(dates, tl months)

fun get_nth (xs : string list, n : int) =
    if (n = 1)
    then hd xs
    else get_nth(tl xs, n-1)

fun date_to_string (year:int, month:int, day:int) =
    get_nth(["January", "February", "March", "April", "May", "June", "July",
	     "August", "September", "October", "November", "December"], month)
    ^ " " ^ Int.toString(day) ^ ", " ^ Int.toString(year)

fun number_before_reaching_sum (sum : int, number_list: int list) =
    if ((hd number_list) >= sum)
    then 0
    else 1 + number_before_reaching_sum((sum - (hd number_list)), tl number_list)

fun what_month (day : int) =
    1 + number_before_reaching_sum(day, [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31])

fun month_range (day1 : int, day2 : int) =
    if (day1 > day2)
    then []
    else (what_month(day1)) :: month_range(day1 + 1, day2)

fun oldest (dates : (int * int * int) list) =
    if null dates
    then NONE
    else let fun oldest_in_list (xs : (int * int * int) list) =
		 if null(tl xs)
		 then hd xs
		 else if (is_older(hd xs, hd(tl xs)))
		      then oldest_in_list(tl(tl xs) @ [hd xs])
       		      else oldest_in_list(tl xs)
	 in SOME (oldest_in_list(dates))
	 end 

fun number_in_months_challenge (dates : (int * int * int) list, months : int list) =
    let fun remove_duplicates (xs : int list) =
	    if null xs
	    then []
	    else let fun remove_equals (y : int, ys : int list) =
			 if null ys
			 then []
			 else if y = hd ys
			      then remove_equals(y, tl ys)
			      else (hd ys) :: remove_equals(y, tl ys)
		 in (hd xs) :: remove_duplicates(remove_equals(hd xs, xs))
		 end
    in number_in_months(dates, remove_duplicates(months))
    end
	
fun dates_in_months_challenge (dates : (int * int * int) list, months : int list) =
    let fun remove_duplicates (xs : int list) =
	    if null xs
	    then []
	    else let fun remove_equals (y : int, ys : int list) =
			 if null ys
			 then []
			 else if y = hd ys
			      then remove_equals(y, tl ys)
			      else (hd ys) :: remove_equals(y, tl ys)
		 in (hd xs) :: remove_duplicates(remove_equals(hd xs, xs))
		 end
    in dates_in_months(dates, remove_duplicates(months))
    end

fun reasonable_date (year:int, month:int, day:int) =
    (year > 0) andalso (1 <= month) andalso (month <= 12) andalso (1 <= day)
    andalso (if (month = 2)
	     then if ((year mod 400 = 0) orelse ((year mod 4 = 0) andalso (not (year mod 100 = 0))))
		  then (day <= 29)
		  else (day <= 28)
	     else if ((month = 4) orelse (month = 6) orelse (month = 9) orelse (month = 11))
	          then (day <= 30)
      	          else (day <= 31))
		      
		 
			   
				  
