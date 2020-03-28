package com.chepsi.coronatracker.data.model

import com.google.gson.annotations.SerializedName

//Todo finish up on this class
data class TimelineData(
    @SerializedName("name")
    val name: String
)

/*
{"countrytimelinedata":[{"info":{"ourid":167, "title":"USA", "code":"US", "source":"https://thevirustracker.com/usa-coronavirus-information-us"}}],
"timelineitems":[{"1/23/2020":{"new_daily_cases":1,"new_daily_deaths":0,"total_cases":1,"total_recoveries":0,"total_deaths":0},"
1/24/2020":{"new_daily_cases":1,"new_daily_deaths":0,"total_cases":2,"total_recoveries":0,"total_deaths":0},
"1/25/2020":{"new_daily_cases":0,"new_daily_deaths":0,"total_cases":2,"total_recoveries":0,"total_deaths":0},
"1/26/2020":{"new_daily_cases":3,"new_daily_deaths":0,"total_cases":5,"total_recoveries":0,"total_deaths":0},
"1/27/2020":{"new_daily_cases":0,"new_daily_deaths":0,"total_cases":5,"total_recoveries":0,"total_deaths":0},
"1/28/2020":{"new_daily_cases":0,"new_daily_deaths":0,"total_cases":5,"total_recoveries":0,"total_deaths":0},
"1/29/2020":{"new_daily_cases":0,"new_daily_deaths":0,"total_cases":5,"total_recoveries":0,"total_deaths":0},
"1/30/2020":{"new_daily_cases":0,"new_daily_deaths":0,"total_cases":5,"total_recoveries":0,"total_deaths":0},
"1/31/2020":{"new_daily_cases":2,"new_daily_deaths":0,"total_cases":7,"total_recoveries":0,"total_deaths":0},
"2/1/2020":{"new_daily_cases":1,"new_daily_deaths":0,"total_cases":8,"total_recoveries":0,"total_deaths":0},
"2/2/2020":{"new_daily_cases":0,"new_daily_deaths":0,"total_cases":8,"total_recoveries":0,"total_deaths":0},
"2/3/2020":{"new_daily_cases":3,"new_daily_deaths":0,"total_cases":11,"total_recoveries":0,"total_deaths":0},
"2/4/2020":{"new_daily_cases":0,"new_daily_deaths":0,"total_cases":11,"total_recoveries":0,"total_deaths":0},
"2/5/2020":{"new_daily_cases":0,"new_daily_deaths":0,"total_cases":11,"total_recoveries":0,"total_deaths":0},
"2/6/2020":{"new_daily_cases":0,"new_daily_deaths":0,"total_cases":11,"total_recoveries":0,"total_deaths":0},
"2/7/2020":{"new_daily_cases":0,"new_daily_deaths":0,"total_cases":11,"total_recoveries":0,"total_deaths":0},
"2/8/2020":{"new_daily_cases":0,"new_daily_deaths":0,"total_cases":11,"total_recoveries":0,"total_deaths":0},
"2/9/2020":{"new_daily_cases":0,"new_daily_deaths":0,"total_cases":11,"total_recoveries":3,"total_deaths":0},
"2/10/2020":{"new_daily_cases":0,"new_daily_deaths":0,"total_cases":11,"total_recoveries":3,"total_deaths":0},
"2/11/2020":{"new_daily_cases":1,"new_daily_deaths":0,"total_cases":12,"total_recoveries":3,"total_deaths":0},
"2/12/2020":{"new_daily_cases":0,"new_daily_deaths":0,"total_cases":12,"total_recoveries":3,"total_deaths":0},
"2/13/2020":{"new_daily_cases":1,"new_daily_deaths":0,"total_cases":13,"total_recoveries":3,"total_deaths":0},
"2/14/2020":{"new_daily_cases":0,"new_daily_deaths":0,"total_cases":13,"total_recoveries":3,"total_deaths":0},
"2/15/2020":{"new_daily_cases":0,"new_daily_deaths":0,"total_cases":13,"total_recoveries":3,"total_deaths":0},
"2/16/2020":{"new_daily_cases":0,"new_daily_deaths":0,"total_cases":13,"total_recoveries":3,"total_deaths":0},
"2/17/2020":{"new_daily_cases":0,"new_daily_deaths":0,"total_cases":13,"total_recoveries":3,"total_deaths":0},
"2/18/2020":{"new_daily_cases":0,"new_daily_deaths":0,"total_cases":13,"total_recoveries":3,"total_deaths":0},
"2/19/2020":{"new_daily_cases":0,"new_daily_deaths":0,"total_cases":13,"total_recoveries":3,"total_deaths":0},
"2/20/2020":{"new_daily_cases":0,"new_daily_deaths":0,"total_cases":13,"total_recoveries":3,"total_deaths":0},
"2/21/2020":{"new_daily_cases":2,"new_daily_deaths":0,"total_cases":15,"total_recoveries":5,"total_deaths":0},
"2/22/2020":{"new_daily_cases":0,"new_daily_deaths":0,"total_cases":15,"total_recoveries":5,"total_deaths":0},
"2/23/2020":{"new_daily_cases":0,"new_daily_deaths":0,"total_cases":15,"total_recoveries":5,"total_deaths":0},
"2/24/2020":{"new_daily_cases":0,"new_daily_deaths":0,"total_cases":15,"total_recoveries":5,"total_deaths":0},
"2/25/2020":{"new_daily_cases":0,"new_daily_deaths":0,"total_cases":15,"total_recoveries":6,"total_deaths":0},
"2/26/2020":{"new_daily_cases":0,"new_daily_deaths":0,"total_cases":15,"total_recoveries":6,"total_deaths":0},
"3/14/2020":{"new_daily_cases":0,"new_daily_deaths":0,"total_cases":2133,"total_recoveries":12,"total_deaths":47},
"stat":"ok"}]}
 */