# Zenith Trace Metric Probe Walkthrough

The fixture is intentionally compact, so the review starts with the cases that pull farthest apart.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | span volume | 134 | watch |
| stress | latency skew | 194 | ship |
| edge | signal loss | 185 | ship |
| recovery | incident shape | 255 | ship |
| stale | span volume | 190 | ship |

Start with `recovery` and `baseline`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

`recovery` is the optimistic case; use it to make sure the scoring path still rewards strong signal.
