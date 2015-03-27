function flatten() {
    var movieLists = [
        {
            name: "New Releases",
            videos: [
                {                                                               
                    "id": 70111470,
                    "title": "Die Hard",
                    "boxart": "http://cdn-0.nflximg.com/images/2891/DieHard.jpg",
                    "uri": "http://api.netflix.com/catalog/titles/movies/70111470",
                    "rating": 4.0,
                    "bookmark": []
                },
                {
                    "id": 654356453,
                    "title": "Bad Boys",
                    "boxart": "http://cdn-0.nflximg.com/images/2891/BadBoys.jpg",
                    "uri": "http://api.netflix.com/catalog/titles/movies/70111470",
                    "rating": 5.0,
                    "bookmark": [{ id:432534, time:65876586 }]
                }
            ]
        },
        {
            name: "Dramas",
            videos: [
                {
                    "id": 65432445,
                    "title": "The Chamber",
                    "boxart": "http://cdn-0.nflximg.com/images/2891/TheChamber.jpg",
                    "uri": "http://api.netflix.com/catalog/titles/movies/70111470",
                    "rating": 4.0,
                    "bookmark": []
                },
                {
                    "id": 675465,
                    "title": "Fracture",
                    "boxart": "http://cdn-0.nflximg.com/images/2891/Fracture.jpg",
                    "uri": "http://api.netflix.com/catalog/titles/movies/70111470",
                    "rating": 5.0,
                    "bookmark": [{ id:432534, time:65876586 }]
                }
            ]
        }
    ],

    allVideoIdsInMovieLists = [];

    // ------------   INSERT CODE HERE!  ----------------------------
    // Use two nested forEach loops to flatten the movieLists into a list of video ids.
    // ------------   INSERT CODE HERE!  ----------------------------

    movieLists.forEach(function (videoLists) {
        videoLists.videos.forEach(function (videoItem) {
            var id = videoItem.id;
            allVideoIdsInMovieLists.push(id);
        });
    });

    return allVideoIdsInMovieLists;
}

/** 
 * A tiny print function to test flatten()
 * This function is called from flatten.html
 * to visualize the result.
 */
function print() {
    var ids = flatten();
    ids.toString();
    document.getElementById("demo").innerHTML = ids;
}
