fun is_older ((year1:int, month1:int, day1:int), (year2:int, month2:int, day2:int)) =
    if (year1 = year2)
    then if (month1 = month2)
	 then (day1 < day2)
	 else (month1 < month2)
    else (year1 < year2)
