package me.mudkip.moememos.util

sealed class EmbedInfo {
    data class YouTube(val videoId: String, val url: String) : EmbedInfo()
    data class Twitter(val tweetId: String, val url: String) : EmbedInfo()
    data class Reddit(val url: String) : EmbedInfo()
    data class TikTok(val url: String) : EmbedInfo()
    data class Instagram(val url: String) : EmbedInfo()
}

private val YOUTUBE_RE =
    Regex("""^(?:https?://)?(?:www\.|m\.)?(?:youtube\.com/(?:watch\?v=|embed/|shorts/)|youtu\.be/)([\w-]{11})""")

private val TWITTER_RE =
    Regex("""^https?://(?:www\.)?(?:twitter\.com|x\.com)/\w+/status/(\d+)""")

private val REDDIT_RE =
    Regex("""^https?://(?:www\.)?reddit\.com/r/\w+/comments/\w+""")

private val TIKTOK_RE =
    Regex("""^https?://(?:www\.|vm\.|m\.)?tiktok\.com/(?:@[\w.]+/video/\d+|t/[\w-]+|[\w-]+/?)""")

private val INSTAGRAM_RE =
    Regex("""^https?://(?:www\.)?instagram\.com/(?:p|reel|reels|tv)/[\w-]+""")

fun detectEmbed(url: String): EmbedInfo? {
    YOUTUBE_RE.find(url)?.let { match ->
        return EmbedInfo.YouTube(videoId = match.groupValues[1], url = url)
    }
    TWITTER_RE.find(url)?.let { match ->
        return EmbedInfo.Twitter(tweetId = match.groupValues[1], url = url)
    }
    if (REDDIT_RE.containsMatchIn(url)) {
        return EmbedInfo.Reddit(url = url)
    }
    if (TIKTOK_RE.containsMatchIn(url)) {
        return EmbedInfo.TikTok(url = url)
    }
    if (INSTAGRAM_RE.containsMatchIn(url)) {
        return EmbedInfo.Instagram(url = url)
    }
    return null
}
