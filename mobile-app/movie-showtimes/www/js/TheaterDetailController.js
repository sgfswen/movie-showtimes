/**
 * Created by dinhquangtrung on 1/22/15.
 */

angular.module('app').controller('TheaterDetailControllerTitle', function ($scope, DataService) {
    var movieId = $scope.ons.navigator.getCurrentPage().options.data;
    DataService.getTheater(movieId).then(function (theater) {
        $scope.theater = theater;

        var MSECONDS_PER_DAY = 24 * 60 * 60 * 1000;
        var today = Math.floor(+new Date / MSECONDS_PER_DAY) * MSECONDS_PER_DAY;
        var tomorrow = Math.floor(+new Date / MSECONDS_PER_DAY) * MSECONDS_PER_DAY + MSECONDS_PER_DAY;
        var later = Math.floor(+new Date / MSECONDS_PER_DAY) * MSECONDS_PER_DAY + 2 * MSECONDS_PER_DAY;
        $scope.todaySessions = {
            label: "Hôm nay",
            sessions: $scope.theater.sessions.filter(function (o) {
                var show_date = Math.floor(o.show_time / MSECONDS_PER_DAY) * MSECONDS_PER_DAY;
                return show_date >= today && show_date < tomorrow;
            })
        };
        $scope.tomorrowSessions = {
            label: "Ngày mai",
            sessions: $scope.theater.sessions.filter(function (o) {
                var show_date = Math.floor(o.show_time / MSECONDS_PER_DAY) * MSECONDS_PER_DAY;
                return show_date >= tomorrow && show_date < later;
            })
        };
        $scope.laterSessions = {
            label: "",
            sessions: $scope.theater.sessions.filter(function (o) {
                var show_date = Math.floor(o.show_time / MSECONDS_PER_DAY) * MSECONDS_PER_DAY;
                return show_date >= later;
            })
        };

        $scope.activeSessions = $scope.todaySessions;

        if ($scope.tomorrowSessions.sessions.length) {
            $scope.isTomorrowAvailable = true;
        }
        if ($scope.laterSessions.sessions.length) {
            $scope.isLaterAvailable = true;
        }

        // Methods
        $scope.changeSession = function (session) {
            $scope.activeSessions = session;
        };

        $scope.showSessionDetail = function (session) {
            // $scope.ons.navigator.pushPage('views/movie_detail/session_detail.html', {data: session})
        };
    }, function (reason) {
        console.log('Could not get theater.', reason);
    });

    $scope.openMap = function () {
        navigator.app.loadUrl($scope.theater.map_link, {openExternal: true});
    }
});