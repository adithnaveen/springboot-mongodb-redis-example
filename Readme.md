# Spring boot + Mongodb + Redis (for Caching) Example
---

## Prerequisites:

1. Redis server must be running at port 6379
2. Mongodb server must be running at port 27017

## How to use the demo?

1. Import the project into Eclipse
2. Do a maven update
3. Run com.kvinod.App class
4. Use a browser to visit http://localhost:2233/api/users
5. Using one of the user's id, make another request (e.g, http://localhost:2233/api/users/5d876248a0b7a0fde2b490f9)
	1. You should see some mongodb logs on Eclipse console
	2. Refresh the browser multiple times, but no logs to be displayed on Eclipse console
	3. You may even stop mongodb server and refresh the browser, and still get data (cached in Redis)
	4. While the mongodb has stopped, if you make request for any other id, you must get error 500

