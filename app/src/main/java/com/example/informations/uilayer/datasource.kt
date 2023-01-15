package com.example.informations.uilayer

import com.example.informations.R

class Datasource {
    fun loadInfoList(): List<Information> {
        return listOf<Information> (
            Information(R.string.name_one,R.string.adr_one,R.string.phn_id),
            Information(R.string.name_two,R.string.adr_two,R.string.phn_id),
            Information(R.string.name_three,R.string.adr_three,R.string.phn_id),
            Information(R.string.name_four,R.string.adr_four,R.string.phn_id),
            Information(R.string.name_five,R.string.adr_five,R.string.phn_id),
            Information(R.string.name_six,R.string.adr_six,R.string.phn_id),
            Information(R.string.name_seven,R.string.adr_seven,R.string.phn_id),
            Information(R.string.name_eight,R.string.adr_eight,R.string.phn_id),
            Information(R.string.name_nine,R.string.adr_nine,R.string.phn_id),
            Information(R.string.name_ten,R.string.adr_ten,R.string.phn_id),
                )
    }
}
