# GS Memos (Custom Fork)

A custom fork of [MoeMemosAndroid](https://github.com/mudkipme/MoeMemosAndroid) — an Android client for your self-hosted [Memos](https://github.com/albrtbc/memos) instance. Built with Kotlin and Jetpack Compose.

[![Upstream](https://img.shields.io/badge/upstream-mudkipme%2FMoeMemosAndroid-blue?style=flat-square)](https://github.com/mudkipme/MoeMemosAndroid)

## Changes from upstream

### Location/Geolocation Support

- **GPS tagging** — Attach location coordinates (including altitude) when writing memos
- **Map display** — View memo locations on an interactive map in the card list
- **Zoom persistence** — Map zoom level is saved and restored across sessions
- OSM tiles with proper User-Agent for reliable map rendering

### Embedded Link Previews

- Rich embedded rendering for YouTube, Twitter/X, and Reddit links directly in memos

### UI/UX Improvements

- **Pin/unpin icon in card header** — Surfaced directly in the memo card instead of hidden in a menu
- **Edit and share in detail view** — Icons shown directly in the top bar
- **Styled hashtags** — Hashtags displayed as rounded background chips

### Search Enhancement

- Search results now include attachment filenames

### Sidebar Refresh

- Refresh button also updates the tags list in the sidebar

### Pagination

- Paging 3 integration for efficient memo list loading
- Auto-refresh on connect, fade-in animations, and optimized page sizes

### Bug Fixes

- Improved markdown table rendering
- Fixed copy link generating double slashes in URLs

### CI/CD

- Release Please automation for versioning and release builds

## Installation

This app is not published on any store. Download the latest APK from the [Releases](https://github.com/albrtbc/MoeMemosAndroid/releases/latest) page.

1. Download the `.apk` file from Releases
2. On your Android device, enable "Install from unknown sources" if not already enabled
3. Open the downloaded APK and install

## Compatibility

GS Memos is designed to work with the [albrtbc/memos](https://github.com/albrtbc/memos) backend (v0.26+). It may not be compatible with the upstream usememos/memos or other forks.

## Ecosystem

| App | Description | Repository |
|-----|-------------|------------|
| **Memos** | Server — API + web frontend | [albrtbc/memos](https://github.com/albrtbc/memos) |
| **Memos Firefox/Chrome** | Browser extension | [albrtbc/memos-firefox](https://github.com/albrtbc/memos-firefox) |
| **GS Memos** (this repo) | Android app | [albrtbc/MoeMemosAndroid](https://github.com/albrtbc/MoeMemosAndroid) |

## License

GS Memos is open-source software licensed under the [GPLv3](LICENSE).
