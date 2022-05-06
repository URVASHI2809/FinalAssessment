# FinalAssessment

category is a enum and can only accept : (CYCLING, AEROBICS, YOGA, DANCING)


post request 
- http://localhost:8081/workout

**********************

{
    "title": "Surya-namaskar",
    "note": "30 mins workout",
    "caloriesBurntPerMinute": 481.20,
    "category": "YOGA"
}

***********************

get request 
- http://localhost:8081/workout


search by id
- http://localhost:8081/workout/id?id={ID_Number}


delete by id (delete request)
- http://localhost:8081/workout/delete?id={ID_Number}


update values (put request)
- http://localhost:8081/workout/update?id={ID_Number}


**********************

{
        "id": 2,
        "title": "Cobrapose",
        "note": "45 mins",
        "caloriesBurntPerMinute": 481.20,
        "category": "YOGA"
}

**********************
