# Review Journal

The review surface for `zenith-trace-metric-probe` is deliberately narrow: one fixture, one scoring rule, and one local check.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its observability focus without claiming live deployment or external usage.

## Cases

- `baseline`: `span volume`, score 134, lane `watch`
- `stress`: `latency skew`, score 194, lane `ship`
- `edge`: `signal loss`, score 185, lane `ship`
- `recovery`: `incident shape`, score 255, lane `ship`
- `stale`: `span volume`, score 190, lane `ship`

## Note

This file is intentionally plain so the fixture remains the source of truth.
