package com.amr.util;

public class util {
	public final static int RECONNECTION_COUNT = 3 ;
	
	// NetworkHandler Names
	public final static int ANALYZE_FEATURE  = 1 ;
	public final static int RECOMMEND_LIST = 0 ;
	public final static int NOT_FOUND_RECOMMEND = 2 ;
	
	// Thread Switch Case
	public final static int USER_REGISTER = 0 ;
	public final static int USER_REMOVE = 1 ;
	public final static int MUSIC_SIMILAR = 2 ;
	public final static int MUSIC_SEARCH = 3 ;
	public final static int MUSIC_RECOMMEND = 4 ;
	public final static int USER_PLAY = 5 ;
	public final static int USER_SHARED_HISTORY =6 ;
	public final static int USER_NONSHARED_HISTORY = 7 ;
	public final static int MUSIC_USERS = 8 ;
	public final static int USER_MATE = 9 ;
	public final static int USER_UNMATE = 10 ;
	public final static int USER_MATE_LIST = 11 ;
	public final static int REVIEW_WRITE = 12 ;
	public final static int MUSIC_REVIEW = 13 ;
	public final static int USER_REVIEW = 14 ;
	public final static int USER_FEED = 15 ;
	
	// BroadCast keys
	public final static String AMR = "AMR Recommend List" ;
	
	// URLs
	public final static String URL_SEARCH = "http://52.68.14.38/soundnerd/music/search" ;
	public final static String URL_SIMILAR = "http://52.68.14.38/soundnerd/music/similar" ;
	public final static String URL_RECOMMEND = "http://52.68.14.38/soundnerd/music/recommend" ;
	public final static String URL_USER_REGISTER = "http://52.68.14.38/soundnerd/user/regitser" ;
	public final static String URL_USER_REMOVE = "http://52.68.14.38/soundnerd/user/remove" ;
	public final static String URL_USER_PLAY = "http://52.68.14.38/soundnerd/user/play" ;
	public final static String URL_REVIEW_WRITE = "http://52.68.14.38/soundnerd/review/write" ;
	public final static String URL_MUSIC_REVIEW = "http://52.68.14.38/soundnerd/music/review" ;
	
	public final static String POST = "POST" ;
	public final static String UTF_8 = "UTF-8" ;
	
	// Paser Keys and JSON Keys
	public final static String DATA = "data" ;
	
	public final static String TRACKS = "tracks" ;
	public final static String REVIEWS = "reviews" ;
	
	public final static String FEATURE = "feature" ;
	public final static String ARTIST = "artist" ;
	public final static String TITLE = "title" ;
	public final static String START = "start" ;
	public final static String COUNT = "count" ;
	public final static String TRACK_ID = "track_id" ;
	public final static String USER_ID = "user_id" ;
	public final static String TRACK = "track" ;
	
	public final static String ALBUM = "album" ;
	public final static String URL = "url" ;
	public final static String TIME_STAMP = "timestamp" ;
	public final static String CONTENT = "content" ;
	public final static String SCORE = "score" ;
	
	// JSON Value
	public final static int TRACK_ID_COUNT = 1 ;
	public final static int START_INDEX = 0 ;
	
	// Log Tag
	public final static String TAG = "AMR" ;
	
	// Times
	public final static int CONNECT_DELAY_TIME = 5000 ;
	public final static int READ_DELAY_TIME = 5000 ;
	
	public final static long SLEEP = 100 ;
	
}
