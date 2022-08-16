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
         then (#2 (hd dates)) :: dates_in_month(tl dates, month)
	 else dates_in_month(tl dates, month)
			     
fun dates_in_months (dates : (int * int * int) list, months : int list) =
    if null months
    then []
    else dates_in_month(dates, hd months) @ dates_in_months(dates, tl months)

fun get_nth (xs : string list, n : int) =
    if (n = 1)
    then hd xs
    else get_nth(tl xs, n-1)

fun date_to_string ((year:int, month:int, day:int)) =
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
