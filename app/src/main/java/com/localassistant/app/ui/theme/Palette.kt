package com.localassistant.app.ui.theme

/**
 * The Gruvbox palette, as plain ARGB integers.
 *
 * The app paints with Compose colour roles and the wake card is drawn by the
 * system, which cannot read a [MaterialTheme][android.material.theme] - a session
 * runs in its own process and has no Compose surface to ask. Both halves still
 * have to agree on what "the reply colour" or "the card surface" is, so the
 * palette lives here as the one set of tokens both name, and each half converts
 * to whatever its own paint API wants: Compose wraps these in a
 * [android.compose.ui.graphics.Color], a session hands them straight to
 * `setTextColor`/`setColor`.
 *
 * Keeping the tokens as integers rather than Compose colours is what lets the
 * session service depend on this module without dragging the whole Compose
 * toolchain into a process that must not carry one.
 */

/**
 * Nothing at all - a colour that paints no ink, which is how a turn that has no
 * text yet contributes nothing to the card.
 */
const val TRANSPARENT = 0x00000000

// Gruvbox dark scheme.
const val GRUVBOX_PRIMARY = 0xFFF2A94C.toInt() // Warm yellow/orange (Gruvbox accent)
const val GRUVBOX_ON_PRIMARY = 0xFF2B2B2B.toInt()
const val GRUVBOX_PRIMARY_CONTAINER = 0xFFD48A30.toInt()
const val GRUVBOX_SECONDARY = 0xFFD75D00.toInt() // Deep orange (Gruvbox accent)
const val GRUVBOX_ON_SECONDARY = 0xFF2B2B2B.toInt()
const val GRUVBOX_SECONDARY_CONTAINER = 0xFFB54E00.toInt()
const val GRUVBOX_TERTIARY = 0xFFCC8836.toInt() // Golden brown (Gruvbox accent)
const val GRUVBOX_ON_TERTIARY = 0xFF333333.toInt()
const val GRUVBOX_TERTIARY_CONTAINER = 0xFFA86C1A.toInt()
const val GRUVBOX_BACKGROUND = 0xFF2B2B2B.toInt() // Neutral dark gray
const val GRUVBOX_ON_BACKGROUND = 0xFFE8E8E8.toInt()
const val GRUVBOX_SURFACE = 0xFF333333.toInt() // Neutral gray
const val GRUVBOX_ON_SURFACE = 0xFFE8E8E8.toInt() // Light gray for text on dark gray surfaces
const val GRUVBOX_SURFACE_LOW = 0xFF2D2D2D.toInt() // Slightly darker gray
const val GRUVBOX_SURFACE_MED = 0xFF3A3A3A.toInt() // Surface medium gray
const val GRUVBOX_SURFACE_HIGH = 0xFF444444.toInt() // Elevated gray
const val GRUVBOX_SURFACE_HIGHEST = 0xFF4F4F4F.toInt()
const val GRUVBOX_ON_SURFACE_MUTED = 0xFFABABAB.toInt()
const val GRUVBOX_ERROR = 0xFFCC3D2B.toInt() // Red-orange for errors (Gruvbox style)
const val GRUVBOX_ON_ERROR = 0xFF2B2B2B.toInt()

// Gruvbox light scheme (fallback palette).
const val GRUVBOX_LIGHT_PRIMARY = 0xFFB57617.toInt() // Golden brown
const val GRUVBOX_LIGHT_ON_PRIMARY = 0xFF333333.toInt()
const val GRUVBOX_LIGHT_PRIMARY_CONTAINER = 0xFFD7A66E.toInt()
const val GRUVBOX_LIGHT_SECONDARY = 0xFF8F6300.toInt() // Darker orange
const val GRUVBOX_LIGHT_ON_SECONDARY = 0xFFFBF1DE.toInt()
const val GRUVBOX_LIGHT_SECONDARY_CONTAINER = 0xFFE8B878.toInt()
const val GRUVBOX_LIGHT_TERTIARY = 0xFFA47D52.toInt() // Warm gray-brown
const val GRUVBOX_LIGHT_ON_TERTIARY = 0xFFFBF1DE.toInt()
const val GRUVBOX_LIGHT_TERTIARY_CONTAINER = 0xFFD4A673.toInt()
const val GRUVBOX_LIGHT_BACKGROUND = 0xFFFDF6E3.toInt() // Cream/beige
const val GRUVBOX_LIGHT_ON_BACKGROUND = 0xFF333333.toInt()
const val GRUVBOX_LIGHT_SURFACE = 0xFFFBF1DE.toInt() // Lighter cream
const val GRUVBOX_LIGHT_SURFACE_VARIANT = 0xFFF2E8D5.toInt()
const val GRUVBOX_LIGHT_ON_SURFACE_VARIANT = 0xFFA47D52.toInt()
const val GRUVBOX_LIGHT_ERROR = 0xFFAF3A1B.toInt()
const val GRUVBOX_LIGHT_ON_ERROR = 0xFFFBF1DE.toInt()
const val GRUVBOX_LIGHT_SURFACE_DIM = 0xFFEFE2CC.toInt()
const val GRUVBOX_LIGHT_SURFACE_BRIGHT = 0xFFFBF1DE.toInt()
const val GRUVBOX_LIGHT_SURFACE_CONTAINER_LOW = 0xFFF5E9D4.toInt()
const val GRUVBOX_LIGHT_SURFACE_CONTAINER = 0xFFF2E8D5.toInt()
const val GRUVBOX_LIGHT_SURFACE_CONTAINER_HIGH = 0xFFECE1CB.toInt()
const val GRUVBOX_LIGHT_SURFACE_CONTAINER_HIGHEST = 0xFFE8D9C1.toInt()

/**
 * The card the wake session draws.
 *
 * Translucent rather than solid: the session window is transparent and the
 * platform paints nothing behind the card, so the screen the device is showing
 * reads through it and the exchange stays a floating chat card rather than a
 * panel over the display.
 */
const val WAKE_CARD_SURFACE = 0xE6141414.toInt()

/**
 * The bubble the user's half of the exchange wears - the medium gray surface,
 * lifted off the card so the two turns read as separate bubbles rather than two
 * blocks of ink on one panel.
 */
const val WAKE_USER_BUBBLE = GRUVBOX_SURFACE_MED

/**
 * The bubble the reply wears. It carries the accent's brown rather than the
 * accent itself, so the card stays Gruvbox while the answer is still obvious
 * against the user's gray.
 */
const val WAKE_REPLY_BUBBLE = 0xFF342A1F.toInt()

/**
 * The colours the status dot wears, one per phase of the exchange.
 *
 * The dot is what makes the status line readable at a glance across a room: the
 * label needs the eye to be on the card, the colour does not. A state the wake
 * service does not name is taken as a fault and wears [GRUVBOX_ERROR].
 */
const val WAKE_PHASE_LISTENING = 0xFF67B744.toInt()
const val WAKE_PHASE_THINKING = 0xFFEF7E3B.toInt()
const val WAKE_PHASE_ANSWERING = GRUVBOX_PRIMARY
