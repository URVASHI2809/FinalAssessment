# FinalAssessment

category is a enum and can only accept : (CYCLING, AEROBICS, YOGA, DANCING)


post request 
- http://localhost:8080/workout

**********************

{
    "note": "30 mins workout",
    "title": "Surya-namaskar",
    "caloriesBurntPerMinute": 280.20,
    "category": "YOGA"
}

***********************

get request 
- http://localhost:8080/workout


search by id
- http://localhost:8080/workout/id?id={ID_Number}


delete by id (delete request)
- http://localhost:8080/workout/deleted?id={ID_Number}


update values (put request)
- http://localhost:8080/workout/updated?id={ID_Number}


**********************

{
        "id": 2,
        "note": "45 mins workout",
        "title": "Cobrapose",
        "caloriesBurntPerMinute": 280.20,
        "category": "YOGA"
}

**********************
