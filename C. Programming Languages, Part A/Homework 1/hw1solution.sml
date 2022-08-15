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


